package com.InventoryManagement.IMS.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String supplierName;
    private String supplierEmail;
    private int supplierPhone;

    public Supplier() {
        super();
    }

    public Supplier(String supplierName, String supplierEmail, int supplierPhone) {
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.supplierPhone = supplierPhone;
    }

    public String getSupplierName() {return supplierName;}

    public void setSupplierName(String supplierName) {this.supplierName = supplierName;}

    public String getSupplierEmail() {return supplierEmail;}

    public void setSupplierEmail(String supplierEmail) {this.supplierEmail = supplierEmail;}

    public int getSupplierPhone() {return supplierPhone;}

    public void setSupplierPhone(int supplierPhone) {this.supplierPhone = supplierPhone;}
}
