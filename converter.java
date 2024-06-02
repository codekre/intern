import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class converter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Map<String,Double> Rates = new HashMap<>();
        Rates.put("USD", 1.0);
        Rates.put("EUR",0.92);
        Rates.put("GBP",0.79);
        Rates.put("JPY",157.26);
        Rates.put("INR",83.46);
        Rates.put("CNY",7.24);
        Rates.put("CAD",1.37);
        Rates.put("AUD",1.50);

        System.out.println("CURRENCY CONVERTER");
        System.out.println("ENTER THE AMOUNT:");
        double amount =sc.nextDouble();

        System.out.println("ENTER THE SOURCE CURRENCY(e.g , USD , EUR):");

        String fromCurrency = sc.next().toUpperCase();

        if(!Rates.containsKey(fromCurrency)){
            System.out.println("Unsupported source currency.");
            return;
        }
        System.out.println("Enter the Target currency(e.g , USD , EUR):");
        String toCurrency=sc.next().toUpperCase();

        if(!Rates.containsKey(toCurrency)){
            System.out.println("Unsupported Target currency.");
            return; 
        }
        double fromRate=Rates.get(fromCurrency);
        double toRate=Rates.get(toCurrency);

        double result = amount *(toRate/fromRate);

        System.out.println("Converted amount in "+ toCurrency+":"+result);
    }
}
