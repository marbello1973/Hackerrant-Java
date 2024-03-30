
import java.text.*;
import java.util.*;

import static java.text.NumberFormat.getCompactNumberInstance;
import static java.text.NumberFormat.getCurrencyInstance;

public class FormatPayment {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();

        //String indianPattern = "Rs#,###.##";
        DecimalFormat formatIndia = new DecimalFormat("###,###.00");
        DecimalFormat formatChina = new DecimalFormat("\u00A5 ###,###.000");
        //DecimalFormat formatFrance = new DecimalFormat("###.000 \u20AC");


        // Format US
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = "Rs." + formatIndia.format(payment);
        //String china = formatChina.format(payment);
        String china = NumberFormat.getCurrencyInstance(new Locale("zh", "CN")).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        //String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india );
        System.out.println("China: " + china);
        System.out.println("France: " + france);
/*
        //Format Indian
        String rupeeSymbol = "\u20B9";
        NumberFormat indianNf = NumberFormat.getCurrencyInstance(new Locale("EN", "IN"));
        String indianFormatted = indianNf.format(payment);
        System.out.println("India: " + indianFormatted.replace(rupeeSymbol, "Rs."));


        //Format china
        String chinaSymbol = NumberFormat.getCurrencyInstance(Locale.CHINA).getCurrency().getSymbol(Locale.CHINA);
        String china = NumberFormat.getCurrencyInstance(new Locale("zh", "CN")).format(payment);
        String formattedChina = china.replaceFirst(chinaSymbol, chinaSymbol + " ");
        System.out.println("China: " + formattedChina);
        //String chinaSymbol = "\uFFE5";
        String chinaSymbol = NumberFormat.getCurrencyInstance(Locale.CHINA).getCurrency().getSymbol(Locale.CHINA);
        NumberFormat chinaNf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String chinaCurrency = chinaNf.format(amount);
        String formattedChina = chinaCurrency.replaceFirst(chinaSymbol, chinaSymbol + " ");
        System.out.println("CHINA: " + formattedChina.toUpperCase());

        //Format france
        //String franceNf = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        //System.out.println("France: " + franceNf);


*/

    }

}
