package com.cam.api.talleres.serviceImpl;

import com.cam.api.talleres.dto.AsistenciaDTO;
import com.cam.api.talleres.entity.AsistenciaEntity;
import com.cam.api.talleres.repository.IAsistenciaRepository;
import com.cam.api.talleres.repository.IGenericRepository;
import com.cam.api.talleres.service.IAsistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsistenciaServiceImpl extends CRUDImplDTO<AsistenciaDTO, AsistenciaEntity, Integer> implements IAsistenciaService {

    @Autowired
    private IAsistenciaRepository repository;

    @Override
    protected IGenericRepository<AsistenciaEntity, Integer> getRepository() {
        return repository;
    }
}
