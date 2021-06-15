import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai3 {
    // Viet CT nhap vao 1 so nguyen duong, kiem tra so do có la 1 thang trong nam khong, neu có
    // thi in ra thang do co bao nhieu ngay
    public void Test3() throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n Nhập số nguyên dương: ");
        int intMonth = sc.nextInt();

        try {
            if (intMonth <= 0)
                throw new IOException("Số nhập phải > 0");
            else {
                switch (intMonth)
                {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.printf("\nTháng %d có 31 ngày", intMonth);
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.printf("\nTháng %d có 30 ngày", intMonth);
                        break;
                    case 2:
                        System.out.printf("\nTháng %d có 28 hoặc 29 ngày", intMonth);
                        break;
                    default:
                        System.out.printf("\n Không có tháng này");

                }
            }
        } catch (InputMismatchException ex) {
            System.out.printf("Lỗi: chỉ được nhập số, %s", ex.toString());
        }


    }
}
