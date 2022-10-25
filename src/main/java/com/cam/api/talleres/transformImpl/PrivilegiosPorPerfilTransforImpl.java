package com.cam.api.talleres.transformImpl;

import com.cam.api.talleres.dto.PrivilegiosPorPerfilDTO;
import com.cam.api.talleres.entity.PrivilegiosPorPerfilEntity;
import org.springframework.stereotype.Service;
import com.cam.api.talleres.transform.GenericTransformImpl;
import com.cam.api.talleres.transform.IPrivilegiosPorPerfilTransform;

@Service
public class PrivilegiosPorPerfilTransforImpl extends GenericTransformImpl<PrivilegiosPorPerfilDTO, PrivilegiosPorPerfilEntity> implements IPrivilegiosPorPerfilTransform {
    @Override
    public PrivilegiosPorPerfilDTO getDTO(PrivilegiosPorPerfilEntity entity) {
        return this.mapper.map(entity, PrivilegiosPorPerfilDTO.class);
    }

    @Override
    public PrivilegiosPorPerfilEntity getEntity(PrivilegiosPorPerfilDTO dto) {
        return this.mapper.map(dto, PrivilegiosPorPerfilEntity.class);
    }
}
