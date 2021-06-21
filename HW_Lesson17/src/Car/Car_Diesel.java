package Car;

public class Car_Diesel extends Cars{
    String loaiDiesel;


    public Car_Diesel(String mauSac, Integer choNgoi, String phanKhuc, String nhanHieu) {
        super(mauSac, choNgoi, phanKhuc, nhanHieu);
    }


    public Car_Diesel(String mauSac, Integer choNgoi, String phanKhuc, String nhanHieu, String loaiDiesel) {
        super(mauSac, choNgoi, phanKhuc, nhanHieu);
        this.loaiDiesel = loaiDiesel;
    }


    @Override
    public void diChuyen() {
        super.diChuyen();
        System.out.printf("\n Đây là loại xe chạy bằng Diesel nhãn hiệu %s", nhanHieu);
    }

    @Override
    public String toString() {
        return "Car_Diesel{" +
                "loaiDiesel='" + loaiDiesel + '\'' +
                ", mauSac='" + mauSac + '\'' +
                ", choNgoi=" + choNgoi +
                ", phanKhuc='" + phanKhuc + '\'' +
                ", nhanHieu='" + nhanHieu + '\'' +
                '}';
    }
}
