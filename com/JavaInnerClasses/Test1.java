package com.JavaInnerClasses;

public class Test1 {

	public static void main(String[] args) 
	{
		
		Customer customer = new Customer(1234, "Pratiksha", 8600557071L);
		System.out.println(customer.toString());
		
		System.out.println("------------------------------------------------------------------");
		
		Customer.Address address = customer.new Address("Satara");
		address.getCustomerDetails();
		
		System.out.println("------------------------------------------------------------------");
		
		Customer.Qualification.getQualificationDetails();
		
	}

}
