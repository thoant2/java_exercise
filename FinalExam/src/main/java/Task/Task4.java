package Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 1. Use the keyboard to enter the number N.
 *
 * 2. Use the keyboard to enter N integers and put them in a list: the getIntegerList method.
 *
 * 3. Find the minimum among the list items: the getMinimum method.
 *
 * Requirements:e
 * •The program should read values from the keyboard.
 * •The getIntegerList() method should read the number N from the keyboard and then return a list of N elements, which has been filled with numbers read from the keyboard.
 * •The getMinimum() method must return the minimum among the list items.
 * •The main() method should call the getIntegerList() method.
 * •The main() method should call the getMinimum() method.
 */
public class Task4 {
    public static void main(String[] args){
        //write your code here
        Task4 task4 = new Task4();
        task4.getIntegerList();
    }


    public int getMinimum(List<Integer> array) {
        // write your code here

        return 0;
    }

    public List<Integer> getIntegerList(){
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập số bất kỳ: ");
        int i = scanner.nextInt();
        if(i<0)
            System.out.printf("\nBạn cần nhập số > 0");
        else {
            List<Integer> listNumber = new ArrayList<>();
            for (int j = 0; j<i; j++)
            {
                System.out.printf("\nMời bạn nhập số thứ %d: ",j );
                listNumber.add(scanner.nextInt());
            }
            if(listNumber.size()> 0 )
            {
                //Collections.sort(listNumber, Collections.reverseOrder());
                System.out.printf("Số nhỏ nhất là: %d", Collections.min(listNumber));
            }

        }
        return null;
    }

}
