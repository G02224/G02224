package com.gxc;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class text extends JFrame {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        book book = new book("《三国演义》",28.8,"罗贯中");
        list.add(book);
        book book2 = new book("《红楼梦》",48.8,"曹雪芹");
        list.add(book2);
        book book3 = new book("《西游记》",38.8,"吴承恩");
        list.add(book3);
        System.out.println(" 书名"+"\t\t"+"价格"+"\t"+"作者");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("排序后====");
        book.sort(list);
        for (Object obj:list) {
            System.out.println(obj);
        }


    }
}
class book{
    String bookname;
    double price;
    String author;

    public book(String bookname, double price, String author) {
        this.bookname = bookname;
        this.price = price;
        this.author = author;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return getBookname()+"\t"+getPrice()+"\t"+getAuthor();
    }
    public static void sort(List list){
        for (int i = 0; i <list.size()-1 ; i++) {
            for (int j = 0; j <list.size()-1-i ; j++) {
               book book1 = (book)list.get(j);
               book book2 = (book)list.get(j+1);
               if (book1.getPrice()<book2.getPrice()){
                   list.set(j,book2);
                   list.set(j+1,book1);
               }
            }
        }
    }
}
