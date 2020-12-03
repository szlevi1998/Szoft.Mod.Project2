package com.example.Szoft.Mod.Project2.controller;

import com.example.Szoft.Mod.Project2.dto.BorrowingDTO;
import com.example.Szoft.Mod.Project2.entity.Borrowing;
import com.example.Szoft.Mod.Project2.service.BorrowingService;
import com.example.Szoft.Mod.Project2.views.Views;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/borrowing")
public class BorrowingController {

    @Autowired
    private BorrowingService borrowingService;

    @JsonView(Views.FromMovie.class)
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Borrowing> getAllBorrowing() {
        return borrowingService.getAllBorrowing();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Borrowing> getBorrowingById(@PathVariable("id") int id){
        return borrowingService.getBorrowingById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteBorrowingById(@PathVariable("id") int id) {
        return borrowingService.removeBorrowingById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateBorrowing(@RequestBody Borrowing borrowing) {
        borrowingService.updateBorrowing(borrowing);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertBorrowing(@RequestBody BorrowingDTO borrowingDTO){
        borrowingService.insertBorrowing(borrowingDTO);
    }
}
