package com.cam.api.talleres.transformImpl;

import com.cam.api.talleres.dto.AseguradoDTO;
import com.cam.api.talleres.entity.AseguradoEntity;
import org.springframework.stereotype.Service;
import com.cam.api.talleres.transform.GenericTransformImpl;
import com.cam.api.talleres.transform.IAseguradoTransform;

@Service
public class AseguradoTransformImpl extends GenericTransformImpl<AseguradoDTO, AseguradoEntity> implements IAseguradoTransform {

    @Override
    public AseguradoDTO getDTO(AseguradoEntity entity) {
        return this.mapper.map(entity, AseguradoDTO.class);
    }

    @Override
    public AseguradoEntity getEntity(AseguradoDTO dto) {
        return this.mapper.map(dto, AseguradoEntity.class);
    }
}
