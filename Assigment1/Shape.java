package Assigment;
import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> p;
    private int size;

    public Shape () {
        p = new ArrayList<Point>();
        size = 0;
    }

    public void addPoint (Point p1) {
        p.add(p1);
        size++;
    }

    public void getPoints () {
        for (int i = 0; i < size; i ++) {
            System.out.println(p.get(i).getX() + "  " + p.get(i).getY());
        }
    }

    public double calcPer () {
        double Perimeter = 0;
        Perimeter += p.get(0).distance(p.get(size-1));
        for (int i = 0; i < size-1; i ++) {
            Perimeter += p.get(i).distance(p.get(i+1));
        }
        return Perimeter;
    }

    public double maxEdge () {
        double mx = 0;
        mx = Math.max (mx, p.get(0).distance(p.get(size-1)));
        for (int i = 0; i < size-1; i ++) {
            mx = Math.max(mx, p.get(i).distance(p.get(i+1)));
        }
        return mx;
    }

    public double avg () {
        double Perimeter = 0;
        Perimeter += p.get(0).distance(p.get(size-1));
        for (int i = 0; i < size-1; i ++) {
            Perimeter += p.get(i).distance(p.get(i+1));
        }
        return Perimeter / size;
    }
}

