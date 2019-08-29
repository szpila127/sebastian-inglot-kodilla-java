package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        String toDoTask = "Tasks to do";
        String inProgressTask = "Tasks in progres";
        String doneTask = "Done tasks";

        // When
        boolean doAddResult = board.addToDoTask(toDoTask);
        boolean inProgressResult = board.addInProgressTask(inProgressTask);
        boolean doneResult = board.addDoneTask(doneTask);

        // Then
        assertTrue(doAddResult);
        assertTrue(inProgressResult);
        assertTrue(doneResult);

        assertEquals(toDoTask, board.getToDoTask(0));
        assertEquals(inProgressTask, board.getInProgressTask(0));
        assertEquals(doneTask, board.getDoneTask(0));
    }
}
