package com.gorczynskimike.employee;

public interface EmployeeNotificationService {

    boolean sendMessageToEmployee(Employee employee, String message);

}
