package com.example.clubprojecthomework.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto {
    private int number;
    private String writer;
    private String title;
    private String contents;
}
