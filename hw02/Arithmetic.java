//Holland Roza
//September 5, 2014
//CSE 002
//Arithmetic Java Program
//

public class Arithmetic{
    
    public static void main(String[] args) {
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //('$' is part of the variable name)
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        
        double totalSockCost$, totalSockTax$, totalSalesTaxS$; //total cost of socks
        totalSockCost$=(nSocks * sockCost$);
        totalSalesTaxS$ =(totalSockCost$ * taxPercent);
        totalSockTax$=(totalSockCost$) + (totalSalesTaxS$);
        
        double totalGlassCost$, totalGlassTax$, totalSalesTaxG$;
        totalGlassCost$=(nGlasses * glassCost$);
        totalSalesTaxG$=(totalGlassCost$ * taxPercent);
        totalGlassTax$=(totalGlassCost$) + (totalSalesTaxG$);
        
        double totalEnvelopeCost$, totalEnvelopeTax$, totalSalesTaxE$;
        totalEnvelopeCost$=(nEnvelopes * envelopeCost$);
        totalSalesTaxE$=(totalEnvelopeCost$ * taxPercent);
        totalEnvelopeTax$=(totalEnvelopeCost$) + (totalSalesTaxE$);
        
        double totalCost$=(totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$);
        double totalCostTax$=(totalSockTax$ + totalGlassTax$ + totalEnvelopeTax$);
        double totalSalesTax$=totalSalesTaxE$ + totalSalesTaxG$ + totalSalesTaxS$;
        
        System.out.println("I am buying " + nSocks + " pairs of socks.");
        System.out.println("The socks cost " +  sockCost$ + " per pair.");
        System.out.println("The total cost of the socks before tax is " + totalSockCost$ + ".");
        System.out.println("The total sales tax of the socks is " + totalSalesTaxS$ + ".");
        
        System.out.println("I am buying " + nGlasses + " glasses.");
        System.out.println("The glasses cost " + glassCost$ + " per glass.");
        System.out.println("The total cost of the glasses before tax is " + totalGlassCost$ + ".");
        System.out.println("The total sales tax of the glasses is " + totalSalesTaxG$ + ".");
        
        System.out.println("I am buying " + nEnvelopes + " envelope.");
        System.out.println("The envelopes cost " + envelopeCost$ + " per envelope.");
        System.out.println("The total cost of the envelopes before tax is " + totalEnvelopeCost$ + ".");
        System.out.println("The total sales tax of the envelopes is " + totalSalesTaxE$ + ".");
        
        System.out.println("The total cost of the purchases before tax is " + totalCost$ + ".");
        System.out.println("The total sales tax is " + totalSalesTax$ + ".");
        System.out.println("The total cost of the purchases after tax is " + totalCostTax$ + ".");
        
    } 
}