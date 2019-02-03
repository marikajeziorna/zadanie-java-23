public class CalandarConverter {
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    public static String convertDayToString(int dayNumber) {

        String name;
        switch (dayNumber) {
            case MONDAY:
                name = "Monday";
                break;
            case TUESDAY:
                name = "Tuesday";
                break;
            case WEDNESDAY:
                name = "Wednesday";
                break;
            case THURSDAY:
                name = "Thursday";
                break;
            case FRIDAY:
                name = "Friday";
                break;
            case SATURDAY:
                name = "Saturday";
                break;
            case SUNDAY:
                name = "Sunday";
                break;
            default:
                name = "Invalid day";
                break;
        }
        System.out.println(dayNumber + " is called " + name);
        return name;
    }
}
