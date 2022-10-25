package com.cam.api.talleres.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ParametroDTO {

    private int idParametro;
    private String tipo;
    private int padre;
    private String nombre;
    private String descripcion;

    private int activo;
    private LocalDateTime fecCreacion;
    private String userCreacion;
    private LocalDateTime fecModificacion;
    private String userModificacion;
}
