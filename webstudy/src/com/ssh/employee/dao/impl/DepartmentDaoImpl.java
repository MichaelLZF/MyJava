package com.ssh.employee.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ssh.employee.domain.Department;

public class DepartmentDaoImpl extends HibernateDaoSupport{

	@SuppressWarnings("unchecked")
	public int findCount() {
		String hql = "select count(*) from Department";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size()>0){
			return list.get(0).intValue();
		}else{
			return 0;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Department> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Department.class);
		List<Department> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	public void save(Department department) {
		this.getHibernateTemplate().save(department);
	}

	public Department editById(Integer did) {
		return this.getHibernateTemplate().get(Department.class,did);
	}

	public void update(Department department) {
		this.getHibernateTemplate().update(department);
	}

	public void delete(Department dep) {
		this.getHibernateTemplate().delete(dep);
	}

	@SuppressWarnings("unchecked")
	public List<Department> findAll() {
		String hql = "from Department";
		List<Department> list = this.getHibernateTemplate().find(hql);
		return list;
	}
}
