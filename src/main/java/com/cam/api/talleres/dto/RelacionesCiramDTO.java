package com.cam.api.talleres.dto;

import com.cam.api.talleres.entity.UnidadOperativaEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class RelacionesCiramDTO {

    private int idRelacionCiramCam;
    @NotNull
    private UnidadOperativaEntity unidadOpePadre;
    private UnidadOperativaEntity unidadOpeHijo;
    private String estado;

    private int activo;
    private LocalDateTime fecCreacion;
    private String userCreacion;
    private LocalDateTime fecModificacion;
    private String userModificacion;
}
