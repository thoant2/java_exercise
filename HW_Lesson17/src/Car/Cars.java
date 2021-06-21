package Car;

public class Cars {
    String mauSac = "Trắng";
    Integer choNgoi = 5;
    String phanKhuc = "A";
    String nhanHieu = "Vinfast";
    public Cars() {

    }

    public Cars(String mauSac, Integer choNgoi, String phanKhuc, String nhanHieu) {
        this.mauSac = mauSac;
        this.choNgoi = choNgoi;
        this.phanKhuc = phanKhuc;
        this.nhanHieu = nhanHieu;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "mauSac='" + mauSac + '\'' +
                ", choNgoi=" + choNgoi +
                ", phanKhuc='" + phanKhuc + '\'' +
                ", nhanHieu='" + nhanHieu + '\'' +
                '}';
    }

    /*PHÂN KHÚC A - XE CỠ NHỎ (CITY CAR)
    PHÂN KHÚC B - XE BÌNH DÂN CỠ NHỎ (SUBCOMPACT CAR)
    PHÂN KHÚC C - XE BÌNH DÂN CỠ VỪA (COMPACT CAR)
    PHÂN KHÚC D - XE BÌNH DÂN CỠ LỚN.
    PHÂN KHÚC E - XE HẠNG SANG.
    PHÂN KHÚC F - XE HẠNG SANG CỠ LỚN.
    PHÂN KHÚC M - XE MPV hay MINIVAN.*/

    public void diChuyen()
    {
        switch (phanKhuc)
        {
            case "A":
            case "B":
                System.out.printf("\n Xe cỡ nhỏ, dành cho gia đình nhỏ ít người");
                break;
            case "C":
            case "D":
                System.out.printf("\n Xe cỡ trung, dành cho gia đình lớn nhiều người");
                break;
            case "E":
            case "F":
                System.out.printf("\n Xe hạng sang, dành cho giới thượng lưu");
                break;
            case "M":
                System.out.printf("\n XE MPV hay MINIVAN");
                break;
            default:
                System.out.printf("\n Chưa có phân khúc loại này");
                break;

        }
        System.out.printf("\n Đi ô tô thật nhanh và tiện lợi.");
    }
}
