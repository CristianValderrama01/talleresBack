package com.cam.api.talleres.controller;

import com.cam.api.talleres.dto.RelacionesCiramDTO;
import com.cam.api.talleres.entity.RelacionesCiramEntity;
import com.cam.api.talleres.service.IRelacionesCiramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/relaciones-ciram")
public class RelacionesCiramController extends CRUDControllerImplDTO<RelacionesCiramDTO, Integer> {

    @Autowired
    private IRelacionesCiramService service;

    @GetMapping("/buscar-padre/{idUnidadOperativaPadre}")
    public ResponseEntity<List<RelacionesCiramDTO>> buscarPorUnidadOpePadre(@PathVariable int idUnidadOperativaPadre) throws Exception {
        return new ResponseEntity<>(service.buscarPorUnidadOpePadre(idUnidadOperativaPadre), HttpStatus.OK);
    }
}
