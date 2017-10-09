package com.cg.bean;

public class StudentBean {

	
	private int studId;
	private String subject;
	private int theory;
	private int mcq;
	private int lab;
	private int total;
	private String grade;
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getTheory() {
		return theory;
	}
	public void setTheory(int theory) {
		this.theory = theory;
	}
	public int getMcq() {
		return mcq;
	}
	public void setMcq(int mcq) {
		this.mcq = mcq;
	}
	public int getLab() {
		return lab;
	}
	public void setLab(int lab) {
		this.lab = lab;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "StudentBean [studId=" + studId + ", subject=" + subject
				+ ", theory=" + theory + ", mcq=" + mcq + ", lab=" + lab
				+ ", total=" + total + ", grade=" + grade + "]";
	}
	public StudentBean(int studId, String subject, int theory, int mcq, int lab,
			int total, String grade) {
		super();
		this.studId = studId;
		this.subject = subject;
		this.theory = theory;
		this.mcq = mcq;
		this.lab = lab;
		this.total = total;
		this.grade = grade;
	}
	public StudentBean() {
	
	}

	
	
}
	
	


