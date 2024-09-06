package com.gbtravel.model;

public class Passenger  implements java.io.Serializable {

     private String id;
     private String name;
     private String gender;
     private String contact;

    public Passenger() {
    }

	
    public Passenger(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Passenger(String id, String name, String gender, String contact) {
       this.id = id;
       this.name = name;
       this.gender = gender;
       this.contact = contact;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getContact() {
        return this.contact;
    }
    
    public void setContact(String contact) {
        this.contact = contact;
    }




}


