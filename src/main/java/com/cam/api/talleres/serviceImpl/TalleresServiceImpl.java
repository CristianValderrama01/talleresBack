package com.cam.api.talleres.serviceImpl;

import com.cam.api.talleres.dto.TalleresDTO;
import com.cam.api.talleres.entity.TalleresEntity;
import com.cam.api.talleres.repository.IGenericRepository;
import com.cam.api.talleres.repository.ITalleresRepository;
import com.cam.api.talleres.service.ITalleresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TalleresServiceImpl extends CRUDImplDTO<TalleresDTO, TalleresEntity, Integer> implements ITalleresService {

    @Autowired
    private ITalleresRepository repository;

    @Override
    protected IGenericRepository<TalleresEntity, Integer> getRepository() {
        return repository;
    }
}
