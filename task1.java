import java.util.Scanner;

public class Main {

public static void main(String[] args) {
System.out.println("Введите число: ");
Scanner sc = new Scanner(System.in);
String input = sc.next();

try {
int intValue = Integer.parseInt(input);
if (intValue % 2 == 0) {
System.out.println("Число " + intValue + " четное");
System.out.println("Это число составное");
return;
} else {
System.out.println("Вы ввели нечетное целое число");
for (int i = 2; i < intValue; i++) {
if (intValue % i == 0) {
System.out.println("Это число составное");
return;
}
}
System.out.println("Это число простое");
}

} catch (NumberFormatException ex) {
System.out.println("Это нецелое число!");
return;
}

}
}