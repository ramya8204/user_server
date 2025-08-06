package com.userex.entity;
import com.userex.entity.Contact;

public class Contact {

    private Long cId;
    private String contactName;
    private String email;
    private Long userId;

    public Contact() {}

    // Getters and Setters
    public Long getcId() {
        return cId;
    }
    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getContactName() {
        return contactName;
    }
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
