package com.example.travelexpenses;

public class Travel {

    Double trip;

    void CalcTrip(double mtod, double mperg, double gas)
    {
        trip=(mtod/mperg)*gas;
    }
    double getTrip()
    {
        return trip;
    }
}

