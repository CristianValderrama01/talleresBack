package com.cam.api.talleres.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tallergrupo")
public class TallerGrupoEntity {

    @Id
    @Column(name = "id_tallergrupo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTallerGrupo;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_programa_fk", referencedColumnName = "id_programa")
    private ProgramasEntity programa;

    @Column(name = "desc_tallergrupo", length = 20)
    private String descTallerGrupo;

    @Column(name = "cod_tallergrupo", length = 20)
    private String codTallerGrupo;

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

