package xyz.devartisee.recommend.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "showing")
@DynamicUpdate
public class Showing {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
