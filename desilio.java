/*You have to design a custom message printing function for a company Desilio Designs where user will enter the name of client and a message will be printed 
"<Name > your request has been forwarded to our team, someone will contact you within 24 hours" */

import java.util.Scanner;

public class desilio{

     public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the client name.");
        String name = sc.nextLine();
        System.out.println(name+" your request has been forwarded to our team, someone will contact you within 24 hours");
     }
}
