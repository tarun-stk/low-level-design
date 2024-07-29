package com.stk.proxydp;

/*Subject interface, which will be implemented by both proxy and real object*/
public interface Internet {
    void connectTo(String serverHost) throws Exception;
}
