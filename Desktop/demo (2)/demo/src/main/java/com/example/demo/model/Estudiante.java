
package com.example.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

        

@Entity
@Data
public class Estudiante {
@Id
@Column
private Long iduser;
@Column
private String nombre;
@Column
private String apellido;
@Column
private String email;
@Column
private String telefono;
}
