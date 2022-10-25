package com.cam.api.talleres.controller;

import com.cam.api.talleres.dto.AsistenciaDTO;
import com.cam.api.talleres.entity.AsistenciaEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/asistencias")
public class AsistenciaController extends CRUDControllerImplDTO<AsistenciaDTO, Integer> {
}
