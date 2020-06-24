package com.utn.rest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Call {
    private int Id;

    private PhoneLine lineIdFrom;

    private PhoneLine lineIdTo;

    private Invoice invoice;

    private float minutePrice;

    private float minuteCost;

    private int duration;

    private Date date;
}
