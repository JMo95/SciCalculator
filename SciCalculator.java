import java.util.Scanner;

public class SciCalculator {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);  // Creates a new scanner.
        Boolean gameRun = true;
        int menuRun = 1; // Controls if the menu is printed or not.
        int numOfCalcs = 0;  // Keeps track of number of calculations that have been done since program started.
        double result = 0;  // Holds the result of the calculations.
        double sumOfResults = 0; // Holds the sum of all the results together.

        System.out.println("Current Result: " + result);

            while (gameRun = true) { // Keeps game running until 0 is the input.
                if (menuRun != 0) {  // Prints menu when specified.
                    // Calculator Menu user is told to choose between 0-7.
                    System.out.println("");
                    System.out.println("Calculator Menu\n---------------\n"
                            + "0. Exit Program\n" +
                            "1. Addition\n2. Subtraction\n3. Multiplication" +
                            "\n4. Division\n" + "5. Exponentiation\n" + "6. Logarithm\n" +
                            "7. Display Average");
                    System.out.println("");
                }
                System.out.print("Enter Menu Selection: ");
                int menuInput = userInput.nextInt();
                double firstOperand;
                double secondOperand;

                if (menuInput == 0) {  // If input is 0 the game prints a statement then exits.
                    System.out.println("Thanks for using this calculator. Goodbye!");
                    System.exit(0);
                }

                // Each case number performs the operation that the user input from the menu.
                if (menuInput != 7 && menuInput > -1 && menuInput < 8) {
                    // Uses switch statements if input is 1-7.
                    System.out.print("Enter first operand: ");
                    firstOperand = userInput.nextDouble();
                    // Has user input second number to calculate
                    System.out.print("Enter second operand: ");
                    secondOperand = userInput.nextDouble();
                    System.out.println("");
                    switch (menuInput) {  // Applies each case to which menu number was input of (1-6).
                        case 1:
                            result = (firstOperand + secondOperand);
                            System.out.println("Current Result: "
                                    + result);
                            numOfCalcs++;
                            sumOfResults = sumOfResults + result;
                            menuRun = 1;
                            break;
                        case 2:
                            result = (firstOperand - secondOperand);
                            System.out.println("Current Result:  "
                                    + result);
                            numOfCalcs++;
                            sumOfResults = sumOfResults + result;
                            break;
                        case 3:
                            result = (firstOperand * secondOperand);
                            System.out.println("Current Result: "
                                    + result);
                            numOfCalcs++;
                            sumOfResults = sumOfResults + result;
                            break;
                        case 4:
                            result = (firstOperand / secondOperand);
                            System.out.println("Current Result: "
                                    + result);
                            numOfCalcs++;
                            sumOfResults = sumOfResults + result;
                            break;
                        case 5:
                            result = Math.pow(firstOperand, secondOperand);
                            System.out.println("Current Result: "
                                    + result);
                            numOfCalcs++;
                            sumOfResults = sumOfResults + result;
                            break;
                        case 6:
                            result = Math.log(secondOperand) / Math.log(firstOperand);
                            System.out.println("Current Result: "
                                    + result);
                            numOfCalcs++;
                            sumOfResults = sumOfResults + result;
                            break;
                        default:
                            break;
                    }
                } else if (menuInput == 7) {  // Prints stats of game if input is 7.
                    if (numOfCalcs == 0) {  // Prints this statement if no calculations have been done yet.
                        System.out.println("Error: No calculations yet to average!");
                        menuRun = 0;
                    } else {
                        System.out.println("Sum of calculations: " + sumOfResults);
                        System.out.println("Number of calculations: " + numOfCalcs);
                        System.out.print("Average of calculations: ");
                        double average = sumOfResults / numOfCalcs;
                        average *= 100;
                        int a = Math.round((float) average);
                        average = (double) a / 100;
                        System.out.println(average);
                        menuRun = 0;
                    }

                } else {  // Prints this statement if user input is out of bounds of (0-7).
                    System.out.println("Error: Invalid selection!");
                    System.out.println("");
                    menuRun = 0;
                }
            }
        }
    }

