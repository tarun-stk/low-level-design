package com.stk.adapterdp;

public class School {
    public static void main(String[] args) {
        /*By using simply below, we get null pointer exception bcoz we've not not implementation
        * for pen interface, and we don't even want to do it, we want some adaptor to do it*/
        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.write("writing");
        /*Adaptor dp:
        * A has iphone, he is in B's house who has only samsung charger
        * now A wants to charge his iphone
        * but samsung charger cannot do this directly
        * so he uses adaptor which fullfills his functionality using samsung charger
        *
        * Adaptor dp does same
        * here we only have pen, interface, and our friend Varun gave us pilotpen to accomplish
        * assignment work, but pilotpen by default cannot write the assignment because it is not
        * implementing pen interface
        * now we need some adaptor */
        /*By using below we can overcome above challenge
        * */
        Pen p = new PenAdaptor();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.write("I'm too tired to write an assignment");

    }
}
