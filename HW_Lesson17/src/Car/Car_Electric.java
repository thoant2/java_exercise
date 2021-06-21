package Car;

public class Car_Electric extends Cars{
    String loaiBinhSac ="PIN";
    String thoiGianSac ="5h";
    String quangDuong = "200km";

    public Car_Electric(String mauSac, Integer choNgoi, String phanKhuc, String nhanHieu, String loaiBinhSac, String thoiGianSac, String quangDuong) {
        super(mauSac, choNgoi, phanKhuc, nhanHieu);
        this.loaiBinhSac = loaiBinhSac;
        this.thoiGianSac = thoiGianSac;
        this.quangDuong = quangDuong;
    }

    public Car_Electric(String loaiBinhSac, String thoiGianSac, String quangDuong) {
        this.loaiBinhSac = loaiBinhSac;
        this.thoiGianSac = thoiGianSac;
        this.quangDuong = quangDuong;
    }

    public Car_Electric() {
    }


    @Override
    public void diChuyen() {
        super.diChuyen();
        System.out.printf("\n Đây là loại xe chạy bằng Điện nhãn hiệu %s", nhanHieu);
    }

    @Override
    public String toString() {
        return "Car_Electric{" +
                "loaiBinhSac='" + loaiBinhSac + '\'' +
                ", thoiGianSac='" + thoiGianSac + '\'' +
                ", quangDuong='" + quangDuong + '\'' +
                ", mauSac='" + mauSac + '\'' +
                ", choNgoi=" + choNgoi +
                ", phanKhuc='" + phanKhuc + '\'' +
                ", nhanHieu='" + nhanHieu + '\'' +
                '}';
    }
}
