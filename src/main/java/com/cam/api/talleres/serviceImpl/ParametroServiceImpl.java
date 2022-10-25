package com.cam.api.talleres.serviceImpl;

import com.cam.api.talleres.dto.ParametroDTO;
import com.cam.api.talleres.entity.ParametroEntity;
import com.cam.api.talleres.repository.IGenericRepository;
import com.cam.api.talleres.repository.IParametroRepository;
import com.cam.api.talleres.service.IParametroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParametroServiceImpl extends CRUDImplDTO<ParametroDTO, ParametroEntity, Integer> implements IParametroService {

    @Autowired
    private IParametroRepository repository;

    @Override
    protected IGenericRepository<ParametroEntity, Integer> getRepository() {
        return repository;
    }

    @Override
    public List<ParametroDTO> findAllByPadre(Integer idPadre) {
        List<ParametroEntity> entities = repository.findAllByPadre(idPadre);
        List<ParametroDTO> dtos = new ArrayList<>();

        for(ParametroEntity entity : entities){
            dtos.add(transform.getDTO(entity));
        }
        return dtos;
    }
}
