package com.cam.api.talleres.serviceImpl;

import com.cam.api.talleres.repository.IGenericRepository;
import com.cam.api.talleres.service.ICRUD;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class CRUDImpl<T, ID> implements ICRUD<T, ID> {

    @Autowired
    protected abstract IGenericRepository<T, ID> getRepository();

    @Override
    public T registrar(T t) throws Exception {
        return getRepository().save(t);
    }

    @Override
    public T actualizar(T t) throws Exception {
        return getRepository().save(t);
    }

    @Override
    public List<T> listar() throws Exception {
        return getRepository().findAll();
    }

    @Override
    public T listarPorId(ID id) throws Exception {
        return getRepository().findById(id).orElse(null);
    }

    @Override
    public void eliminar(ID id) throws Exception {
        getRepository().deleteById(id);
    }
}
