package laba10;

import laba10.Complex;
import laba10.ComplexAbstractFactory;
import laba10.ConcreteFactory;

public class Main {
    public static void main(String[] args)
    {
        Complex a=new Complex(45,9);
        System.out.println(a);

        ComplexAbstractFactory b = new ConcreteFactory();
        Complex c = b.CreateComplex(564, 453);
        System.out.println(c);

        ConcreteFactory d = new ConcreteFactory();
        Complex f = d.CreateComplex(0, 1);
        System.out.println(f);
    }
}