package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User maciek = new Millenials("Maciek Millenials");
        User tadek = new YGeneration("Tadek Y. Niejadek");
        User zenek = new ZGeneration("Zenenk Z. Bóbr");

        //When
        String maciekShare = maciek.sharePost();
        System.out.println(maciek.getName() + " używa " + maciekShare);
        String tadekShare = tadek.sharePost();
        System.out.println(tadek.getName() + " używa " + tadekShare);
        String zenekShare = zenek.sharePost();
        System.out.println(zenek.getName() + " używa " + zenekShare);

        //Then
        Assert.assertEquals("[Facebook]", maciekShare);
        Assert.assertEquals("[Snapchat]", tadekShare);
        Assert.assertEquals("[Twitter]", zenekShare);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User zenek = new ZGeneration("Zenenk Z. Bóbr");

        //When
        String zenekShare = zenek.sharePost();
        System.out.println(zenek.getName() + " używa " + zenekShare);
        zenek.setSharingStrategy(new FacebookPublisher());
        zenekShare = zenek.sharePost();
        System.out.println(zenek.getName() + " używa " + zenekShare);

        //Then
        Assert.assertEquals("[Facebook]", zenekShare);
    }
}
