package com.cam.api.talleres.controller;

import com.cam.api.talleres.dto.UbiGeoDTO;
import com.cam.api.talleres.entity.UbiGeoEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ubi-geo")
public class UbiGeoController extends CRUDControllerImplDTO<UbiGeoDTO, Integer> {
}
