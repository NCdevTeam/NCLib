package org.library.pojo; /**
 * Created by Владислав on 01.04.2017.
 */

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
public class Book implements Serializable{
    @Id
    @Column (name = "ID")
    @GeneratedValue
    private Integer id;

    @Column (name = "AUTHOR_ID")
    private Integer author_id;

    @Column(name = "NAME")
    private String Name;

    @Column(name = "DESCRIPTION")
    private String Description;

    @Column(name = "IMAGE_URL")
    private String ImageUrl;

    @Column(name = "DOWNLOAD_URL")
    private String DownloadUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.ImageUrl = imageUrl;
    }

    public String getDownloadUrl() {
        return DownloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.DownloadUrl = downloadUrl;
    }


}
