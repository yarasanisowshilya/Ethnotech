package Projects.SmartMess;
import java.sql.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void registerStudent() throws Exception {

        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Room No: ");
        int room = sc.nextInt();

        System.out.print("Enter Password: ");
        String password = sc.next();

        Connection con = DBConnection.getConnection();

        String query =
                "insert into students(st_name,room_no,password) values(?,?,?)";

        PreparedStatement ps =
                con.prepareStatement(query);

        ps.setString(1, name);
        ps.setInt(2, room);
        ps.setString(3, password);

        ps.executeUpdate();

        System.out.println("Student Registered");
    }

    public static void viewStudents() throws Exception {

        Connection con = DBConnection.getConnection();

        PreparedStatement ps =
                con.prepareStatement("select * from students");

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            System.out.println(
                    rs.getInt("st_id") + " "
                            + rs.getString("st_name") + " "
                            + rs.getInt("room_no"));
        }
    }


    public static boolean login() throws Exception {
        sc.nextLine(); // clear buffer

        System.out.print("Enter Student ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        Connection con = DBConnection.getConnection();

        String query =
                "select * from students where st_id=? and password=?";

        PreparedStatement ps =
                con.prepareStatement(query);

        ps.setInt(1, id);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {

            System.out.println("Login Successful");
            con.close();
            return true;
        }

        System.out.println("Invalid ID or Password");
        con.close();
        return false;
    }


    public static void viewMenu() throws Exception {

        LocalDate date = LocalDate.now();
        DayOfWeek day = date.getDayOfWeek();

        String today = day.toString();

        // MONDAY -> Monday
        today = today.substring(0,1) +
                today.substring(1).toLowerCase();

        Connection con = DBConnection.getConnection();

        String query =
                "select * from meals where day_name=?";

        PreparedStatement ps =
                con.prepareStatement(query);

        ps.setString(1, today);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {

            System.out.println("\nToday's Menu (" + today + ")");

            System.out.println("Breakfast : "
                    + rs.getString("breakfast"));

            System.out.println("Lunch : "
                    + rs.getString("lunch"));

            System.out.println("Dinner : "
                    + rs.getString("dinner"));
        }
        else {
            System.out.println("Menu not found");
        }

        con.close();
    }

    public static void buyCoupon() throws Exception {

        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Meal Type (Breakfast/Lunch/Dinner): ");
        String mealType = sc.nextLine();

        String today =
                java.time.LocalDate.now()
                        .getDayOfWeek()
                        .toString();

        today = today.substring(0,1) +
                today.substring(1).toLowerCase();

        Connection con = DBConnection.getConnection();

        String menuQuery =
                "select * from meals where day_name=?";

        PreparedStatement ps1 =
                con.prepareStatement(menuQuery);

        ps1.setString(1, today);

        ResultSet rs = ps1.executeQuery();

        double amount = 0;

        if(rs.next()) {

            if(mealType.equalsIgnoreCase("Breakfast")) {
                amount = rs.getDouble("breakfast_price");
            }
            else if(mealType.equalsIgnoreCase("Lunch")) {
                amount = rs.getDouble("lunch_price");
            }
            else if(mealType.equalsIgnoreCase("Dinner")) {
                amount = rs.getDouble("dinner_price");
            }
        }

        String insertQuery =
                "insert into coupons(student_id,day_name,meal_type,amount,status) values(?,?,?,?,?)";

        PreparedStatement ps2 =
                con.prepareStatement(insertQuery);

        ps2.setInt(1, studentId);
        ps2.setString(2, today);
        ps2.setString(3, mealType);
        ps2.setDouble(4, amount);
        ps2.setString(5, "Active");

        ps2.executeUpdate();

        System.out.println("Coupon Generated");
        System.out.println("Amount = ₹" + amount);

        con.close();
    }
    public static void viewCoupons() throws Exception {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        Connection con = DBConnection.getConnection();

        String query =
                "select * from coupons where student_id=?";

        PreparedStatement ps =
                con.prepareStatement(query);

        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            System.out.println(
                    rs.getInt("coupon_id") + " "
                            + rs.getString("day_name") + " "
                            + rs.getString("meal_type") + " "
                            + rs.getDouble("amount") + " "
                            + rs.getString("status"));
        }
    }

    public static void useCoupon() throws Exception {

        System.out.print("Enter Coupon ID: ");
        int id = sc.nextInt();

        Connection con = DBConnection.getConnection();

        String query =
                "update coupons set status='Used' where coupon_id=?";

        PreparedStatement ps =
                con.prepareStatement(query);

        ps.setInt(1, id);

        ps.executeUpdate();

        System.out.println("Coupon Used");
    }

    public static void totalBill() throws Exception {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        Connection con = DBConnection.getConnection();

        String query =
                "select sum(amount) total from coupons where student_id=?";

        PreparedStatement ps =
                con.prepareStatement(query);

        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            System.out.println(
                    "Total Bill = ₹"
                            + rs.getDouble("total"));
        }
    }

    public static void main(String[] args) throws Exception {

        while (true) {

            System.out.println("\n===== SMART MESS SYSTEM =====");
            System.out.println("1. Register Student");
            System.out.println("2. Login");
            System.out.println("3. View Students");
            System.out.println("4. View Menu");
            System.out.println("5. Buy Coupon");
            System.out.println("6. View Coupons");
            System.out.println("7. Use Coupon");
            System.out.println("8. Total Bill");
            System.out.println("9. Exit");

            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    registerStudent();
                    break;

                case 2:
                    login();
                    break;

                case 3:
                    viewStudents();
                    break;

                case 4:
                    viewMenu();
                    break;

                case 5:
                    buyCoupon();
                    break;

                case 6:
                    viewCoupons();
                    break;

                case 7:
                    useCoupon();
                    break;

                case 8:
                    totalBill();
                    break;

                case 9:
                    System.out.println("Thank You");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
