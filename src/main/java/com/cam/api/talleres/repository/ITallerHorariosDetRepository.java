package com.cam.api.talleres.repository;

import com.cam.api.talleres.entity.TallerHorariosDetEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ITallerHorariosDetRepository extends IGenericRepository<TallerHorariosDetEntity, Integer>{

    @Query("SELECT det FROM TallerHorariosDetEntity det INNER JOIN TallerHorariosCabEntity cab " +
            "ON det.tallerHorarioCab.idTallerHorarioCab = cab.idTallerHorarioCab " +
            "WHERE cab.taller.idTaller = :idTaller AND  " +
            "cab.persona.idPersona = :idPersona AND " +
            "det.dia = :dia")
    List<TallerHorariosDetEntity> buscarPorTallerTalleristaFecha(int idTaller, int idPersona, LocalDateTime dia);
}
