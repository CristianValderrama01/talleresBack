package com.cam.api.talleres.transformImpl;

import com.cam.api.talleres.dto.PersonaDTO;
import com.cam.api.talleres.entity.PersonaEntity;
import com.cam.api.talleres.transform.GenericTransformImpl;
import com.cam.api.talleres.transform.IPersonaTransform;
import org.springframework.stereotype.Service;

@Service
public class PersonaTransformImpl extends GenericTransformImpl<PersonaDTO, PersonaEntity> implements IPersonaTransform {
    @Override
    public PersonaDTO getDTO(PersonaEntity entity) {
        return this.mapper.map(entity, PersonaDTO.class);
    }

    @Override
    public PersonaEntity getEntity(PersonaDTO dto) {
        return this.mapper.map(dto, PersonaEntity.class);
    }
}
