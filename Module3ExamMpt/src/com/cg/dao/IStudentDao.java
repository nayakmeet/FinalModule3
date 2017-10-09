package com.cg.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import com.cg.bean.StudentBean;

public interface IStudentDao {

	public int addDetails(StudentBean bean) throws SQLException, NamingException, IOException;

	public ArrayList<Integer> getId() throws NamingException, IOException;

	public ArrayList<StudentBean> retrieveDetails();

}
