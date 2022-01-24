package com.InventoryManagement.IMS.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SupplyManager {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int userPermLevel;
    private String userName;
    private String userEmail;

    public SupplyManager() {super();}

    public SupplyManager(int userPermLevel, String userName, String userEmail) {
        this.userPermLevel = userPermLevel;
        this.userName = userName;
        this.userEmail = userEmail;
    }

    public int getUserPermLevel() {return userPermLevel;}

    public void setUserPermLevel(int userPermLevel) {this.userPermLevel = userPermLevel;}

    public String getUserName() {return userName;}

    public void setUserName(String userName) {this.userName = userName;}

    public String getUserEmail() {return userEmail;}

    public void setUserEmail(String userEmail) {this.userEmail = userEmail;}
}
