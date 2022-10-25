package com.cam.api.talleres.dto;

import com.cam.api.talleres.entity.UnidadOperativaEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class PersonaDTO implements Serializable {

    private int idPersona;
    @NotNull
    private UnidadOperativaEntity unidadOperativa;
    private int tipoDoc;
    private String numDoc;
    private String nombres;
    private String apePaterno;
    private String apeMaterno;
    private String celular;
    private String ubiGeodirecc;
    private String correo;
    private LocalDateTime fecIngreso;

    private int activo;
    private LocalDateTime fecCreacion;
    private String userCreacion;
    private LocalDateTime fecModificacion;
    private String userModificacion;
}
