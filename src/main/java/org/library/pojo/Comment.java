package org.library.pojo;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;


/**
 * Created by Romio on 01.04.2017.
 */

@Entity
@Table(name = "COMMENT")
public class Comment implements Serializable {

    private static final long serialVersionUID = -5527566248002296042L;

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Column (name = "NOTE_ID")
    private Integer note_id;

    @Column (name = "NOTE_TYPE")
    private Integer noteType;

    @Column(name = "USER_ID")
    private Integer user_id;

    @Column(name = "COMMENT_TEXT")
    private String commentText;

    @Column(name = "DATE")
    private Date date;


    //Getters

    public Integer getId() {
        return id;
    }

    public Integer getNote_id() {
        return note_id;
    }

    public Integer getNoteType() {
        return noteType;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public String getCommentText() {
        return commentText;
    }

    public Date getDate() {
        return date;
    }

    //Setters

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNote_id(Integer note_id) {
        this.note_id = note_id;
    }

    public void setNoteType(Integer noteType) {
        this.noteType = noteType;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}


