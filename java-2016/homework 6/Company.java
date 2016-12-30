
import java.util.*;

/**
 * This class contains 1 List, 1 Map and 1 sorting. Created by Kypy Kyp on
 * 12/21/2016.
 */
public class Company {

    private List<Employee> employeeList = new ArrayList<>();
    private HashMap<String, Integer> parkingMap = new HashMap<>();

    /**
     * This method adds the employees to the list called employeeList.
     * Created by Kypy Kyp on 12/21/2016.
     */
    public void addEmployeeToList(Employee emp) {
        employeeList.add(emp);
    }

    /**
     * This method returns the employees contained in employeeList.
     * Created by Kypy Kyp on 12/21/2016.
     */
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    /**
     * This method adds the employees without parkingplace to the parkingMap map.
     * This method returns a HashMap.
     * Created by Kypy Kyp on 12/21/2016.
     */

    public HashMap<String, Integer> getEmployeeWithNoParkPlace() {
        for (Employee empl : employeeList) {
            if (empl.getParkingPlace().equals("no")) {
                parkingMap.put(empl.getName(), empl.getTimeInCompany());
            }
        }
        return parkingMap;
    }

    public HashMap<String, Integer> getSortedEmployees() {
        return sortHashMapByValues(parkingMap);
    }

    private LinkedHashMap<String, Integer> sortHashMapByValues(HashMap<String, Integer> passedMap) {
        List<String> mapKeys = new ArrayList<>(passedMap.keySet());
        List<Integer> mapValues = new ArrayList<>(passedMap.values());
        Collections.sort(mapValues);
        Collections.sort(mapKeys);

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        Iterator<Integer> valueIt = mapValues.iterator();
        while (valueIt.hasNext()) {
            Integer val = valueIt.next();
            Iterator<String> keyIt = mapKeys.iterator();

            while (keyIt.hasNext()) {
                String key = keyIt.next();
                Integer comp1 = passedMap.get(key);
                Integer comp2 = val;

                if (comp1.equals(comp2)) {
                    keyIt.remove();
                    sortedMap.put(key, val);
                    break;
                }
            }
        }
        return sortedMap;
    }

    /**
     * getManagerList method finds the managers of the company.
     * This method returns an ArrayList with managers.
     * Created by Kypy Kyp on 12/21/2016.
     */

    public List<Employee> getManagerList() {
        List<Employee> managerList = new ArrayList<>();
        for (Employee empl : employeeList) {
            if (empl.getGrade().equals("manager")) {
                managerList.add(empl);
            }
        }
        return managerList;
    }

    /**
     * getJuniorList method finds the juniors of the company.
     * This method returns an ArrayList with juniors.
     * Created by Kypy Kyp on 12/21/2016.
     */

    public List<Employee> getJuniorList() {
        List<Employee> juniorList = new ArrayList<>();
        for (Employee empl : employeeList) {
            if (empl.getGrade().equals("junior")) {
                juniorList.add(empl);
            }
        }
        return juniorList;
    }
}

