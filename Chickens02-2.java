public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
        double dailyAverage = (100+121+117)/(3);
        double monthlyAverage = dailyAverage*30;
        double monthlyProfit = 0.18*monthlyAverage;

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
