package com.cam.api.talleres.repository;

import com.cam.api.talleres.entity.PersonaEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IPersonaRepository extends IGenericRepository<PersonaEntity, Integer>{

    Optional<PersonaEntity> findByTipoDocAndNumDoc(int tipoDoc, String numDoc);
}
