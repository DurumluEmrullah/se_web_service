package ws.service;

import model.Employee;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@WebService(endpointInterface ="ws.service.EmployeeService" )
public class EmployeeServiceImpl implements EmployeeService{

    public static List<Employee> employeeList = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee ) {
        System.out.println("EmployeeServiceImpl#addEmployee is invoked ! ");
        employeeList.add(employee);

    }

    @Override
    public Employee getEmployee(int id) {
        System.out.println("EmployeeServiceImpl#getEmployee is invoked ! ");
        Predicate<Employee> predicate = e->e.getId() == id;
        return employeeList.stream().filter(predicate).findAny().orElse(null);
    }
}
