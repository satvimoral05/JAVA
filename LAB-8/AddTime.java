class Time {

    int hour;
    int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Time add(Time t2) {

        int m = this.minute + t2.minute;
        int h = this.hour + t2.hour;

        if (m > 59) {
            h++;
            m = m % 60;
        }

        return new Time(h, m);
    }
}

public class AddTime {

    public static void main(String[] args) {

        Time t1 = new Time(2, 5);
        Time t2 = new Time(8, 55);

        Time t3 = t1.add(t2);

        System.out.println("After adding");
        System.out.println(
            "Hour : " + t3.hour + " Minute : " + t3.minute
        );
    }
}
