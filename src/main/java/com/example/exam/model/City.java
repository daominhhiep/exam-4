package com.example.exam.model;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Cities")
@Data
@Validated
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable=false)
    @NotNull
    private String name;

    @Column(nullable=false)
    @NotNull
    @Min(value = 1, message = "Nhập số lớn hơn 0")
    private Float area;

    @Column(nullable=false)
    @NotNull
    @Min(value = 1, message = "Nhập số lớn hơn 0")
    private Float population;

    @Column(nullable=false)
    @NotNull
    @Min(value = 1, message = "Nhập số lớn hơn 0")
    private Float  gdp;

    @ManyToOne
    @NotNull
    @JoinColumn(name="country_id")
    private Country country;

    @Column(nullable=false, columnDefinition="TEXT")
    @NotNull
    private String introduce;

}