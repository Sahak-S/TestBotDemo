package com.example.testbotdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;


//@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private Long chatId;
    private Integer stateId;
    private String phone;
    private String email;
    private Boolean admin;
    private Boolean notified = false;

    public User(Long chatId, Integer state) {
        this.chatId = chatId;
        this.stateId = state;
    }

    public User(Long chatId, Integer stateId,Boolean admin) {
        this.chatId = chatId;
        this.stateId = stateId;
        this.admin = admin;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Boolean getNotified() {
        return notified;
    }

    public void setNotified(Boolean notified) {
        this.notified = notified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(chatId, user.chatId) && Objects.equals(stateId, user.stateId) && Objects.equals(phone, user.phone) && Objects.equals(email, user.email) && Objects.equals(admin, user.admin) && Objects.equals(notified, user.notified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, chatId, stateId, phone, email, admin, notified);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", chatId=" + chatId +
                ", stateId=" + stateId +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", admin=" + admin +
                ", notified=" + notified +
                '}';
    }
}
