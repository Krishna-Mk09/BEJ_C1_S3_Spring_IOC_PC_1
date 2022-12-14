/*
 * Author Name : M.Krishna.
 * Date: 16-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package Domain;

import org.springframework.context.annotation.Bean;

/**
 * The class EmployeeConfig is annotated with @Configuration, which means that it will be used by Spring to create and
 * manage beans
 */
public class EmployeeConfig {
    /**
     * The function getEmp1Details() returns an object of type Employee
     *
     * @return Employee object
     */
    @Bean("empBean1")
    public Employee getEmp1Details() {
        Employee employee = new Employee();
        employee.setEmployeeId(1001);
        employee.setEmployeeName("krishna");
        employee.setPosition("team-lead");
        employee.setMobileNumber(78314781892L);
        return employee;
    }

    /**
     * The function getEmp2Details() returns an object of type Employee
     *
     * @return A bean object
     */
    @Bean("empBean2")
    public Employee getEmp2Details() {
        Employee employee = new Employee();
        employee.setEmployeeId(1002);
        employee.setEmployeeName("Vijay");
        employee.setPosition("associate");
        employee.setMobileNumber(78314732892L);
        return employee;
    }

    /**
     * The function getEmp3Details() returns an object of type Employee
     *
     * @return A bean object
     */
    @Bean("empBean3")
    public Employee getEmp3Details() {
        Employee employee = new Employee();
        employee.setEmployeeId(1004);
        employee.setEmployeeName("Bharath");
        employee.setPosition("team-lead");
        employee.setMobileNumber(234314781892L);
        return employee;
    }

    /**
     * The function is annotated with @Bean, which means that it will return an object that should be registered as a bean
     * in the Spring application context
     *
     * @return A new instance of the Department class.
     */
    @Bean
    public Department getDepartment() {
        return new Department(027, "IT");
    }
}
