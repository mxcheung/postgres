package guru.springframework.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.domain.ReferenceType;
import guru.springframework.domain.ReferenceValue;

@Service
public class ReferenceDataServiceImpl implements ReferenceDataService {

    @Autowired
    private ReferenceDataRepository referenceDataRepository;



    @Autowired
    private ReferenceTypeRepository referenceTypeRepository;

    @Override
    public List<ReferenceValue> getAllReferenceData() {
        return referenceDataRepository.findAll();
    }
    @Override
    public ReferenceValue addOrUpdateReferenceValue(ReferenceValue referenceValue) {
        return referenceDataRepository.save(referenceValue);
    }
    @Override
    public List<ReferenceType> getAllReferenceTypes() {
        return referenceTypeRepository.findAll();
    }
    @Override
    public List<ReferenceValue> getReferenceDataByReferenceType(String refType) {
        return referenceDataRepository.findByReferenceTypeRefType(refType);
    }





    @Override
    public ReferenceValue getReferenceValue(List<ReferenceValue> referenceValueList, String refType, String key) {
        if (key == null) {
            return null;
        }
        ReferenceValue referenceValue = referenceValueList.stream()
                .filter(refValue -> refType.equals(refValue.getReferenceType().getRefType()))
                .filter(refValue -> key.equals(refValue.getKey())).findAny().orElse(null);
        return referenceValue;
    }


}