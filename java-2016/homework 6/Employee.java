/**
 * This class contains the employees of a company.
 * Created by Kypy Kyp on 12/21/2016.
 */
public class Employee {

    private String name, parkingPlace, grade;
    private int timeInCompany;

    /**
     * This is an explicit constructor.
     *
     * @param name          is the first parameter
     * @param timeInCompany represents the senority in company
     * @param parkingPlace  can be: yes or no
     * @param grade         can be: manajer or junior
     *                      Created by Kypy Kyp on 12/21/2016.
     */
    public Employee(String name, int timeInCompany, String parkingPlace, String grade) {

        this.name = name;
        this.timeInCompany = timeInCompany;
        this.parkingPlace = parkingPlace;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeInCompany() {
        return timeInCompany;
    }

    public void setTimeInCompany(int timeInCompany) {
        this.timeInCompany = timeInCompany;
    }

    public String getParkingPlace() {
        return parkingPlace;
    }

    public void setParkingPlace(String parkingPlace) {
        this.parkingPlace = parkingPlace;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * This is an overriden method from the Object class.
     * Created by Kypy Kyp on 12/21/2016.
     */
    @Override
    public String toString() {
        return "Employee [name=" + name + ", timeInCompany=" + timeInCompany + ", parkingPlace=" + parkingPlace
                + ", grade=" + grade + "]";
    }
}

