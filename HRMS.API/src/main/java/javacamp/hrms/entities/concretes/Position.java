package javacamp.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="job_titles")
public class Position {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int    id;

    @Column(name="title")
    private String title;

    @Column(name="create_date")
    private Date createDate;


}