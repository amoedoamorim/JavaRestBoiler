package com.amoedoamorim.javarestboiler.model;

import java.util.Calendar;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

@JsonDeserialize(as = ContatoImpl.class)
public interface Contato extends Entity {

    @JsonProperty(value = "nome")
    public String getNome();

    public void setNome(final String nome);
    
    @JsonProperty(value = "email")
    public String getEmail();

    public void setEmail(final String email);
    
    @JsonProperty(value = "endereco")
    public String getEndereco();

    public void setEndereco(final String endereco);
    
    @JsonProperty(value = "dataNascimento")
    public Calendar getDataNascimento();

    public void setDataNascimento(final Calendar dataNascimento);
}
