class Solution {
    public double[] convertTemperature(double celsius) {
        double[] Temperature=new double[2];
        double kelvin=celsius + 273.15;
        double Fahrenheit = celsius * 1.80 + 32.00;
        Temperature[0]=kelvin;
        Temperature[1]=Fahrenheit;
        return Temperature;
    }
}