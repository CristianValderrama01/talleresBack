package com.cam.api.talleres.service;

import com.cam.api.talleres.dto.ParametroDTO;
import com.cam.api.talleres.entity.ParametroEntity;

import java.util.List;

public interface IParametroService extends ICRUD<ParametroDTO, Integer>{

    List<ParametroDTO> findAllByPadre(Integer idPadre);
}
