package com.example.Szoft.Mod.Project2.service;

import com.example.Szoft.Mod.Project2.dto.BorrowingDTO;
import com.example.Szoft.Mod.Project2.entity.Borrowing;
import com.example.Szoft.Mod.Project2.entity.Person;
import com.example.Szoft.Mod.Project2.repository.BorrowingRepository;
import com.example.Szoft.Mod.Project2.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BorrowingService {

    @Autowired
    private BorrowingRepository borrowingRepository;
    @Autowired
    private PersonRepository personDTO;


    public String insertBorrowing(BorrowingDTO borrowingDTO) {
        try {
            Borrowing borrowing = new Borrowing();
            borrowing.setFk_person(new Person(borrowingDTO.getPerson()));
            this.borrowingRepository.save(borrowing);
            return "Sikeres hozzáadás!";
        }
        catch (HttpMessageNotReadableException e) {
            return "Nem sikerült a hozzáadás..hibás formátum.";
        }
    }


    public Iterable<Borrowing> getAllBorrowing() {
        return borrowingRepository.findAll();
    }

    public Optional<Borrowing> getBorrowingById(Integer id){
        return this.borrowingRepository.findById(id);
    }

    public void updateBorrowing(Borrowing borrowing) {
        this.borrowingRepository.save(borrowing);
    }

    public String removeBorrowingById(Integer id) {
        try {
            this.borrowingRepository.deleteById(id);
            return "Sikeres törlés!";
        }
        catch(EmptyResultDataAccessException e) {
            return "Nem létezik ilyen id!";
        }
    }

}
