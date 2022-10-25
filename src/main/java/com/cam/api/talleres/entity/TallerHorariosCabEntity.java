package com.cam.api.talleres.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tallerhorarioscab")
public class TallerHorariosCabEntity {

    @Id
    @Column(name = "id_tallerhorariocab")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTallerHorarioCab;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_taller", referencedColumnName = "id_taller")
    private TalleresEntity taller;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_unidadoperativa", referencedColumnName = "id_unidadoperativa")
    private UnidadOperativaEntity unidadOperativa;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    private PersonaEntity persona;

    @Column(name = "fecinicio")
    private LocalDateTime fecInicio;

    @Column(name = "fecfin")
    private LocalDateTime fecFin;

    @Column(name = "modalidad", length = 100)
    private String modalidad;

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
