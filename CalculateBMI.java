import java.util.Scanner;

public class CalculateBMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Prompt the user to enter height in inches
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        // Calculate BMI
        double bmi = calculateBMI(weight, height);

        // Determine weight status
        String status = findStatus(bmi);

        // Display the results
        System.out.println("BMI is " + bmi);
        System.out.println("Weight status: " + status);
    }

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        return (weight / (height * height)) * 703;
    }

    // Method to determine weight status based on BMI
    public static String findStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static class control_Structure {
        public static void main(String[] args) {
            /*
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the age :");
            int Age=sc.nextInt();
            System.out.println(Age);
            boolean Nic=  true;
            if (Age >18){
                if(Nic==true) {
                    System.out.println(" You eligible  ");
                }
            } else  {
                System.out.println("your not the eligible for the vote ");
            }


            // else if else


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the percentage :");
            int percentage =sc.nextInt();
            if (percentage>90 && percentage<=100){
                System.out.println("your grade is A");
            }
            else if (percentage>80 && percentage<=89){
                System.out.println(" Your grade is B");
            }
            else if (percentage>60 && percentage<=79){
                System.out.println("your garde is C");

            }
            else if (percentage>33 && percentage<=59){

                System.out.println(" your grade is D");
            } else if (percentage<33){
                System.out.println("your are the Fail");
            }


            // Sum of Nth Natural Number
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Natural Number :");
            int Number =sc.nextInt();
            int sum =0;
            for(int i=0 ; i<=Number ; i++){
                 sum+=i;


            }
               System.out.println(" The Sum Of Natural Number:"+ sum);
             */
            // continue Statement
            for (int i=0 ; i<=2;i++){

                for ( int j=i; j<=5; j++){

                    if (j==4){
                        continue;

                    }
                    System.out.println(j);
                }


            }

        }
    }

    public static class Relational_Operator {
        public static void main(String[] args) {
            String arr[]={""};


            int a=8,b=25;
            int result1 = 0;

          /*  System.out.println("a is "+a +" and b is "+b);
            System.out.println(a == b);
            System.out.println(a != b);
            System.out.println(a>b);
            System.out.println(a<b);
            System.out.println(a>=b);
            System.out.println(a<=b);
            System.out.println(a && b);

            System.out.println ((a>b)|| (c>d));
            System.out.println ((b>a)&&(d>c));


            System.out.println("value of a: " + result1);
            result1=++a;
            System.out.println("After Increament " + result1);
            System.out.println("value of b: " + result2);
            result2=--b;
            System.out.println("After Decreamnet " + result2);


        */
            result1 =a|b;
            System.out.println("This is bitwise "+ result1);
            result1 =a&b;
            System.out.println("This is bitwise "+ result1);
            result1 =a^b;
            System.out.println("This is bitwise "+ result1);
            result1 =~b;
            System.out.println("This is bitwise "+ result1);
            result1= a>>2;
            System.out.println("This is left bitwise operator "+result1);








        }







    }

    public static class RK4 {
        // Function representing dy/dx = 2 * x * y
        static double func(double x, double y) {
            return 2 * x * y;
        }
        public static void main(String[] args) {
            // Initialize variables
            double X = 0, Y = 1, h = 0.05, Xn = 2;
            System.out.print("X\t\t Y(RK4)\n");
            System.out.print("---------------------------\n");
            while (X <= Xn) {
                // Print the current values of X and Y
                System.out.printf("%.2f\t\t%.4f\n", X, Y);
                // Calculate the k-values for RK4
                double k1 = func(X, Y);
                double k2 = func(X + h / 2, Y + h / 2 * k1);
                double k3 = func(X + h / 2, Y + h / 2 * k2);
                double k4 = func(X + h, Y + h * k3);
                // Update Y using RK4 formula
                Y = Y + (h / 6) * (k1 + 2 * k2 + 2 * k3 + k4);
                // Increment X by the step size
                X += h;
            }
        }
    }

    public static class classes_and_objects {

        public static void main(String[] args) {

        }


    }

    public static class ImprovedEular {
        // Function representing dy/dx = 2x - 3y + 1
        static double func(double x, double y) {
            return 2 * x *y;
        }

        // Actual solution of the differential equation (example placeholder)
        static double actual(double x) {
            return Math.exp(x * x); // Replace this with the actual solution from the problem
        }

        public static void main(String[] args) {
            // Initialize variables
            double X = 1.0, Y = 1.0, h = 0.1, Xn = 1.5;

            // Print table header
            System.out.printf("x_n\t\ty_n\t\tActual Value\tAbs. Error\t%% Rel. Error\n");
            System.out.printf("----------------------------------------------------------\n");

            while (X <= Xn + 1e-9) { // Ensure Xn is included within floating-point precision
                // Calculate actual value
                double Y_actual = actual(X);

                // Calculate absolute error and percent relative error
                double absoluteError = Math.abs(Y_actual - Y);
                double relativeError = (absoluteError / Math.abs(Y_actual)) * 100;

                // Print values for the current step
                System.out.printf("%.2f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%.2f\n", X, Y, Y_actual, absoluteError, relativeError);

                // Improved Euler calculations
                double f1 = func(X, Y);
                double Y_predicted = Y + h * f1;
                double f2 = func(X + h, Y_predicted);
                Y = Y + (h / 2) * (f1 + f2);
                X += h;
            }
        }
    }

    public static class Eular1{

        // Function representing dy/dx = 2 * x * y
        static double func(double x, double y) {
            return 2 * x * y;

        }

        public static void main(String[] args) {
            // Initialize variables
            double X = 0, Y = 1, h = 0.05, Xn = 2;

            // Print table header
            System.out.printf("X\t\tY (Improved Euler)\n");
            System.out.printf("-----------------------------\n");

            // Improved Euler's method loop
            while (X <= Xn) {
                // Print the current values of X and Y
                System.out.printf("%.2f\t\t%.4f\n", X, Y);

                // Compute initial slope
                double f1 = func(X, Y);

                // Predict the value of Y at the next step
                double Y_predicted = Y + h * f1;

                // Compute corrected slope using predicted values
                double f2 = func(X + h, Y_predicted);

                // Update Y using the average slope
                Y = Y + (h / 2) * (f1 + f2);

                // Update X for the next step
                X += h;
            }
        }
    }

    public static class lab_2 {

        public static void main(String[] args) {
    /*

         Scanner Input= new Scanner (System.in);
            System.out.println(" What is correct way to declare a variable store in java");
            System.out.println("a. int 1x=10");
            System.out.println("b. int x=10;");
            System.out.println("c.float x=10.0f");
            System.out.println("d. string x=10");

            System.out.println("Enter your choice: ");
            char choice = Input.next().charAt(0);
            switch (choice){
                case 'a':
                    System.out.println("Incorrect");
                break;
                case 'b':
                    System.out.println("correct");
                    break;
                case 'c':
                    System.out.println("Incorrect");
                    break;
                case 'd':
                    System.out.println("Incorrect");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            Input.close();

           String Sample="The quick brown fox jumps over the lazy dog";
           String replace =Sample.replaceAll("fox","cat");
            System.out.println(Sample);
            System.out.println(replace);



            System.out.println("Enter the value of a:");
            Scanner a=new Scanner(System.in);
            System.out.println("Enter the value of b:");
            Scanner b=new Scanner(System.in);

            System.out.println("Enter the value of c:");
            Scanner c=new Scanner(System.in);
            double determinant =(b*b)-4*a*c ;
            if (determinant>0){
                double root1 = (-b + Math.sqrt(determinant)) / 2 * a;
                double root2 =(-b-Math.sqrt(determinant))/( * a ;



    /*
                    int[] odds = new int[15]; // There are 15 odd numbers between 1 and 30

                    int index = 0; // Keep track of the current position in the 'odds' array

                    for (int i = 1; i <= 30; i++) {
                        if (i % 2 != 0) { // Check if 'i' is odd (remainder when divided by 2 is not 0)
                            odds[index] = i;  // Store the odd number in the array
                            index++;         // Move to the next position in the array
                        }
                    }

                    // Print the array to verify (optional)
                    System.out.println("Odd numbers between 1 and 30:");
                    for (int odd : odds) {
                        System.out.print(odd + " ");
                    }
                    System.out.println(); // Add a newline at the end


    // Task 6
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the dividend (An integer ):");
            int dividend =sc.nextInt();
            int divisor = sc.nextInt();
            double result =(double) dividend/divisor;
            int roundedResult = (int) Math.ceil(result);
            System.out.println("The rounded result of " + dividend +" divided by " + divisor + " is : "  + roundedResult);
    */

    // Task 7


            Scanner input = new Scanner(System.in);

            System.out.print("Enter a sentence: ");
            String sentence = input.nextLine();

            String formattedSentence = formatSentence(sentence);
            System.out.println("Formatted sentence: " + formattedSentence);

            input.close();
        }

        public static String formatSentence(String sentence) {
            if (sentence == null || sentence.isEmpty()) {
                return ""; // Handle null or empty input
            }

            // Check for starting capital letter
            if (!Character.isUpperCase(sentence.charAt(0))) {
                sentence = Character.toUpperCase(sentence.charAt(0)) + sentence.substring(1);
            }

            // Check for ending full stop
            if (!sentence.endsWith(".")) {
                sentence += ".";
            }

            return sentence;







                }
            }

    public static class Operators {
        public static void main(String[] args) {
            int a = 12, b = 4;
            int sum = a += b;
            int Subt = a -= b;
            int Div = a /= b;
            int Module = a %= b;
            int Mult = a *= b;
            System.out.println("This is Sum " + sum);
            System.out.println("This is Subt " + Subt);
            System.out.println("This is Module " + Module);
            System.out.println("This is Div " +Div);
            System.out.println("This is Mult "+ Mult );

        }










    }

    public static class Even_Numbers {
        public static void main(String[] args) {
            int a[] =new int[10];
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the 10 Number ");
            for (int i=0;i<=10;i++){
                a[i]= sc.nextInt();

            }
            System.out.println("List of reverse order : ");
            for (int i=10;i<10;i--){


                    System.out.println(a[i] + " ");



            }
        }

    }

    // TIP: To run the code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public static class AllValues{

        // Function representing dy/dx = 2 * x * y
        static double func(double x, double y) {

            return 2 * x * y;
        }

        // Actual solution of the ODE: y(x) = e^(x^2)
        static double actual(double x) {

            return Math.exp(x * x);
        }

        public static void main(String[] args) {
            // Initialize variables
            double X = 0, Y_euler = 1, Y_improved = 1, h = 0.05, Xn = 2;
            double cumulativeErrorEuler = 0, cumulativeErrorImproved = 0;

            // Print table header
            System.out.printf("X\t\tY (Euler)\tAbs Err (Euler)\tRel Err (Euler)\tCum Err (Euler)\tY (Improved)\tAbs Err (Improved)\tRel Err (Improved)\tCum Err (Improved)\tY (Actual)\n");
            System.out.printf("-----------------------------------------------------------------------------------------------------------------------------------------------------------\n");

            // Loop through using the step size
            while (X <= Xn) {
                // Compute actual value
                double Y_actual = actual(X);

                // Compute absolute error for Euler
                double absErrorEuler = Math.abs(Y_actual - Y_euler);
                cumulativeErrorEuler += absErrorEuler;

                // Compute relative error for Euler
                double relErrorEuler = absErrorEuler / Y_actual;

                // Compute absolute error for Improved Euler
                double absErrorImproved = Math.abs(Y_actual - Y_improved);
                cumulativeErrorImproved += absErrorImproved;

                // Compute relative error for Improved Euler
                double relErrorImproved = absErrorImproved / Y_actual;

                // Print the current values
                System.out.printf("%.2f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\t\t%.4f\n",
                        X, Y_euler, absErrorEuler, relErrorEuler, cumulativeErrorEuler, Y_improved, absErrorImproved, relErrorImproved, cumulativeErrorImproved, Y_actual);

                // Euler method calculation
                double f_euler = func(X, Y_euler);
                Y_euler += h * f_euler;

                // Improved Euler method calculation
                double f1 = func(X, Y_improved);
                double Y_predicted = Y_improved + h * f1;
                double f2 = func(X + h, Y_predicted);
                Y_improved += (h / 2) * (f1 + f2);

                // Increment X by the step size
                X += h;
            }
        }
    }

    public static class Fuctions_Methods {
        public static void printMyName(String name){
            System.out.println(name);
            return ;

        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String name=sc.next();
            printMyName(name);
        }








    }

    public static class Terniary_operator {
        public static void main(String[] args) {
            /* int x,y;
            x=20;
            y=(x==1)?61:90;
            System.out.println("value of y is " +y);
            y=(x==20)?61:90;
            System.out.println("value of y is " +y);

                // Ternary operater
            int a=4,b=6,c=8;
            String d;
            d=(a>b)? ("a is greater "+(a>c?a:c)) : (" c is grater "+(b>c?b:c));
            System.out.println(d);


            //leap year

            int a=2025;
            String leap = (a%4==0)? "A is leap year " :"A Not a Leap Yera " ;
            System.out.println(leap);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of x");
            int x=sc.nextInt();
            System.out.println("Enter the value of y");
            int y=sc.nextInt();
            System.out.println("These are the integers ");
            System.out.println(x);
            System.out.println(y);



    */






        }
    }

    public static class Lab_3 {

        public static void main(String[] args) {
            /* int[][] arr={{1,2},{3,4}};
             for(int i=0;i<2;i++){

                 for (int j=0;j<2;j++){

                     System.out.println(arr[i][j]+"");

                 }
                 System.out.println();


            Scanner rows= new Scanner(System.in);
            System.out.println("Entcer the length of Array:" );
            int row = new.nextInt();
            System.out.println("Enter column length of an array:");
    */
            int a[][]={{1,2,3},{3,4,5}};
            int b[][]={{1,2,3},{3,4,5}};
            int c[][]=new int[1][3];
            for (int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.println(c[i][j]+" ");

            }

                System.out.println();
            }

        }

    }

    // TIP: To run the code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public static class Main {

        // Function representing dy/dx = 2 * x * y
        static double func(double x, double y) {
            return 2 * x * y;
        }

        public static void main(String[] args) {
            // Initialize variables
            double X = 0, Y = 1, h = 0.05, Xn = 2;

            // Print table header
            System.out.printf("X\t\t\t\t Y\n");
            System.out.printf("----------------------\n");

            // Euler's method loop
            while (X <= Xn) {
                // Print the current values of X and Y
                System.out.printf("%.2f\t\t%.4f\n", X, Y);

                // Calculate the next values
                double f = func(X, Y); // Compute f(x, y)
                Y += h * f;            // Update Y using Euler's formula
                X += h;                // Update X
            }
        }
    }

    public static class Arrays { // Better class name

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Size of array :");
            int size = sc.nextInt();
            int arr1[] = new int[size];
            int arr2[] =new int[size];
            System.out.println("Enter the values for the first array:");
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = sc.nextInt();
            }
            System.out.println("Enter the values of Second Array :");
            for (int i=0 ;i< arr2.length;i++){
                arr2[i]=sc.nextInt();
            }
            int smallest = arr1[0]; // Initialize largest with the first element
            for (int i = 0; i < size; i++) { // Start from the second element (index 1)
                if (arr1[i] < smallest) {
                    smallest= arr1[i];
                }
            }
            System.out.println("smallest value is: " + smallest); // Print the result only ONCE, after the loop
            int largest=arr2[0];
            for (int i=0; i<size;i++){
                if (arr2[i]> largest){
                    largest=arr2[i];
                }
            }
            System.out.println("largest value is :"+ largest);
            sc.close(); // Close the scanner
        }
    }

    public static class Tutorials {

        public static void main(String[] args) {
            System.out.println("Hellow world ");
        }



    }
}