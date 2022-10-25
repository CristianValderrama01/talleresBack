package com.cam.api.talleres.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ubigeo")
public class UbiGeoEntity {

    @Id
    @Column(name = "id_ubigeo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUbigeo;

    @Column(name = "ubigeo_dep", length = 100)
    private String ubigeoDep;

    @Column(name = "desc_dep", length = 1000)
    private String descDep;

    @Column(name = "ubigeo_dis", length = 100)
    private String ubigeoDis;

    @Column(name = "desc_dis", length = 1000)
    private String descDis;

    @Column(name = "ubigeo_prov", length = 100)
    private String ubigeoProv;

    @Column(name = "desc_prov", length = 1000)
    private String descProv;

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
