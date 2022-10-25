package com.cam.api.talleres.repository;

import com.cam.api.talleres.entity.RelacionesCiramEntity;
import com.cam.api.talleres.entity.UnidadOperativaEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface IRelacionesCiramRepository extends IGenericRepository<RelacionesCiramEntity, Integer>{

    @Query("SELECT c FROM RelacionesCiramEntity c WHERE  c.unidadOpePadre.idUnidadOperativa = :idUnidadOperativaPadre")
    List<RelacionesCiramEntity> buscarPorUnidadOpePadre(int idUnidadOperativaPadre);


//    @Query("SELECT p.unidadOpePadre FROM UnidadOperativaEntity ")
//    Set<UnidadOperativaEntity> obtenerUnidadesOperativasPadres();
}
