package com.cam.api.talleres.dto;

import com.cam.api.talleres.entity.TallerGrupoEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class TalleresDTO {

    private int idTaller;
    @NotNull
    private TallerGrupoEntity tallergrupo;
    private String codTaller;
    private String descTaller;
    private String estado;

    private int activo;
    private LocalDateTime fecCreacion;
    private String userCreacion;
    private LocalDateTime fecModificacion;
    private String userModificacion;
}
