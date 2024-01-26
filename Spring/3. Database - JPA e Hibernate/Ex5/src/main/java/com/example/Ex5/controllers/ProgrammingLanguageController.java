package com.example.Ex5.controllers;


import com.example.Ex5.DTO.InventorUpdatingRequest;
import com.example.Ex5.entities.ProgrammingLanguageEnt;
import com.example.Ex5.repositories.ProgrammingLanguageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/languages")

public class ProgrammingLanguageController {

    @Autowired
    private ProgrammingLanguageRepo languageRepo;

    @PostMapping("/createLanguage")
    public ProgrammingLanguageEnt createLanguage(@RequestBody ProgrammingLanguageEnt programmingLanguageEnt) {
        return languageRepo.saveAndFlush(programmingLanguageEnt);
    }

    @GetMapping("/getAllLanguages")

    public Page<ProgrammingLanguageEnt> getAllLanguages(
            @RequestParam(required = false, defaultValue = "0") Optional<Integer> page,
            @RequestParam(required = false, defaultValue = "2") Optional<Integer> size) {
        if (page.isPresent() && size.isPresent()) {
            Pageable twoElements = PageRequest.of(page.get(), size.get());
            return languageRepo.findAll(twoElements);
        } else {
            return Page.empty();
        }

    }

    @PatchMapping("/updateInventor/{id}")

    public Optional<ProgrammingLanguageEnt> updateInventor(@PathVariable long id, @RequestBody InventorUpdatingRequest updatingRequest) {
        Optional<ProgrammingLanguageEnt> languageToBeUpdated = languageRepo.findById(id);
        if (languageToBeUpdated.isPresent()) {
            languageToBeUpdated.get().setInventor(updatingRequest.getUpdatedInventor());
            languageRepo.saveAndFlush(languageToBeUpdated.get());
            return languageToBeUpdated;
        } else {
            return Optional.empty();
        }
    }
}
