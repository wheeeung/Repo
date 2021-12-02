package com.example.clubprojecthomework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BOARD")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int number;

    @Column(name = "WRITER")
    private String writer;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CONTENTS")
    private String contents;

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
