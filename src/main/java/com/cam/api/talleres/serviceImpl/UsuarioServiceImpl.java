package com.cam.api.talleres.serviceImpl;

import com.cam.api.talleres.dto.UsuarioDTO;
import com.cam.api.talleres.entity.UsuarioEntity;
import com.cam.api.talleres.repository.IGenericRepository;
import com.cam.api.talleres.repository.IUsuarioRepository;
import com.cam.api.talleres.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl extends CRUDImplDTO<UsuarioDTO, UsuarioEntity, Integer> implements IUsuarioService {

    @Autowired
    private IUsuarioRepository repository;

    @Override
    protected IGenericRepository<UsuarioEntity, Integer> getRepository() {
        return repository;
    }
}
