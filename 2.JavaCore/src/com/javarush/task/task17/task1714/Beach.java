package com.javarush.task.task17.task1714;

/* 
Comparable
*/

import java.util.Objects;

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {

    }

    @Override
    public synchronized int compareTo(Beach o) {
        int rating = 0;
        if (this.hashCode() == o.hashCode() && this.equals(o)) {
            return rating;
        } else {
            if (this.distance > o.distance) {
                rating++;
            } else if (this.distance < o.distance){
                rating--;
            }
            if (this.quality > o.quality) {
                rating += 2;
            } else if (this.quality < o.quality) {
                rating -= 2;
            }
            return rating;
        }
    }

    @Override
    public synchronized boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beach beach = (Beach) o;
        return Float.compare(beach.distance, distance) == 0 &&
                quality == beach.quality &&
                name.equals(beach.name);
    }

    @Override
    public synchronized int hashCode() {
        return Objects.hash(name, distance, quality);
    }
}
