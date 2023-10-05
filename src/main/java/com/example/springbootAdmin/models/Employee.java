package com.example.springbootAdmin.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long Id;
    private String name;
    private String email;
    private String jobTitle;
    private String jobDescription;
    private String phoneNumber;
    private String imageUrl;
    private Long startDate;
    private Boolean isVerified;

    public Employee(String name,String email, String jobTitle, String jobDescription, String phoneNumber, String imageUrl, Long startDate,Boolean isVerified){
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.phoneNumber = phoneNumber;
        this.imageUrl =imageUrl;
        this.startDate = startDate;
        this.isVerified = isVerified;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public void setJobDescription(String jobDescription){
        this.jobDescription = jobDescription;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }
    public void setStartDate(Long startDate){
        this.startDate = startDate;
    }
    public void setVerified(Boolean isVerified){
        this.isVerified =isVerified;
    }
    
    public Long getId(){
        return Id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public String getJobDescription(){
        return jobDescription;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getImageUrl(){
        return imageUrl;
    }
    public Long getStartDate(){
        return startDate;
    }
    public Boolean getVerified(){
        return isVerified;
    }
}