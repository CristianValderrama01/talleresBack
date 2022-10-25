package com.cam.api.talleres.controller;

import com.cam.api.talleres.dto.ProgramasDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/programas")
public class ProgramasController extends CRUDControllerImplDTO<ProgramasDTO, Integer> {
}
