package com.jungle.ch2.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "tbl_webBoard")
@EqualsAndHashCode(of = "bno")
@ToString
public class WebBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;
    private String title;

    private String writer;
    private String content;

    @CreationTimestamp
    private Timestamp regdate;
    @CreationTimestamp
    private Timestamp updateDate;
}
