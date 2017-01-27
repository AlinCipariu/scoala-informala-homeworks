package com.kypy.kyp;

import java.util.*;

/**
 * This class contains 1 List, 1 Map and 1 sorting. Created by Kypy Kyp on
 * 12/21/2016.
 */
public class Company {

	public ArrayList<Employee> employeeList = new ArrayList<>();

	/**
	 * This method adds the employees to the list called employeeList. Created
	 * by Kypy Kyp on 12/21/2016.
	 */
	public void addEmployeeToList(Employee emp) {
		employeeList.add(emp);
	}

	/**
	 * This method returns the employees contained in employeeList. Created by
	 * Kypy Kyp on 12/21/2016.
	 */
	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	/**
	 * getMangermap method finds the juniors of the company. This method returns
	 * an ArrayList with juniors. Created by Kypy Kyp on 12/21/2016.
	 */

	public Map<String, Integer> getManagerMap() {
		Map<String, Integer> managerMap = new HashMap<String, Integer>();
		for (Employee e : employeeList) {
			managerMap.put(e.getName(), e.getTimeInCompany());

		}
		return managerMap;
	}

	/**
	 * getJuniormap method finds the juniors of the company. This method returns
	 * an ArrayList with juniors. Created by Kypy Kyp on 12/21/2016.
	 */

	public Map<String, Integer> getJuniorMap() {
		Map<String, Integer> juniorMap = new HashMap<String, Integer>();
		for (Employee e : employeeList) {
			juniorMap.put(e.getName(), e.getTimeInCompany());

		}
		return juniorMap;
	}

	/**
	 * This method adds the employees without parkingplace to
	 * employeeWithoutParking list This method creates and sorts the
	 * employeeWithoutParking
	 * 
	 * @return employeeWithoutParking list
	 */
	public List<Employee> sortEmployeeWithoutParking() {
		List<Employee> employeeWithoutParking = new ArrayList<>();
		for (Employee e : employeeList) {
			if (e.getParkingPlace().equals("no")) {
				employeeWithoutParking.add(e);
			}
		}
		Collections.sort(employeeWithoutParking, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o2.getTimeInCompany() - o1.getTimeInCompany();
			}
		});

		return employeeWithoutParking;

	}
}
