package Lab2;

public class Week2q3 {
    public static void main(String[] args) {

        long totalMilliseconds=System.currentTimeMillis();
        long totalSeconds= totalMilliseconds/1000;
        long totalMinutes = totalSeconds/ 60;
        long totalHours =totalMinutes/60;

        System.out.println("Current Time is "+totalHours%24+":"+ totalMinutes % 60+":"+totalSeconds % 60+" GMT");
    }
}
