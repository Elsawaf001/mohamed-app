package com.elsawaf.app.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "industrial_order")
public class IndustrialOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "industrial_licence_order_seq")
    @SequenceGenerator(name = "industrial_licence_order_seq" ,  sequenceName = "industrial_licence_order_seq"
            , allocationSize = 100 , initialValue = 400000)
    @Column(name = "id", nullable = false)
    private Long id;



}