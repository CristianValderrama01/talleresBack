package com.cam.api.talleres.transformImpl;

import com.cam.api.talleres.dto.UnidadOperativaDTO;
import com.cam.api.talleres.entity.UnidadOperativaEntity;
import org.springframework.stereotype.Service;
import com.cam.api.talleres.transform.GenericTransformImpl;
import com.cam.api.talleres.transform.IUnidadOperativaTransform;

@Service
public class UnidadOperativaTransformImpl extends GenericTransformImpl<UnidadOperativaDTO, UnidadOperativaEntity> implements IUnidadOperativaTransform {
    @Override
    public UnidadOperativaDTO getDTO(UnidadOperativaEntity entity) {
        return this.mapper.map(entity, UnidadOperativaDTO.class);
    }

    @Override
    public UnidadOperativaEntity getEntity(UnidadOperativaDTO dto) {
        return this.mapper.map(dto, UnidadOperativaEntity.class);
    }
}
