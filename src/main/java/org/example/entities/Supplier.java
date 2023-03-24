package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private Long id;
    private String companyName;
    private String country;
    //ManyToOne
    private List<Long> productIds;

    public Long getId() {
        return id;
    }

    public Supplier setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Supplier setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Supplier setCountry(String country) {
        this.country = country;
        return this;
    }

    public List<Long> getProductIds() {
        return productIds;
    }

    public Supplier setProductIds(List<Long> productIds) {
        this.productIds = productIds;
        return this;
    }
}
