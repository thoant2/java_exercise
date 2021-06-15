import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;

public class Bai1Test {
    Bai1 bai1 = new Bai1();
    String str = "You Only Live Once. But if You do it right. once is Enough";
    @Test
    @DisplayName("ChecksokytuInHoa")
    public void TestSo()
    {
        System.out.printf("\n Chuỗi cần kiểm tra là: %s", str);
        int countInHoa = bai1.DemInHoa(str);
        System.out.printf("\n 1. Số ký tự in hoa là: %d",  countInHoa);
        assertThat(countInHoa).isNotNull()
                .isEqualTo(7);
    }

    @Test
    @DisplayName("CheckchuoiInHoa")
    public void TestChuoiInHoa()
    {
        String newStr = bai1.VietInHoa(str);
        System.out.printf("\n 2. Chuỗi sau khi đc viết in hoa là: %s", newStr);
        assertThat(newStr).isNotNull()
                .matches("\\D+");

    }

    @Test
    @DisplayName("Checkchuanhoa")
    public void TestChuoiChuanHoa()
    {
        String newStr = bai1.ChuanHoa(str);
        System.out.printf("\n 3. Chuẩn hóa lại chuỗi ký tự: %s", newStr);
        assertThat(newStr).isNotNull()
                .matches("\\D+");

    }

}