package com.example.clubprojecthomework.Repository;

import com.example.clubprojecthomework.Board;
import com.example.clubprojecthomework.BoardNumberAndTitle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardNumberAndTitleRepository extends JpaRepository<Board, Integer> {
    List<BoardNumberAndTitle> findAllBy();
}
