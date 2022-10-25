package com.cam.api.talleres.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "usuario")
public class UsuarioEntity {

    @Id
    @Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_perfil_fk", referencedColumnName = "id_perfil")
    private PerfilesEntity perfil;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_persona_fk", referencedColumnName = "id_persona")
    private PersonaEntity persona;

    @Column(name = "usuario", length = 18)
    private String usuario;

    @Column(name = "contraseña", length = 100)
    private String contraseña;

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
