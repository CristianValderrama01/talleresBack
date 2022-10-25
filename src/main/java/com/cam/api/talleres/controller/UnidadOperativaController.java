package com.cam.api.talleres.controller;

import com.cam.api.talleres.dto.UnidadOperativaDTO;
import com.cam.api.talleres.entity.UnidadOperativaEntity;
import com.cam.api.talleres.service.IUnidadOperativaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/unidad-operativa")
public class UnidadOperativaController extends CRUDControllerImplDTO<UnidadOperativaDTO, Integer> {

    @Autowired
    private IUnidadOperativaService service;

    @GetMapping("/unidades-operativas-padres")
    public ResponseEntity<List<UnidadOperativaDTO>> obtenerUnidadesOperativasPadres() throws Exception {
        return new ResponseEntity<>(service.obtenerUnidadesOperativasPadres(), HttpStatus.OK);
    }

    @GetMapping("/unidades-operativas-hijas/{idUnidadOperativaPadre}")
    public ResponseEntity<List<UnidadOperativaDTO>> obtenerUnidadesOperativasHijas(@PathVariable int idUnidadOperativaPadre) throws Exception {
        return new ResponseEntity<>(service.obtenerUnidadesOperativasHijas(idUnidadOperativaPadre), HttpStatus.OK);
    }
}
