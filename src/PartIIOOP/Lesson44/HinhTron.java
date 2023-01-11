package PartIIOOP.Lesson44;

public class HinhTron extends Hinh {
    private double r;

    public HinhTron(ToaDo toaDo, double r) {
        super(toaDo);
        this.r = r;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * Math.pow(this.r, 2);
    }
}
