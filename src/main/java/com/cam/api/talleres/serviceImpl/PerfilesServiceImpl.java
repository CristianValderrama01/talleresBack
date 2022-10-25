package com.cam.api.talleres.serviceImpl;

import com.cam.api.talleres.dto.PerfilesDTO;
import com.cam.api.talleres.entity.PerfilesEntity;
import com.cam.api.talleres.repository.IGenericRepository;
import com.cam.api.talleres.repository.IPerfilesRepository;
import com.cam.api.talleres.service.IPerfilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilesServiceImpl extends CRUDImplDTO<PerfilesDTO, PerfilesEntity, Integer> implements IPerfilesService {

    @Autowired
    private IPerfilesRepository repository;

    @Override
    protected IGenericRepository<PerfilesEntity, Integer> getRepository() {
        return repository;
    }
}
