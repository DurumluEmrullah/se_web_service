package client;

import model.Employee;
import ws.service.EmployeeService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {

    public static void main(String[] args) throws MalformedURLException {
        String address = "http://127.0.0.1:8080/se_endpoint/employee.service";
        URL url = new URL(address);
        QName qName = new QName("http://service.ws/","EmployeeServiceImplService");
        Service service =Service.create(url,qName);


        Employee employee = new Employee(0,"Emrullah","Durumlu",10000);
        Employee employee2 = new Employee(1,"Samet","Duran",10000);
        Employee employee3 = new Employee(2,"Mustecep","Sahin",10000);
        Employee employee4 = new Employee(3,"Cihat Can","Kaya",10000);
        Employee employee5 = new Employee(4,"Rasime","Nezle",10000);


        EmployeeService port = service.getPort(EmployeeService.class);
        port.addEmployee(employee);
        port.addEmployee(employee2);
        port.addEmployee(employee3);
        port.addEmployee(employee4);
        port.addEmployee(employee5);


    }
}
