package com.controller;

import com.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.model.Person;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")

public class PeopleController
{
    @Autowired private PersonRepository personRepository;

   @GetMapping("devhanoisaigoshanghai")
    public ResponseEntity<Map<String, List<Person>>> devhanoisaigoshanghai() {
       return ResponseEntity.ok().body(personRepository.groupDevelopeByCity());
   }
   @GetMapping("youngestdevs")
   public ResponseEntity<List<Map.Entry<String,Double>>> youngestdevs() {
       return ResponseEntity.ok().body(personRepository.youngestdevs());
   }
    @GetMapping("malefemaleratio")
   public ResponseEntity< Map<String, Double>> malefemaleratio() {
       return ResponseEntity.ok().body(personRepository.malefemaleratio());
   }
   @GetMapping("avgsalarypeopleabove30")
   public ResponseEntity<Double> avgsalarypeopleabove30()   {
       return ResponseEntity.ok().body(personRepository.avgsalarypeopleabove30());
   }
    @GetMapping("getAll")
    public ResponseEntity<List<Person>> getAll() {
        return ResponseEntity.ok().body(personRepository.getAll());
    }
}
