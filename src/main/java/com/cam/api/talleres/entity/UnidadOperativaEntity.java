package com.cam.api.talleres.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "unidadoperativa")
public class UnidadOperativaEntity {

    @Id
    @Column(name = "id_unidadoperativa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUnidadOperativa;

    @Column(name = "des_unidad", length = 1000)
    private String descUnidad;

    @Column(name = "tipo", length = 100)
    private String tipo;

    @Column(name = "direccion", length = 1000)
    private String direccion;

    @Column(name = "ubigeodireccion", length = 100)
    private String ubiGeodireccion;

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
