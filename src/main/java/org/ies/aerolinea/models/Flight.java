package org.ies.aerolinea.models;

import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
public class Flight  {

    private  int flightNumber;

    private String origin;

    private String destination;

    private Date flightDate;

    private List<Passenger> passengers;



}
