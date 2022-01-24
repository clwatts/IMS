package com.InventoryManagement.IMS.Entities;

import javax.persistence.*;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int productOwnerID;
    private int[] items;


}
