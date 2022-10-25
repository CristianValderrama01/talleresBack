package com.cam.api.talleres.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "persona")
public class PersonaEntity {

    @Id
    @Column(name = "id_persona")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersona;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_unidadoperativa", referencedColumnName = "id_unidadoperativa")
    private UnidadOperativaEntity UnidadOperativa;

    @Column(name = "tipodoc")
    private int tipoDoc;

    @Column(name = "numdoc", unique = true ,length = 100)
    private String numDoc;

    @Column(name = "nombres", length = 100)
    private String nombres;

    @Column(name = "apepaterno", length = 100)
    private String apePaterno;

    @Column(name = "apematerno", length = 100)
    private String apeMaterno;

    @Column(name = "celular", length = 100)
    private String celular;

    @Column(name = "ubigeodirecc", length = 1000)
    private String ubiGeodirecc;

    @Column(name = "correo", length = 100)
    private String correo;

    @Column(name = "fecingreso")
    private LocalDateTime fecIngreso;


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
