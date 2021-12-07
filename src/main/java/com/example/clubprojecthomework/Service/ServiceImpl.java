package com.example.clubprojecthomework.Service;

import com.example.clubprojecthomework.Dto.BoardDto;
import com.example.clubprojecthomework.Dto.BoardNumberAndTitleDto;
import com.example.clubprojecthomework.Entity.BoardEntity;
import com.example.clubprojecthomework.Repository.BoardNumberAndTitleRepository;
import com.example.clubprojecthomework.Repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ServiceImpl implements Service{

    private final BoardRepository boardRepository;
    private final BoardNumberAndTitleRepository boardNumberAndTitleRepository;

    @Override
    public String insert(BoardDto board) {
        BoardEntity boardEntity = new BoardEntity(board.getNumber(),board.getWriter(),board.getTitle(),board.getContents());
        boardRepository.save(boardEntity);
        return "게시물이 입력되었습니다.";
    }

    @Override
    public List<BoardNumberAndTitleDto> list() {
        return boardNumberAndTitleRepository.findAllBy();
    }

    @Override
    @Transactional
    public String edit(int number, BoardDto board) {
        BoardEntity find = boardRepository.findById(number).get();
        find.setWriter(board.getWriter());
        find.setTitle(board.getTitle());
        find.setContents(board.getContents());
        return "게시물이 수정되었습니다.";
    }

    @Override
    public Optional<BoardEntity> found(int number) {
        return boardRepository.findById(number);
    }

    @Override
    public void delete(int number) {
        boardRepository.deleteById(number);
    }
}
