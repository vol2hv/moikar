package com.madv.moikar.domain;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

/**
 * WashFacility - Сущность представляющая автомойки.
 */
@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor

public class Box extends BaseEntity<Long> {
    @NotBlank(message = "Name cannot be empty")
    @NonNull
    @Column(unique = true, nullable = false, length = 80)
    private String name;
    private String description;
    @Enumerated(EnumType.STRING)
    private BoxStatus boxStatus;
    @Enumerated(EnumType.STRING)
    private BoxType boxType;

}
