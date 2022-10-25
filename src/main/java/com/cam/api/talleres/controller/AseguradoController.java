package com.cam.api.talleres.controller;

import com.cam.api.talleres.dto.AseguradoDTO;
import com.cam.api.talleres.exeption.ModeloNotFoundException;
import com.cam.api.talleres.service.IAseguradoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/asegurados")
public class AseguradoController extends CRUDControllerImplDTO<AseguradoDTO, Integer> {
    @Autowired
    private IAseguradoService service;

    @GetMapping("/buscar")
    public ResponseEntity<AseguradoDTO> findByTipoDocNumDoc(@RequestParam(name = "tipoDoc")int tipoDoc,
                                                            @RequestParam(name = "numDoc") String numDoc) throws Exception {
        AseguradoDTO dto = service.findByTipoDocAndNumDoc(tipoDoc, numDoc);

        if(dto == null){
            throw new ModeloNotFoundException("ASEGURADO NO ENCONTRADO");
        }
        return new ResponseEntity<AseguradoDTO>(dto, HttpStatus.OK);
    }
}
