package com.cam.api.talleres.transformImpl;

import com.cam.api.talleres.dto.ParametroDTO;
import com.cam.api.talleres.entity.ParametroEntity;
import org.springframework.stereotype.Service;
import com.cam.api.talleres.transform.GenericTransformImpl;
import com.cam.api.talleres.transform.IParametroTransform;

@Service
public class ParametroTransformImpl extends GenericTransformImpl<ParametroDTO, ParametroEntity> implements IParametroTransform {
    @Override
    public ParametroDTO getDTO(ParametroEntity entity) {
        return this.mapper.map(entity, ParametroDTO.class);
    }

    @Override
    public ParametroEntity getEntity(ParametroDTO dto) {
        return this.mapper.map(dto, ParametroEntity.class);
    }
}
