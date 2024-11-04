import java.util.Scanner;
public class Caesar_cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*** CAESAR CIPHER  ***");
        System.out.println("Select your Option: ");
        System.out.println("1. Encrypt");
        System.out.println("2. Decrypt");
        int operation = sc.nextInt(); // Op is a variable, which stores the selection option
        sc.nextLine();
        switch (operation) {
            case 1 -> {
                System.out.print("Enter the Message to Encrypt: ");
                String txt = sc.nextLine();
                System.out.print("Enter the key: ");
                int key = sc.nextInt();
                String encryptedMessage = encrypt(txt,key);
                System.out.println("Encrypted Message is:- " + encryptedMessage);
                System.out.println(" ");
                System.out.println("*** EXECTION SUCCESSFUL ***");
            }
            case 2 ->{
                System.out.print("Enter the encrypted text: ");
                String c_txt=sc.nextLine();
                System.out.print("Enter the key to decrypt: ");
                int key2=sc.nextInt();
                String decryptedMessage=decrypt(c_txt,key2);
                System.out.println("Your Mssage is: " + decryptedMessage);
                System.out.println(" ");
                System.out.println("*** Executed Successfully ***");
            }            
        }
     }
    
    public static String encrypt(String txt, int key){
        StringBuilder encryptedMessage =new StringBuilder();
        txt = txt.toLowerCase();
        //System.out.println(txt.length());
        for(int i=0; i<txt.length(); i++){
            char c =txt.charAt(i);
            if (Character.isLetter(c)){
                c = (char) ((c-'a' + key +26) % 26 + 'a');
            }
            encryptedMessage.append(c);
        }
        return encryptedMessage.toString();
        //System.out.print(txt);//return txt; 
    }
    public static String decrypt(String c_txt, int key2){
        StringBuilder decryptedMessage = new StringBuilder();
        c_txt=c_txt.toLowerCase();
        for (int i=0; i<c_txt.length();i++){
            char d =c_txt.charAt(i);
            if(Character.isLetter(d)){
                d = (char) ((d - 'a' - key2 + 26) %26 + 'a');
            }
            decryptedMessage.append(d);
        }

        return decryptedMessage.toString();
    }
    }
