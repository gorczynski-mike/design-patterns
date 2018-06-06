package com.gorczynskimike.employee;

import com.gorczynskimike.employee.old.EmployeeAdapterEmployeeOld;
import com.gorczynskimike.employee.old.EmployeeOldStandard;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeAdapterEmployeeOldTestSuite {

    private EmployeeNotificationService testNotificationService = (employee, message) -> {
        System.out.println("Sending message '" + message + "' to " + employee.getFristName() + " " +
        employee.getLastName() + " (id:" + employee.getId() +") at " + employee.getEMail());
        return true;
    };

    @Test
    public void testEmployeeAdapterOld() {
        //Given
        Employee companyEmployee = new CompanyEmployee("John", "Kowalski", 1111, "jk11@company.com");
        EmployeeOldStandard employeeOldStandard = new EmployeeOldStandard("Mike.Waglewski", "2222", "company.com");

        //When
        boolean modernEmployeeMessageSent = testNotificationService.sendMessageToEmployee(companyEmployee, "TEST MSG");
        boolean oldEmployeeMessageSent = testNotificationService
                .sendMessageToEmployee(new EmployeeAdapterEmployeeOld(employeeOldStandard), "TEST MSG");

        //Then
        Assert.assertTrue(modernEmployeeMessageSent);
        Assert.assertTrue(oldEmployeeMessageSent);
    }
}
