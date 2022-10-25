package com.cam.api.talleres.transformImpl;

import com.cam.api.talleres.dto.UbiGeoDTO;
import com.cam.api.talleres.entity.UbiGeoEntity;
import org.springframework.stereotype.Service;
import com.cam.api.talleres.transform.GenericTransformImpl;
import com.cam.api.talleres.transform.IUbiGeoTransform;

@Service
public class UbiGeoTransformImpl extends GenericTransformImpl<UbiGeoDTO, UbiGeoEntity> implements IUbiGeoTransform {
    @Override
    public UbiGeoDTO getDTO(UbiGeoEntity entity) {
        return this.mapper.map(entity, UbiGeoDTO.class);
    }

    @Override
    public UbiGeoEntity getEntity(UbiGeoDTO dto) {
        return this.mapper.map(dto, UbiGeoEntity.class);
    }
}
