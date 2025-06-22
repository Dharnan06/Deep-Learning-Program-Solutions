public class FinancialForecast {

    public static double forecastValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        } else {
            return forecastValue(presentValue, growthRate, years - 1) * (1 + growthRate);
        }
    }

    public static void main(String[] args) {
        double presentValue = 300000; // 
        double growthRate = 0.012;
        int years = 2;

        double futureValue = forecastValue(presentValue, growthRate, years);
        System.out.println("Future value after "+years +" years = "+futureValue);
    }
}
