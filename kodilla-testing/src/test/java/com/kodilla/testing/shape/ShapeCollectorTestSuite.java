package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Circle circle = new Circle(5);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertTrue(shapeCollector.getFiguresQuantity() == 1);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Square square = new Square(4);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        //When
        boolean result = shapeCollector.removeFigure(square);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testGetFigure() {
        //Given
        Triangle triangle = new Triangle(4,7);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);
        //When
        Shape result;
        result = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(triangle, result);
    }

    @Test
    public void testShowFigures() {
        //Given
        Square square = new Square(6);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        //When
        Shape result;
        result = shapeCollector.showFigures(square);
        //Then
        Assert.assertEquals(square,result);
    }

}
