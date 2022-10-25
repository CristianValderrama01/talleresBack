package com.cam.api.talleres.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "relacionesciram")
public class RelacionesCiramEntity {

    @Id
    @Column(name = "id_relacionciramcam")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRelacionCiramCam;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_unidadopepadre", referencedColumnName = "id_unidadoperativa")
    private UnidadOperativaEntity unidadOpePadre;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_uniopehijo", referencedColumnName = "id_unidadoperativa")
    private UnidadOperativaEntity unidadOpeHijo;

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
