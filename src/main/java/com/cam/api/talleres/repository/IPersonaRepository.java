package com.cam.api.talleres.repository;

import com.cam.api.talleres.entity.PersonaEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends IGenericRepository<PersonaEntity, Integer>{

    PersonaEntity findByTipoDocAndNumDoc(int tipoDoc, String numDoc);
}
