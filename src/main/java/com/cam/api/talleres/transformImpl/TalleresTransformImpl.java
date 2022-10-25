package com.cam.api.talleres.transformImpl;

import com.cam.api.talleres.dto.TalleresDTO;
import com.cam.api.talleres.entity.TalleresEntity;
import org.springframework.stereotype.Service;
import com.cam.api.talleres.transform.GenericTransformImpl;
import com.cam.api.talleres.transform.ITalleresTransform;

@Service
public class TalleresTransformImpl extends GenericTransformImpl<TalleresDTO, TalleresEntity> implements ITalleresTransform {
    @Override
    public TalleresDTO getDTO(TalleresEntity entity) {
        return this.mapper.map(entity, TalleresDTO.class);
    }

    @Override
    public TalleresEntity getEntity(TalleresDTO dto) {
        return this.mapper.map(dto, TalleresEntity.class);
    }
}
