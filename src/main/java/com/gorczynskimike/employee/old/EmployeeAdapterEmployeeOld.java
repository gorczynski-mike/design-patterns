package com.gorczynskimike.employee.old;

import com.gorczynskimike.employee.Employee;

public class EmployeeAdapterEmployeeOld implements Employee {

    private EmployeeOldStandard instance;

    public EmployeeAdapterEmployeeOld(EmployeeOldStandard instance) {
        this.instance = instance;
    }

    @Override
    public String getFristName() {
        String[] parts = instance.getName().split("\\.");
        return parts[0];
    }

    @Override
    public String getLastName() {
        String[] parts = instance.getName().split("\\.");
        return parts.length == 2 ? parts[1] : "";
    }

    @Override
    public String getEMail() {
        String address = instance.getName() + instance.getId();
        String domain = instance.getDomain();
        String email = address + "@" + domain;
        return email;
    }

    @Override
    public int getId() {
        return Integer.parseInt(instance.getId());
    }
}
