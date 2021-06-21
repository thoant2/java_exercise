package Car;

public class Car_Electric extends Cars implements ICar_Manual, ICar_Auto{
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

    @Override
    public void dieuKhienTuDongHanhTrinh() {
        System.out.printf("\n Xe điện chế độ tự lái có thể tự điều khiển hành trình");
    }

    @Override
    public void hoTroDoXe() {
        System.out.printf("\n Xe điện chế độ tự lái có thể tự lùi, tiến và đỗ xe đúng vị trí");
    }

    @Override
    public void canhBaoVaCham() {
        System.out.printf("\n Xe điện chế độ tự lái có thể tự cảnh báo sắp có va chạm qua hệ thống camera và check siêu âm xung quanh");
    }

    @Override
    public void canhBaoChechLan() {
        System.out.printf("\n Xe điện chế độ tự lái có thể tự kiểm tra và cảnh báo khi ô tô đi sang làn đường khác");
    }

    @Override
    public void docBienBao() {
        System.out.printf("\n Xe điện chế độ tự lái có thể tự đọc biển báo giao thông và đèn tín hiệu giao thông");
    }

    @Override
    public void diChuyenDuongBangPhang() {
        System.out.printf("\n Xe điện chế độ người lái có thể di chuyển trên đường bằng phẳng");
    }

    @Override
    public void diChuyenLeoDoc() {
        System.out.printf("\n Xe điện chế độ người lái có thể di chuyển leo dốc núi, đèo");
    }

    @Override
    public void diChuyenLoiSuoi() {
        System.out.printf("\n Xe điện chế độ người lái có thể di chuyển lội suối, đường ngập không bị hỏng máy");
    }

    @Override
    public void diChuyenGioCaoDiem() {
        System.out.printf("\n Xe điện chế độ người lái có thể di chuyển trong giờ cao điểm hay bị tắc đường");
    }
}
