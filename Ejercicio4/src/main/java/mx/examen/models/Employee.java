package mx.examen.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    private int id;
    private String name;
    private String lastName;
    private String rfc;
    private String curp;
    private int age;
}
