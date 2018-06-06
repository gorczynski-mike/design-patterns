package com.gorczynskimike.employee.old;

public class EmployeeOldStandard {

    private final String name;
    private final String id;
    private final String domain;

    public EmployeeOldStandard(String name, String id, String domain) {
        this.name = name;
        this.id = id;
        this.domain = domain;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDomain() {
        return domain;
    }
}
