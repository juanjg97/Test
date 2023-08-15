package mx.examen;

import lombok.AllArgsConstructor;
import mx.examen.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
@Service
@AllArgsConstructor
public class ExamenApplication implements CommandLineRunner {
	EmployeeService employeeService;
	public static void main(String[] args) {
		SpringApplication.run(ExamenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		employeeService.getEmployees();
		System.out.println("--------------------------");
		employeeService.getEmployee(1);
		*/
	}

}
