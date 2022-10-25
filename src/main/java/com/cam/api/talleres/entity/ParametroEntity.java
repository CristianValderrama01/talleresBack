package com.cam.api.talleres.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "parametro")
public class ParametroEntity {

    @Id
    @Column(name = "id_parametro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idParametro;

    @Column(name = "tipo", length = 100)
    private String tipo;

    @Column(name = "id_padre")
    private int padre;

    @Column(name = "nombre", length = 1000)
    private String nombre;

    @Column(name = "descripcion", length = 1000)
    private String descripcion;

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
