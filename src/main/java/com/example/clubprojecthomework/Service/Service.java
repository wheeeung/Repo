package com.example.clubprojecthomework.Service;

import com.example.clubprojecthomework.Board;
import com.example.clubprojecthomework.BoardDto;
import com.example.clubprojecthomework.BoardMapping;

import java.util.List;
import java.util.Optional;

public interface Service {
    public String Insert(BoardDto board);
    public List<BoardMapping> List();
    public String Retouch(int number, BoardDto board);
    public Optional<Board> Find(int number);
    public String Delete(int number);
}
