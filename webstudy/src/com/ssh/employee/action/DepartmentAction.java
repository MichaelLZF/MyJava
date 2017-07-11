package com.ssh.employee.action;

import com.ssh.employee.domain.Department;
import com.ssh.employee.domain.PageBean;
import com.ssh.employee.service.impl.DepartmentServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 *部门action
 */
@SuppressWarnings("serial")
public class DepartmentAction extends ActionSupport implements ModelDriven<Department>{
	private Department department = new Department();
	//spring注入departmentServiceImpl
	private DepartmentServiceImpl departmentServiceImpl;
	//struts结合spring自动注入的department
	private int currentPage=1;
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public void setDepartmentServiceImpl(DepartmentServiceImpl departmentServiceImpl) {
		this.departmentServiceImpl = departmentServiceImpl;
	}
	public Department getModel() {
		return department;
	}
	public String findAll(){
		PageBean<Department> pageBean = departmentServiceImpl.findByPage(currentPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}
	//通过action返回添加的视图的jsp
	public String saveUI(){
		return "saveUI";
	}
	//添加部门的save方法
	public String saveInfo(){
		departmentServiceImpl.save(department);
		return "saveSuccess";
	}
	//通过ID找出对应的Department
	public String editById(){
		department = departmentServiceImpl.editById(department.getDid());
		return "editSuccess";
	}
	//修改对应的Department
	public String update(){
		departmentServiceImpl.update(department);
		return "updateSuccess";
	}
	public String delete(){
		Department dep = departmentServiceImpl.editById(department.getDid());
		departmentServiceImpl.delete(dep);
		return "deleteSuccess";
	}
}
