package com.joshiSoftware.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
