package com.cam.api.talleres.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UnidadOperativaDTO {

    private int idUnidadOperativa;
    private String descUnidad;
    private String tipo;
    private String direccion;
    private String ubiGeodireccion;

    private int activo;
    private LocalDateTime fecCreacion;
    private String userCreacion;
    private LocalDateTime fecModificacion;
    private String userModificacion;
}
