package com.cg.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.bean.StudentBean;
import com.cg.service.IStudentService;
import com.cg.service.StudentServiceImpl;


@WebServlet("*.obj")
public class StudentController extends HttpServlet {
	
	
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int res = 0;
		String path= request.getServletPath();
		String target=null;
		StudentBean bean=new StudentBean();
		IStudentService service=new StudentServiceImpl();
		HttpSession session=request.getSession();
		
		switch(path)
		{
		case "/add.obj":
			try {
				
				target="AddStudentExam.jsp";
				ArrayList<Integer> list = new ArrayList<Integer>();
				list=service.getId();
				
				session.setAttribute("list",list);
				for(Integer i:list)
				{
					System.out.println(i);
				}
				
				break;
				
				
			} catch (NamingException e) {
				e.printStackTrace();
			}
			
			
		case "/insert.obj":
			try {
			String studId=request.getParameter("sid");
			int id=Integer.parseInt(studId);
			
			String subject=request.getParameter("subject");
			
			
			String Theory=request.getParameter("theory");
			int theo=Integer.parseInt(Theory);
			
			String Scores=request.getParameter("score");
			int score=Integer.parseInt(Scores);
			
			String Lab=request.getParameter("lab");
			int lab=Integer.parseInt(Lab);
			
			
			bean.setStudId(id);
			bean.setSubject(subject);
			bean.setTheory(theo);
			bean.setMcq(score);
			bean.setLab(lab);
			int total = service.getTotal(theo, score, lab);
			bean.setTotal(total);
			
			String grade = service.getGrade(total);
			bean.setGrade(grade);
			
			res = service.addDetails(bean);
			System.out.println(res);
			
			if(res==1)
				{
				/*ArrayList<StudentBean> list=service.retrieveDetails();
				System.out.println(list);*/
				session.setAttribute("id", id);
				session.setAttribute("subject", subject);
				session.setAttribute("total", total);
				session.setAttribute("grade", grade);
				
				target="ResultScore.jsp";
				}
			else
			{
				target="Error.jsp";
			}
			break;
			
			} 
			catch (SQLException e) {
				e.printStackTrace();
			} catch (NamingException e) {
				e.printStackTrace();
			}
			
		}
		RequestDispatcher rd  = request.getRequestDispatcher(target);
		rd.forward(request, response);
		}}
