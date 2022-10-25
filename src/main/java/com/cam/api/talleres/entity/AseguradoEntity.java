package com.cam.api.talleres.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "asegurado")
public class AseguradoEntity {

    @Id
    @Column(name = "id_asegurado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAsegurado;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_unidadoperativa_fk", referencedColumnName = "id_unidadoperativa")
    private UnidadOperativaEntity unidadOperativa;

    @Column(name = "estadoinscripcion", nullable = false, length = 100)
    private String estadoInscripcion;

    @Column(name = "tipodoc", length = 100)
    private int tipoDoc;

    @Column(name = "numdoc", unique = true, length = 100)
    private String numDoc;

    @Column(name = "nombres", length = 100)
    private String nombres;

    @Column(name = "apellidoPaterno", length = 100)
    private String apellidoPaterno;

    @Column(name = "apellidomaterno", length = 100)
    private String apellidoMaterno;

    @Column(name = "direccionactual", length = 100)
    private String direccionActual;

    @Column(name = "celular", length = 100)
    private String celular;

    @Column(name = "telefono", length = 100)
    private String telefono;

    @Column(name = "correo", length = 100)
    private String correo;

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
