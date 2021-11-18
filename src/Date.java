import java.io.Serializable;

public class Date implements Serializable {
    public Month month;
    public int date;
    public int year;

    public Date() {
        this.month = Month.JANURARY;
        this.date = 1;
        this.year = 2000;
    }

    public Date(Month month, int date, int year) {
        this.month = month;
        this.date = date;
        this.year = year;
    }
}
