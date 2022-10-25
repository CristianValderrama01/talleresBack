package com.cam.api.talleres.repository;

import com.cam.api.talleres.entity.AseguradoEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IAseguradoRepository extends IGenericRepository<AseguradoEntity, Integer>{

    Optional<AseguradoEntity> findByTipoDocAndNumDoc(int tipoDoc, String numDoc);
}
