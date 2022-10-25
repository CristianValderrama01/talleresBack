package com.cam.api.talleres.service;

import com.cam.api.talleres.dto.RelacionesCiramDTO;
import com.cam.api.talleres.dto.UnidadOperativaDTO;
import com.cam.api.talleres.entity.RelacionesCiramEntity;

import java.util.List;
import java.util.Set;

public interface IRelacionesCiramService extends ICRUD<RelacionesCiramDTO, Integer>{

    List<RelacionesCiramDTO> buscarPorUnidadOpePadre(int idUnidadOperativaPadre);


}
