package com.ssh.employee.domain;

import java.util.Date;

public class Employee {
	private Integer eid;
	private String ename;
	private String sex;
	private Date birthday;
	private Date joinDay;
	private String eno;
	private String username;
	private String password;
	private Department department;
	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [birthday=" + birthday + ", department=" + department
				+ ", eid=" + eid + ", ename=" + ename + ", eno=" + eno
				+ ", joinDay=" + joinDay + ", password=" + password + ", sex="
				+ sex + ", username=" + username + "]";
	}
	/**
	 * @return the eid
	 */
	public Integer getEid() {
		return eid;
	}
	/**
	 * @param eid the eid to set
	 */
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}
	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return the joinDay
	 */
	public Date getJoinDay() {
		return joinDay;
	}
	/**
	 * @param joinDay the joinDay to set
	 */
	public void setJoinDay(Date joinDay) {
		this.joinDay = joinDay;
	}
	/**
	 * @return the eno
	 */
	public String getEno() {
		return eno;
	}
	/**
	 * @param eno the eno to set
	 */
	public void setEno(String eno) {
		this.eno = eno;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
}
