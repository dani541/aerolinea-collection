package org.ies.aerolinea.models;

import java.util.Comparator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
public class passengerBySeat implements Comparator<Passenger> {

    public int compare(Passenger o1, Passenger o2) {
        return Integer.compare(o1.getSeatNumber(), o2.getSeatNumber());
    }
}
