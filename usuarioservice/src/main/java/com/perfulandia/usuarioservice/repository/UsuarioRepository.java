package com.perfulandia.usuarioservice.repository;

//Import usuario
import com.perfulandia.usuarioservice.model.Usuario;
//Import JPA Repository (Permite realizar CRUD)
import org.springframework.data.jpa.repository.JpaRepository;

//Interfaz hereda JPA y gestiona la entidad usuario ID tipo Long
//findAll(), findById(id), save() y delete
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


}
