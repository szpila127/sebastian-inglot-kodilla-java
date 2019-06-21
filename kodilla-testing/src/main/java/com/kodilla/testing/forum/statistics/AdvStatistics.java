package com.kodilla.testing.forum.statistics;

public class AdvStatistics {
    Statistics statistics;

    int usersQuantity;
    int postsQuantity;
    int commentsQuantitny;
    double avPostsPerUser;
    double avCommentsPerUser;
    double avCommentsPerPost;

    public AdvStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        usersQuantity = statistics.usersNames().size();

        postsQuantity = statistics.postsCount();

        commentsQuantitny = statistics.commentsCount();

        if (statistics.usersNames().size() == 0) {
            avPostsPerUser = 0.0;
        } else avPostsPerUser = (double) statistics.postsCount() / (double) statistics.usersNames().size();

        if (statistics.usersNames().size() == 0) {
            avCommentsPerUser = 0.0;
        } else avCommentsPerUser = (double) statistics.commentsCount() / (double) statistics.usersNames().size();

        if (statistics.postsCount() == 0) {
            avCommentsPerPost = 0.0;
        } else avCommentsPerPost = (double) statistics.commentsCount() / (double) statistics.postsCount();
    }

    public String showStatistics() {

        return "usersQuantity: " + usersQuantity +
                "\n postsQuantity: " + postsQuantity +
                "\n commentsQuantity: " + commentsQuantitny +
                "\n avPostsPerUser: " + avPostsPerUser +
                "\n avCommentsPerUser" + avCommentsPerUser +
                "\n avCommentsPerPost" + avCommentsPerPost;
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantitny() {
        return commentsQuantitny;
    }

    public double getAvPostsPerUser() {
        return avPostsPerUser;
    }

    public double getAvCommentsPerUser() {
        return avCommentsPerUser;
    }

    public double getAvCommentsPerPost() {
        return avCommentsPerPost;
    }
}
