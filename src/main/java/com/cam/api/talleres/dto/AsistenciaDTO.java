package com.cam.api.talleres.dto;

import com.cam.api.talleres.entity.AseguradoEntity;
import com.cam.api.talleres.entity.TallerHorariosDetEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class AsistenciaDTO {

    private int idAsistencia;
    @NotNull
    private TallerHorariosDetEntity tallerDet;
    @NotNull
    private AseguradoEntity asegurado;
    private String estadoAsistencia;

    private int activo;
    private LocalDateTime fecCreacion;
    private String userCreacion;
    private LocalDateTime fecModificacion;
    private String userModificacion;
}
