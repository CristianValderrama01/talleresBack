package com.cam.api.talleres.controller;

import com.cam.api.talleres.dto.ParametroDTO;
import com.cam.api.talleres.entity.ParametroEntity;
import com.cam.api.talleres.service.IParametroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/parametros")
public class ParametroController extends CRUDControllerImplDTO<ParametroDTO, Integer> {

    @Autowired
    private IParametroService service;

    @GetMapping("/id-padre/{idPadre}")
    public ResponseEntity<List<ParametroDTO>> findAllByPadre(@PathVariable int idPadre) throws Exception {
        return new ResponseEntity<>(service.findAllByPadre(idPadre), HttpStatus.OK);
    }
}
