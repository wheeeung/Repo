package com.example.clubprojecthomework.Service;

import com.example.clubprojecthomework.Entity.BoardEntity;
import com.example.clubprojecthomework.Dto.BoardDto;
import com.example.clubprojecthomework.Dto.BoardNumberAndTitleDto;

import java.util.List;
import java.util.Optional;

public interface Service {
    public String insert(BoardDto board);
    public List<BoardNumberAndTitleDto> list();
    public String edit(int number, BoardDto board);
    public Optional<BoardEntity> found(int number);
    public void delete(int number);
}
