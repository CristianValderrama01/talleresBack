package com.cam.api.talleres.transform;

import com.cam.api.talleres.aggregate.Aggregate;

public interface IGenericTransform <D, T> {

    D getDTO(T entity);
    T getEntity(D dto);

//    D getDTO(Aggregate<D> dto, Aggregate<T> entity);
//    T getEntity(Aggregate<D> dto, Aggregate<T> entity);
}
