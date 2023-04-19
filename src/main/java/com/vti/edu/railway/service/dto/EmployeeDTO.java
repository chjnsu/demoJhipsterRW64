package com.vti.edu.railway.service.dto;

public class EmployeeDTO {
    private Long departmentId;

    public EmployeeDTO() {
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public EmployeeDTO(Long departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
            "departmentId=" + departmentId +
            '}';
    }
}
