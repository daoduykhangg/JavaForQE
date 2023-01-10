package PartIIOOP.Lesson36;

public class NgayChieu {
    private int day;
    private int thang;
    private int nam;

    public NgayChieu(int day, int thang, int nam) {
        this.day = day;
        this.thang = thang;
        this.nam = nam;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
}
