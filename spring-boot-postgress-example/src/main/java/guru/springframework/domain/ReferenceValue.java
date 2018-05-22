package guru.springframework.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "reference_value")
public class ReferenceValue implements java.io.Serializable {

    private static final long serialVersionUID = -425102971421444481L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "ref_type", referencedColumnName = "ref_type")
    private ReferenceType referenceType;

    @Column(name = "alt_sequence")
    private int alternateSequence;

    @Column(name = "key")
    private String key;

    @Column(name = "value")
    private String value;


    public ReferenceValue() {
    }

    public ReferenceValue(Long id, String key, String value, String description, ReferenceType referenceType,
            int alternateSequence) {
        super();
        this.id = id;
        this.description = description;
        this.referenceType = referenceType;
        this.alternateSequence = alternateSequence;
        this.key = key;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ReferenceType getReferenceType() {
        return referenceType;
    }

    public void setRefType(ReferenceType referenceType) {
        this.referenceType = referenceType;
    }

    public int getAlternateSequence() {
        return alternateSequence;
    }

    public void setAlternateSequence(int alternateSequence) {
        this.alternateSequence = alternateSequence;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
