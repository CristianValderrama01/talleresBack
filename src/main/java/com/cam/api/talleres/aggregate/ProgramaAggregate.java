package com.cam.api.talleres.aggregate;

import com.cam.api.talleres.entity.ProgramasEntity;

public class ProgramaAggregate extends Aggregate<ProgramasEntity>{

    public ProgramaAggregate(ProgramasEntity root) {
        super(root);
    }

}
