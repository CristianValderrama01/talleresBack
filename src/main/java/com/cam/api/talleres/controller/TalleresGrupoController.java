package com.cam.api.talleres.controller;

import com.cam.api.talleres.dto.TallerGrupoDTO;
import com.cam.api.talleres.entity.TallerGrupoEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/taller-grupo")
public class TalleresGrupoController extends CRUDControllerImplDTO<TallerGrupoDTO, Integer> {
}
