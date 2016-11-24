package com.amoedoamorim.javarestboiler.model;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.hibernate.metamodel.ValidationException;

public interface Entity {

    @JsonProperty(value = "id")
    public Long getId();

    public void setId(Long id);

    @JsonIgnore
    public void validate() throws ValidationException;
}
