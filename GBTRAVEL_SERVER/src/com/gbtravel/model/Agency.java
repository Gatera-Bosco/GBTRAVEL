/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gbtravel.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author hnjej
 */
@Entity
public class Agency implements Serializable{
    @Id
    @Column(name="id", length = 5, nullable = false)
    private String code;
    private String agencyName;
    private String contact;
    

    public Agency() {
    }

    public Agency(String code, String agencyName, String contact) {
        this.code = code;
        this.agencyName = agencyName;
        this.contact = contact;
    }

    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    
    
}
