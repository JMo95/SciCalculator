import java.util.Scanner;

public class CmdProj {
static Scanner scn = new Scanner(System.in);


public static void main(String[] args) {

System.out.println("Enter 5 values");
arr();

int exitLoop = 20;
int elementPlace = 0;
int y = 0;

String[] strings = new String[20];

while (exitLoop != 0) {

System.out.println("type 1 to enter a message, 2 to see your messages. 0 to exit");
int choice = scn.nextInt();

switch (choice) {

case 0:
System.out.println("Thanks for not being an idiot");
exitLoop = 0;
break;
case 1:
System.out.println("please enter a message you want to be saved");
String line = scn.next();
strings[elementPlace] = line;
elementPlace++;
break;
case 2:
for (int i = 0; i < elementPlace; i++){
System.out.print(strings[y] + " ");
System.out.println("");
y++;
}
break;
default:
break;

}


}




}


public static void arr(){
int[] holder = new int[5];
int x = 0;
int input;

for (int i = 0; i < 5; i++) {
input = scn.nextInt();
holder[x] = input;
x++;
}

for (int i = 0; i < 5; i++) {
System.out.print(holder[i] + " ");
}
System.out.println("");



}


}