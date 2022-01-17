package publish;

import ws.service.EmployeeServiceImpl;

import javax.xml.ws.Endpoint;

public class Publisher {

    public static void main(String[] args) {

        String address= "http://127.0.0.1:8080/se_endpoint";
        Endpoint.publish(address,new EmployeeServiceImpl());
        System.out.println("Web service is running ! \n" +
                "address : " +address +"?wsdl");
    }
}
