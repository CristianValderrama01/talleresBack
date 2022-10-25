package com.cam.api.talleres.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "talleres")
public class TalleresEntity {

    @Id
    @Column(name = "id_taller")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTaller;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_tallergrupo_fk", referencedColumnName = "id_tallergrupo")
    private TallerGrupoEntity tallergrupo;

    @Column(name = "cod_taller", length = 1000)
    private String codTaller;

    @Column(name = "desc_taller", length = 1000)
    private String descTaller;

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
