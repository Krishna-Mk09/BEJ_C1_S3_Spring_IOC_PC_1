/*
 * Author Name : M.Krishna.
 * Date: 16-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package Domain;

public class Department {
    // Declaring the variables.
    private int departmentCode;
    private String type;

    // A default constructor.
    public Department() {
    }

    // This is a constructor.
    public Department(int departmentCode, String type) {
        this.departmentCode = departmentCode;
        this.type = type;
    }

    // This is a getter and setter method.
    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Overriding the toString method.
    @Override
    public String toString() {
        return "Department{" + "departmentCode=" + departmentCode + ", type='" + type + '\'' + '}';
    }
}
