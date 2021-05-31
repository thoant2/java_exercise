import com.sun.org.apache.bcel.internal.classfile.SourceFile;
import org.junit.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DemoTest {
    @AfterAll
    public  static  void afterAll() {
        System.out.printf("After all");
    }
    @BeforeAll
    public  static void beforeAll()
    {
        System.out.printf("Before all");
    }
    @BeforeEach
    public static void beforeEach() {  System.out.printf("Before each");    }
    @AfterEach
    public static void AfterEach()
    {
        System.out.printf("After each");
    }

    @Test
    @DisplayName("hello")
    public  void test1()
    {
        System.out.printf("test 1");
    }


    @Test
    public void testEquals()
    {
        assertEquals(3, Calculator.nhan(3,1));
        assertEquals(2, Calculator.sub(3,1));
        assertEquals(4, Calculator.sub(5,1));
        assertNotEquals(0, Calculator.sub(3,1));
        String[] strarray1 = {"Thoa", "xinh đẹp"};
        String[] strarray2 = {"Thoa", "xinh đẹp"};
        assertArrayEquals(strarray1, strarray2);
    }
    @Test
    public void testTrueFalse()
    {
        String str1 = "Hello";
        String str2 = " hello ";

        assertFalse(str1.contentEquals(str2));
        assertTrue(str1.trim().toLowerCase().contentEquals(str2.trim().toLowerCase()));
        assertNotSame(str1,str2);

    }

    @Test
    public void testNull()
    {
        String str = null;
        assertNull(str);
        str ="Xin chào   ";
        assertNotNull(str);
    }

    @Test
    public void testSame()
    {
        assertNotSame(Calculator.sub(5,3), Calculator.nhan(2,2));
        assertSame(Calculator.sub(10,5), Calculator.nhan(5,1));
    }


}
