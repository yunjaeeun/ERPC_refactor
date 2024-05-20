package com.cineverse.erpc.employee.dto;

import lombok.Data;

@Data
public class ResponseEmployeeDTO {
    private String employeeCode;
    private String employeeName;
    private String employeePassword;
    private String employeeEmail;
    private String employeeHp;
    private String employeeNumber;
    private String employmentDate;
    private String resignationDate;
    private int employeeRankId;
    private int teamCodeId;
}