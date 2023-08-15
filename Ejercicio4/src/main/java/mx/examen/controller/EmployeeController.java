package mx.examen.controller;

import lombok.AllArgsConstructor;
import mx.examen.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1")
@RestController
@AllArgsConstructor
public class EmployeeController {
    EmployeeService employeeService;
    @GetMapping("/personas")
    public ResponseEntity<?> getUserInfo(
            @RequestParam(name = "id",required = false) Integer id) {
        if(id !=null){
            return ResponseEntity.status(HttpStatus.OK).body(employeeService.getEmployee(id));
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(employeeService.getEmployees());
        }

    }
}
