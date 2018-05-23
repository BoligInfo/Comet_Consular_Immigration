package dk.comet.prototyping;

import java.util.ArrayList;

public interface Travelable {

    default ArrayList<Travelable> getConnections() {
        return  null;

    }



}
