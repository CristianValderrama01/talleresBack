package com.cam.api.talleres.controller;

import com.cam.api.talleres.dto.PerfilesDTO;
import com.cam.api.talleres.entity.PerfilesEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/perfiles")
public class PerfilesController extends CRUDControllerImplDTO<PerfilesDTO, Integer> {
}
