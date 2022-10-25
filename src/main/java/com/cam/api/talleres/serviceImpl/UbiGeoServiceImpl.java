package com.cam.api.talleres.serviceImpl;

import com.cam.api.talleres.dto.UbiGeoDTO;
import com.cam.api.talleres.entity.UbiGeoEntity;
import com.cam.api.talleres.repository.IGenericRepository;
import com.cam.api.talleres.repository.IUbiGeoRepository;
import com.cam.api.talleres.service.IUbiGeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UbiGeoServiceImpl extends CRUDImplDTO<UbiGeoDTO, UbiGeoEntity, Integer> implements IUbiGeoService {

    @Autowired
    private IUbiGeoRepository repository;

    @Override
    protected IGenericRepository<UbiGeoEntity, Integer> getRepository() {
        return repository;
    }
}
