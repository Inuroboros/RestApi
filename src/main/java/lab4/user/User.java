package com.example.lab4.user;

import com.example.lab4.location.Location;

public class User {

    private String id;
    private String firstname;
    private String lastname;
    private Location location;
    private String email;

    public User(String id, String firstname, String lastname, com.example.lab4.location.Location location, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.location = location;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", location=" + location +
                ", email='" + email + '\'' +
                '}';
    }
}
