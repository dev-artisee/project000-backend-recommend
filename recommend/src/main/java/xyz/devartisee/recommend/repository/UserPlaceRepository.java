package xyz.devartisee.recommend.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import xyz.devartisee.recommend.entity.UserPlace;
import xyz.devartisee.recommend.service.dto.response.GetUserPlaceResponse;

public interface UserPlaceRepository extends JpaRepository<UserPlace, Long> {

    @Override
    <S extends UserPlace> S save(S entity);

    Page<UserPlace> findAll(Pageable pageable);

//    @Query(value = "SELECT r.id as id, r.user_id as userId, r.reg_date as regDate " +
//            "FROM user_place r" +
//            "         LEFT JOIN place p ON r.place_id = p.id"
//            , nativeQuery = true)
@Query(value =
        "SELECT r.id as id, r.user_id as user_id, p.id as place_id, r.reg_date as reg_date " +
        "FROM user_place r " +
        "         LEFT JOIN place p ON r.place_id = p.id " +
        "WHERE r.user_id = :userId "
        , nativeQuery = true)
    Page<UserPlace> findAllByUserId(@Param("userId") Integer usreId, Pageable pageable);

}
