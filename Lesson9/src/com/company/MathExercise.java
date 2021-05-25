package com.company;

import java.util.Scanner;

public class MathExercise
{
    public void menu()
    {
        System.out.printf("\n ------------------------------");
        System.out.printf("\n Bài 1, 2, 3, 4, 5, 6, 7, 9, 10");
        System.out.printf("\n ------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\n Bạn muốn xem bài nào? nhập vào đây:");
        int n = scanner.nextInt();
        switch (n) {
            case 2:
                Bai2(); menu();
                break;
            case 3:
                Bai3(); menu();
            case 4:
                Bai4(); menu();
            case 5:
                Bai5(); menu();
            case 6:
                Bai6(); menu();
            case 7:
                Bai7(); menu();
            case 9:
                Bai9(); menu();
            case 10:
                Bai10(); menu();
            default:
                System.out.printf("Không có bài nào hợp lệ với số bạn chọn, mời chọn lại");
                menu();
                break;
        }

    }
    static int inputN()
    {
        Scanner scanner = new Scanner(System.in);
        int n;
        do
        {
            System.out.printf("\n Nhập số nguyên dương n: ");
            n = scanner.nextInt();
        }
         while (n<=0);
         return n;
    }
    //Bài 2
    //Nhập vào số nguyên dương n (n> 0). Tính tổng S(n) = 1 + 1/2 + 1/3 +... +1/n
    public void Bai2()
    {
        System.out.printf("\n Bài 2: ");
        // input số n
        int n = inputN();
        //Tính tổng S(n) = 1 + 1/2 + 1/3 +... +1/n
        double tong = 0;
        for (int i = 1; i<=n; i++)
            tong = tong + 1.0/i;
        System.out.printf("\n Tổng S(n) = 1+ 1/2 +1/3 +...+ 1/%d = %.3f",n,tong);
    }
    // Bài 3
    //Nhập số nguyên dương n > 0. Tính tổng S(n) = 1/2 + 3/4 + 5/6 +... + (2n+1)/(2n+2)
    public void Bai3()
    {
        System.out.printf("\n Bài 3: ");
        int n = inputN();
        // Tính tổng S
        float tong = 0;
        for(int i = 1; i<=(2*n+1); i++)
            tong = tong + i/(i+1);
        System.out.printf("\n Tổng S(n) = 1/2 + 3/4 +... + %d/%d = %.3f",(2*n+1),(2*n+2),tong);
    }
    // tìm số đảo ngược
    public void Bai4()
    {
        System.out.printf("\n Bài 4: ");
        int n = inputN();
        // Tìm số đảo ngược
        String str = String.valueOf(n);
        String str1 ="";
        for(int i = str.length()-1; i>=0; i--)
            str1 = str1+ str.charAt(i);
        System.out.printf("\nSố đảo ngược là: %s",str1);

    }
    // check số đối xứng
    public void Bai5()
    {
        System.out.printf("\n Bài :5 ");
        int n = inputN();
        String str = String.valueOf(n);
        String str1 ="";
        for(int i = str.length()-1; i>=0; i--)
            str1 = str1+ str.charAt(i);
        if(str.equals(str1) && str.length()%2 !=0)
            System.out.printf("\n%s là số đối xứng", str);
        else
            System.out.printf("\n%s không phải là số đối xứng", str);
    }
    //Nhập mảng 1 chiều số nguyên
    //tìm số chẵn cuối cùng trong mảng 1 chiều số nguyên. Nếu ko có số chẵn trả ra -1
    public void Bai6()
    {
        int n = inputN();
        int []matrix = inputArray(n);
        System.out.printf("\n Ma trận vừa nhập là: " );
        showArray(matrix,n);
        boolean laSoChan = false;
        for(int i = n-1;i>=0;i--)
        {
            if(matrix[i]%2 ==0)
            {
                laSoChan = true;
                System.out.printf("\n Số chẵn cuối cùng của mảng là phần tử thứ %d: %d ",i, matrix[i]);
                break;
            }

        }
        if(laSoChan == false)
            System.out.printf("\n Không có số chẵn: -1");
    }

    // nhập vào 1 mảng 1 chiều số nguyên
    //Viết hàm tìm số âm đầu tiên trong mảng, nếu ko có thì show ra -1
    public void Bai7()
    {
        int n = inputN();
        int []matrix = inputArray(n);
        System.out.printf("\n Ma trận vừa nhập là: " );
        showArray(matrix,n);
        boolean laSoAm = false;
        for(int i = 0;i<n;i++)
        {
            if(matrix[i]< 0)
            {
                laSoAm = true;
                System.out.printf("\n Số âm đầu tiên của màng là phần tử thứ %d: %d ",i, matrix[i]);
                break;
            }

        }
        if(laSoAm == false)
            System.out.printf("\n Không có số âm: -1");
    }

    // nhập số nguyên dương >0, h là chiều cao tam giác. in ra hình sao tam giác
    public void Bai9()
    {
        int n = inputN();
        int i = 0;
        System.out.printf("\n Hình tam giác *: \n" );
          for(i = 0; i<n; i++)
          {
              for(int k= n-i; k>0; k--)
                  System.out.printf("\t");
               for(int j= 0; j<i*2+1; j++)
               {
                 System.out.printf("*\t");
               }
              System.out.printf("\n");
          }
    }
// nhập height và width là kích thước hình chữ nhật
    // in hình chữ nhật *
    public void Bai10()
    {
        int height = inputN();
        int width = inputN();
        int i = 0;
        int j = 0;
        System.out.printf("\n Hình chữ nhật %dx%d: \n",width,height );
        for ( i = 0; i<width; i++)
        {
            for (j = 0; j<height; j++)
            {
                System.out.printf("*\t");
            }
            System.out.printf("\n");
        }
    }
    static int[] inputArray(int n)
    {
        int matrix[]= new int [n];
        int row;

        Scanner scanner = new Scanner(System.in);
        // Nhập ma trận vuôn n  phần tử
        for (row = 0; row<n;row++)
        {
            System.out.printf("\n Phần tử [%s] là: ", row);
            matrix[row] = scanner.nextInt();
        }
        return matrix;
    }
    static void showArray(int[] matrix, int n)
    {
        for (int i:matrix)
            System.out.printf("\t %d ", i);
    }
}
