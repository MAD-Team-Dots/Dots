package com.example.dots;

/**
 *  Connects two dots together
 *
 *  @author Al Zargarpur
 *  @version Oct 30, 2013
 */
public class DotLink
{
    Node<Dot> otherDot;

    public DotLink(Dot dot) {
        this.otherDot = new Node<Dot>(dot);
    }

    public void unLinkDots() {
        otherDot = null;
    }
    public Dot getLinkedDot() {
        return otherDot.data();
    }
    public void setLinkedDot(Dot dot) {
        otherDot = new Node<Dot>(dot);
    }


}
