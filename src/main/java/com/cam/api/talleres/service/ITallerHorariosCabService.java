package com.cam.api.talleres.service;

import com.cam.api.talleres.dto.TallerHorariosCabDTO;

import java.time.LocalDateTime;
import java.util.List;

public interface ITallerHorariosCabService extends ICRUD<TallerHorariosCabDTO, Integer>{

    List<TallerHorariosCabDTO> buscarPorTallerTalleristaFecha (int idTaller, int idPersona, LocalDateTime dia);
}
