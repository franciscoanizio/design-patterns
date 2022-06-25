package br.com.franciscoanizio.strategy;

public class StateTax implements Tax
{
    @Override
    public Double calculate(Double principalValue) {
        return principalValue * 0.025;
    }
}
