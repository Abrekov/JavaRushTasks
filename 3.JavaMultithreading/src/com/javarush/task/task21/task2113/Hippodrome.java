package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {
        List<Horse> horses = getHorses();
        for (Horse horse: horses) {
            horse.move();
        }
    }

    public void print() {
        List<Horse> horses = getHorses();
        for (Horse horse: horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }

    }

    public Horse getWinner() {
        List<Horse> horses = getHorses();
        double maxDistance = 0;
        Horse winner = null;
        for (Horse horse: horses) {
            if (horse.getDistance() > maxDistance) {
                maxDistance = horse.getDistance();
                winner = horse;
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) throws InterruptedException {

        game = new Hippodrome(new ArrayList<>());
        List<Horse> horses = game.getHorses();
        horses.add(new Horse("horse1", 3, 0));
        horses.add(new Horse("horse2", 3, 0));
        horses.add(new Horse("horse3", 3, 0));

        game.run();

        game.printWinner();
    }
}
