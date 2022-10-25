package com.cam.api.talleres.dto;

import com.cam.api.talleres.entity.UnidadOperativaEntity;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class AseguradoDTO {

    private int idAsegurado;
    @NotNull
    private UnidadOperativaEntity unidadOperativa;
    private String estadoInscripcion;
    private int tipoDoc;
    private String numDoc;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String direccionActual;
    private String celular;
    private String telefono;
    private String correo;

    private int activo;
    private LocalDateTime fecCreacion;
    private String userCreacion;
    private LocalDateTime fecModificacion;
    private String userModificacion;
}
