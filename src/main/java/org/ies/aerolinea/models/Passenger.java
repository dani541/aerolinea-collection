package org.ies.aerolinea.models;

import java.util.Comparator;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
public class Passenger {

    private String nif;
    private int seatNumber;

    private List<Luggages> luggages;


}
