package com.kypy.kyp;

import java.util.ArrayList;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class ParkingTests {

	@Test
	public void unaddedEmployeesAreAddedToEmployeeList() {
		// given
		Company c = new Company();
		Employee e = new Employee("Gabriel", 4, "yes", "junior");
		c.addEmployeeToList(e);
		// when
		ArrayList<Employee> l2 = c.getEmployeeList();
		// then
		List<Employee> l3 = new ArrayList<>();
		l3.add(e);
		Assert.assertEquals(l2, l3);
	}
	
	@Test
	public void unsortedEmployeesAreSorted() {
		// given
		List<Employee> l1 = new ArrayList<>();
		Company c = new Company();
		Employee e = new Employee("Gabriel", 4, "yes", "junior");
		Employee e1 = new Employee("Mihai", 2, "no", "manager");
		Employee e2 = new Employee("Andrei", 1, "no", "junior");
		Employee e3 = new Employee("Cristian", 8, "yes", "manager");
		l1.add(e);
		l1.add(e1);
		l1.add(e2);
	    l1.add(e3);
		// when
	    c.addEmployeeToList(e);
	    c.addEmployeeToList(e1);
	    c.addEmployeeToList(e2);
	    c.addEmployeeToList(e3);
	    List<Employee> l2 = c.sortEmployeeWithoutParking(); 
		// then
		List<Employee> l3 = new ArrayList<>(); 
		l3.add(e1);
		l3.add(e2);
		Assert.assertEquals(l2, l3);
	}
	
}
/*given
		String s1 = new String("dani has apples.");
		StringUtility su = new StringUtility();
		// when
		String s2 = su.removeAllWhiteSpaces(s1);
		// then
		String s3 = new String("danihasapples.");
		Assert.assertEquals(s2, s3);*/