/*
 * Author Name : M.Krishna.
 * Date: 16-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package Domain;

public class Department {
    private int departmentCode;
    private String type;

    public Department() {
    }

    public Department(int departmentCode, String type) {
        this.departmentCode = departmentCode;
        this.type = type;
    }

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

    @Override
    public String toString() {
        return "Department{" + "departmentCode=" + departmentCode + ", type='" + type + '\'' + '}';
    }
}
