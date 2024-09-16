package com.bci.api_bci.entity;

import io.micrometer.common.lang.NonNull;
import io.micrometer.common.lang.NonNullFields;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Phones {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "NAME", nullable = false)
    private String number;
    @Column(name = "CITY_CODE", nullable = false)
    private String cityCode;
    @Column(name = "COUNTRY_CODE", nullable = false)
    private String countryCode;

}
