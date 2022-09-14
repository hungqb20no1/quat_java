public class Quat {
    public String thuongHieu;
    public String loai;
    public float gia;
    public int congSuat;
    public int capDo;
    public boolean quay;
     

    public void quatGi() {
        System.out.println(thuongHieu + loai + gia + congSuat+ "quatGi");
    }
    public void chuyenso(){
        System.out.println(capDo +"chuyenso");

    }
    public void chuyenTrangThai(){
        System.out.println(quay +"chuyenTrangThai");
    }
    public void bat(capDo x){
        if (x >0){
            this capDo += x;
        }
        System.out.println(capDo + "bat");
    }

    public void tat(capDo x){
        if (x = 0) {
            this capDo = x;
            
        }
        System.out.println(capDo + "tat");
    }
   
}