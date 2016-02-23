package com.movies;

import java.util.ArrayList;
import java.util.List;

public class RentManager {

    public static void main(String[] args) {

        Person p1 = new Person("Git","Áron",Gender.MALE, 5555);
        Person p2 = new Person("Külö","Nóra",Gender.FEMALE, 4444);
        Person p3 = new Person("Eszet","Lenke",Gender.FEMALE, 3586);
        Person p4 = new Person("Kér","Ede",Gender.MALE, 4538);
        Person p5 = new Person("Koaxk","Ábel",Gender.MALE, 5387);
        Person p6 = new Person("Elektrom","Ágnes",Gender.FEMALE, 5198);
        Person p7 = new Person("Bármi","Áron",Gender.MALE, 5089);
        Person p8 = new Person("Har","Mónika",Gender.FEMALE, 4869);


        Movie m1 = new Movie("Inception", Genre.SCI_FI, 200, 4.8, 50, p1);
        Movie m2 = new Movie("TheMatrix", Genre.SCI_FI, 190, 4.9, 55,p1);
        m1.getCast().add(p1);
        m1.getCast().add(p4);
        m2.getCast().add(p5);
        m2.getCast().add(p8);
        System.out.println("MOVIES:");
        System.out.printf("Investment on %s: %d\n", m1.getTitle(),m1.getInvestment());
        System.out.printf("Investment on %s: %d\n", m2.getTitle(),m2.getInvestment());

        Game g1 = new Game("The Witcher", true, 80, p4);
        Game g2 = new Game("Call of Duty", false, 70, p5);
        g1.getStaff().add(p2);
        g1.getStaff().add(p3);
        g2.getStaff().add(p6);
        g2.getStaff().add(p7);
        System.out.println("GAMES:");
        System.out.printf("Investment on %s: %d\n", g1.getTitle(),g1.getInvestment());
        System.out.printf("Investment on %s: %d\n", g2.getTitle(),g2.getInvestment());

        Book b1 = new Book("Python 3",p8,p2);
        Book b2 = new Book("Java SE 7",p7,p3);
        System.out.println("BOOKS:");
        System.out.printf("Investment on %s: %d\n", b1.getTitle(),b1.getInvestment());
        System.out.printf("Investment on %s: %d\n", b2.getTitle(),b2.getInvestment());


        List<Object> a = new ArrayList<Object>();
        a.add(g1);
        a.add(g2);
        a.add(m1);
        System.out.printf("\nSum of prices: %d",sumPrices(a));
    }

    public static long sumPrices(List<Object> listOfObjects){
        long result=0;
        for (Object o: listOfObjects){
            if     (o instanceof Movie){result += ((Movie) o).getPrice();}
            else if(o instanceof Game) {result += ((Game)  o).getPrice();}}
        return result;
    }
}
