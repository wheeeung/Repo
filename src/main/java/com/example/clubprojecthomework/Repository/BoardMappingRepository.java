package com.example.clubprojecthomework.Repository;

import com.example.clubprojecthomework.Board;
import com.example.clubprojecthomework.BoardMapping;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardMappingRepository extends JpaRepository<Board, Integer> {
    List<BoardMapping> findAllBy();
}
