package Task;

import java.util.HashSet;
import java.util.Set;

/**
 Create a set of numbers (Set<Integer>) and add 10 different numbers to it.

 Remove from the set all numbers greater than 10 .

 Requirements:
 •Create createSet() method to create and return a HashSet containing 10 different numbers.
 •Create removeAllNumbersGreaterThan10() method to remove from the set all numbers greater than 10.
 •Write unit test for the removeAllNumbersGreaterThan10() method
 */
public class Task5 {
    public static void main(String[] args) {
        Task5 task5 = new Task5();
        Set<Integer> setNumber = task5.createSet();
        System.out.println("Set trước khi remove là: " + setNumber);
        System.out.println("Số phần tử của Set là: " + setNumber.size());
        Set<Integer> integerSet = task5.removeAllNumbersGreaterThan10(setNumber);
        System.out.println("Số phần tử còn lại sau khi đã removed là: " + integerSet);
    }
    public Set<Integer> createSet() {
        //write your code here
        Set<Integer> setNumber = new HashSet<>();
        setNumber.add(4);
        setNumber.add(7);
        setNumber.add(11);
        setNumber.add(50);
        setNumber.add(499);
        setNumber.add(222);
        setNumber.add(443);
        setNumber.add(777);
        setNumber.add(0);
        setNumber.add(10);

        return setNumber;

    }
    public Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        //write your code here
        set.removeIf(i -> i > 10);
        return set;

    }

}
