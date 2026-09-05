package rev.date;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Calender {

    public Date currentDate() {
        return new Date();
    }

    public Year currentYear() {
        return Year.now();
    }

    public Month currentMonth() {
        return LocalDate.now().getMonth();
    }

    public LocalDate currentDateOfMonth() {
        return LocalDate.now();
    }

    public LocalDateTime currentDateTime() {
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

        System.out.println("Current date: " + calender.currentDate());
        System.out.println("Current year: " + calender.currentYear());
        System.out.println("Current month: " + calender.currentMonth());
        System.out.println("Current date of month: " + calender.currentDateOfMonth());
        System.out.println("Current date time: " + calender.currentDateTime());

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your birthday (yyyy-MM-dd):");
        String date = input.nextLine();

        LocalDate birthDate = LocalDate.parse(date);

        System.out.println("Current age: "
                + calender.calculateAge(birthDate));

        System.out.println("Days until your next birthday: "
                + calender.daysUntilNextBirthday(birthDate));

        input.close();
    }
}