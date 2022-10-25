package com.cam.api.talleres.controller;

import com.cam.api.talleres.dto.PrivilegiosPorPerfilDTO;
import com.cam.api.talleres.entity.PrivilegiosPorPerfilEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/privilegios-por-perfil")
public class PrivilegiosPorPerfilController extends CRUDControllerImplDTO<PrivilegiosPorPerfilDTO, Integer> {
}
