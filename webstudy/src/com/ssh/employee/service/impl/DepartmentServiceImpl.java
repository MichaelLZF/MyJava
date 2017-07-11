package com.ssh.employee.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ssh.employee.dao.impl.DepartmentDaoImpl;
import com.ssh.employee.domain.Department;
import com.ssh.employee.domain.PageBean;
import com.opensymphony.xwork2.ActionContext;

@Transactional
public class DepartmentServiceImpl {
	private DepartmentDaoImpl departmentDaoImpl;
	public void setDepartmentDaoImpl(DepartmentDaoImpl departmentDaoImpl) {
		this.departmentDaoImpl = departmentDaoImpl;
	}
	public PageBean<Department> findByPage(int currentPage) {
		PageBean<Department> pageBean = new PageBean<Department>();
		int pageSize=2;
		int totalSize = departmentDaoImpl.findCount();
		int pageCount = (totalSize%pageSize)==0?(totalSize/pageSize):(totalSize/pageSize)+1;
		pageBean.setPageCount(pageCount);
		pageBean.setPageSize(pageSize);
		pageBean.setCurrentPage(currentPage);
		pageBean.setTotalSize(totalSize);
		int begin = (currentPage-1)*pageSize;
		List<Department> list = departmentDaoImpl.findByPage(begin,pageSize);
		pageBean.setList(list);
		ActionContext.getContext().put("list", list);
		return pageBean;
	}
	public void save(Department department) {
		departmentDaoImpl.save(department);
	}
	public Department editById(Integer did) {
		return departmentDaoImpl.editById(did);
	}
	public void update(Department department) {
		departmentDaoImpl.update(department);
	}
	public void delete(Department dep) {
		departmentDaoImpl.delete(dep);
	}
	public List<Department> findAll() {
		return departmentDaoImpl.findAll();
	}
	
}
