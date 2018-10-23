package com.tongtu.ncgl.base.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Pagination<T> {
    @JsonProperty("rows")
    protected List<T> rows;
    @JsonProperty("total")
    protected Long total;
    @JsonProperty("colmodel")
    protected List<T> colmodel;

    public Pagination(List<T> rows, Long total) {
        this.rows = rows;
        this.total = total;
        this.colmodel = new ArrayList<T>();
    }

    public List<T> getRows() {
        if (rows == null) {
            rows = new ArrayList<T>();
        }
        return rows;
    }

    public Long getTotal() {
        return total;
    }

    public List<T> getColmodel() {
        if (colmodel == null) {
            colmodel = new ArrayList<T>();
        }
        return colmodel;
    }
}
