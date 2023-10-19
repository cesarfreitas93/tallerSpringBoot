package com.appms.artifatc.services;

import com.appms.artifatc.model.UsuarioActualizar;
import com.appms.artifatc.model.UsuarioRequest;

public interface AuthenticationI {
    String login(UsuarioRequest request);
    String actualizarUsuario(UsuarioActualizar request);
}
