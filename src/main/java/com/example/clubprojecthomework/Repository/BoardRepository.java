package com.example.clubprojecthomework.Repository;

import com.example.clubprojecthomework.Entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository <BoardEntity, Integer>{
}
