package com.cam.api.talleres.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "privilegiosporperfil")
public class PrivilegiosPorPerfilEntity {

    @Id
    @Column(name = "id_privilegios")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPrivilegios;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_perfil_fk", referencedColumnName = "id_perfil")
    private PerfilesEntity perfil;

    @Column(name = "privilegios_desc", length = 1000)
    private String privilegiosDesc;

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
