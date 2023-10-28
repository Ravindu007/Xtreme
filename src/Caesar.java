import java.util.*;
import java.lang.*;
import java.io.*;

public class Caesar {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number 1");
        int num_messages = scn.nextInt();

        String message = scn.nextLine();
        char[] messageArray = message.toCharArray();

        for(int i=0; i<messageArray.length; i++){
            System.out.println(messageArray[i]);
        }

    }
}
