import Car.*;

public class Main {
    public static void main(String[] args)
    {
        Cars cars = new Cars();
        System.out.printf("\n%s", cars);
        cars.diChuyen();
        System.out.printf("\n---------------------");
        Car_Diesel car_diesel = new Car_Diesel("Xanh da trời", 5,"A", "Toyota", "Diesel");
        System.out.printf("\n%s", car_diesel);
        car_diesel.diChuyen();

        System.out.printf("\n---------------------");
        Car_Electric car_electric = new Car_Electric("Đỏ", 7, "C", "Vinfast", "Pin", "5h", "200km");
        System.out.printf("\n%s", car_electric);
        car_electric.diChuyen();
        car_electric.canhBaoChechLan();
        car_electric.canhBaoVaCham();
        car_electric.docBienBao();
        car_electric.hoTroDoXe();
        car_electric.dieuKhienTuDongHanhTrinh();
        car_electric.diChuyenGioCaoDiem();

        System.out.printf("\n---------------------");
        Car_Hidro car_hidro = new Car_Hidro("Vàng", 2, "A", "Tesla", "PIN", "2h", "300km","Hydro");
        System.out.printf("\n%s", car_hidro);
        car_hidro.diChuyen();
        car_hidro.diChuyenDuongBangPhang();
        car_hidro.diChuyenLeoDoc();
        car_hidro.diChuyenLoiSuoi();
        car_hidro.hoTroDoXe();
        car_hidro.canhBaoVaCham();

        System.out.printf("\n---------------------");
        Car_Oil car_oil = new Car_Oil("Đen", 16, "E", "Mec", "Xăng","15l/100km");
        System.out.printf("\n%s", car_oil);
        car_oil.diChuyen();
        System.out.printf("\n---------------------");
    }

}
