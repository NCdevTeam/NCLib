package org.library.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;

/**
 * Created by Romio on 01.04.2017.
 */

@Entity
@Table(name = "USER")

public class User implements Serializable{

    private static final long serialVersionUID = -5527566248002296042L;

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "LOGIN")
    private String login;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "MAIL")
    private String mail;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "RATING")
    private Double rating;

    @Column(name = "LAST_IP")
    private String last_ip;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;


    //Getters

    public Integer getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getMail() {
        return mail;
    }

    public Integer getStatus() {
        return status;
    }

    public Double getRating() {
        return rating;
    }

    public String getLast_ip() {
        return last_ip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //Setters

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setLast_ip(String last_ip) {
        this.last_ip = last_ip;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
