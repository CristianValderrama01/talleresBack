package com.cam.api.talleres.repository;

import com.cam.api.talleres.entity.TallerHorariosCabEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ITallerHorariosCabRepository extends IGenericRepository<TallerHorariosCabEntity, Integer>{

//    @Query("SELECT cab FROM TallerHorariosCabEntity cab INNER JOIN TallerHorariosDetEntity det ON cab.idTallerHorarioCab = det.tallerHorarioCab.idTallerHorarioCab " +
//            "WHERE cab.taller.idTaller = :idTaller AND  cab.persona.idPersona = :idPersona AND det.dia = :dia")

    @Query(value = "SELECT *\n" +
            "FROM  public.tallerhorarioscab\n" +
            "INNER JOIN  public.tallerhorariosdet\n" +
            "ON public.tallerhorariosdet.id_tallerhorariocab = public.tallerhorarioscab.id_tallerhorariocab\n" +
            "WHERE public.tallerhorarioscab.id_persona = :idPersona AND \n" +
            "public.tallerhorarioscab.id_taller = :idTaller AND\n" +
            "public.tallerhorariosdet.dia = :dia", nativeQuery = true)
    List<TallerHorariosCabEntity> buscarPorTallerTalleristaFecha(int idTaller, int idPersona, LocalDateTime dia);
}
