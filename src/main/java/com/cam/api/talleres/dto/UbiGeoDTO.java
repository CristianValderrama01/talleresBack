package com.cam.api.talleres.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UbiGeoDTO {

    private int idUbigeo;
    private String ubigeoDep;
    private String descDep;
    private String ubigeoDis;
    private String descDis;
    private String ubigeoProv;
    private String descProv;

    private int activo;
    private LocalDateTime fecCreacion;
    private String userCreacion;
    private LocalDateTime fecModificacion;
    private String userModificacion;
}
