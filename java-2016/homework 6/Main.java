/**
 * This is the main class.
 * Created by Kypy Kyp on 12/21/2016.
 */
public class Main {
	/**
	 * This is the main method.
	 * Created by Kypy Kyp on 12/21/2016.
	 */
    public static void main (String args[]) {
        Employee a = new Employee("Alin", 5, "no", "manager");
        Employee m = new Employee("Mihai", 4, "yes", "junior");
        Employee r = new Employee("Raul", 3, "no", "junior");
        Employee p = new Employee("Patricia", 9, "no", "manager");
        Employee s = new Employee("Sergiu", 1, "yes", "manager");
        Employee v = new Employee("Victor", 11, "no", "junior");
        Company comp = new Company();
        comp.addEmployeeToList(a);
        comp.addEmployeeToList(m);
        comp.addEmployeeToList(r);
        comp.addEmployeeToList(p);
        comp.addEmployeeToList(s);
        comp.addEmployeeToList(v);

        System.out.println(comp.getEmployeeList());
        System.out.println(comp.getEmployeeWithNoParkPlace());
        System.out.println(comp.getManagerList());
        System.out.println(comp.getJuniorList());

        System.out.println("Unsorted employees list " + comp.getEmployeeWithNoParkPlace());
        System.out.println("Sorted employees list " + comp.getSortedEmployees());
    }
}