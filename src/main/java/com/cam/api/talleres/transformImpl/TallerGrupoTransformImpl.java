package com.cam.api.talleres.transformImpl;

import com.cam.api.talleres.dto.TallerGrupoDTO;
import com.cam.api.talleres.entity.TallerGrupoEntity;
import org.springframework.stereotype.Service;
import com.cam.api.talleres.transform.GenericTransformImpl;
import com.cam.api.talleres.transform.ITallerGrupoTransform;

@Service
public class TallerGrupoTransformImpl extends GenericTransformImpl<TallerGrupoDTO, TallerGrupoEntity> implements ITallerGrupoTransform {
    @Override
    public TallerGrupoDTO getDTO(TallerGrupoEntity entity) {
        return this.mapper.map(entity, TallerGrupoDTO.class);
    }

    @Override
    public TallerGrupoEntity getEntity(TallerGrupoDTO dto) {
        return this.mapper.map(dto, TallerGrupoEntity.class);
    }
}
