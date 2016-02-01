package com.training.handson1;

public class Employee {

	private String empName;
	private String empType;
	private long empId;
	private double salary;
	
	public Employee(String empName, String empType, long empId, double salary) throws EmpException {
		super();
		
		if(empType.equalsIgnoreCase("unskilled") && salary < 85000)
			throw new EmpException(8500);
		else if(empType.equalsIgnoreCase("semi skilled") && salary < 95000)
			throw new EmpException(9500);
		else if (empType.equalsIgnoreCase("skilled") && salary < 105000)
			throw new EmpException(10500);
		else{
			this.empName = empName;
			this.empType = empType;
			this.empId = empId;
			this.salary = salary;
		}
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) throws EmpException {
		if(empType.equalsIgnoreCase("unskilled") && salary < 85000)
			throw new EmpException(85000);
		else if(empType.equalsIgnoreCase("semi skilled") && salary < 95000)
			throw new EmpException(9500);
		else if (empType.equalsIgnoreCase("skilled") && salary < 105000)
			throw new EmpException(10500);
		else
			this.empType = empType;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
}
