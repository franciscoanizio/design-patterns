package br.com.franciscoanizio.strategy;

public class TaxCalculator
{

    public Double calculate(Double principalValue,Tax tax)
    {
        return tax.calculate(principalValue);
    }
}
