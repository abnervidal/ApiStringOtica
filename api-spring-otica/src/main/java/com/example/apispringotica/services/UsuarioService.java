package com.example.apispringotica.services;

import java.util.List;
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.example.apispringotica.entities.Usuario;
import com.example.apispringotica.repositories.UsuarioRepository;


@Service
public class UsuarioService {
    // private static final String PASSWORD_REGEX = "^(?=.*[a-zA-Z]).{6,}$";
    // private static final Pattern pattern = Pattern.compile(PASSWORD_REGEX);

    // @Autowired
    // private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> create(Usuario usuario) {

        // String senhaNormal = usuario.getSenha();
        // String senhaCriptografada = bCryptPasswordEncoder.encode(senhaNormal);
        // usuario.setSenha(senhaCriptografada);
        
        // Usuario usr = usuarioRepository.getUsuarioPorLogin(usuario.getLogin());
        // if(usr != null) {
        //     throw new RuntimeException("Login já existe");
        // }

        // Matcher matcher = pattern.matcher(senhaNormal);
        
        usuarioRepository.save(usuario);
        return list();
    }

    public List<Usuario> list() {
        return usuarioRepository.findAll();
    }
    public List<Usuario> update(Usuario usuario) {
        usuarioRepository.save(usuario);
        return list();
    }
    public List<Usuario> delete(Integer id) {
        usuarioRepository.deleteById(id);
        return list();
    }
}
