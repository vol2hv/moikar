package com.madv.moikar.domain;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;


@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(callSuper = true)
public class Child1 extends BaseEntity<Long> {
    @NotBlank(message = "Name cannot be empty")
    @NonNull
    @Column(unique = true, nullable = false, length = 80)
    private String name;
    @NonNull
    private int field1;
}
