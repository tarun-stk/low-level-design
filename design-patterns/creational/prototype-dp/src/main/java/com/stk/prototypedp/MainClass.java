package com.stk.prototypedp;

/*The Prototype Design Pattern is a creational design pattern that allows you to create new
objects by copying an existing object, known as the prototype. This pattern is particularly
useful when the process of creating a new instance of a class is complex or computationally
expensive. Instead of constructing a new instance from scratch, you can clone an existing instance.*/
public class MainClass {
    public static void main(String[] args) {
        BookShop bs1 = new BookShop();
        bs1.setShopName("bs1");
        bs1.loadData();

        BookShop bs2 = bs1.clone();
        bs2.setShopName("bs2");
        bs1.getBooks().remove(0);
        System.out.println(bs1);
        System.out.println(bs2);

        /*sample outpu:
        bookid 0 only removed from bs1, not from bs2
        * BookShop{shopName='bs1', books=[Book{id=1, name='name1'}, Book{id=2, name='name2'}, Book{id=3, name='name3'}, Book{id=4, name='name4'}]}
        BookShop{shopName='bs2', books=[Book{id=0, name='name0'}, Book{id=1, name='name1'}, Book{id=2, name='name2'}, Book{id=3, name='name3'}, Book{id=4, name='name4'}]}*/
    }
}
