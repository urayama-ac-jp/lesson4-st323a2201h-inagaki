package com.classroom.assignment.model.request;

public class Student {
  private String id;
  private String name;
  private String Department;

  public Student(String id, String name,String Department) {
    this.setId(id);
    this.setName(name);
    this.setName(Department);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDepartment() {
    return Department;
  }

  public void setDepartment(String Department) {
    this.Department = Department;
  }


}
