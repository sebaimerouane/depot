package com.sebai.jsfBeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
//Import log4j classes.
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import com.sebai.data.Employee;

@ManagedBean
@SessionScoped
public class ViewEmployeesManagedBean {
	private static final Logger logger = LogManager.getLogger(ViewEmployeesManagedBean.class);
	private List<Employee> employees = new ArrayList<Employee>();

	public ViewEmployeesManagedBean(){

	}

	@PostConstruct
	public void populateEmployeeList(){
		logger.info("Populate Employee List !");
		for(int i = 1 ; i <= 10 ; i++){
			Employee emp = new Employee();
			emp.setEmployeeId(String.valueOf(i));
			emp.setEmployeeName("Employee#"+i);
			this.employees.add(emp);
		}
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
