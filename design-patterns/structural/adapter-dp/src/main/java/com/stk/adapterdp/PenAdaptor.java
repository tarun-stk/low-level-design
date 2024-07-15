package com.stk.adapterdp;

import com.stk.adapterdp.varun.PilotPen;

public class PenAdaptor implements Pen{

    PilotPen pilotPen = new PilotPen();
    @Override
    public void write(String write) {
        pilotPen.mark(write);
    }
}
