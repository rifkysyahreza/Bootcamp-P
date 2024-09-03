import java.time.LocalDate;

public class DifferentDates {
    public static int calc(String dateOne, String dateTwo){
        LocalDate dateOneParsed = LocalDate.parse(dateOne);
        LocalDate dateTwoParsed = LocalDate.parse(dateTwo);

        int dayOne = dateOneParsed.getDayOfMonth();
        int dayTwo = dateTwoParsed.getDayOfMonth();

        if (dayOne > dayTwo){
            return dayOne - dayTwo;
        } else {
            return dayTwo - dayOne;
        }
    }
}
