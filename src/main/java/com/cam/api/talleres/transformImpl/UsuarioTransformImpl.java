package com.cam.api.talleres.transformImpl;

import com.cam.api.talleres.dto.UsuarioDTO;
import com.cam.api.talleres.entity.UsuarioEntity;
import org.springframework.stereotype.Service;
import com.cam.api.talleres.transform.GenericTransformImpl;
import com.cam.api.talleres.transform.IUsuarioTransform;

@Service
public class UsuarioTransformImpl extends GenericTransformImpl<UsuarioDTO, UsuarioEntity> implements IUsuarioTransform {
    @Override
    public UsuarioDTO getDTO(UsuarioEntity entity) {
        return this.mapper.map(entity, UsuarioDTO.class);
    }

    @Override
    public UsuarioEntity getEntity(UsuarioDTO dto) {
        return this.mapper.map(dto, UsuarioEntity.class);
    }
}
