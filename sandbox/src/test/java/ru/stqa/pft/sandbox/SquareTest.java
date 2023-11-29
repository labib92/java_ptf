package ru.stqa.pft.sandbox;



import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SquareTest { 

    @Test
    public void testArea(){
        Square s = new Square(5);
        assertEquals(s.area(), 25.0);
    }
}