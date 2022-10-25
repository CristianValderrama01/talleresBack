package com.cam.api.talleres.dto;

import com.cam.api.talleres.entity.PerfilesEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class PrivilegiosPorPerfilDTO {

    private int idPrivilegios;
    @NotNull
    private PerfilesEntity perfil;
    private String privilegiosDesc;
    private String estado;

    private int activo;
    private LocalDateTime fecCreacion;
    private String userCreacion;
    private LocalDateTime fecModificacion;
    private String userModificacion;
}
