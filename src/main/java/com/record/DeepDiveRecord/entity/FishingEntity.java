package com.record.DeepDiveRecord.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "fishing")
public class FishingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String notes;
    private boolean caught;
    private BigDecimal weight;
    @ManyToOne
    @JoinColumn(name = "fish_id", referencedColumnName = "id")
    private FishEntity fish;
    @ManyToOne
    @JoinColumn(name = "id_geographic", nullable = false)
    private GeographicalLocationEntity geographicalLocation;
    @Column(name = "lat_g")
    private double latG;
    @Column(name = "long_g")
    private double longG;
    @ManyToOne
    @JoinColumn(name = "dive_day_id", referencedColumnName = "dive_day_id", nullable = false)
    private DiveDayEntity diveDay;


}
