package com.cam.api.talleres.serviceImpl;

import com.cam.api.talleres.dto.PrivilegiosPorPerfilDTO;
import com.cam.api.talleres.entity.PrivilegiosPorPerfilEntity;
import com.cam.api.talleres.repository.IGenericRepository;
import com.cam.api.talleres.repository.IPrivilegiosPorPerfilRepository;
import com.cam.api.talleres.service.IPrivilegiosPorPerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrivilegiosPorPerfilServiceImpl extends CRUDImplDTO<PrivilegiosPorPerfilDTO, PrivilegiosPorPerfilEntity, Integer> implements IPrivilegiosPorPerfilService {

    @Autowired
    private IPrivilegiosPorPerfilRepository repository;

    @Override
    protected IGenericRepository<PrivilegiosPorPerfilEntity, Integer> getRepository() {
        return repository;
    }
}
