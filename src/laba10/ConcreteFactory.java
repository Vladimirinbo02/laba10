package laba10;

import laba10.Complex;
import laba10.ComplexAbstractFactory;

public class ConcreteFactory implements ComplexAbstractFactory
{
    public Complex createComplex()
    {
        return new Complex();
    }

    public Complex CreateComplex(int real, int image)
    {
        return new Complex(real,image);
    }
}