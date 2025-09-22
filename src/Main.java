//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int intOperandA = 13;
        int intOperandB = 5;
        int intSum = intOperandA + intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intDifference = intOperandA - intOperandB;
        int intQuotient = intOperandA / intOperandB;     // integer division
        int intModulo = intOperandA % intOperandB;

        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);


        double doubleOperandA = 13.0;
        double doubleOperandB = 5.0;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;

        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);


        System.out.println("Notice int division truncates: 13/5 -> " + intQuotient + ", but 13.0/5.0 -> " + doubleQuotient);


        double myLunchCost = 12.50;
        int numberOfKidsInFamily = 3;
        boolean isItRaining = false;
        double pricePerGallonGas = 3.79;
        int favoriteNumber = 23;
        double shoeSize = 10.5;
        String birthMonth = "July";
        String fullName = "Fayoz Muydinov";

        System.out.println("Lunch cost: " + myLunchCost);
        System.out.println("Kids in family: " + numberOfKidsInFamily);
        System.out.println("Is it raining? " + isItRaining);
        System.out.println("Gas price: " + pricePerGallonGas);
        System.out.println("Favorite number: " + favoriteNumber);
        System.out.println("Shoe size: " + shoeSize);
        System.out.println("Birth month: " + birthMonth);
        System.out.println("Full name: " + fullName);
    }
}
