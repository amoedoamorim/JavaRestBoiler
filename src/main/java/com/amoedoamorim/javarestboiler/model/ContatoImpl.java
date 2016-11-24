package com.amoedoamorim.javarestboiler.model;

import java.util.Calendar;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "contatos")
public class ContatoImpl extends EntityImpl implements Contato {

    private String nome; 
    private String email;    
    private String endereco;  
    private Calendar dataNascimento;

    public ContatoImpl() {
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(final String name) {
        this.nome = name.trim();
    }
    
    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setEmail(final String email) {
        this.email = email.trim();
    }
    
    @Override
    public String getEndereco() {
        return this.endereco;
    }

    @Override
    public void setEndereco(final String endereco) {
        this.endereco = endereco.trim();
    }

    @Override
    public Calendar getDataNascimento() {
        return this.dataNascimento;
    }

    @Override
    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
