package com.ssh.employee.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ssh.employee.dao.impl.EmployeeDaoImpl;
import com.ssh.employee.domain.Employee;
import com.ssh.employee.domain.PageBean;

@Transactional
public class EmployeeServiceImpl {
	private EmployeeDaoImpl employeeDaoImpl;
	/**
	 * @param employeeDaoImpl the employeeDaoImpl to set
	 */
	public void setEmployeeDaoImpl(EmployeeDaoImpl employeeDaoImpl) {
		this.employeeDaoImpl = employeeDaoImpl;
	}
	public Employee findUserExist(Employee employee) {
		return employeeDaoImpl.findUserExist(employee);
	}
	public PageBean<Employee> findAll(int currentPage) {
		PageBean<Employee> pageBean = new PageBean<Employee>();
		int pageSize = 2;
		int totalSize = employeeDaoImpl.findAllCount(currentPage);
		int pageCount = (totalSize%pageSize)==0?(totalSize/pageSize):(totalSize/pageSize)+1;
		pageBean.setCurrentPage(currentPage);
		pageBean.setPageCount(pageCount);
		pageBean.setPageSize(pageSize);
		pageBean.setTotalSize(totalSize);
		int begin = (currentPage-1)*pageSize;
		List<Employee> list = employeeDaoImpl.findAll(begin,pageSize);
		pageBean.setList(list);
		return pageBean;
	}
	public void save(Employee employee) {
		employeeDaoImpl.save(employee);
	}
	public Employee edit(Integer eid) {
		return employeeDaoImpl.edit(eid);
	}
	public void update(Employee em) {
		employeeDaoImpl.update(em);
	}
	

}
