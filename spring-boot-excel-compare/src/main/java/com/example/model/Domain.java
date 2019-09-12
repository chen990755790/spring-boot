package com.example.model;

import lombok.Data;

import java.util.function.Supplier;

@Data
public class Domain {

    private String columnName;

    private String content;

    private int existCount = 1;

    private boolean hasCompare;

    public static Domain createDomain(final Supplier<Domain> supplier) {
        return supplier.get();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (!(obj instanceof Domain)) return false;
        Domain domain = (Domain) obj;
        return this.getColumnName().equals(domain.getColumnName()) ;
    }


    @Override
    public String toString() {
        return "Domain{" +
                "columnName='" + columnName + '\'' +
                ", content='" + content + '\'' +
                ", existCount=" + existCount +
                '}';
    }
}
