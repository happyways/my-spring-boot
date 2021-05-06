package org.ssu.sslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.ssu.sslab.domain.Dog;
import org.ssu.sslab.service.DogManagementService;

import java.util.ArrayList;

@RestController
public class DogController {
    @Autowired
    private DogManagementService dogManagementService;

    @PostMapping("/dogs")
    public void createDog(@RequestBody Dog dog) {
        dogManagementService.createDog(dog);
    }

    @GetMapping("/dogs")
    public ArrayList<Dog> getAllDogs() {
        return dogManagementService.getAllDogs();
    }

    @GetMapping("/dogs/{name}")
    public Dog getDogByName(@PathVariable String name) {
        return dogManagementService.findDog(name);
    }

    @PutMapping("/dogs")
    public void updateDog(@RequestBody Dog dog) {
        dogManagementService.updateDog(dog);
    }

    @DeleteMapping("/dogs")
    public void deleteDog(@RequestParam String name) {
        dogManagementService.deleteDog(name);
    }
}
