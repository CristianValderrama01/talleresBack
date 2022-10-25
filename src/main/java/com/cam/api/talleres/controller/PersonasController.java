package com.cam.api.talleres.controller;

import com.cam.api.talleres.dto.PersonaDTO;
import com.cam.api.talleres.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personas")
public class PersonasController extends CRUDControllerImplDTO<PersonaDTO, Integer>{

    @Autowired
    private IPersonaService service;

    @GetMapping("/buscar")
    public ResponseEntity<PersonaDTO> findByTipoDocAndNumDoc(@RequestParam(name = "tipoDoc")int tipoDoc,
                                                             @RequestParam(name = "numDoc") String numDoc) throws Exception {
        return new ResponseEntity<>(service.findByTipoDocAndNumDoc(tipoDoc, numDoc), HttpStatus.OK);
    }
}
