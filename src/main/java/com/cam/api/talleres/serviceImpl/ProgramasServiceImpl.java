package com.cam.api.talleres.serviceImpl;

import com.cam.api.talleres.dto.ProgramasDTO;
import com.cam.api.talleres.entity.ProgramasEntity;
import com.cam.api.talleres.repository.IGenericRepository;
import com.cam.api.talleres.repository.IProgramasRepository;
import com.cam.api.talleres.service.IProgramasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramasServiceImpl extends CRUDImplDTO<ProgramasDTO, ProgramasEntity, Integer> implements IProgramasService {

    @Autowired
    private IProgramasRepository repository;

    @Override
    protected IGenericRepository<ProgramasEntity, Integer> getRepository() {
        return repository;
    }

}
