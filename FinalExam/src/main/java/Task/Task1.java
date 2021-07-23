package Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 Write a program that will read a string containing numbers from the keyboard, each number is separated by comma ","

 Display to screen the whole list of number in decreasing sorting order.

 If string contains alphabetical character instead of a number, then the method should catch an exception and display to screen the message "String contains character which cannot be converted into number".

 Requirements:
 •The program must read a string of numbers from the keyboard.
 •The readData method is to read numbers from the keyboard
 •The readData method must contain a try-catch block.
 •The sortNumber method is to sorting list of numbers into decreasing order.
 •The readData method calls sortNumber method.
 •If the user enters alphabetical character rather than a number, the program should display message "String contains character which cannot be converted into number".
 */

public class Task1 {
    public List<Integer> readData() {
        //write your code here OK

        String str = inputString();
        str = str.trim();
        String[] arrayStr = str.split(",");
        List<Integer> numberList = new ArrayList<>();
        try {
            for (String phantu : arrayStr) {
                numberList.add(Integer.valueOf(phantu));
            }
            sortNumberList(numberList);
        }
        catch (Exception ex)
        {
            System.out.printf("String contains character which cannot be converted into number");

        }
        return null;
    }

    //nhập chuỗi số
    public String inputString()
    {

            String str = "";
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.printf("Nhập chuỗi số cách nhau dấu phẩy: ");
                str = scanner.nextLine();
            }
            while (str.trim().length() == 0);
            return str;

    }


    public List<Integer> sortNumberList(List<Integer> list){
        //write your code here
        Collections.sort(list, Collections.reverseOrder());
        System.out.printf("\nDanh sách số sx giảm dần là: \n");
        list.stream().forEach((num) -> { System.out.println(num); });
        return null;

    }

    public static void main(String[] args) {
        //write your code here
        Task1 task1 = new Task1();
        task1.readData();


    }
}



