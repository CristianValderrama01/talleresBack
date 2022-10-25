package com.cam.api.talleres.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tallerhorariosdet")
public class TallerHorariosDetEntity {

    @Id
    @Column(name = "id_tallerdet")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTallerDet;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_tallerhorariocab", referencedColumnName = "id_tallerhorariocab")
    private TallerHorariosCabEntity tallerHorarioCab;

    @Column(name = "dia")
    private LocalDateTime dia;

    @Column(name = "horaini")
    private LocalDateTime horaIni;

    @Column(name = "horafin")
    private LocalDateTime horaFin;

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
