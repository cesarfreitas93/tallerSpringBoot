package com.appms.artifatc.controllers;

import com.appms.artifatc.model.UsuarioActualizar;
import com.appms.artifatc.model.UsuarioRequest;
import com.appms.artifatc.services.AutenticationImpl;
import com.appms.artifatc.services.AuthenticationI;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final AuthenticationI authentication;

    @GetMapping("/saludo")
    public String saludo() {
        return "Hola Mundo";
    }

    @PostMapping("/login")
    public String login(@RequestBody UsuarioRequest request) {
        return authentication.login(request);
    }

    @PutMapping("/actualizar")
    public String actualizarUsuario(@RequestBody UsuarioActualizar request) {
        return authentication.actualizarUsuario(request);
    }
}
