package xyz.devartisee.recommend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.devartisee.recommend.entity.UserAddress;

import java.util.List;

public interface UserAddressRepository extends JpaRepository<UserAddress, Long> {

    @Override
    <S extends UserAddress> S save(S entity);
    List<UserAddress> findUserAddressByUserId(Long userId);


}
