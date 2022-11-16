/*
 * Author Name : M.Krishna.
 * Date: 16-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package Domain;

public class Employee {
    private String employeeName;
    private int employeeId;
    private long MobileNumber;
    private String position;

    public Employee() {
    }

    public Employee(String employeeName, int employeeId, long mobileNumber, String position) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        MobileNumber = mobileNumber;
        this.position = position;
    }
}
