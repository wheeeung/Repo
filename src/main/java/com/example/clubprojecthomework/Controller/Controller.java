package com.example.clubprojecthomework.Controller;

import com.example.clubprojecthomework.Board;
import com.example.clubprojecthomework.BoardDto;
import com.example.clubprojecthomework.BoardNumberAndTitle;
import com.example.clubprojecthomework.Service.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final Service service;

    @PostMapping("/board/insert")
    public String Insert(@RequestBody BoardDto board){
        return service.Insert(board);
    }

    @GetMapping("/board")
    public List<BoardNumberAndTitle> List(){
        return service.List();
    }

    @PutMapping("/board/edit/{number}")
    public String Edit(@RequestBody BoardDto board, @PathVariable("number")int number){
        return service.Edit(number, board);
    }

    @GetMapping("/board/{number}")
    public Optional<Board> Found(@PathVariable("number")int number)
    {
        return service.Found(number);
    }

    @DeleteMapping("/board/delete/{number}")
    public String Delete(@PathVariable("number")int number){
        return service.Delete(number);
    }
}
