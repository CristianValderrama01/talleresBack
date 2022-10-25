package com.cam.api.talleres.controller;

import com.cam.api.talleres.dto.BuscarTallerCabDTO;
import com.cam.api.talleres.dto.TallerHorariosCabDTO;
import com.cam.api.talleres.entity.TallerHorariosCabEntity;
import com.cam.api.talleres.service.ITallerHorariosCabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/taller-horarios-cab")
public class TallerHorariosCabController extends CRUDControllerImplDTO<TallerHorariosCabDTO, Integer> {

    @Autowired
    private ITallerHorariosCabService service;

    @PostMapping("/buscar")
    public ResponseEntity<List<TallerHorariosCabDTO>> buscarPorTallerTalleristaFecha(@RequestBody BuscarTallerCabDTO buscar) throws Exception {
        return new ResponseEntity<List<TallerHorariosCabDTO>>(service.buscarPorTallerTalleristaFecha(buscar.getIdTaller(), buscar.getIdTallerista(), buscar.getDia()), HttpStatus.OK);
    }
}
