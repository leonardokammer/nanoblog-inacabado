package com.programem.Nanoblog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity /** indica que o Banco de Dados deve criar uma tabela para esse objeto */
public class Mensagem {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    String titulo;

    String mensagem;


    public void setId(Integer id){
        this.id = id;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }

    public Integer getId(){
        return this.id;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getMensagem(){
        return this.mensagem;
    }

}