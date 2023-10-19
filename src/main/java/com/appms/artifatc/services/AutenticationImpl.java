package com.appms.artifatc.services;

import com.appms.artifatc.model.UsuarioActualizar;
import com.appms.artifatc.model.UsuarioRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Slf4j
public class AutenticationImpl implements AuthenticationI{

    @Override
    public String login(UsuarioRequest request) {
        return "Login exitoso";
    }

    @Override
    public String actualizarUsuario(UsuarioActualizar request) {
        log.info("LLAMANDO AL METODO DE ACUALIZA USUARIO REQUES = [{}]", request);
        UsuarioActualizar usuarioAnterior = UsuarioActualizar.builder()
                .id(1)
                .nombre("cesar")
                .saldo(new BigDecimal(100))
                .build();

        usuarioAnterior.setSaldo(request.getSaldo());
        usuarioAnterior.setNombre(request.getNombre());

        return "Usuario Actualizado Correctamente".concat(usuarioAnterior.getNombre());

    }
}
