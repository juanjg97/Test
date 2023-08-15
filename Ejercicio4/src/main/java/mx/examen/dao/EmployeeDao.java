package mx.examen.dao;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import mx.examen.models.Employee;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@AllArgsConstructor
@Repository
public class EmployeeDao {
    Faker faker;
    ArrayList<Employee> employees = new ArrayList<Employee>();

    @PostConstruct
   public void initData(){
        for(int i = 0; i <10;i++){
            employees.add(
                    new Employee(
                            i,
                            faker.name().firstName(),
                            faker.name().lastName(),
                            "ABCD",
                            "xyzq",
                            10+i));
        }
    }


    public ArrayList<Employee> getEmployeesFromDb(){
        return employees;
    }

    public Employee getEmployeeFromDb(int id){
        return employees.get(id);
    }
}
