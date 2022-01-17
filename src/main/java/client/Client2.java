package client;

import model.Employee;
import ws.service.EmployeeService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class Client2 {

    public static void main(String[] args) throws MalformedURLException {
        String address = "http://127.0.0.1:8080/se_endpoint/employee.service";
        URL url = new URL(address);
        QName qName = new QName("http://service.ws/","EmployeeServiceImplService");
        Service service =Service.create(url,qName);


        EmployeeService port = service.getPort(EmployeeService.class);

        Random random = new Random();
        int id = Math.abs(random.nextInt())%5;
        System.out.println(id);

        Employee result = port.getEmployee(id);
        System.out.println(result.getName() + " / "+ result.getLastName());

    }
}
