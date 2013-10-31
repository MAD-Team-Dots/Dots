package com.example.dots;

public class Dot
{
    DotLink northLink, southLink, eastLink, westLink;

    public enum DotDirection {
        NORTH, SOUTH, EAST, WEST
    }

    public DotLink getDotLink(DotDirection direction) {
        DotLink link = null;

        switch(direction) {
            case NORTH : {
                link = northLink;
                break;
            }
            case SOUTH : {
                link = southLink;
                break;
            }
            case EAST : {
                link = eastLink;
                break;
            }
            case WEST : {
                link = westLink;
                break;
            }
            default : {
                return null;
            }
        }
        return link;
    }
    public Dot getDot(DotDirection direction) {
        DotLink dotLink = getDotLink(direction);

        if(dotLink != null) {
            return dotLink.getLinkedDot();
        } else {
            return null;
        }
    }
}
