package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        int daysInMonth;
        if (year < 0)
            daysInMonth =0;
        else {
            daysInMonth = switch (month){

                case 1,3,5,7,8,10-> {
                    yield 31;
                }
                case  2 -> {
//                    yield ((year % 4 == 0) && (year % 100 != 0)) ? 29 : 28;
                    if (year % 4 == 0){
                        if ((year % 400 == 0) | (year % 100 == 0 | ((year % 100) % 4 == 0)))
                            yield 29;
                        else
                            yield 28;

                    }
                    else
                        yield 28;
                }
                case 4,6,9,11 -> {
                    yield 30;
                }

                default -> {
                    yield 0;
                }


            };

        }
        System.out.println((daysInMonth != 0) ? daysInMonth : "invalid date");

    }
}
