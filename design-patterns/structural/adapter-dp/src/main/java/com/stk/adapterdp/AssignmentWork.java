package com.stk.adapterdp;

public class AssignmentWork {
    private Pen p;
    public void write(String str){
        p.write(str);
    }

    public void setP(Pen p) {
        this.p = p;
    }
}
