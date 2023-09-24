package org.example;

import java.lang.management.MonitorInfo;

public class Main {
    public static void main(String[] args) {
        PC pc1 = new PC(
                new Case(
                        "Model 1",
                        "Samsung",
                        "15000V PS"
                ),
                new MotherBoard(
                        "sony23",
                        "Sony",
                        2,
                        4,
                        "sony-bios"
                ),
                new Monitor(
                    new Resolution(50, 50),
                        293904l,
                        "HP"
                )
        );

        pc1.description();
        pc1.powerUp();
    }
}