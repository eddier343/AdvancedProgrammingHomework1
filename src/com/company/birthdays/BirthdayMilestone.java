package com.company.birthdays;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Date;

public class BirthdayMilestone {

    public static void main(String[] args) {

        int daysUntilBDay;
        int daysSinceBDay;

        Scanner sc  = new Scanner(System.in);
        System.out.println("Please enter the date you were born on (1-31)");
        Integer date = sc.nextInt();
        System.out.println("Please enter the month you were born on (1-12)");
        Integer month = sc.nextInt();
        System.out.println("Please enter the year you were born in (XXXX)");
        Integer year = sc.nextInt();

        String localTime = java.time.LocalDate.now().toString();
        System.out.println(localTime);

        String currentDate = String.valueOf(localTime.charAt(8));
        currentDate += localTime.charAt(9);
        int localDate = Character.getNumericValue(Integer.parseInt(currentDate));

        String currentMonth = String.valueOf(localTime.charAt(5));
        currentMonth += localTime.charAt(6);
        int localMonth = Character.getNumericValue(Integer.parseInt(currentMonth));

        String currentYear = String.valueOf(localTime.charAt(0));
        System.out.println(currentYear);
        currentYear += localTime.charAt(1);
        System.out.println(currentYear);
        currentYear += localTime.charAt(2);
        System.out.println(currentYear);
        currentYear += localTime.charAt(3);
        System.out.println(currentYear);
        int localYear = Integer.parseInt(currentYear);

        System.out.println(currentDate + currentMonth + localYear);

        int dateCounter = 0;

        // Days since beginning of the year
        for (int i = 1; i < localMonth; i++)
        {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
            {
                dateCounter = dateCounter + 31;
            }
            //feb
            if (i == 2)
            {
                dateCounter = dateCounter + 28;
            }
            //apr, jun, sept, nov
            if (i == 4 || i == 6 || i == 9 || i == 11)
            {
                dateCounter = dateCounter + 30;
            }
        }

        int birthdayCounter = 0;

        for (int i = 1; i < month; i++)
        {
            //jan, mar, may, jul, aug, oct, dec
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
            {
                birthdayCounter = birthdayCounter + 31;
            }
            //feb
            if (i == 2)
            {
                birthdayCounter = birthdayCounter + 28;
            }
            //apr, jun, sept, nov
            if (i == 4 || i == 6 || i == 9 || i == 11)
            {
                birthdayCounter = birthdayCounter + 30;
            }
        }

        // days since the start of the year

        if (dateCounter > birthdayCounter)
        {
            daysSinceBDay = dateCounter - birthdayCounter;
            daysUntilBDay = 365 - daysSinceBDay;
        }
        else //currentDateCount is less than bDayCount
        {
            daysUntilBDay = birthdayCounter - dateCounter;
            daysSinceBDay = 365 - daysUntilBDay;
        }

        System.out.println("It is "+daysUntilBDay+" days until your birthday.");
        System.out.println("It is "+daysSinceBDay+" days since your birthday.");

        int ageInYears = localYear - year;
        System.out.println(localYear);
        System.out.println("You are "+ageInYears+" old.");

        if (ageInYears < 16) {
            System.out.println("Your next milestone is becoming 16!");
            int daysUntilBecoming16 = 16 * 365;
            daysUntilBecoming16 -= (ageInYears*365) + daysSinceBDay;
            System.out.println("It is "+daysUntilBecoming16+" until you become 16");
        }

        if (ageInYears < 18 && ageInYears >= 16) {
            System.out.println("Your next milestone is becoming 18!");
            int daysUntilBecoming18 = 18 * 365;
            daysUntilBecoming18 -= (ageInYears*365) + daysSinceBDay;
            System.out.println("It is "+daysUntilBecoming18+" until you become 18");
        }

        if (ageInYears < 21 && ageInYears >= 18) {
            System.out.println("Your next milestone is becoming 21!");
            int daysUntilBecoming21 = 21 * 365;
            daysUntilBecoming21 -= (ageInYears*365) + daysSinceBDay;
            System.out.println("It is "+daysUntilBecoming21+" until you become 21");
        }

        float nextAgeMilestone = 0;
        
        if (ageInYears > 21) {
            while (nextAgeMilestone%10 != 0) {
                nextAgeMilestone+=1;
            }
            System.out.println("Your next age milestone is becoming "+nextAgeMilestone);
            float daysToBecomingNextMilestone = nextAgeMilestone * 365;
            daysToBecomingNextMilestone -= (ageInYears*365) + daysSinceBDay;
            System.out.println("It is "+daysToBecomingNextMilestone+" until you become "+nextAgeMilestone);
            
            
        }

    }

}
