package com.cam.api.talleres.serviceImpl;

import com.cam.api.talleres.dto.TallerHorariosCabDTO;
import com.cam.api.talleres.entity.TallerHorariosCabEntity;
import com.cam.api.talleres.repository.IGenericRepository;
import com.cam.api.talleres.repository.ITallerHorariosCabRepository;
import com.cam.api.talleres.service.ITallerHorariosCabService;
import com.cam.api.talleres.transform.IGenericTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TallerHorariosCabServiceImpl extends CRUDImplDTO<TallerHorariosCabDTO, TallerHorariosCabEntity, Integer> implements ITallerHorariosCabService {

    @Autowired
    private ITallerHorariosCabRepository repository;

    @Autowired
    protected IGenericTransform<TallerHorariosCabDTO, TallerHorariosCabEntity> transform;

    @Override
    protected IGenericRepository<TallerHorariosCabEntity, Integer> getRepository() {
        return repository;
    }

    @Override
    public List<TallerHorariosCabDTO> buscarPorTallerTalleristaFecha(int idTaller, int idPersona, LocalDateTime dia) {
        List<TallerHorariosCabDTO> dtos = new ArrayList<>();
        List<TallerHorariosCabEntity> entitys =  repository.buscarPorTallerTalleristaFecha(idTaller,idPersona, dia);

        for (TallerHorariosCabEntity t : entitys){
            dtos.add(transform.getDTO(t));
        }
        return dtos;
    }
}
