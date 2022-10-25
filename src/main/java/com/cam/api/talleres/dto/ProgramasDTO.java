package com.cam.api.talleres.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProgramasDTO {

    private int idPrograma;
    private String codPrograma;
    private String descPrograma;
    private String estado;

    private int activo;
    private LocalDateTime fecCreacion;
    private String userCreacion;
    private LocalDateTime fecModificacion;
    private String userModificacion;
}
