package SampleProgram;


import java.sql.*;
public class Program 
{
public static void main(String[] args)
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedetails","root","Vais");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from employee where EmpId = 1");
while(rs.next())
{
System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
}
}
catch(Exception e)
{
System.out.println(e.toString());
}
}
}
