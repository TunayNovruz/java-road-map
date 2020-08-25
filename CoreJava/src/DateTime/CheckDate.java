/*
 * Copyright (c) 2020.
 * @author TunayNovruz https://tunaynovruz.com
 *
 */

package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CheckDate {
    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        LocalDate obj2 = LocalDate.now();
        LocalTime obj3 = LocalTime.now();
        Date obj4 = new Date();
        System.out.println(obj4);

        String cleanDate = obj.format(DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss"));
        System.out.println(cleanDate);
        System.out.println(obj3);
        System.out.println(obj2);
        System.out.println(obj);


        Period period = Period.between(LocalDate.parse("2018-01-18"), LocalDate.parse("2018-02-14"));

        System.out.println(period.getDays());


    }
}
