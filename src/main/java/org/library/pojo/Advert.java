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
@Table (name = "ADVERT")

public class Advert implements Serializable{

    private static final long serialVersionUID = -5527566248002296042L;

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "USER_ID")
    private Integer user_id;

    @Column(name = "BOOK_ID")
    private Integer book_id;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "PRICE")
    private Integer price;

    @Column(name = "TYPE")
    private Integer type;


    //Getters

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public String getStatus() {
        return status;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getType() {
        return type;
    }

    public Integer getBook_id() {
        return book_id;
    }

    //Setters

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }
}

