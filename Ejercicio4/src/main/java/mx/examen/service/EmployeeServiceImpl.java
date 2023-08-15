package mx.examen.service;

import lombok.AllArgsConstructor;
import mx.examen.dao.EmployeeDao;
import mx.examen.models.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@AllArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService{

    EmployeeDao employeeDao;

    @Override
    public ArrayList<Employee> getEmployees() {
        ArrayList<Employee> employees = employeeDao.getEmployeesFromDb();
        System.out.println(employees);
        return employees;
    }

    @Override
    public Employee getEmployee(int id) {
        Employee employee = employeeDao.getEmployeeFromDb(id);
        System.out.println(employee);
        return employee;
    }
}
