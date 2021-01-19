package com.example.QuadTree;
import java.util.*;
public class Camp {

    private float x;
    private float y;
    private float r;

    public Camp(float x, float y,float r) {
        this.x = x;
        this.y = y;
        this.x = r;
    }

    // getters & toString()


    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getR() {
        return r;
    }

    public void setR(float x) {
        this.r = r;
    }
}