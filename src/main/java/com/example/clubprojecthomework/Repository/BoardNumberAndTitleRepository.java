package com.example.clubprojecthomework.Repository;

import com.example.clubprojecthomework.Entity.BoardEntity;
import com.example.clubprojecthomework.Dto.BoardNumberAndTitleDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardNumberAndTitleRepository extends JpaRepository<BoardEntity, Integer> {
    List<BoardNumberAndTitleDto> findAllBy();
}
