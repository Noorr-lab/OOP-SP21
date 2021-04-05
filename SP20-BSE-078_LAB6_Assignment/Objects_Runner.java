package com.company;
public class Objects_Runner {
    public static void main(String[] args) {
        Objects O1 = new Objects();
        Objects O2 = new Objects(122);
        Objects O3 = new Objects(150);
        System.out.println("Objects created:"+ Objects.getObjectscreated());
        System.out.println("Objects created:"+ O1.getObjectscreated());
    }

}
