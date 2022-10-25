package com.cam.api.talleres.repository;

import com.cam.api.talleres.entity.TallerHorariosDetEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ITallerHorariosDetRepository extends IGenericRepository<TallerHorariosDetEntity, Integer>{

    @Query(value = "SELECT *\n" +
            "FROM  public.tallerhorariosdet\n" +
            "INNER JOIN  public.tallerhorarioscab\n" +
            "ON public.tallerhorariosdet.id_tallerhorariocab = public.tallerhorarioscab.id_tallerhorariocab\n" +
            "WHERE public.tallerhorarioscab.id_persona = :idPersona AND \n" +
            "public.tallerhorarioscab.id_taller = :idTaller AND\n" +
            "public.tallerhorariosdet.dia = :dia", nativeQuery = true)
    List<TallerHorariosDetEntity> buscarPorTallerTalleristaFecha(int idTaller, int idPersona, LocalDateTime dia);
}
