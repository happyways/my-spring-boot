package org.ssu.sslab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssu.sslab.domain.Dog;
import org.ssu.sslab.repository.DogRepository;

import java.util.ArrayList;

@Service
public class DogManagementService {
    @Autowired
    DogRepository dogRepository;

    public void createDog(Dog dog) {
        //쓸데 없는 공백, 글자수 제한 등을 처리하고 DB에 위임

        dogRepository.insertDog(dog);
    }

    public Dog findDog(String name) {
        //business logic
        return dogRepository.findDog(name);
    }

    public ArrayList<Dog> getAllDogs() {
        return dogRepository.getAllDogs();
    }

    public void updateDog(Dog dog) {
        dogRepository.updateDog(dog);
    }

    public void deleteDog(String name) {
        dogRepository.deleteDog(name);
    }
}
