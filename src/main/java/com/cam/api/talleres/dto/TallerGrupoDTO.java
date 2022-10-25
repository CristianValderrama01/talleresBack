package com.cam.api.talleres.dto;

import com.cam.api.talleres.entity.ProgramasEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class TallerGrupoDTO {

    private int idTallerGrupo;
    @NotNull
    private ProgramasEntity programa;
    private String descTallerGrupo;
    private String codTallerGrupo;

    private int activo;
    private LocalDateTime fecCreacion;
    private String userCreacion;
    private LocalDateTime fecModificacion;
    private String userModificacion;
}
