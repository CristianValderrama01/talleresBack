package com.cam.api.talleres.transformImpl;

import com.cam.api.talleres.dto.RelacionesCiramDTO;
import com.cam.api.talleres.entity.RelacionesCiramEntity;
import org.springframework.stereotype.Service;
import com.cam.api.talleres.transform.GenericTransformImpl;
import com.cam.api.talleres.transform.IRelacionesCiramTransform;

@Service
public class RelacioneCiramTransforImpl extends GenericTransformImpl<RelacionesCiramDTO, RelacionesCiramEntity> implements IRelacionesCiramTransform {

    @Override
    public RelacionesCiramDTO getDTO(RelacionesCiramEntity entity) {
        return this.mapper.map(entity, RelacionesCiramDTO.class);
    }

    @Override
    public RelacionesCiramEntity getEntity(RelacionesCiramDTO dto) {
        return this.mapper.map(dto, RelacionesCiramEntity.class);
    }
}
