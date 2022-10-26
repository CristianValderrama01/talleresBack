package com.cam.api.talleres.serviceImpl;

import com.cam.api.talleres.dto.PersonaDTO;
import com.cam.api.talleres.entity.PersonaEntity;
import com.cam.api.talleres.repository.IGenericRepository;
import com.cam.api.talleres.repository.IPersonaRepository;
import com.cam.api.talleres.service.IPersonaService;
import com.cam.api.talleres.transform.IGenericTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonaServiceImpl extends CRUDImplDTO<PersonaDTO, PersonaEntity, Integer> implements IPersonaService {

    @Autowired
    private IPersonaRepository repository;

    @Autowired
    protected IGenericTransform<PersonaDTO, PersonaEntity> transform;

    @Override
    protected IGenericRepository<PersonaEntity, Integer> getRepository() {
        return repository;
    }

    @Override
    public PersonaDTO findByTipoDocAndNumDoc(int tipoDoc, String numDoc) {
        Optional<PersonaEntity> entity = repository.findByTipoDocAndNumDoc(tipoDoc, numDoc);
        if(entity.isEmpty()){
            return null;
        }
        return transform.getDTO(entity.get());
    }
}
