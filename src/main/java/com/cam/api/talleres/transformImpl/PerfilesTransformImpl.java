package com.cam.api.talleres.transformImpl;

import com.cam.api.talleres.dto.PerfilesDTO;
import com.cam.api.talleres.entity.PerfilesEntity;
import org.springframework.stereotype.Service;
import com.cam.api.talleres.transform.GenericTransformImpl;
import com.cam.api.talleres.transform.IPerfilesTransform;

@Service
public class PerfilesTransformImpl extends GenericTransformImpl<PerfilesDTO, PerfilesEntity> implements IPerfilesTransform {
    @Override
    public PerfilesDTO getDTO(PerfilesEntity entity) {
        return this.mapper.map(entity, PerfilesDTO.class);
    }

    @Override
    public PerfilesEntity getEntity(PerfilesDTO dto) {
        return this.mapper.map(dto, PerfilesEntity.class);
    }
}
