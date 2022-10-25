package com.cam.api.talleres.transformImpl;

import com.cam.api.talleres.dto.TallerHorariosDetDTO;
import com.cam.api.talleres.entity.TallerHorariosDetEntity;
import org.springframework.stereotype.Service;
import com.cam.api.talleres.transform.GenericTransformImpl;
import com.cam.api.talleres.transform.ITallerHorariosDetTransform;

@Service
public class TallerHorariosDetTransformImpl extends GenericTransformImpl<TallerHorariosDetDTO, TallerHorariosDetEntity> implements ITallerHorariosDetTransform {
    @Override
    public TallerHorariosDetDTO getDTO(TallerHorariosDetEntity entity) {
        return this.mapper.map(entity, TallerHorariosDetDTO.class);
    }

    @Override
    public TallerHorariosDetEntity getEntity(TallerHorariosDetDTO dto) {
        return this.mapper.map(dto, TallerHorariosDetEntity.class);
    }
}
