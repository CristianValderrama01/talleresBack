package com.cam.api.talleres.transformImpl;

import com.cam.api.talleres.dto.TallerHorariosCabDTO;
import com.cam.api.talleres.entity.TallerHorariosCabEntity;
import org.springframework.stereotype.Service;
import com.cam.api.talleres.transform.GenericTransformImpl;
import com.cam.api.talleres.transform.ITallerHorariosCabTransform;

@Service
public class TallerHorariosCabTransformImpl extends GenericTransformImpl<TallerHorariosCabDTO, TallerHorariosCabEntity> implements ITallerHorariosCabTransform {
    @Override
    public TallerHorariosCabDTO getDTO(TallerHorariosCabEntity entity) {
        return this.mapper.map(entity, TallerHorariosCabDTO.class);
    }

    @Override
    public TallerHorariosCabEntity getEntity(TallerHorariosCabDTO dto) {
        return this.mapper.map(dto, TallerHorariosCabEntity.class);
    }
}
