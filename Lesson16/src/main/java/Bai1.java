public class Bai1 {
    // Đếm số từ viết in hoa trong chuỗi
    // Viết in hoa toàn bộ chữ đầu của các từ trong chuỗi
    // Chuyển ký tự đầu tiên của chuỗi hoặc ký tự đầu của từ sau dấu chấm là viết in hoa, còn lại viết thường
    // Viết testcase.

    public void Test1()
    {
        String str = "You Only Live Once. But if You do it right. once is Enough";
        System.out.printf("\n Chuỗi cần kiểm tra là: %s", str);
        System.out.printf("\n 1. Số ký tự in hoa là: %d",  DemInHoa(str));
        System.out.printf("\n 2. Chuỗi sau khi đc viết in hoa là: %s", VietInHoa(str));
        System.out.printf("\n 3. Chuẩn hóa lại chuỗi ký tự: %s", ChuanHoa(str));
    }
    static int DemInHoa(String str)
    {
        int count = 0;
        if(str!=null )
        {
            for(char c: str.toCharArray())
                if(Character.isUpperCase(c))
                    count++;
        }
        return count;
    }

    static String VietInHoa(String str)
    {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String[] arrayStr = str.split(" ");
        StringBuilder newstring = new StringBuilder();
        for (String phantu: arrayStr )
        {
            String temp = String.valueOf(phantu.charAt(0));
            newstring.append(temp.toUpperCase()+phantu.substring(1).toString());
            newstring.append(" ");
        }
        return newstring.toString().trim();
    }

    static String ChuanHoa(String str)
    {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        str = str.toLowerCase();
        String[] arrayStr = str.split(" ");
        StringBuilder newstring = new StringBuilder();
        String temp = String.valueOf(arrayStr[0].charAt(0));
        newstring.append(temp.toUpperCase()+arrayStr[0].substring(1).toString());
        newstring.append(" ");
        for (int i = 1; i< arrayStr.length;i++ )
        {
            newstring.append(arrayStr[i]);
            if(arrayStr[i].contains("."))
            {
                newstring.append(" ");
                temp = String.valueOf(arrayStr[i+1].charAt(0));
                newstring.append(temp.toUpperCase() + arrayStr[i+1].substring(1).toString());
                i++;
            }
            newstring.append(" ");
        }
        return newstring.toString().trim();
    }
}
