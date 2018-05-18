package dk.comet.prototyping;

import java.util.ArrayList;

public interface Node {

    default ArrayList<Node> getConnections() {
        return  null;

    }



}
