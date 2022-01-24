package com.InventoryManagement.IMS.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String status;
    private int ownerID;
    private int itemQuantity;
    private Date orderDate;

    public Item(){
        super();
    }

    public Item(String name, String status, int ownerID, int itemQuantity, Date orderDate) {
        super();
        this.name = name;
        this.status = status;
        this.ownerID = ownerID;
        this.itemQuantity = itemQuantity;
        this.orderDate = orderDate;
    }

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getStatus() {return status;}

    public void setStatus(String status) {this.status = status;}

    public int getOwnerID() {return ownerID;}

    public void setOwnerID(int ownerID) {this.ownerID = ownerID;}

    public int getItemQuantity() {return itemQuantity;}

    public void setItemQuantity(int itemQuantity) {this.itemQuantity = itemQuantity;}

    public Date getOrderDate() {return orderDate;}

    public void setOrderDate(Date orderDate) {this.orderDate = orderDate;}
}
