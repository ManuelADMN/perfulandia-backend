package com.perfulandia.usuarioservice.model;

//Import
import jakarta.persistence.*;
import lombok.*;

//Lombok
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder // Genera constructores de una manera mas flexible
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String correo;
    private String rol; //ADMIN, GERENTE O USUARIO
}
