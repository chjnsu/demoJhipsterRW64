package com.vti.edu.railway.service.dto;

public class DepartmentPlusDTO {

    private Long id;
    private String departmentName;
    private String address;

    public DepartmentPlusDTO() {}

    public DepartmentPlusDTO(Long id, String departmentName, String address) {
        this.id = id;
        this.departmentName = departmentName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "DepartmentPlusDTO{" + "id=" + id + ", departmentName='" + departmentName + '\'' + ", address='" + address + '\'' + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
