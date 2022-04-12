package com.example.mu_ku_202_2022.model;

import java.util.Objects;

public class User extends Person{
    // 1 attributes
    // 2 constructor
    // 3 getters and setters



    /////////////////
    //
    // 1 attributes
    //
    private boolean works_or_not=false;     // default
    ///////////////////

    // 2 constructor
    //
    //
    public User(String id_no) {
        super(id_no);
    }
    public User(Person person){
        super(person.getId_no(),person.getName(), person.getLasname(), person.getAdress(), person.getBirth(), person.getEmail(), person.getTel_no(),person.getNotes());
    }

    public boolean isWorks_or_not() {
        return works_or_not;
    }
    //////////////////////////

    // 3 getters and setters
    //
    //
    public void setWorks_or_not(boolean works_or_not) {
        this.works_or_not = works_or_not;
    }

}
