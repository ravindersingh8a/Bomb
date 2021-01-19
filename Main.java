package com.example.QuadTree;
import java.util.*;

public class Main {

    public static void main (String[] args) throws java.lang.Exception
    {

        Quad tree = new Quad();
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        while(n-->0)
        {
            double x,y,r;
            x=scan.nextDobule();
            y=scan.extDouble();
            r=scan.nextDouble();
            Camp c = new Camp(x,y,r);
            tree.addPoint(c);
        }
        int radius;
        radius = scan.nextInt();
        ArrayList<Camp> camps = tree.getDestoryedCamps(r);
        for(Camp c:camps)
        {
            System.out.println(camps.toString());
        }
   
    }
}
