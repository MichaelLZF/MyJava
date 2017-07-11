package com.ssh.employee.domain;

import java.util.HashSet;
import java.util.Set;
public class Department {
	private Integer did;
	private String dname;
	private String ddesc;
	private Set<Employee> employee = new HashSet<Employee>();
	/**
	 * @return the did
	 */
	public Integer getDid() {
		return did;
	}
	/**
	 * @return the employee
	 */
	public Set<Employee> getEmployee() {
		return employee;
	}
	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	/**
	 * @param did the did to set
	 */
	public void setDid(Integer did) {
		this.did = did;
	}
	/**
	 * @return the dname
	 */
	public String getDname() {
		return dname;
	}
	/**
	 * @param dname the dname to set
	 */
	public void setDname(String dname) {
		this.dname = dname;
	}
	/**
	 * @return the ddesc
	 */
	public String getDdesc() {
		return ddesc;
	}
	/**
	 * @param ddesc the ddesc to set
	 */
	public void setDdesc(String ddesc) {
		this.ddesc = ddesc;
	}
	
}
