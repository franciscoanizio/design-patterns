package br.com.franciscoanizio.strategy;

public class StrategyPatternTest
{
    public static void main(String[] args)
    {
        double principalValue = 1000;

        System.out.println("Federal tax result "+new TaxCalculator().calculate(principalValue,new FedaralTax()));
        System.out.println("State tax result "+new TaxCalculator().calculate(principalValue,new StateTax()));

    }
}
