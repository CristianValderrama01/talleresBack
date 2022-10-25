package com.cam.api.talleres.controller;

import com.cam.api.talleres.dto.BuscarTallerCabDTO;
import com.cam.api.talleres.dto.TallerHorariosDetDTO;
import com.cam.api.talleres.service.ITallerHorariosDetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/taller-horarios-det")
public class TallerHorariosDetController extends CRUDControllerImplDTO<TallerHorariosDetDTO, Integer> {

    @Autowired
    private ITallerHorariosDetService service;

    @PostMapping("/buscar")
    public ResponseEntity<List<TallerHorariosDetDTO>> buscarPorTallerTalleristaFecha(@RequestBody BuscarTallerCabDTO buscar) throws Exception {
        return new ResponseEntity<List<TallerHorariosDetDTO>>(service.buscarPorTallerTalleristaFecha(buscar.getIdTaller(), buscar.getIdTallerista(), buscar.getDia()), HttpStatus.OK);
    }
}
