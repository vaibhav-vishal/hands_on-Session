package com.training.handson1;

public class EmpException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long salary;
	public EmpException(long salary) {
		// TODO Auto-generated constructor stub
		this.salary = salary;
	}
	
	public String getMessage(){
		
		String returnString = "";
		if(salary == 8500)
			returnString = "Salary for unskilled employee shoud be more than 8500";
		else if(salary == 9500)
			returnString =  "Salary for semi skilled employee shoud be more than 9500";
		else if(salary == 10500)
			returnString = "Salary for skilled employee shoud be more than 10500";
		
		return returnString;
	}

}
