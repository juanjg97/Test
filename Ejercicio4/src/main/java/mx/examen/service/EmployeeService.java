package mx.examen.service;

import mx.examen.models.Employee;

import java.util.ArrayList;


public interface EmployeeService {
    ArrayList<Employee> getEmployees();
    Employee getEmployee(int id);
}
