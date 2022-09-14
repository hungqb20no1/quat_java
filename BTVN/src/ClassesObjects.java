



public class ClassesObjects {

    public static void main(String[] args) {
        Quat QuatCay = new Quat();
        QuatCay.thuongHieu = "dienmayxanh";
        QuatCay.loai = "cay";
        QuatCay.capDo = 1;
        QuatCay.congSuat = 60;
        QuatCay.gia = 100;
        QuatCay.quay = true;

        System.out.println("ten quat"+ QuatCay.thuongHieu + QuatCay.loai + QuatCay.gia );
        System.out.println("trang thai quat so " + QuatCay.capDo);
        System.out.println("bat so va quay la " + QuatCay.capDo + QuatCay.quay);
        
    }
}