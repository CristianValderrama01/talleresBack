package com.cam.api.talleres.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PerfilesDTO {

    private int idPerfil;
    private String descPerfil;
    private String estado;

    private int activo;
    private LocalDateTime fecCreacion;
    private String userCreacion;
    private LocalDateTime fecModificacion;
    private String userModificacion;
}
