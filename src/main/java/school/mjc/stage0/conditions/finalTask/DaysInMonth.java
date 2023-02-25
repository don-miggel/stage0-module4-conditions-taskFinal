package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        int daysInMonth = 0;
        if (month < 1 || month > 12 || year < 0)
            System.out.println("invalid date");
        else {
            daysInMonth = switch (month){

                case 1,3,5,7,8,10-> {
                    yield 31;
                }
                case  2 -> {
                    yield (year % 4 == 0) ? 29 : 28;
                }
                case 4,6,9,11 -> {
                    yield 30;
                }
                default -> {
                    yield 0;
                }

            };

        }
        System.out.println(daysInMonth);

    }
}
