package com.JavaInnerClasses;

public class Test2 
{

	public static void main(String[] args) 
	{
		//Cannot instantiate the type Department
		//anonymous inner class **
		Department department = new Department(123, "Finance")
		{

			@Override
			public void getDepartmentDetails() 
			{
				System.out.println(getDepartmentId());
				System.out.println(getDepartmentName());
				
			}
			
		};
		department.getDepartmentDetails();
		
		//by lambda expression
	}

}
