package guru.springframework.controllers;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import guru.springframework.domain.ReferenceType;
import 	guru.springframework.domain.ReferenceValue;


/**
 * Service for fetching / modifying reference data.
 */
public interface ReferenceDataService {

    List<ReferenceValue> getAllReferenceData();

    List<ReferenceValue> getReferenceDataByReferenceType(String refType);


    ReferenceValue getReferenceValue(List<ReferenceValue> referenceValueList, String refType, String key);


    List<ReferenceType> getAllReferenceTypes();

    ReferenceValue addOrUpdateReferenceValue(ReferenceValue referenceValue);
}
