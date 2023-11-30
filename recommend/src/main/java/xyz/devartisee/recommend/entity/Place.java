package xyz.devartisee.recommend.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Table(name = "place")
@DynamicUpdate
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "address_name")
    private String addressName;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "place_name")
    private String placeName;

    @Column(name = "place_url")
    private String placeUrl;

    @Column(name = "road_address_name")
    private String RoadAddressName;

    @Column(name = "rating")
    private String rating;

}
