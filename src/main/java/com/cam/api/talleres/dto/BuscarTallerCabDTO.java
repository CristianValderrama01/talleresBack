package com.cam.api.talleres.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BuscarTallerCabDTO {

    private int idTallerista;
    private int idTaller;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dia;
}
