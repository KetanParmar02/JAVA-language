package com.MYSQL;
import java.sql.*;
public class EmpDB {
    public static void main(String[] args) throws ClassNotFoundException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from empinfo");
            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
