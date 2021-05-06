package org.ssu.sslab.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.ssu.sslab.domain.Dog;

import java.util.ArrayList;

@Repository
@Slf4j
public class DogRepository {
    ArrayList<Dog> dogs = new ArrayList<>();

    public void insertDog(Dog dog) {
        dogs.add(dog);
        log.info("dog has been inserted successful. dog : {}", dog);
    }

    public ArrayList<Dog> getAllDogs() {
        return dogs;
    }

    public void updateDog(Dog dog) {
        Dog targetDog = dogs.stream()
                //curDog 대신 어떤 이름이 좋을까?
                .filter(curDog -> curDog.getName().equals(dog.getName()))
                .findAny()
                .orElseThrow();
        targetDog.setType(dog.getType());
    }

    public Dog findDog(String name) {
        return dogs.stream()
                .filter(dog -> dog.getName().equals(name))
                .findAny()
                .orElseThrow(); //기본 500던짐
    }

    public void deleteDog(String name) {
        dogs.removeIf(dog -> dog.getName().equals(name));
    }
}
