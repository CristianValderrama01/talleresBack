package com.cam.api.talleres.serviceImpl;

import com.cam.api.talleres.dto.TallerGrupoDTO;
import com.cam.api.talleres.entity.TallerGrupoEntity;
import com.cam.api.talleres.repository.IGenericRepository;
import com.cam.api.talleres.repository.ITallerGrupoRepository;
import com.cam.api.talleres.service.ITallerGrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TallerGrupoServiceImpl extends CRUDImplDTO<TallerGrupoDTO, TallerGrupoEntity, Integer> implements ITallerGrupoService {

    @Autowired
    private ITallerGrupoRepository repository;

    @Override
    protected IGenericRepository<TallerGrupoEntity, Integer> getRepository() {
        return repository;
    }
}
