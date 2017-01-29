package com.example.shaloin.seventhassignmentb;

/**
 * Created by shaloin on 21/12/16.
 */

public class Model {

    private int id;
    private String product_name;

    public Model(){}

    public Model(String product_name){
        this.product_name=product_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
}
