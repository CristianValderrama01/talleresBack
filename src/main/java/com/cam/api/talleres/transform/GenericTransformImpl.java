package com.cam.api.talleres.transform;

import org.modelmapper.ModelMapper;

public abstract class GenericTransformImpl<D, T> implements IGenericTransform<D, T>{
    protected final ModelMapper mapper;
    public GenericTransformImpl(){
        this.mapper = new ModelMapper();
    }
}
