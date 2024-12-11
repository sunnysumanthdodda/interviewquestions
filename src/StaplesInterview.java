import java.time.LocalDate;
import java.util.*;


public class StaplesInterview {
    public static void main(String[] args) {
        List<LocalDate> localDates = new ArrayList<>(List.of(
                LocalDate.parse("2024-03-20"),
                LocalDate.parse("2024-03-25"),
                LocalDate.parse("2024-03-15"),
                LocalDate.parse("2024-03-13"),
                LocalDate.parse("2024-03-31")));
        System.out.println(findClosestDate(LocalDate.parse("2024-03-14"),localDates));
    }

    private static LocalDate findClosestDate(LocalDate inputDate , List<LocalDate> localDates){
        //[3-20-2024,3-25-2024, 3-15-2024, 3-13-2024]
        //input Date - [3-26-2024]
        LocalDate closestDate = null;
        long minDiff = Long.MAX_VALUE;

        for(LocalDate date: localDates){
            long diff = inputDate.toEpochDay() - date.toEpochDay();
            if(diff>0 && diff< minDiff){
                minDiff = diff;
                closestDate = date;
            }
        }
        return closestDate;
    }
}
