package com.cam.api.talleres.controller;

import com.cam.api.talleres.dto.UsuarioDTO;
import com.cam.api.talleres.entity.UsuarioEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController extends CRUDControllerImplDTO<UsuarioDTO, Integer> {
}
