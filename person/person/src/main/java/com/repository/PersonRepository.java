package com.repository;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import com.model.Person;
import org.springframework.util.ResourceUtils;

@Repository
public class PersonRepository
{
    private List<Person> people = new ArrayList<>();

    //Constructor đọc toàn bộ dữ liệu từ JSON vào
    public PersonRepository() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        File file;
        try {
            file = ResourceUtils.getFile("classpath:static/person.json");
            people.addAll(mapper.readValue(file, new TypeReference<List<Person>>(){}));
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Person> getAll() {
        return people;
    }

   //1. Trả về danh sách 'developer' ở các thành phố Hanoi, Saigon, Shanghai
   public Map<String, List<Person>> groupDevelopeByCity() {
       return people
               .stream()
               .filter(p-> p.getCity().equals("Hanoi") ||  p.getCity().equals("Saigon") || p.getCity().equals("Shanghai"))
               .filter(p-> p.getJob().equals("developer"))
               .collect(Collectors.groupingBy(Person::getCity));

   }

   //2. Tìm ra thành phố có độ tuổi trung bình của lập trình viên trẻ nhất

    public List<Map.Entry<String,Double>> youngestdevs() {
        //group developer by city
        Map<String, List<Person>> groupDevelopersByCity = people
                .stream()
                .filter(p -> p.getJob().equals("developer"))
                .collect(Collectors.groupingBy(Person::getCity));
        //average age
        Map<String, Double> cityAverageAge= groupDevelopersByCity.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        entry -> entry.getValue()
                                .stream()
                                .collect(Collectors.averagingInt(Person::getAge))));

        // return set sort theo age
        return cityAverageAge.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .limit(1)
                .collect(Collectors.toList());

    }

   //3. Liệt kê tỷ lệ nam/nữ ở từng thành phố
   public  Map<String, Double> malefemaleratio() {
       //group male by city
       Map<String, List<Person>> groupByCity = people
               .stream()
               .collect(Collectors.groupingBy(Person::getCity));

       Map<String, Double> citymaleratio = groupByCity.entrySet()
               .stream()
               .collect(Collectors.toMap(Map.Entry::getKey,
                       entry -> (double)entry.getValue()
                               .stream()
                               .filter(p -> p.getGender().equals("Male"))
                               .collect(Collectors.counting())
                               /  (double) entry.getValue()
                               .stream()
                               .filter(p -> p.getGender().equals("Female"))
                               .collect(Collectors.counting())
               ));


       return citymaleratio;
   }


   //4. Tính mức lương trung bình của tất cả những người trên 30 tuổi

    public Double avgsalarypeopleabove30() {

        Double avgSalary = people
                .stream()
                .filter(p -> p.getAge()>30)
                .collect(Collectors.averagingDouble(Person::getSalary));

        return avgSalary;
    }
}


