package com.ironhack.animalsearchservice.utils;

import com.github.javafaker.Faker;
import com.ironhack.animalsearchservice.dao.Animal;
import com.ironhack.animalsearchservice.repositories.AnimalRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class SampleDataLoader implements CommandLineRunner {

    private final AnimalRepository animalRepository;
    private final Faker faker;

    public SampleDataLoader(AnimalRepository animalRepository, Faker faker) {
        this.animalRepository = animalRepository;
        this.faker = faker;
    }


    @Override
    public void run(String... args) {

        List<Animal> sampleAnimals = IntStream.rangeClosed(1, 20)
                .mapToObj(i -> new Animal(
                        faker.funnyName().name(),
                        faker.animal().name(),
                        faker.number().numberBetween(0L, 20L),
                        faker.random().nextBoolean()
                )).collect(Collectors.toList());

        animalRepository.saveAll(sampleAnimals);
    }

}
