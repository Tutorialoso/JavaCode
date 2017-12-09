package librarybookingsystem;

import java.time.LocalDate;

public class Borrower {
    
    public String foreName;
    public String surName;
    public String phoneNum;
    
    public static void main(String[] args){
        initBirthDate();
    }
    public static void initBirthDate(){
        LocalDate birthdate = new LocalDate(1970, 1, 20);
        LocalDate now = new LocalDate();
        Years age = Years.yearsBetween(birthdate, now);

    }
}
