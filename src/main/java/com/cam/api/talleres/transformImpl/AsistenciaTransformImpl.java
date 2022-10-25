package com.cam.api.talleres.transformImpl;

import com.cam.api.talleres.dto.AsistenciaDTO;
import com.cam.api.talleres.entity.AsistenciaEntity;
import org.springframework.stereotype.Service;
import com.cam.api.talleres.transform.GenericTransformImpl;
import com.cam.api.talleres.transform.IAsistenciaTransform;

@Service
public class AsistenciaTransformImpl extends GenericTransformImpl<AsistenciaDTO, AsistenciaEntity> implements IAsistenciaTransform {
    @Override
    public AsistenciaDTO getDTO(AsistenciaEntity entity) {
        return this.mapper.map(entity, AsistenciaDTO.class);
    }

    @Override
    public AsistenciaEntity getEntity(AsistenciaDTO dto) {
        return this.mapper.map(dto, AsistenciaEntity.class);
    }
}
