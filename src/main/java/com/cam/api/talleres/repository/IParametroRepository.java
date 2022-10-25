package com.cam.api.talleres.repository;

import com.cam.api.talleres.entity.ParametroEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IParametroRepository extends IGenericRepository<ParametroEntity, Integer>{

    List<ParametroEntity> findAllByPadre(Integer idPadre);
}
