package ws.service;

import model.Employee;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)// default =  SOAPBinding.Style.DOCUMENT
public interface EmployeeService {

    @WebMethod
    void addEmployee(@WebParam(name = "Employee")Employee employee);

    @WebMethod
    Employee getEmployee(@WebParam(name="id") int id);

}
