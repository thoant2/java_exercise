package Car;

public class Car_Hidro extends Car_Electric {
   String nhienLieu ="Hydro";

    public Car_Hidro(String mauSac, Integer choNgoi, String phanKhuc, String nhanHieu, String loaiBinhSac, String thoiGianSac, String quangDuong, String nhienLieu) {
        super(mauSac, choNgoi, phanKhuc, nhanHieu, loaiBinhSac, thoiGianSac, quangDuong);
        this.nhienLieu = nhienLieu;
    }

    @Override
    public void diChuyen() {
        super.diChuyen();
        System.out.printf("\n Đây là loại xe chạy bằng Hydro nhãn hiệu %s", nhanHieu);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
