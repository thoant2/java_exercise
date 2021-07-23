package Task;

import java.util.*;

/**
 * There is a Cat class with a String variable name, int variable age.
 *
 * Create a Map<Integer, Cat> and add 10 cats represented by (index, Cat) pairs.
 *
 * Get a Set of all cats from the Map and display it on the screen.
 *
 * Requirements
 * •The program must not read data from the keyboard.
 * •The createMap method must create a new HashMap<Integer, Cat> object.
 * •The createMap method must add 10 cats to the map, represented by (index, Cat) pairs.
 * •The createMap method must return the created map.
 * •The convertMapToSet method must create and return the set of cats retrieved from the passed map.
 * •The program must display name and age each cats in the set.
 */

public class Task2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        Map<Integer,Cat> mapCat = task2.createMap();
        Set<Cat> setCat = task2.convertMapToSet(mapCat);

        task2.printCats(setCat);

    }

    public Map<Integer,Cat> createMap() {
        //write your code here
        Map<Integer,Cat> catMap= new HashMap<>();
        catMap.put(1, new Cat("Mèo 1", 1));
        catMap.put(2, new Cat("Mèo 2", 3));
        catMap.put(3, new Cat("Mèo 3", 4));
        catMap.put(4, new Cat("Mèo 4", 4));
        catMap.put(5, new Cat("Mèo 5", 5));
        catMap.put(6, new Cat("Mèo 6", 6));
        catMap.put(7, new Cat("Mèo 7", 2));
        catMap.put(8, new Cat("Mèo 8", 9));
        catMap.put(9, new Cat("Mèo 9", 2));
        catMap.put(10, new Cat("Mèo 10", 10));

        return catMap;
    }

    public Set<Cat> convertMapToSet(Map<Integer, Cat> map){
        //write your code here

        //Convert Map values to Set
        Set<Cat> setCat= new HashSet<Cat>(map.values());

        return setCat;
    }

    public void printCats(Set<Cat> cats) {
        //write your code here
        System.out.printf("Danh sách mèo: \n");

        for (Cat cat : cats) {
            System.out.println(cat.getName() + " - "+ cat.getAge() +" tuổi");
        }
    }

    public class Cat{

        public Cat(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        //write your code here
        private String name;
        private Integer age;

    }
}
