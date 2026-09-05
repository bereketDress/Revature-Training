package rev.date;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Calender {


    public Date currentDate() {
        return new Date();

    }

    public Year currentYear() {
        return Year.now();
    }

    public LocalDate currentDateOfMonth() {
        return LocalDate.now();

    }
    public LocalDateTime currentDateTime(){
        return LocalDateTime.now();
    }
    public int calculateAge(LocalDate birthDate) {

        return Period.between(birthDate, LocalDate.now()).getYears();

    }
    public long daysUntilNextBirthday(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        LocalDate next = birthDate.withYear(today.getYear());

        if (!next.isAfter(today)) {
            next = next.plusYears(1);
        }

        return ChronoUnit.DAYS.between(today, next);
    }


    public static void main(String[] args) {
        Calender calender = new Calender();

        System.out.println("current date: "+calender.currentDate());
        System.out.println("current year: "+calender.currentYear());
        System.out.println("current date of month: "+calender.currentDateOfMonth());
        System.out.println("current age: "+calender.calculateAge(LocalDate.of(1990,05,20)));
        System.out.println("next birth date in days: "+calender.daysUntilNextBirthday(LocalDate.of(1990,05,20)));


    }
}
