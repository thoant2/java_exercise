import java.util.Scanner;

public class Bai2 {
    //Viet CT nhap mat khau, yc mat khau phai có 10 ký tự tro len, trong đo có ít nhất 1 ký tự in hoa
    // 1 ký tự số, 1 ký tự đặcb iêt
    // nếu MK < 10 ký tự thì thông bao mật khasur yếu
    // Nếu thiếu 1 trong các ký tự trên thì thông báo mật khẩu chưa đủ mạnh

    public void Test2()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\n Nhập mật khẩu: ");
        String strPassword = scanner.nextLine();
        if(strPassword.length()<10)
            System.out.printf("\n Mật khẩu yếu");
        else if(!checkPassword(strPassword))
            System.out.printf("\n Mật khẩu chưa đủ mạnh");
        else
            System.out.printf("\n Mật khẩu ok");
    }

    static boolean checkPassword(String str)
    {
        str= str.trim();
        String regexPass ="((?=.*d)(?=.*[A-Z])(?=.*[!.#$@_+,?-]))";

            if(str.matches(regexPass))
                return true;
            else
                return false;

    }
}
