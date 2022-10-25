package com.cam.api.talleres.service;

import com.cam.api.talleres.dto.UnidadOperativaDTO;

import java.util.List;

public interface IUnidadOperativaService extends ICRUD<UnidadOperativaDTO, Integer>{

    List<UnidadOperativaDTO> obtenerUnidadesOperativasPadres();

    List<UnidadOperativaDTO> obtenerUnidadesOperativasHijas(Integer idUnidadOperativaPadre);

}
