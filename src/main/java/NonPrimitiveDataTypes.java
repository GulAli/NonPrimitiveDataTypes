import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner menuSelection = new Scanner(System.in);
        Scanner userName = new Scanner(System.in);
        boolean MENU_EXIT = true;

        while (MENU_EXIT) {
            System.out.println("Enter a number : " + "\r\n 1 - ADD" + "\r\n 2 - REMOVE" + "\r\n 3 - VIEW" + "\r\n 4 - EXIT");
            int myInt = menuSelection.nextInt();

            if (myInt == 1) { // ADD
                System.out.println("Enter a name : ");
                String myString = userName.nextLine();
                if (false) { // if include forbidden chars
                    System.out.println("ERROR LOG : FORBIDDEN CHARACTER HAS BEN ENTERED!");
                } else {
                    list.add(myString);
                    System.out.println("A NAME HAS BEEN ADDED TO THE LIST!");
                }
            } else if (myInt == 2) { // REMOVE
                if (list.isEmpty()) {
                    System.out.println("LIST EMPTY. NOTHING TO REMOVE!");
                } else {
                    System.out.println("ENTER INDEX THAT YOU WANT TO REMOVE FROM THE LIST : ");
                    int userRemoveInt = menuSelection.nextInt();
                    if (userRemoveInt > list.size() || 0 > userRemoveInt) {
                        System.out.println("THE INDEX YOU ENTERED IS OUT OF BOUNDRY!");
                    } else {
                        list.remove(userRemoveInt);
                        System.out.println("USER HAS BEEN DELETED.");
                    }
                }
            } else if (myInt == 3) { // VIEW
                if (list.isEmpty()) {
                    System.out.println("LIST EMPTY. NOTHING TO VIEW");
                } else {
                    System.out.println("My list : ");
                    for (String fruit : list)
                        System.out.println(fruit);
                }
            } else if (myInt == 4) { // EXIT
                MENU_EXIT = false;
                System.out.println("SYSTEM HAS BEEN CLOSED!");
            } else {
                System.out.println("ERROR LOG : WRONG INPUT!");
            }
        }
    }
}
