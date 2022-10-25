package com.cam.api.talleres.service;

import com.cam.api.talleres.dto.PersonaDTO;

public interface IPersonaService extends ICRUD<PersonaDTO, Integer>{

    public PersonaDTO findByTipoDocAndNumDoc(int tipoDoc, String numDoc);
}
