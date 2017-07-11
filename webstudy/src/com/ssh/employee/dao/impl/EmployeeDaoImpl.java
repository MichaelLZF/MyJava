package com.ssh.employee.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ssh.employee.dao.EmployeeDao;
import com.ssh.employee.domain.Employee;
public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao{
	@SuppressWarnings("unchecked")
	public Employee findUserExist(Employee employee) {
		System.out.println(employee.getUsername()+"===="+employee.getPassword());
		String hql = " from Employee where username = ? and password = ?";
		List<Employee> list = this.getHibernateTemplate().find(hql,employee.getUsername(),employee.getPassword());
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public int findAllCount(int currentPage) {
		String hql = "select count(*) from Employee";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size()>0){
			return list.get(0).intValue();
		}
		return 0;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> findAll(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Employee.class);
		List<Employee> list = this.getHibernateTemplate().findByCriteria(criteria, begin, pageSize);
		return list;
	}


	public void save(Employee employee) {
		this.getHibernateTemplate().save(employee);
	}

	public Employee edit(Integer eid) {
		return this.getHibernateTemplate().get(Employee.class, eid);
	}

	public void update(Employee em) {
		this.getHibernateTemplate().update(em);
	}


}
