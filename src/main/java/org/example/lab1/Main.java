
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int key = 1;

            System.out.println("MAIN MENU: ");
            System.out.println("If u want quit, enter 0!");
            System.out.println("Select a number for the tasks: ");
            System.out.println("Task 1: working with numbers");
            System.out.println("Task 2: working with matrices");
            System.out.println("Task 3: working with Point3D");
            System.out.println("Task 4: working with Vector3D");
            System.out.println("Task 5: working with Vector3DProcessor");
            System.out.println("Task 6: working with Vector3DArray");
            key = in.nextInt();
            switch (key) {
                case 1 -> menuTask1();
                case 2 -> menuArr();
                case 3 -> menuPoint();
                case 4 -> menuVector();
                case 5 -> menuVector3DProcessor();
                case 6 -> menuVector3DArray();
            }

    }
    public static void menuTask1() {
        System.out.println("MenuTask1: ");
        Scanner in = new Scanner(System.in);
        int numberTask1;
        do {
            System.out.println("If u want quit, enter 0!");
            System.out.println("Enter 1: task with Hello world");
            System.out.println("Enter 2: task with number");
            System.out.println("Enter 3: task with equation");
            System.out.println("Enter 4: task with sin(x) ");
            System.out.println("Enter 5: task with linear equations");
            System.out.println("Enter 6: task with Taylor formula");
            numberTask1 = in.nextInt();
            switch (numberTask1) {
                case 1 -> hello();
                case 2 -> {
                    System.out.println("Task with number");
                    double a, b, c;
                    a = in.nextDouble();
                    b = in.nextDouble();
                    c = in.nextDouble();
                    number(a, b, c);
                }
                case 3 -> {
                    System.out.println("Task with equation");
                    double a, b, c;
                    System.out.println("Enter the odds: ");
                    a = in.nextDouble();
                    b = in.nextDouble();
                    c = in.nextDouble();
                    equations(a, b, c);
                }
                case 4 -> {
                    System.out.println("Task with Sin(x)");
                    System.out.println("Enter range in degrees: ");
                    double a = 0;
                    double b = 0;
                    a = in.nextInt();
                    b = in.nextInt();
                    a = Math.toRadians(a);
                    b = Math.toRadians(b);
                    System.out.println("Enter step");
                    double step = 0;
                    step = in.nextInt();
                    step = Math.toRadians(step);
                    sin(a, b, step);
                }
                case 5 -> {
                    System.out.println("Task with linear equations");
                    double a1, a2, b1, b2, c1, c2;
                    System.out.println("Enter the first odds: ");
                    a1 = in.nextDouble();
                    b1 = in.nextDouble();
                    c1 = in.nextDouble();
                    System.out.println("Enter the second odds: ");
                    a2 = in.nextDouble();
                    b2 = in.nextDouble();
                    c2 = in.nextDouble();
                    twoEquations(a1, b1, c1, a2, b2, c2);
                }
                case 6 -> {
                    System.out.println("Task with Taylor formula");
                    double x;
                    double accuracy;
                    System.out.println("Enter x: ");
                    x = in.nextDouble();
                    System.out.println("Enter accuracy: ");
                    accuracy = in.nextDouble();
                    taylor(x, accuracy);
                }
            }
        } while (numberTask1 != 0);
    }
    public static void menuArr() {
        Scanner in = new Scanner(System.in);
        System.out.println("MenuArray");
        System.out.println("Enter length array:");
        int Rows = 0;
        int numberTask2;
        Rows = in.nextInt();
        int[] arr = new int[Rows];
        Array array = new Array();
        for(int i = 0;  i < Rows; i ++ ){
            arr[i] = in.nextInt();
        }
        do {
            System.out.println("If u want quit, enter 0!");
            System.out.println("Select a number for the tasks:");
            System.out.println("Task 1: print array");
            System.out.println("Task 2: summa array");
            System.out.println("Task 3: even numbers");
            System.out.println("task 4: interval from a to b");
            System.out.println("task 5: check negative number");
            System.out.println("task 6: permutation array");

            numberTask2 = in.nextInt();

            switch (numberTask2) {
                case 1 -> array.printArr(arr);
                case 2 -> {
                    double key = array.sumArr(arr);
                    System.out.println("Summa array is:");
                    System.out.println(key);
                }
                case 3 -> {
                    System.out.println("Quantity even numbers: " + array.evenNumber(arr));
                }
                case 4 -> {
                    System.out.println("Enter a: ");
                    int a = in.nextInt();
                    System.out.println("Enter b: ");
                    int b = in.nextInt();
                    System.out.println("Quantity numbers from (" + a + ":" + b + ") = " + array.interval(arr, a, b));
                }
                case 5 -> {
                    if (array.checkNumber(arr)) {
                        System.out.println("The are negative elements!");
                    } else {
                        System.out.println("The aren`t negative elements!");
                    }
                }
                case 6 -> {
                    System.out.println("Array:");
                    array.printArr(arr);
                    System.out.println("New array");
                    array.permutation(arr);
                    array.printArr(arr);
                }
            }
        } while (numberTask2 != 0);
    }
    public static void menuPoint() {
        Scanner in = new Scanner(System.in);
        System.out.println("MenuPoint:");
        Point3D pointOne = new Point3D();
        Point3D pointTwo = new Point3D(2,2,2);
        Point3D pointThree = new Point3D(2,2,2);
        System.out.println("Point One = " + pointOne.print());
        System.out.println("Point Two = " + pointTwo.print());
        System.out.println("Point Three = " + pointThree.print());
        Vector3D vector2 = new Vector3D(2, 2, 2);

        if(pointOne.compareTwoPoint(pointOne)){
            System.out.println("точка равна сама себе ");
        }
        else{
            System.out.println("точка не равно себе ");
        }
        System.out.println(pointTwo == pointThree);
        if(pointTwo.compareTwoPoint(pointThree)){
            System.out.println("Second point and third equal!");
        }
        else{
            System.out.println("Second point and third not equal!");
        }
    }
    public static void menuVector() {
        Vector3D vector1 = new Vector3D(1, 2 ,3);
        Vector3D vector2 = new Vector3D(2, 2, 2);
        Vector3D vector3 = new Vector3D(2, 2 ,2);
        System.out.println("Task print vectors: ");
        System.out.println("First vector created: " + vector1.printVector());
        System.out.println("Second vector created: " + vector2.printVector());
        System.out.println("Third vector created: " + vector3.printVector());
        System.out.println("Task with length vectors: ");
        System.out.println("Length first vector: " + vector1.lengthVector());
        System.out.println("Length second vector: " + vector2.lengthVector());
        System.out.println("Length third vector: " + vector3.lengthVector());
        System.out.println("Task compare two vectors: ");
        System.out.println("First vector and second vector: ");
        if(vector1.compare(vector2)){
            System.out.println("vectors compare!");
        }
        else{
            System.out.println("vectors not compare!");
        }
        System.out.println("First vector and third vector: ");
        if(vector1.compare(vector3)){
            System.out.println("vectors compare!");
        }
        else{
            System.out.println("vectors not compare!");
        }
        System.out.println("Second vector and third vector: ");
        if(vector2.compare(vector3)){
            System.out.println("vectors compare!");
        }
        else{
            System.out.println("vectors not compare!");
        }
    }
    public static void menuVector3DProcessor() {
        Vector3DProcessor object = new Vector3DProcessor();
        Vector3D vector1 = new Vector3D(1, 2 ,3);
        Vector3D vector2 = new Vector3D(2, 2, 2);
        Vector3D vector3 = new Vector3D();
        vector3 = object.sum(vector1, vector2);
        System.out.println("Sum vectors: " + vector3.printVector());
        vector3 = object.diff(vector1, vector2);
        System.out.println("Difference vectors: " + vector3.printVector());
        System.out.println("Scalar vectors: " + object.scalar(vector1, vector2));
        vector3 = object.vectorComp(vector1, vector2);
        System.out.println("Vectors product: " + vector3.printVector());
        if(object.collVector(vector1, vector2)){
            System.out.println("vector1 and vector2 collinear!");
        }
        else{
            System.out.println("vector1 and vector2 not collinear!");
        }

    }
    public static void menuVector3DArray() {
        int size = 4;
        Vector3DArray array = new Vector3DArray(size);
        System.out.println("Length arrays: " + array.lengthArr());
        Vector3D vectorOne = new Vector3D(3,4,5);
        Vector3D vectorTwo = new Vector3D(3,4,5);
        Vector3D vectorThree = new Vector3D(1,1,1);
        System.out.println("Array of vectors:");
        array.print();
        System.out.println("After replacement:");
        array.replace(vectorOne, 1);
        array.replace(vectorTwo, 2);
        array.replace(vectorThree, 3);
        array.print();
        System.out.println(array.maximumLength());
        System.out.println("Search vector(1,1,1): " + array.searchVector3DArray(vectorThree));
        Vector3D vectorResult = array.sumVector3DArray();
        System.out.println("Sum of all vectors: " + vectorResult.printVector());
        double[] Arr = new double[]{2,3,4, 1};
        vectorResult = array.linearVector(Arr);
        System.out.println("Linear vector: " + vectorResult.printVector());
        Point3D point = new Point3D(3,2,1);
        Point3D [] pointResult = array.shiftPoints(point);
        for (Point3D point3D : pointResult) {
            System.out.println("ShiftPoints: " + point3D.print());
        }
    }
    public static void hello() {
        System.out.println("Hello World");
    }
    public static void number(double a, double b, double c) {

        System.out.println(a * b * c);
        System.out.println((a + b + c) / 3.);
        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else {
            if (a > b) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }

    }
    public static void equations(double a, double b, double c) {
        double dis = 0;
        dis = b * b - 4 * a * c;
        if (dis < 0) {
            System.out.println("Error, no solutions");
        } else if (a != 0) {
            if (dis > 0) {
                double x1 = (-b - sqrt(dis)) / (2. * a);
                double x2 = (-b + sqrt(dis)) / (2. * a);
                System.out.println("Quantity roots: 2 - x1 = " + x1 + " x2 = " + x2);

            } else {
                double x1 = -b / (2. * a);
                System.out.println("Quantity roots: 1 - x1 = " + x1);
            }
        } else {
            if (b != 0) {
                double x1 = -c / b;
                System.out.println("Quantity roots: 1 - x1 = " + x1);
            } else {
                System.out.println("Error, no solutions");
            }
        }
    }

    public static void sin(double a, double b, double step) {
        for (double x = a; x < b; x += step) {
            double sine = Math.sin(x);
            System.out.println("sin(x) = " + sine);
        }
    }

    public static void twoEquations(double a1, double b1, double c1, double a2, double b2, double c2) {

        if ((a1 == 0 && a2 == 0) || (b1 == 0 && b2 == 0) || (c1 ==0 && c2 ==0)) {
            System.out.println("Error, no solutions");
        } else {
            double detFirstMatrix = a1 * b2 - b1 * a2;
            double detSecondMatrix = c1 * b2 - b1 * c2;
            double detThirdMatrix = a1 * c2 - c1 * a2;
            double rootFirst = detSecondMatrix / detFirstMatrix;
            double rootSecond = detThirdMatrix / detFirstMatrix;
            System.out.println("First root = " + rootFirst + " Second root = " + rootSecond);
        }
    }

    public static void taylor(double x, double accuracy) {
        double elem = 1;
        double res = 1;
        for (int n = 1; elem > accuracy; n++) {
            elem *= x / n;
            res += elem;
        }
        System.out.println("Exp(" + x + ") = " + res);
    }


}
