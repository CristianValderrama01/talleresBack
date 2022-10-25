package com.cam.api.talleres.transformImpl;

import com.cam.api.talleres.dto.ProgramasDTO;
import com.cam.api.talleres.entity.ProgramasEntity;
import com.cam.api.talleres.transform.GenericTransformImpl;
import com.cam.api.talleres.transform.IProgramaTransform;
import org.springframework.stereotype.Service;

@Service
public class ProgramaTransformImpl extends GenericTransformImpl<ProgramasDTO, ProgramasEntity> implements IProgramaTransform {

    @Override
    public ProgramasDTO getDTO(ProgramasEntity entity) {
        return this.mapper.map(entity, ProgramasDTO.class);
    }

    @Override
    public ProgramasEntity getEntity(ProgramasDTO dto) {
        return this.mapper.map(dto, ProgramasEntity.class);
    }
}
