package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        Processor processor = new Processor();
//        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(() -> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println();

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println();

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("PiErWsZy TeKsT", (text) -> text.toLowerCase());
        poemBeautifier.beautify("dRuGi TeKsT", (text) -> text.toUpperCase());
        poemBeautifier.beautify("Trzeci tekst", (text) -> text + " [TO JEST DOPISANE W LAMBDA]");
        poemBeautifier.beautify("Czwarty tekst", (text) -> "*** " + text + " ***");
        poemBeautifier.beautify("Piąty tekst", (text) -> text.substring(1, text.length()-1));
        poemBeautifier.beautify("AAASzósty tekstAAA", (text) -> text.replace("A", "" ));

        System.out.println();

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
