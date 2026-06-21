package JDBC_Basics;

import java.sql.*;

public class PreparedStmt {
    private static final String url="jdbc:mysql://localhost:3306/jdbc";
    private static final String username="root";
    private static final String password="Sows@2005";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,username,password);
       // String query=" select*From students";
//        PreparedStatement st=con.prepareStatement(query);
//        //Reteriving the records
//
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
//        String query="insert into Students(id,name,email,marks)values(?,?,?,?)";
//        PreparedStatement st=con.prepareStatement(query);
//
//        st.setInt(1,2);
//        st.setString(2,"arun");
//        st.setString(3,"a@gmail.com");
//        st.setInt(4,89);
//        int myRes=st.executeUpdate();
//        if(myRes>0)
//        {
//            System.out.println("Successfully inserted");
//        }
//        else {
//            System.out.println("Failed to insert");
//        }


        //update

//        String query="update students set email=? where id=?";
//        PreparedStatement st=con.prepareStatement(query);
//        st.setString(1,"arun@gmail.com");
//        st.setInt(2,2);
//       int myRes=st.executeUpdate();
//        if(myRes>0)
//        {
//            System.out.println("Successfully updated");
//        }
//        else {
//            System.out.println("Failed to update");
//        }

        //delete


         String query="delete from students  where id=?";
         PreparedStatement st=con.prepareStatement(query);
         st.setInt(1,3);
        int myRes=st.executeUpdate();
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
