package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDao 
{
	public int insert(EmployeeBean ebean) 
	{
		String insertQuery = "INSERT INTO employee(name,salary,dsgn,orgName) VALUES('"+ebean.getName()+"','"+ebean.getSalary()+"','"+ebean.getDsgn()+"','"+ebean.getOrgName()+"')";
		Connection conn = DbConnection.getDbConnection();
		Statement stmt = null;
		int rowAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				
				rowAffected = stmt.executeUpdate(insertQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("EmplotyeeDao----insert()---Db not connected");
		}
		return rowAffected;
	}
	public  int update(EmployeeBean ebean,int id) 
	{
		String updateQuery = "UPDATE employee SET name = '"+ebean.getName()+"', salary= '"+ebean.getSalary()+"' , dsgn = '"+ebean.getDsgn()+"' , orgName = '"+ebean.getOrgName()+"' WHERE id = " + id;
		Connection conn = DbConnection.getDbConnection();
		Statement stmt = null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				rowsAffected = stmt.executeUpdate(updateQuery);
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}	
		} else 
		{
			System.out.println("EmployeeDao---update--Db not connected");
		}
		return rowsAffected;
	}
	public  int delete(int id) 
	{
		String deleteQuery = "DELETE FROM employee WHERE id="+id;
		Connection conn = DbConnection.getDbConnection();
		Statement stmt = null;
		int rowsAffected = 0;
		if(conn != null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rowsAffected = stmt.executeUpdate(deleteQuery);
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}else 
		{
			System.out.println("EmployeeDao---delete()---Db not connected");
		}
		return rowsAffected;
	}
	public ArrayList<EmployeeBean> getAllRecords() 
	{
		String selectQuery = "SELECT * FROM employee";
		Connection conn = DbConnection.getDbConnection();
		Statement stmt = null;
		ResultSet rs = null;
		EmployeeBean ebean = null;
		ArrayList<EmployeeBean> list = new ArrayList<EmployeeBean>();
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				
				rs = stmt.executeQuery(selectQuery);
				
				while(rs.next()) 
				{
					ebean = new EmployeeBean(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
					list.add(ebean);
				}
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("EmployeeDao----getAllRecords()---Db not connected");
		}
		return list;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Salary : ");
		String salary= sc.nextLine();
		System.out.println("Enter Dsgn : ");
		String dsgn = sc.nextLine();
		System.out.println("Enter OrgNanme : ");
		String orgName = sc.nextLine();
		
		EmployeeBean ebean = new EmployeeBean(0, name, salary, dsgn, orgName);
	
		System.out.println("Enter Employee ID which you want to Update : ");
		int updatedId = sc.nextInt();
		
		EmployeeDao dao = new EmployeeDao();

		int rowAffected = dao.update(ebean, updatedId);
		if(rowAffected > 0) 
		{
			System.out.println("Employee records successfully Updated : " + rowAffected);
		}else 
		{
			System.out.println("Employee records not Updated : " + rowAffected);
		}
//		ArrayList<EmployeeBean> list = dao.getAllRecords();
//		for(int i=0;i<list.size();i++) 
//		{
//			EmployeeBean bean = list.get(i);
//			System.out.println(bean.getId() + " " + bean.getName() + " " +bean.getSalary() + " " +bean.getDsgn() + " " + bean.getOrgName());
//		}
//		int rowAffected = dao.delete(id);
//		if(rowAffected > 0) 
//		{
//			System.out.println("Employee records successfully Deleted : " + rowAffected);
//		}else 
//		{
//			System.out.println("Employee records not Deleted : " + rowAffected);
//		}
	}
}
