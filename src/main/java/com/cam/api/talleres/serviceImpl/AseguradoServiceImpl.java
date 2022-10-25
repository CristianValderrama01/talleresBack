package com.cam.api.talleres.serviceImpl;

import com.cam.api.talleres.dto.AseguradoDTO;
import com.cam.api.talleres.entity.AseguradoEntity;
import com.cam.api.talleres.repository.IAseguradoRepository;
import com.cam.api.talleres.repository.IGenericRepository;
import com.cam.api.talleres.service.IAseguradoService;
import com.cam.api.talleres.transform.IGenericTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AseguradoServiceImpl extends CRUDImplDTO<AseguradoDTO, AseguradoEntity, Integer> implements IAseguradoService {

    @Autowired
    private IAseguradoRepository repository;

    @Autowired
    protected IGenericTransform<AseguradoDTO, AseguradoEntity> transform;

    @Override
    protected IGenericRepository<AseguradoEntity, Integer> getRepository() {
        return repository;
    }

    @Override
    public AseguradoDTO findByTipoDocAndNumDoc(int tipoDoc, String numDoc) {
        Optional<AseguradoEntity> entity = repository.findByTipoDocAndNumDoc(tipoDoc, numDoc);
        if(entity.isEmpty()){
            return null;
        }
        return transform.getDTO(entity.get());
    }
}
