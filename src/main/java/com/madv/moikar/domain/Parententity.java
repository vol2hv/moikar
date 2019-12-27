package com.madv.moikar.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

/**
 * Образец наследования от BaseEntity
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ToString(callSuper = true)
public class Parententity extends BaseEntity<Long> {
    @NotBlank(message = "Name cannot be empty")
    @NonNull
    @Column(unique = true, nullable = false, length = 80)
    private String name;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch= FetchType.EAGER)
//  !!!!!  инициализация пустым массивом обязательна
    private List<Child1> children1 = new ArrayList<>();
}
