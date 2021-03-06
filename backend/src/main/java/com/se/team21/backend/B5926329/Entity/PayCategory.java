package com.se.team21.backend.B5926329.Entity;



import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
@Table(name = "PayCategories")
public class PayCategory {
    @Id
    @SequenceGenerator(name = "payCategory_seq", sequenceName = "payCategory_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "payCategory_seq")
    private @NotNull Long paycateId;
    private @NotNull String paycateName;

}
