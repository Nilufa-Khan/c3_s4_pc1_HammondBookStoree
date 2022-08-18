package com.bookstore;

import data.Book;

public class BookImpl {
    public static void main(String[] args) {
        Book obj = new Book();
        obj.setAuthorName("Chetan Bhagat");
        obj.setTitle("2 States");
        obj.setDescription("it is the story about a couple coming from 2 states in India");
        obj.setAuthorPenName("Link");
        obj.setIsbnNo(45968637879L);
        obj.setPrice(250);

       // System.out.println(obj.toString());
        System.out.println(obj);
        obj.display();

    }
}
