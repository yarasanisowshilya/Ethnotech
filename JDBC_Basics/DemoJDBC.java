package JDBC_Basics;

import java.sql.*;

public class DemoJDBC {
    private static final String url="jdbc:mysql://localhost:3306/jdbc";
    private static final String username="root";
    private static final String password="Sows@2005";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,username,password);
        Statement st=con.createStatement();
        //Reteriving the records
//       String query=" select*From students";
//       ResultSet rs=st.executeQuery(query);
//       while(rs.next())
//       {
//           int id=rs.getInt("id");
//           String name=rs.getString("name");
//           String email=rs.getString("email");
//           int marks=rs.getInt("marks");
//           System.out.println(id);
//           System.out.println(name);
//           System.out.println(email);
//           System.out.println(marks);
//       }

        //Inserting values
//        String query=String.format("insert into students(id,name,email,marks)values(%d,'%s','%s',%d)",3,"Deepa","deepa@gmail.com",34);
//        int myRes=st.executeUpdate(query);
//        if(myRes>0)
//        {
//            System.out.println("Successfully inserted");
//        }
//        else {
//            System.out.println("Failed to insert");
//        }

//        String query=String.format("update students set marks=%d where id=%d ",90,2);
//       int myRes=st.executeUpdate(query);
//        if(myRes>0)
//        {
//            System.out.println("Successfully updated");
//        }
//        else {
//            System.out.println("Failed to update");
//        }
        String query=String.format("Delete from students where id=%d",2);
        int myRes=st.executeUpdate(query);
        if(myRes>0)
        {
            System.out.println("SuccessFully deleted");
        }
        else {
            System.out.println("Failed to delete");
        }
       st.close();
       con.close();
    }
}
