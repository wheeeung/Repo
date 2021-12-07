package com.example.clubprojecthomework.Controller;

import com.example.clubprojecthomework.Entity.BoardEntity;
import com.example.clubprojecthomework.Dto.BoardDto;
import com.example.clubprojecthomework.Dto.BoardNumberAndTitleDto;
import com.example.clubprojecthomework.Service.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final Service service;

    @PostMapping("/board")
    public String Insert(@RequestBody BoardDto board){
        return service.insert(board);
    }

    @GetMapping("/board")
    public List<BoardNumberAndTitleDto> List(){
        return service.list();
    }

    @PutMapping("/board/{number}")
    public String Edit(@RequestBody BoardDto board, @PathVariable("number")int number){
        return service.edit(number, board);
    }

    @GetMapping("/board/{number}")
    public Optional<BoardEntity> Found(@PathVariable("number")int number)
    {
        return service.found(number);
    }

    @DeleteMapping("/board/{number}")
    public void Delete(@PathVariable("number")int number){
        service.delete(number);
    }
}
