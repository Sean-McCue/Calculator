Scanner scan = new Scanner(System.in);
System.out.println("Please enter in two whole numbers.")
int number1 = scan.nextInt();
int number2 = scan.nextInt();
System.out.println("Which operation would you like to perform?"); 
System.out.println("1. Addition  2. Subtraction 3. Multiplication 4. Division")
int operation = scan.nextInt();
if (operation ==1 ){
    System.out.println(number1 + number2);
}if (operation == 2 ) {
    System.out.println(number1 - number2);
}if (operation == 3 ) {
    System.out.println(number1*number2);
}if (operation == 4) {
    if (number2 == 0){
        System.out.println("Error cannot divide by zero");
    }else{
         System.out.println(number1/number2);
    }

}else{
System.out.println("invalid user input");
}
/exit