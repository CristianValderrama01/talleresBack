package com.cam.api.talleres.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "programas")
public class ProgramasEntity {

    @Id
    @Column(name = "id_programa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPrograma;

    @Column(name = "cod_programa", length = 100)
    private String codPrograma;

    @Column(name = "desc_programa", length = 1000)
    private String descPrograma;

    @Column(name = "estado", length = 100)
    private String estado;

    //control variables
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
