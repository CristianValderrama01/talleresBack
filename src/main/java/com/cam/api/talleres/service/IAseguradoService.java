package com.cam.api.talleres.service;

import com.cam.api.talleres.dto.AseguradoDTO;

public interface IAseguradoService extends ICRUD<AseguradoDTO, Integer>{

    AseguradoDTO findByTipoDocAndNumDoc(int tipoDoc, String numDoc);
}
