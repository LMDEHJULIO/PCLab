package org.example;

public class PC {
    Case pcCase;
    MotherBoard motherBoard;
    Monitor monitor;

    public PC(Case pcCase, MotherBoard motherBoard, Monitor monitor){
        this.pcCase = pcCase;
        this.motherBoard = motherBoard;
        this.monitor = monitor;
    }

    private void drawLogo(){
        monitor.drawPixel(10, 10, "Green");
    }

    public void description(){
        System.out.println("Welcome to Worst Buy. Below is the description of the PC on sale today: \n"  + monitor.toString() + "\n" + pcCase.toString() + "\n"+ motherBoard.toString());
    }

    public void powerUp(){
        pcCase.pressPowerButton();
        this.drawLogo();
        motherBoard.loadProgram("Photoshop" );
    }
}
