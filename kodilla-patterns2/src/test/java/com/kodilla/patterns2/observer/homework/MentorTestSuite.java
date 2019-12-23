package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() throws Exception {
        //Given
        TaskQueue sebastian = new TaskQueue("Sebastian Tasks Queue");
        TaskQueue angelika = new TaskQueue("Angelika Tasks Queue");
        TaskQueue karol = new TaskQueue("Karol Tasks Queue");
        Mentor michal = new Mentor("Michał");
        Mentor andrzej = new Mentor("Andrzej");
        sebastian.registerObserverHW(michal);
        sebastian.registerObserverHW(andrzej);
        angelika.registerObserverHW(michal);
        karol.registerObserverHW(andrzej);
        //When
        sebastian.addTask("Sudoku");
        sebastian.addTask("TicTacToe");
        angelika.addTask("FrogCatcher");
        karol.addTask("FlightSeeker");
        sebastian.removeTask();
        karol.removeTask();
        //Then
        assertEquals(4, michal.getUpdateCount());
        assertEquals(5, andrzej.getUpdateCount());
    }
}
