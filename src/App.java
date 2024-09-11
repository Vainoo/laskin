import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);
        String input = "";
        String input2 = "";
        String input3 = "";
        double vastaus = 0;
        
        System.out.println("kirjoita numero");
        input = in.nextLine();
        System.out.println("kirjoita toinen numero");
        input2 = in.nextLine();
        System.out.println("Haluatko laskea luvut yhteen vai vähentää. Kirjoita plus, miinus, jako, kerto tai potenssi.");
        input3 = in.nextLine();

        if (input3.equalsIgnoreCase("Plus")){
            vastaus = Double.parseDouble(input) + Double.parseDouble(input2);
        }
        
        else if (input3.equalsIgnoreCase("Miinus")){
            vastaus = Double.parseDouble(input) - Double.parseDouble(input2);
        }
        else if (input3.equalsIgnoreCase("Jako")){
            vastaus = Double.parseDouble(input) / Double.parseDouble(input2);
        }
        else if (input3.equalsIgnoreCase("Kerto")){

         vastaus = Double.parseDouble(input) * Double.parseDouble(input2);
        
        }
        else if (input3.equalsIgnoreCase("Potenssi")){
            vastaus = Math.pow(Double.parseDouble(input), Double.parseDouble(input2));
        }

        if (vastaus > 10) {
            System.out.println("Tulos on yli kymmenen. Tulos on " + vastaus);
        }
        else {
            System.out.println("Tulos on alle kymmenen. Tulos on " + vastaus);
        }
 }
}