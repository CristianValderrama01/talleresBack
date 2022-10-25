package com.cam.api.talleres.dto;

import com.cam.api.talleres.entity.PerfilesEntity;
import com.cam.api.talleres.entity.PersonaEntity;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UsuarioDTO {

    private int idUsuario;
    private PerfilesEntity perfil;
    private PersonaEntity persona;
    private String usuario;
    private String contraseña;

    private int activo;
    private LocalDateTime fecCreacion;
    private String userCreacion;
    private LocalDateTime fecModificacion;
    private String userModificacion;
}
