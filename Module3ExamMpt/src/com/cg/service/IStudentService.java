package com.cg.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import com.cg.bean.StudentBean;

public interface IStudentService {

public 	int addDetails(StudentBean bean) throws SQLException, NamingException, IOException;

public ArrayList<Integer> getId() throws NamingException, IOException;

public ArrayList<StudentBean> retrieveDetails();

public int getTotal(int theo, int score, int lab);

public String getGrade(int total);



}
