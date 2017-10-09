package com.cg.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.NamingException;

import java.sql.ResultSet;



import com.cg.bean.StudentBean;
import com.cg.dbutil.DbUtil;

public class StudentDaoImpl implements IStudentDao {

	int value = 0;
	Connection conn=null;
	
	@Override
	public int addDetails(StudentBean bean) throws SQLException, NamingException, IOException {
		

		int rows=0;
	
			
				conn=DbUtil.getConnection();
				System.out.println(conn);
				PreparedStatement ps=conn.prepareStatement("insert into studentscores values(?,?,?,?,?,?,?)");
				ps.setInt(1,bean.getStudId());
				ps.setString(2,bean.getSubject());
				ps.setInt(3, bean.getTheory());
				ps.setInt(4,bean.getMcq());
				ps.setInt(5,bean.getLab());
				ps.setInt(6,bean.getTotal());
				ps.setString(7,bean.getGrade());
				rows=ps.executeUpdate();

		return rows;
	

}

	@Override
	public ArrayList<Integer> getId() throws NamingException, IOException 
	{
	ArrayList<Integer> list = new ArrayList<Integer>();
	try{
		conn=DbUtil.getConnection();
		String str="Select student_id from students";
		PreparedStatement pst=conn.prepareStatement(str);
		ResultSet rs= pst.executeQuery();
		while(rs.next())
		{
			int ids=rs.getInt(1);
			list.add(ids);
		}
	}	
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	return list;
	}

	@Override
	public ArrayList<StudentBean> retrieveDetails() {
		

		ArrayList<StudentBean> list=new ArrayList<StudentBean>();
		
		try
		{
	
		conn=DbUtil.getConnection();
		
		System.out.println(conn);
		
		String sql="Select * from studentscores";
	
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
		
		while(rs.next())
		{
				int studId=rs.getInt(1);
				String subject=rs.getString(2);
				int theory=rs.getInt(3);
				int mcq=rs.getInt(4);
				int lab=rs.getInt(5);
				int total=rs.getInt(6);
				String grade=rs.getString(7);
				

				list.add(new StudentBean(studId,subject,theory,mcq,lab,total,grade));
				
			}
	}
	catch(SQLException|IOException | NamingException e)
	{
	 e.printStackTrace();
	}
		return list;
		
	}}