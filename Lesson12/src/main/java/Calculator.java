import java.util.Scanner;

public class Calculator {

    // kiểm tra email có hợp lệ không
    public boolean checkEmail()
    {

        System.out.printf("\n Homework 1: ");
        String strA = inputString();
        strA=strA.trim();
        if(strA.matches("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$"))
            System.out.printf("\nChuỗi đúng định dạng email");
        else
            System.out.printf("\n Chuỗi không đúng định dạng email");
        return true;
    }
    //kiểm tra cân nặng của người

    // tạo 1 mảng 5 phần tử là các số CMT. Kiểm tra mảng và phần tử có rỗng ko, có đúng 9 số, ko có chữ

    public String inputString()
    {
        Scanner scanner = new Scanner(System.in);
        String str ="";
        do {
            System.out.printf("\n Nhập chuỗi: ");
            str = scanner.nextLine();
        }
        while (str.trim().length()==0);

        return str;

    }
}
