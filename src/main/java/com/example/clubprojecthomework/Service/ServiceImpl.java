package com.example.clubprojecthomework.Service;

import com.example.clubprojecthomework.*;
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
    public String Insert(BoardDto board) {
        Board boardEntity = new Board(board.getNumber(),board.getWriter(),board.getTitle(),board.getContents());
        boardRepository.save(boardEntity);
        return "게시물이 입력되었습니다.";
    }

    @Override
    public List<BoardNumberAndTitle> List() {
        return boardNumberAndTitleRepository.findAllBy();
    }

    @Override
    @Transactional
    public String Edit(int number, BoardDto board) {
        Board find = boardRepository.findById(number).get();
        find.setWriter(board.getWriter());
        find.setTitle(board.getTitle());
        find.setContents(board.getContents());
        return "게시물이 수정되었습니다.";
    }

    @Override
    public Optional<Board> Found(int number) {
        return boardRepository.findById(number);
    }

    @Override
    public String Delete(int number) {
        boardRepository.deleteById(number);
        return "게시물이 삭제되었습니다.";
    }
}
