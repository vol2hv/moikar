package com.madv.moikar.domain;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Образец наследования от BaseEntity
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Sample extends BaseEntity<Long> {
    @NotBlank(message = "Name cannot be empty")
    @NonNull
    @Column(unique = true, nullable = false, length = 80)
    private String name;
    @NotBlank(message = "Description cannot be empty")
    @NonNull
    private String description;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date localDate;
    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm")
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm")
    private Date localTime;
    @Column(precision=15, scale=2)
    private BigDecimal bigDecimal;
    private Boolean isBoolean;
    private String  password;
    @Enumerated(EnumType.STRING)
    private BoxStatus boxStatus;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch= FetchType.EAGER)
    private List<Box> boxes = new ArrayList<>();
}
