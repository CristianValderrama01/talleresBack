package com.cam.api.talleres.serviceImpl;

import com.cam.api.talleres.dto.TallerHorariosDetDTO;
import com.cam.api.talleres.entity.TallerHorariosDetEntity;
import com.cam.api.talleres.repository.IGenericRepository;
import com.cam.api.talleres.repository.ITallerHorariosDetRepository;
import com.cam.api.talleres.service.ITallerHorariosDetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TallerHorariosDetServiceImpl extends CRUDImplDTO<TallerHorariosDetDTO, TallerHorariosDetEntity, Integer> implements ITallerHorariosDetService {

    @Autowired
    private ITallerHorariosDetRepository repository;

    @Override
    protected IGenericRepository<TallerHorariosDetEntity, Integer> getRepository() {
        return repository;
    }

    @Override
    public List<TallerHorariosDetDTO> buscarPorTallerTalleristaFecha(int idTaller, int idPersona, LocalDateTime dia) {
        List<TallerHorariosDetDTO> dtos = new ArrayList<>();
        List<TallerHorariosDetEntity> entitys =  repository.buscarPorTallerTalleristaFecha(idTaller, idPersona, dia);

        for (TallerHorariosDetEntity t : entitys){
            dtos.add(transform.getDTO(t));
        }
        return dtos;
    }
}
