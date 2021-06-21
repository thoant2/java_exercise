package Car;

public class Car_Oil extends Cars{
    String nhienLieu = "Xăng";
    String suDung = "7l/100km";

    public Car_Oil(String mauSac, Integer choNgoi, String phanKhuc, String nhanHieu, String nhienLieu, String suDung) {
        super(mauSac, choNgoi, phanKhuc, nhanHieu);
        this.nhienLieu = nhienLieu;
        this.suDung = suDung;
    }

    @Override
    public String toString() {
        return "Car_Oil{" +
                "nhienLieu='" + nhienLieu + '\'' +
                ", suDung='" + suDung + '\'' +
                ", mauSac='" + mauSac + '\'' +
                ", choNgoi=" + choNgoi +
                ", phanKhuc='" + phanKhuc + '\'' +
                ", nhanHieu='" + nhanHieu + '\'' +
                '}';
    }

    @Override
    public void diChuyen() {
        super.diChuyen();
        System.out.printf("\n Đây là loại xe chạy bằng Xăng nhãn hiệu %s", nhanHieu);
    }
}
