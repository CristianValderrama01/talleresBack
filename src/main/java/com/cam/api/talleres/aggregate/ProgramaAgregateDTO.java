package com.cam.api.talleres.aggregate;

import com.cam.api.talleres.dto.ProgramasDTO;

public class ProgramaAgregateDTO extends Aggregate<ProgramasDTO>{
    public ProgramaAgregateDTO(ProgramasDTO root) {
        super(root);
    }
}
