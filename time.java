//make something to calculate seconds since midnight, seconds remaining in the day, full minutes elapsed. given a 24 hour time of 14:1315

public class Time {

    static int hours = 14, minutes = 13, seconds = 15;

    static int sMidnight() {
	return(hours * 3600 + minutes * 60 + seconds);
    }

    static int sRemDay() {
	return(24 * 3600 - sMidnight());
    }

    static int fullMins() {
	return hours * 60 + minutes;
    }
    

    public static void main(String[] args) {
	System.out.println(sMidnight() + " seconds have elapsed since midnight");
	System.out.println("There are " + sRemDay() + " seconds remaining in the day");
	System.out.println(fullMins() + " full minutes have elapses");
    }

}

