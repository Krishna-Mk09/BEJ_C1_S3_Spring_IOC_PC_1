/*
 * Author Name : M.Krishna.
 * Date: 16-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */

package Domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    // These are the attributes of the class.
    private String employeeName;
    private int employeeId;
    private long MobileNumber;
    private String position;
    // Injecting the Department object into the Employee object.
    @Autowired
    private Department employeeDepartment;

    // A default constructor.
    public Employee() {
    }

    // This is a constructor.
    public Employee(String employeeName, int employeeId, long mobileNumber, String position, Department employeeDepartment) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        MobileNumber = mobileNumber;
        this.position = position;
        this.employeeDepartment = employeeDepartment;
    }

    // This is a getter and setter method.
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public long getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Department getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(Department employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    // This is a method that is used to print the object.
    @Override
    public String toString() {
        return "Employee{" + "employeeName='" + employeeName + '\'' + ", employeeId=" + employeeId + ", MobileNumber=" + MobileNumber + ", position='" + position + '\'' + ", employeeDepartment=" + employeeDepartment + '}';
    }
}
