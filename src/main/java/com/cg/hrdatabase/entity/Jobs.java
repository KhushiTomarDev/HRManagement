package com.hrapp.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "jobs")
public class Jobs {

    @Id
    @Column(name = "job_id", length = 10)
    private String jobId;

    @Column(name = "job_title", length = 35, nullable = false)
    private String jobTitle;

    @Column(name = "min_salary")
    private BigDecimal minSalary;

    @Column(name = "max_salary")
    private BigDecimal maxSalary;

    // 🔹 Relationship with Employee (IMPORTANT for Page 3)
    @OneToMany(mappedBy = "job")
    @JsonIgnore   // prevents infinite recursion
    private List<Employee> employees;

    // Getters & Setters
}