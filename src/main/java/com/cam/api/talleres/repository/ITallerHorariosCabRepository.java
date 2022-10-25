package com.cam.api.talleres.repository;

import com.cam.api.talleres.entity.TallerHorariosCabEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ITallerHorariosCabRepository extends IGenericRepository<TallerHorariosCabEntity, Integer>{

    //@Query("SELECT t FROM TallerHorariosCabEntity WHERE t.taller.idTaller = :idTaller AND  t.persona.idPersona = :idPersona AND ")
    //@Query("SELECT * FROM TallerHorariosCabEntity INNER JOIN TallerHorariosDetEntity ON TallerHorariosCabEntity.id_tallerhorariocab = TallerHorariosDetEntity.id_tallerhorariocab")
    @Query(value = "SELECT *\n" +
            "FROM  public.tallerhorarioscab\n" +
            "INNER JOIN  public.tallerhorariosdet\n" +
            "ON public.tallerhorariosdet.id_tallerhorariocab = public.tallerhorarioscab.id_tallerhorariocab\n" +
            "WHERE public.tallerhorarioscab.id_persona = :idPersona AND \n" +
            "public.tallerhorarioscab.id_taller = :idTaller AND\n" +
            "public.tallerhorariosdet.dia = :dia", nativeQuery = true)
    List<TallerHorariosCabEntity> buscarPorTallerTalleristaFecha(int idTaller, int idPersona, LocalDateTime dia);
}
