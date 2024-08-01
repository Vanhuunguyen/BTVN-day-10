package BTVNday10;

public class Rectangle {
    private Rectangle(){};
    private double chieuDai;
    private double chieuRong;

    public Rectangle(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    public double dienTich(){
        return this.chieuDai*this.chieuRong;
    }
    public double chuVi(){
        return (this.chieuRong+this.chieuDai)*2;
    }
}

