package com.example.clubprojecthomework.Service;

import com.example.clubprojecthomework.Board;
import com.example.clubprojecthomework.BoardDto;
import com.example.clubprojecthomework.BoardNumberAndTitle;

import java.util.List;
import java.util.Optional;

public interface Service {
    public String Insert(BoardDto board);
    public List<BoardNumberAndTitle> List();
    public String Edit(int number, BoardDto board);
    public Optional<Board> Found(int number);
    public String Delete(int number);
}
