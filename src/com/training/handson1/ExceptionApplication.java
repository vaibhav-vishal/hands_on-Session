package com.training.handson1;

public class ExceptionApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			@SuppressWarnings("unused")
			Employee emp = new Employee("asdf", "skilled", 101, 5000);
		} catch (EmpException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		finally{
			
		}
	}

}
