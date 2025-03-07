package com.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import java.util.Date;

@Entity

@Table (name = "todo")
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NonNull
    private String title;

    @Column
    @NonNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    @Column
    @NonNull
    private String status;

    public ToDo(){}

    //Setter & Getter of Id
    public Long getId(){return id;}
    public void setId (Long id ){this.id=id;}

    //Setter & Getter of Title
    public String getTitle(){return title;}
    public void setTitle (String title){this.title=title;}

    //Setter & Getter of Date
    public Date getDate(){return date;}
    public void SetDate (Date date){this.date=date;}

    //Setter & Getter of Status
    public String getStatus(){return status;}
    public void setStatus (String status ){this.status=status;}


}
