/*
 * Author Name : M.Krishna.
 * Date: 16-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package Domain;

import org.springframework.context.annotation.Bean;

public class EmployeeConfig {
    @Bean("empBean1")
    public Employee getEmp1Details() {
        Employee employee = new Employee();
        employee.setEmployeeId(1001);
        employee.setEmployeeName("krishna");
        employee.setPosition("team-lead");
        employee.setMobileNumber(78314781892L);
        return employee;
    }

    @Bean
    public Department getDepartment() {
        return new Department(027, "IT");
    }
}
