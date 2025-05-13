package com.perfulandia.usuarioservice.service;


import com.perfulandia.usuarioservice.model.Usuario;
import com.perfulandia.usuarioservice.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UsuarioService {

    private final UsuarioRepository repo;
    //Constructor para inyectar repositorio
    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }
    //Metodos CRUD
    public Usuario guardar(Usuario usuario) {
        return repo.save(usuario);
    }

    //Metodo listar
    public List<Usuario> listar() {
        return repo.findAll();
    }
    //Buscar usuario por ID
    public Usuario buscar(long id) {
        return repo.findById(id).orElse(null);
    }
    //Eliminar
    public void eliminar(long id) {
        repo.deleteById(id);
    }

}
