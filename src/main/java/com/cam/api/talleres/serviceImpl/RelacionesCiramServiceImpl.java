package com.cam.api.talleres.serviceImpl;

import com.cam.api.talleres.dto.RelacionesCiramDTO;
import com.cam.api.talleres.entity.RelacionesCiramEntity;
import com.cam.api.talleres.repository.IGenericRepository;
import com.cam.api.talleres.repository.IRelacionesCiramRepository;
import com.cam.api.talleres.service.IRelacionesCiramService;
import com.cam.api.talleres.transform.IGenericTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RelacionesCiramServiceImpl extends CRUDImplDTO<RelacionesCiramDTO, RelacionesCiramEntity, Integer> implements IRelacionesCiramService {

    @Autowired
    private IRelacionesCiramRepository repository;

    @Autowired
    protected IGenericTransform<RelacionesCiramDTO, RelacionesCiramEntity> transform;

    @Override
    protected IGenericRepository<RelacionesCiramEntity, Integer> getRepository() {
        return repository;
    }

    @Override
    public List<RelacionesCiramDTO> buscarPorUnidadOpePadre(int idUnidadOperativaPadre) {
        List<RelacionesCiramEntity> entities = repository.buscarPorUnidadOpePadre(idUnidadOperativaPadre);
        List<RelacionesCiramDTO> dtos = new ArrayList<>();

        for(RelacionesCiramEntity entity : entities){
            dtos.add(transform.getDTO(entity));
        }
        return dtos;
    }
}
