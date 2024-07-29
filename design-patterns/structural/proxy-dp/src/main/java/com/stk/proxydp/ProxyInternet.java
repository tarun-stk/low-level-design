package com.stk.proxydp;

import java.util.HashSet;
import java.util.Set;

/*Proxy which will be used by client
 * this acts as intermediary to realobject and controls limited access to realobject
 * by doing some checks before processing to real object*/
public class ProxyInternet implements Internet {

    RealInternet realInternet = new RealInternet();
    static Set<String> blockedSites;

    static {
        blockedSites = new HashSet<>();
        blockedSites.add("abc.com");
        blockedSites.add("xyz.com");
        blockedSites.add("ghi.com");
        blockedSites.add("jkl.com");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if (blockedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("Access denied to: " + serverHost);
        }
        realInternet.connectTo(serverHost);
    }
}
