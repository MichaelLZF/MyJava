package com.ssh.employee.action;

import java.util.List;

import com.ssh.employee.dao.impl.DepartmentDaoImpl;
import com.ssh.employee.domain.Department;
import com.ssh.employee.domain.Employee;
import com.ssh.employee.domain.PageBean;
import com.ssh.employee.service.impl.DepartmentServiceImpl;
import com.ssh.employee.service.impl.EmployeeServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 *员工管理的Action类
 */
@SuppressWarnings("serial")
public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>{
	//是struts与spring融合后自动注入的
	private Employee employee = new Employee();
	//使用spring将service注入
	private EmployeeServiceImpl employeeServiceImpl;
	private int currentPage=1;
	//spring注入部门管理的service
	private DepartmentServiceImpl departmentServiceImpl;
	public void setDepartmentServiceImpl(DepartmentServiceImpl departmentServiceImpl) {
		this.departmentServiceImpl = departmentServiceImpl;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public void setEmployeeServiceImpl(EmployeeServiceImpl employeeServiceImpl) {
		this.employeeServiceImpl = employeeServiceImpl;
	}
	public Employee getModel() {
		return employee;
	}
	public String login(){
		//登陆方法确定用户是否存在
		Employee exsitEmploy = employeeServiceImpl.findUserExist(employee);
		if(exsitEmploy==null){
			this.addActionError("用户名或者密码错误");
			return INPUT;
		}else{
			ActionContext.getContext().getSession().put("exsitEmploy",exsitEmploy );
			return SUCCESS;
		}
	}
	public String findAll(){
		PageBean<Employee> pageBean = employeeServiceImpl.findAll(currentPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}
	public String saveUI(){
		//用于查询出所有的部门信息
		List<Department> list = departmentServiceImpl.findAll();
		ActionContext.getContext().getValueStack().set("list",list);
		return "saveUI";
	}
	public String save(){
		System.out.println(employee.toString());
		employeeServiceImpl.save(employee);
		return "saveSuccess";
	}
	public String edit(){
		employee = employeeServiceImpl.edit(employee.getEid());
		List<Department> list = departmentServiceImpl.findAll();
		ActionContext.getContext().getValueStack().set("list",list);
		return "editSuccess";
	}
	public String update(){
		System.out.println(employee);
		employeeServiceImpl.update(employee);
		return "updateSuccess";
	}
}
