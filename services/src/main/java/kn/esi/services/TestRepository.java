package kn.esi.services;

import kn.esi.model.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Thariq
 * @created 31-03-2022
 **/

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Integer> {
    Optional<TestEntity> findById(Integer id);
}
