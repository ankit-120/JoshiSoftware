package com.joshiSoftware.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {

    private int id;
    private String orderDate;
    private String company;
    private String owner;
    private int quantity;
    private double weight;
    private String shipment;
    private String trackingId;
    private String size;
    private int boxCount;
    private String specification;
    private String checklist;
    private int isFilled;

}
