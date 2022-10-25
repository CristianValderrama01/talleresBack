package com.cam.api.talleres.serviceImpl;

import com.cam.api.talleres.repository.IGenericRepository;
import com.cam.api.talleres.service.ICRUD;
import com.cam.api.talleres.transform.IGenericTransform;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class CRUDImplDTO<DTO, T, ID> implements ICRUD<DTO, ID> {

    @Autowired
    protected abstract IGenericRepository<T, ID> getRepository();

    @Autowired
    protected IGenericTransform<DTO, T> transform;

    @Override
    public DTO registrar(DTO dto) throws Exception {
        T entity = getRepository().save(transform.getEntity(dto));
        return transform.getDTO(entity);
    }

    @Override
    public DTO actualizar(DTO dto) throws Exception {
        T entity = transform.getEntity(dto);
        return transform.getDTO(getRepository().save(entity));
    }

    @Override
    public List<DTO> listar() throws Exception {
        List<T> entities = getRepository().findAll();
        List<DTO> dtos = new ArrayList<>();

        for(T entity : entities){
            dtos.add(transform.getDTO(entity));
        }
        return dtos;
    }

    @Override
    public DTO listarPorId(ID id) throws Exception {
       Optional<T> optional = getRepository().findById(id);
        if(optional.isEmpty()){
            return null;
        }
        return transform.getDTO(optional.get());
    }

    @Override
    public void eliminar(ID id) throws Exception {
        getRepository().deleteById(id);
    }
}
