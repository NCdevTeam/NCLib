package org.library.pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Created by Владислав on 01.04.2017.
 */

@Entity
@Table(name = "AUTHOR")
public class Author implements Serializable {
    @Id
    @Column (name = "ID")
    @GeneratedValue
    private Integer id;

    @Column (name = "NAME")
    private String Name;

    @Column (name = "SURNAME")
    private String Surname;

    @Column (name = "NICKNAME")
    private String Nickname;

    @Column (name = "DESCRIPTION")
    private String Description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
