package com.ardysetiawan.a182101901_ardysetiawanuts22_4_2020.model;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("id")
    private int id;
    @SerializedName("username")
    private String username;
    @SerializedName("name")
    private String name;
    @SerializedName("email")
    private String email;
    public user(Integer id, String username, String name, String email){
        this.id  = id;
        this.username = username;
        this.name = name;
        this.email = email;
    }

    public void  setId(int id){
        this.id = id;
    }

    public void  setEmail(String email){
        this.email = email;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }
}
