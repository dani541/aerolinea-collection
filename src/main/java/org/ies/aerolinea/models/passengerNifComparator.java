package org.ies.aerolinea.models;

import java.util.Comparator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
public class passengerNifComparator implements Comparator<Passenger> {

    public int compare(Passenger o1, Passenger o2) {
        return o1.getNif().compareTo(o2.getNif());
    }

}
