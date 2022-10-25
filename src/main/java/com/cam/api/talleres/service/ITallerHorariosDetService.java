package com.cam.api.talleres.service;

import com.cam.api.talleres.dto.TallerHorariosDetDTO;

import java.time.LocalDateTime;
import java.util.List;

public interface ITallerHorariosDetService extends ICRUD<TallerHorariosDetDTO, Integer>{

    List<TallerHorariosDetDTO> buscarPorTallerTalleristaFecha (int idTaller, int idPersona, LocalDateTime dia);
}
