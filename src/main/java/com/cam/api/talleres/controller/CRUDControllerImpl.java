package com.cam.api.talleres.controller;

import com.cam.api.talleres.exeption.ModeloNotFoundException;
import com.cam.api.talleres.serviceImpl.CRUDImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

public abstract class CRUDControllerImpl<T, S extends CRUDImpl<T, Integer>> implements ICRUDController<T, Integer> {
    //public abstract class GenericControllerImpl<T, ID> implements IGenericController<T, ID>{
    @Autowired
    //private CRUDImpl<T, ID> service;
    private S service;

    @Override
    @PostMapping()
    public ResponseEntity<T> registrar(T t) throws Exception {
        return new ResponseEntity<T>(service.registrar(t), HttpStatus.OK);
    }

    @Override
    @PutMapping
    public ResponseEntity<T> actualizar(T t) throws Exception {
        return new ResponseEntity<T>(service.actualizar(t), HttpStatus.OK);
    }

    @Override
    @GetMapping
    public ResponseEntity<List<T>> listar() throws Exception {
        return new ResponseEntity<List<T>>(service.listar(), HttpStatus.OK);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<T> listarPorId(Integer id) throws Exception {
        T obj = service.listarPorId(id);
        if(obj == null){
            throw new ModeloNotFoundException("ID NO ENCONTRADO" + id);
        }
        return new ResponseEntity<T>(obj, HttpStatus.OK);
    }

    @Override
    @DeleteMapping("{id}")
    public ResponseEntity<?> eliminar(Integer id) throws Exception {
        T obj = service.listarPorId(id);
        if (obj == null){
            throw new ModeloNotFoundException("ID NO ENCONTRADO" + id);
        }
        service.eliminar(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
