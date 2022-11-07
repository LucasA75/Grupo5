package com.grupo5.proyecto5codigo.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.grupo5.proyecto5codigo.models.Usuario;

public class TestUsuario {
    @Test
    void TestUsuario(){
    Usuario usuario = new Usuario();
    usuario.setNombre("Pepito");
    usuario.setContraseña("cassa");
    assertEquals(true, usuario.login("Pepito", "cassa"));
    }


}
