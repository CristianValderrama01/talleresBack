package com.cam.api.talleres.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "asistencia")
public class AsistenciaEntity {

    @Id
    @Column(name = "id_asistencia")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAsistencia;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_tallerdet", referencedColumnName = "id_tallerdet")
    private  TallerHorariosDetEntity tallerDet;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_asegurado_fk", referencedColumnName = "id_asegurado")
    private  AseguradoEntity asegurado;

    @Column(name = "estadoasistencia", length = 100)
    private  String estadoAsistencia;

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
