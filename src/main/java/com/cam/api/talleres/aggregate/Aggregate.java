package com.cam.api.talleres.aggregate;

import lombok.Data;

@Data
public class Aggregate<T> {

    private T root;

    public Aggregate(T root){
        this.root = root;
    }
}
