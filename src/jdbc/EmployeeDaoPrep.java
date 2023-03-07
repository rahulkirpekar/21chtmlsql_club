package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDaoPrep 
{
	public int insert(EmployeeBean ebean) 
	{
		String insertQuery = "INSERT INTO employee(name,salary,dsgn,orgName) VALUES(?,?,?,?)";
		Connection conn = DbConnection.getDbConnection();
		PreparedStatement pstmt = null;
		int rowAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(insertQuery);
				pstmt.setString(1, ebean.getName());
				pstmt.setString(2, ebean.getSalary());
				pstmt.setString(3, ebean.getDsgn());
				pstmt.setString(4, ebean.getOrgName());
				rowAffected = pstmt.executeUpdate();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("EmployeeDaoPrep----insert()---Db not connected");
		}
		return rowAffected;
	}
	public int update(EmployeeBean ebean,int id) 
	{
		String updateQuery = "UPDATE employee SET name = ?, salary= ? , dsgn = ? , orgName = ? WHERE id = ?";
		Connection conn = DbConnection.getDbConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(updateQuery);
				pstmt.setString(1, ebean.getName());
				pstmt.setString(2, ebean.getSalary());
				pstmt.setString(3, ebean.getDsgn());
				pstmt.setString(4, ebean.getOrgName());
				pstmt.setInt(5, id);
				rowsAffected = pstmt.executeUpdate();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}	
		} else 
		{
			System.out.println("EmployeeDaoPrep---update--Db not connected");
		}
		return rowsAffected;
	}
	public int delete(int id) 
	{
		String deleteQuery = "DELETE FROM employee WHERE id=?";
		Connection conn = DbConnection.getDbConnection();
		PreparedStatement pstmt = null;
		int rowsAffected = 0;
		if(conn != null) 
		{
			try 
			{
				pstmt = conn.prepareStatement(deleteQuery);
				pstmt.setInt(1, id);
				rowsAffected = pstmt.executeUpdate();
			
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}else 
		{
			System.out.println("EmployeeDaoPrep---delete()---Db not connected");
		}
		return rowsAffected;
	}
	public void getAllRecords() 
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
			System.out.println("EmployeeDaoPrep----getAllRecords()---Db not connected");
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
		
		EmployeeDao dao = new EmployeeDao();

		System.out.println("Enter Id which you want to update : : ");
		int id = sc.nextInt();
		int rowAffected = dao.update(ebean,id);
		if(rowAffected > 0) 
		{
			System.out.println("Employee records successfully Updated : " + rowAffected);
		}else 
		{
			System.out.println("Employee records not Updated  : " + rowAffected);
		}		
	}
}
