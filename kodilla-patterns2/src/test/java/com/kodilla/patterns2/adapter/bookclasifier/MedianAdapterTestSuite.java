package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<BookA> set = new HashSet<>();
        BookA lotr = new BookA("Tolkien", "LOTR", 1990, "T");
        BookA hobbit = new BookA("Tolkien", "Hobbit", 1980, "T");
        BookA sztukaWojny = new BookA("Sun Pin", "Sztuka Wojny", 2000, "SP");
        BookA shades = new BookA("Jakaś baba", "50 Szhades", 1970, "JB");
        BookA littlePrince = new BookA("Antoni", "Mały Książe", 1960, "A");
        set.add(lotr);
        set.add(hobbit);
        set.add(sztukaWojny);
        set.add(shades);
        set.add(littlePrince);
        //When
        int median = medianAdapter.publicationYearMedian(set);
        //Then
        System.out.println(median);
        assertEquals(1980, median);
    }
}
