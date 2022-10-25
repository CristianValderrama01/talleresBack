package com.cam.api.talleres.dto;

import com.cam.api.talleres.entity.PersonaEntity;
import com.cam.api.talleres.entity.TalleresEntity;
import com.cam.api.talleres.entity.UnidadOperativaEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class TallerHorariosCabDTO {

    private int idTallerHorarioCab;
    @NotNull
    private TalleresEntity taller;
    @NotNull
    private UnidadOperativaEntity unidadOperativa;
    @NotNull
    private PersonaEntity persona;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime fecInicio;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime fecFin;
    private String modalidad;
    private String estado;

    private int activo;
    private LocalDateTime fecCreacion;
    private String userCreacion;
    private LocalDateTime fecModificacion;
    private String userModificacion;
}
