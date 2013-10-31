package com.example.dots;

public class DotLink
{
    Dot dotOne;
    Dot dotTwo;

    public DotLink(Dot dotOne, Dot dotTwo) {
        linkDots(dotOne, dotTwo);
    }
    public DotLink() {
        linkDots(null, null);
    }

    public DotLink linkDots(Dot dotOne, Dot dotTwo) {

        this.dotOne = dotOne;
        this.dotTwo = dotTwo;

        return this;
    }
    public Dot getDotOne() {
        return dotOne;
    }
    public Dot getDotTwo() {
           return dotTwo;
    }


}
