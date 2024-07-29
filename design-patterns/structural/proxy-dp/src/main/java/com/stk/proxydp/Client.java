package com.stk.proxydp;

/*Client: Use the ProxyInternet to access the internet.*/
public class Client {
    public static void main(String[] args) throws Exception {
        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("abc.com");
    }
}

/*The Proxy Design Pattern is a structural design pattern that provides a surrogate or placeholder
 for another object to control access to it. This pattern helps to create an intermediary that acts
 as an interface to another resource, adding a level of indirection to the original object.*/
/*Subject: The common interface for RealSubject and Proxy.
RealSubject: The actual object that the proxy represents.
Proxy: The object that controls access to the RealSubject. It implements the same interface as
the RealSubject, allowing it to be used in place of the RealSubject.*/
