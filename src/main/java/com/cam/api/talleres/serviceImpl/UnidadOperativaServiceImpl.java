package com.cam.api.talleres.serviceImpl;

import com.cam.api.talleres.dto.UnidadOperativaDTO;
import com.cam.api.talleres.entity.UnidadOperativaEntity;
import com.cam.api.talleres.repository.IGenericRepository;
import com.cam.api.talleres.repository.IUnidadOperativaRepository;
import com.cam.api.talleres.service.IUnidadOperativaService;
import com.cam.api.talleres.transform.IGenericTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UnidadOperativaServiceImpl extends CRUDImplDTO<UnidadOperativaDTO, UnidadOperativaEntity, Integer> implements IUnidadOperativaService {

    @Autowired
    private IUnidadOperativaRepository repository;

    @Autowired
    protected IGenericTransform<UnidadOperativaDTO, UnidadOperativaEntity> transform;

    @Override
    protected IGenericRepository<UnidadOperativaEntity, Integer> getRepository() {
        return repository;
    }

    @Override
    public List<UnidadOperativaDTO> obtenerUnidadesOperativasPadres() {
        Set<UnidadOperativaEntity> enities = repository.obtenerUnidadesOperativasPadres();
        List<UnidadOperativaDTO> dtos = new ArrayList<>();

        for (UnidadOperativaEntity entity: enities){
            dtos.add(transform.getDTO(entity));
        }
        return dtos;
    }

    @Override
    public List<UnidadOperativaDTO> obtenerUnidadesOperativasHijas(Integer idUnidadOperativaPadre) {
        Set<UnidadOperativaEntity> enities = repository.obtenerUnidadesOperativasHijas(idUnidadOperativaPadre);
        List<UnidadOperativaDTO> dtos = new ArrayList<>();

        for (UnidadOperativaEntity entity: enities){
            dtos.add(transform.getDTO(entity));
        }
        return dtos;
    }
}
