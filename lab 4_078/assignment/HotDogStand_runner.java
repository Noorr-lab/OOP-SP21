package com.company;
public class HotDogStand_runner {
    public static void main(String[] args) {
        HotDogStand hotdog1 = new HotDogStand(1234, 19);
        HotDogStand hotdog2 = new HotDogStand(5678, 15);
        HotDogStand hotdog3 = new HotDogStand(1357, 17);
        hotdog1.justSold();
        hotdog1.justSold();
        hotdog1.justSold();
        hotdog2.justSold();
        hotdog2.justSold();
        hotdog2.justSold();
        hotdog2.justSold();
        hotdog2.justSold();
        hotdog3.justSold();
        hotdog3.justSold();
        System.out.printf("%-10s%10s\n", "StandsID", "HotDogsSold");
        System.out.printf("%-10d%10d\n", hotdog1.getStandsID(), hotdog1.getHotDogsSold());
        System.out.printf("%-10d%10d\n", hotdog2.getStandsID(), hotdog2.getHotDogsSold());
        System.out.printf("%-10d%10d\n", hotdog3.getStandsID(), hotdog3.getHotDogsSold());
        System.out.println("\nTotal number of hot dogs sold by all stands: " + HotDogStand.getTotalHotDogsSold());
    }
}
