package com.cam.api.talleres.entity.controlVariables;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class ControlVariables {

    @Column(name = "activo")
    private int activo;

    @Column(name = "feccreacion")
    private LocalDateTime fecCreacion;

    @Column(name = "usercreacion", length = 20)
    private String userCreacion;

    @Column(name = "fecmodificacion")
    private LocalDateTime fecModificacion;

    @Column(name = "usermodificacion", length = 20)
    private String userModificacion;
}
