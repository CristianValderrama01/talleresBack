package com.cam.api.talleres.controller;

import com.cam.api.talleres.dto.TalleresDTO;
import com.cam.api.talleres.entity.TalleresEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/talleres")
public class TalleresController extends CRUDControllerImplDTO<TalleresDTO, Integer> {
}
