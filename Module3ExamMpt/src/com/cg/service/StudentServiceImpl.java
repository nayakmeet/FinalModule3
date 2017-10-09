package com.cg.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import com.cg.bean.StudentBean;
import com.cg.dao.IStudentDao;
import com.cg.dao.StudentDaoImpl;

public class StudentServiceImpl implements IStudentService{

	IStudentDao dao=new StudentDaoImpl();
	
	@Override
	public int addDetails(StudentBean bean) throws SQLException, NamingException, IOException {

		int t=bean.getTheory();
		int l=bean.getLab();
		int m=bean.getMcq();
		
		
		return dao.addDetails(bean);
		
		
	}

	@Override
	public ArrayList<Integer> getId() throws NamingException, IOException {
		
		return dao.getId();
	}

	@Override
	public ArrayList<StudentBean> retrieveDetails() {
	
		return dao.retrieveDetails();
	}

	@Override
	public int getTotal(int theo, int score, int lab) {
		// TODO Auto-generated method stub
		return (theo+score+lab);
	}

	@Override
	public String getGrade(int total) {
		// TODO Auto-generated method stub
		String grade = null;
		if(total>=91 && total<=100)
			grade="S";
		else if(total>=81 && total<=90)
			grade="A";
		else if(total>=71 && total<=80)
			grade="B";
		else if(total>=61 && total<=70)
			grade="C";
		else if(total>=51 && total<=60)
			grade="D";
		else 
			grade="U";
		
		return grade;
	}

	public static void main(String[] args) {
		
	}

}
