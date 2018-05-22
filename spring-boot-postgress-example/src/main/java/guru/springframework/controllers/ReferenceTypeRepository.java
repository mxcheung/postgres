package guru.springframework.controllers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import guru.springframework.domain.ReferenceType;

@Repository
public interface ReferenceTypeRepository extends JpaRepository<ReferenceType, Long> {

    ReferenceType findByRefType(String refType);
}
