package com.utn.rest.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Invoice {
    private int id;


    private PhoneLine lineId;

    private int quantityCalls;

    private float costPrice;

    private float totalPrice;

    private Date date;

    private Date dueDate;

    private List<Call> calls;
}
