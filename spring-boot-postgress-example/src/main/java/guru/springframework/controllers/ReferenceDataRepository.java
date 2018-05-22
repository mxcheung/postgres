package guru.springframework.controllers;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import guru.springframework.domain.ReferenceValue;

@Repository
public interface ReferenceDataRepository extends JpaRepository<ReferenceValue, Long> {

    List<ReferenceValue> findByReferenceTypeRefType(String referenceType);

    ReferenceValue findByKeyAndReferenceType_refType(String key, String refType);
}
