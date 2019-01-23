package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        int temp[] = {45, 29, 10, 22, 41, 28, 33};
        int precip[] = {95, 60, 25, 5, 0, 75, 90};
        String weekday[] = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};

        for(int i=0; i<6;i++){
            if ((temp[i]<=32)&&(precip[i]>50)){
                System.out.println(weekday[i]);
            }
        }
    }

}
