package br.com.franciscoanizio.strategy;

public class FedaralTax implements Tax
{
    @Override
    public Double calculate(Double principalValue) {
        return principalValue * 0.015;
    }
}
