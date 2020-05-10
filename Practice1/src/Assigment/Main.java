package Assigment;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File AssignmentOne = new File("C:\\Users\\Aida\\Desktop\\подготовка файнал\\file1.txt");
        Scanner sc = new Scanner(AssignmentOne);
        Shape sh = new Shape();

        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            Point p = new Point(x, y);
            sh.addPoint(p);
        }

        sh.getPoints();
        System.out.println(sh.avg() + "  " + sh.calcPer() + "  " + sh.maxEdge());
    }
}

