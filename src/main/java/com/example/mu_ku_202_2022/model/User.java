package com.example.mu_ku_202_2022.model;

import java.util.Objects;

public class User {
    // 1 attributes
    // 2 constructor
    // 3 getters and setters
    // 4 equals

    /////////////////
    //
    //
    //
    //
    // 1 attributes

    private String id_no;
    private String name;
    private String lasname;
    private String adress;
    private String birth;
    private String tel_no;
    private String email;
    private String notes;
    private boolean works_or_not=false;
    ///////////////////


    //
    // 2 constructors
    public User(String id_no, String name, String lasname, String adress, String birth, String tel_no, String email, String notes, boolean works_or_not) {
        this.id_no = id_no;
        this.name = name;
        this.lasname = lasname;
        this.adress = adress;
        this.birth = birth;
        this.tel_no = tel_no;
        this.email = email;
        this.notes = notes;
        this.works_or_not = works_or_not;
    }

    public User() {}

    public User(String id_no) {
        this.id_no = id_no;
    }

    //////////////
    // 3 getters and setters
    //

    public String getId_no() {
        return id_no;}

    public void setId_no(String id_no) {this.id_no = id_no;}


    public String getName() {return name;}

    public void setName(String name) {this.name = name;}


    public String getBirth() {return birth;}

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getLasname() {
        return lasname;
    }

    public void setLasname(String lasname) {
        this.lasname = lasname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTel_no() {
        return tel_no;
    }

    public void setTel_no(String tel_no) {
        this.tel_no = tel_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isWorks_or_not() {
        return works_or_not;
    }

    public void setWorks_or_not(boolean works_or_not) {
        this.works_or_not = works_or_not;
    }

    //////////
    //
    //  4 equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return isWorks_or_not() == user.isWorks_or_not() && getId_no().equals(user.getId_no()) && Objects.equals(getName(), user.getName()) && Objects.equals(getLasname(), user.getLasname()) && Objects.equals(getAdress(), user.getAdress()) && Objects.equals(getBirth(), user.getBirth()) && Objects.equals(getTel_no(), user.getTel_no()) && Objects.equals(getEmail(), user.getEmail()) && Objects.equals(getNotes(), user.getNotes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId_no());
    }
}
