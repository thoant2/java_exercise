package Task;

import java.util.Scanner;

/**
 * Write a method readString that reads a string from the keyboard.
 *
 * Write a method upperCaseString to change the first letter of each word to uppercase
 *
 * Display the result on the screen.
 *
 * Example input:
 * sam i am.
 *
 * Example output:
 * Sam I Am.
 *
 * Requirements:
 * •The method readString should read a string from the keyboard.
 * •The method upperCaseString should change the first letter of each word to uppercase
 * •The main method displays the result to screen.
 */
public class Task3 {
    public String readString()  {
        //write your code here
        String str = "";
        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.printf("Nhập chuỗi ký tự bất kỳ: ");
            str = scanner.nextLine();
        }
        while (str.trim().length()==0);
        System.out.printf("Chuỗi sau khi viết hoa là: %s", upperCaseString(str));

        return null;
    }

    public String upperCaseString (String s){
        //write your code here
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        String[] arrayStr = s.split(" ");
        StringBuilder newstring = new StringBuilder();
        for (String phantu: arrayStr )
        {
            String temp = String.valueOf(phantu.charAt(0));
            newstring.append(temp.toUpperCase()+phantu.substring(1).toString());
            newstring.append(" ");
        }
        return newstring.toString().trim();

    }

    public static void main(String[] args) {
        //write your code here

        Task3 task3 = new Task3();
        task3.readString();
    }

}
