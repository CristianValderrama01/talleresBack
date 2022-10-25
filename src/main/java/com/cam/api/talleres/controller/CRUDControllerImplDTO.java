package com.cam.api.talleres.controller;

import com.cam.api.talleres.exeption.ModeloNotFoundException;
import com.cam.api.talleres.service.ICRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public class CRUDControllerImplDTO<DTO, ID> implements ICRUDController<DTO, ID> {

    @Autowired
    private ICRUD<DTO, ID> service;
    //private S service;

    @Override
    @PostMapping()
    public ResponseEntity<DTO> registrar(DTO t) throws Exception {
        return new ResponseEntity<DTO>(service.registrar(t), HttpStatus.OK);
    }

    @Override
    @PutMapping
    public ResponseEntity<DTO> actualizar(DTO t) throws Exception {
        return new ResponseEntity<DTO>(service.actualizar(t), HttpStatus.OK);
    }

    @Override
    @GetMapping
    public ResponseEntity<List<DTO>> listar() throws Exception {
        return new ResponseEntity<List<DTO>>(service.listar(), HttpStatus.OK);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<DTO> listarPorId(ID id) throws Exception {
        DTO obj = service.listarPorId(id);
        if(obj == null){
            throw new ModeloNotFoundException("ID NO ENCONTRADO" + id);
        }
        return new ResponseEntity<DTO>(obj, HttpStatus.OK);
    }

    @Override
    @DeleteMapping("{id}")
    public ResponseEntity<?> eliminar(ID id) throws Exception {
        DTO obj = service.listarPorId(id);
        if (obj == null){
            throw new ModeloNotFoundException("ID NO ENCONTRADO" + id);
        }
        service.eliminar(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
