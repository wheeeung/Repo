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

    @PostMapping("/board/input")
    public String Insert(@RequestBody BoardDto board){
        return service.Insert(board);
    }

    @GetMapping("/board")
    public List<BoardNumberAndTitle> List(){
        return service.List();
    }

    @PutMapping("/board/edit/{number}")
    public String Retouch(@RequestBody BoardDto board, @PathVariable("number")int number){
        return service.Retouch(number, board);
    }

    @GetMapping("/board/{number}")
    public Optional<Board> Find(@PathVariable("number")int number)
    {
        return service.Find(number);
    }

    @DeleteMapping("/board/{number}")
    public String Delete(@PathVariable("number")int number){
        return service.Delete(number);
    }
}
