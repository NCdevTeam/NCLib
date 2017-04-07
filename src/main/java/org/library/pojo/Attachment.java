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
@Table(name = "ATTACHMENT")
public class Attachment implements Serializable {
    @Id
    @Column (name = "ID")
    @GeneratedValue
    private Integer id;

    @Column (name = "ADS_ID")
    private Integer adsID;

    @Column (name = "URL")
    private String Url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdsID() {
        return adsID;
    }

    public void setAdsID(Integer adsID) {
        this.adsID = adsID;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
