package com.cam.api.talleres.repository;

import com.cam.api.talleres.entity.UnidadOperativaEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface IUnidadOperativaRepository extends IGenericRepository<UnidadOperativaEntity, Integer>{

    @Query("SELECT p FROM UnidadOperativaEntity p INNER JOIN  RelacionesCiramEntity c ON p.idUnidadOperativa = c.unidadOpePadre.idUnidadOperativa")
    Set<UnidadOperativaEntity> obtenerUnidadesOperativasPadres();

    @Query("SELECT p FROM UnidadOperativaEntity p INNER JOIN  RelacionesCiramEntity c ON p.idUnidadOperativa = c.unidadOpeHijo.idUnidadOperativa" +
            " WHERE c.unidadOpePadre.idUnidadOperativa = :idUnidadOperativaPadre")
    Set<UnidadOperativaEntity> obtenerUnidadesOperativasHijas(Integer idUnidadOperativaPadre);
}
