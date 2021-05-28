import java.util.Random;
import java.util.Scanner;

public class Lesson10 {
    public void menu()
    {
        System.out.printf("\n ------------------------------");
        System.out.printf("\n Bài 1, 2, 3, 4, 5, 6");
        System.out.printf("\n ------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\n Bạn muốn xem bài nào? nhập vào đây:");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                Bai1(); menu();
                break;
            case 2:
                Bai2(); menu();
            case 3:
                Bai3(); menu();
            case 4:
                HomeWork1(); menu();
            case 5:
                HomeWork2(); menu();
            case 6:
                HomeWork3(); menu();

            default:
                System.out.printf("Không có bài nào hợp lệ với số bạn chọn, mời chọn lại");
                menu();
                break;
        }

    }
    // in ra các số ngẫu nhiên 0-> 100, in ra số > 90 thì dừng ct bằng 3 vòng loop
    // rồi đo xem loop nào nhanh nhất
    public void Bai1()
    {
        Random random = new Random();
        int number = random.nextInt(100);
        int i=0;
        // for loop
        System.out.printf("\n----------------------------------");
        System.out.printf("\nSố ngẫu nhiên là: %d", number);
        System.out.printf("\nDanh sách số là (for loop): ");
        long start = System.nanoTime();
        for(i=0; i<number; i++)
        {
            if(i<=90)
                System.out.printf("%d\t",i);
        }
        long finish = System.nanoTime();
        System.out.printf("\nThời gian vòng for: %d", finish-start);

        // while loop
        System.out.printf("\n----------------------------------");
        System.out.printf("\nSố ngẫu nhiên là: %d", number);
        System.out.printf("\nDanh sách số là (while loop): ");
        long start1 = System.nanoTime();
        i=0;
        while (i<number)
        {
            if(i<=90)
                System.out.printf("%d\t",i);
            i++;
        }
        long finish1 = System.nanoTime();
        System.out.printf("\nThời gian vòng while: %d", finish1-start1);

        // do while loop
        System.out.printf("\n----------------------------------");
        System.out.printf("\nSố ngẫu nhiên là: %d", number);
        System.out.printf("\nDanh sách số là (do while loop): ");
        long start2 = System.nanoTime();
        i=0;
        do
        {
            if(i<=90)
                System.out.printf("%d\t",i);
            i++;
        }
        while(i<number);

        long finish2 = System.nanoTime();
        System.out.printf("\nThời gian vòng for: %d", finish2-start2);

        System.out.printf("\n----------------------------------");
        if(finish2-start2 <finish1-start1 && finish2-start2<finish-start)
            System.out.printf("\n Cách nhanh nhất là do while");
        else if(finish1-start1 <finish2-start2 && finish1-start1<finish-start)
            System.out.printf("\n Cách nhanh nhất là while");
        else if(finish-start <finish2-start2 && finish-start<finish1-start1)
            System.out.printf("\n Cách nhanh nhất là for");

    }
    // Viết PT nhập họ tên, tuổi, nơi ở, in ra màn hình
    // Tôi tên là..., năm nay tôi... tuổi, tôi đến từ...
    public void Bai2()
    {
        Scanner scanner= new Scanner(System.in);
        System.out.printf("\n What's your name? ");
        String strName = scanner.nextLine();
        System.out.printf("\n How are you? ");
        int intOld = Integer.valueOf(scanner.nextLine());
       //     scanner.nextLine();
        System.out.printf("\n Where are you? ");
        String strPlace = scanner.nextLine();
        System.out.printf("\n ----------------------");
        System.out.printf("\n Tôi tên là: %s, năm nay tôi %d tuổi, tôi đến từ %s", strName, intOld, strPlace);

    }
    // Nhập 1 số từ bàn phím, tạo 1 số ngẫu nhiên
    // so sánh 2 số, nếu số input > thì thông báo lớn hơn, ngược lại thì thông báo nhỏ hơn
    public void Bai3()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\n Nhập 1 số bất kỳ: ");
        int intInput = scanner.nextInt();
        Random random = new Random(1000);
        int intRandom = random.nextInt();
        System.out.printf("\n Số random là: %d", intRandom);
        if(intInput>intRandom)
            System.out.printf("\n So sánh với số ngẫu nhiên: lớn hơn");
        else if(intInput<intRandom)
            System.out.printf("\n So sánh với số ngẫu nhiên: nhỏ hơn");
        else
            System.out.printf("\n So sánh với số ngẫu nhiên: bằng nhau");
    }
    //Kiểm tra chuỗi chứa nội dung chuỗi khác ko?
    public void HomeWork1()
    {
        System.out.printf("\n Homework 1: ");
        String strA = inputString("A");
        String strB = inputString("B");
        if(strA.toLowerCase().trim().contains(strB.toLowerCase().trim()))
            System.out.printf("\n Chuỗi A chứa chuỗi B");
        else
            System.out.printf("\n Chuỗi A không chứa chuỗi B");
    }

    //Loại bỏ các ký tự giống nhau trong chuỗi aabbcd -> abcd
    public void HomeWork2()
    {
        System.out.printf("\n Homework 2: ");
        String strA = inputString("A");
        strA = strA.trim();
        int lengthStr = strA.length();
        char[] matrixA = new char[lengthStr];
        // gán chuỗi cho mảng
        int i = 0;
        for(i = 0; i<lengthStr; i++)
        {
            matrixA[i]=strA.charAt(i);
        }
        // so sánh phần tử trong mảng giống nhau thì gán ' '

        for(int x = 0; x<lengthStr; x++)
            for (int y = x+1; y<lengthStr; y++)
            {
                if(matrixA[x]==matrixA[y])
                    matrixA[y]=' ';
            }
        // nối chuỗi
        String strB = "";
        for (i=0;i<matrixA.length;i++)
        {
            if(matrixA[i]!= ' ')
                strB = strB +matrixA[i];
        }
        System.out.printf("\n Chuỗi sau khi bỏ ký tự giống nhau là: %s", strB);
    }

    // Tạo vòng lặp, yc người dùng gõ 1 chuỗi. Kiểm tra có đúng định dạng email ko? dùng regex để check
    public void HomeWork3()
    {
        System.out.printf("\n Homework 3: ");
        String strA = inputString("A");
        strA=strA.trim();
        if(strA.matches("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$"))
            System.out.printf("\nChuỗi đúng định dạng email");
        else
            System.out.printf("\n Chuỗi không đúng định dạng email");
    }

    // input chuỗi
    static String inputString(String name)
    {
        Scanner scanner = new Scanner(System.in);

        String str = "";
        do {
            System.out.printf("\n Nhập chuỗi %s: ", name);
            str = scanner.nextLine();
            
        }
        while (str.trim().length()==0);

        return str;
    }
}
