package org.example;

import ru.kushaevaa.Converter;

public class App 
{
    public static void main( String[] args )
    {
        Converter cnv = new Converter(2., 3., 4.,5., 500, 600);
        cnv.getXDen();
    }
}
