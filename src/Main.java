//Given the price of a purchase the program computes and outputs a 5% sales tax.
// Be sure to use output statements that clearly display the price and the computed sales tax.
//(No conditions here, the sales tax is always the same rate.)

public class Main {
    public static void main(String[] args) {
    int price = 5;
    int SALES_TAXRATE = 0.5;
    int SALESTAX = price + SALES_TAXRATE;

    System.out.println("The sales tax on" + price + "is " + SALESTAX);

    }
}