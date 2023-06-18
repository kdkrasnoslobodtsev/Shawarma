package com.example.test.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ordered")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "lavash")
    private Integer lavash;

    @Column(name = "salad")
    private Integer salad;

    @Column(name = "chicken")
    private Integer chicken;

    @Column(name = "pork")
    private Integer pork;

    @Column(name = "beef")
    private Integer beef;

    @Column(name = "pepper")
    private Integer pepper;

    @Column(name = "tomato")
    private Integer tomato;
}
