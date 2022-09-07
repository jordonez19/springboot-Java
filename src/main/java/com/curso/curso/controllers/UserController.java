package com.curso.curso.controllers;


import com.curso.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping(value = "/usuario/12345")
    public Usuario getUsuario(@PathVariable String id){
        Usuario u1 = new Usuario();
        u1.setId(id);
        u1.setNombre("xavi");
        u1.setApellido("ordonez");
        u1.setEmail("a@b.c");
        u1.setPassword("123456");
        u1.setTelefono("789546");
        return u1;
    }

    @RequestMapping(value = "/user/1234")
    public List<Usuario> getUsuario(){
        List<Usuario> usuarios = new ArrayList<>();

        Usuario u1 = new Usuario();
        u1.setId("1");
        u1.setNombre("xavi");
        u1.setApellido("ordonez");
        u1.setEmail("a@b.sc");
        u1.setPassword("789");
        u1.setTelefono("123");

        Usuario u2 = new Usuario();
        u2.setId("2");
        u2.setNombre("jane");
        u2.setApellido("pedraza");
        u2.setEmail("a@baa.c");
        u2.setPassword("789");
        u2.setTelefono("456");

        Usuario u3 = new Usuario();
        u3.setId("3");
        u3.setNombre("mia");
        u3.setApellido("ashmore");
        u3.setEmail("a@bddf.c");
        u3.setPassword("159");
        u3.setTelefono("753");


        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);

        return usuarios ;
    }


    @RequestMapping(value = "/user/123")
    public Usuario modificar(String id){
        Usuario u1 = new Usuario();
        u1.setId(id);
        u1.setNombre("xavi");
        u1.setApellido("ordonez");
        u1.setEmail("a@b.c");
        u1.setPassword("123456");
        u1.setTelefono("789546");
        return u1;
    }

    @RequestMapping(value = "/user/456")
    public Usuario eliminar(){
        Usuario u1 = new Usuario();
        u1.setNombre("xavi");
        u1.setApellido("ordonez");
        u1.setEmail("a@b.c");
        u1.setPassword("123456");
        u1.setTelefono("789546");
        return u1;
    }

    @RequestMapping(value = "/user/789")
    public Usuario buscar(){
        Usuario u1 = new Usuario();
        u1.setNombre("xavi");
        u1.setApellido("ordonez");
        u1.setEmail("a@b.c");
        u1.setPassword("123456");
        u1.setTelefono("789546");
        return u1;
    }


}
