package com.gorczynskimike.employee;

public class CompanyEmployee implements Employee {

    private final String firstName;
    private final String lastName;
    private final int id;
    private String email;

    public CompanyEmployee(String firstName, String lastName, int id) {
        this(firstName, lastName, id, "");
    }

    public CompanyEmployee(String firstName, String lastName, int id, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.email = email;
    }

    @Override
    public String getFristName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getEMail() {
        return this.email;
    }

    @Override
    public int getId() {
        return this.id;
    }
}
