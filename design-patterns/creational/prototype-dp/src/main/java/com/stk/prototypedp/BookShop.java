package com.stk.prototypedp;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    String shopName;
    List<Book> books = new ArrayList<>();

    public void loadData(){
        for(int i = 0; i < 5; i ++){
            Book b = new Book();
            b.id = i;
            b.name = "name"+i;
            books.add(b);
        }
    }
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    /*This is prototype, instead of doing shallow cloning (default clone method)
    * we're overriding clone and doing some modifications and doing deep cloning*/
    @Override
    protected BookShop clone(){
        BookShop bs = new BookShop();
        bs.setShopName(getShopName());
        for(Book b: books){
            bs.getBooks().add(b);
        }
        return bs;
    }

}

class Book{
    int id;
    String name;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
