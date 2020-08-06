package com.programem.Nanoblog;

public class Lista {
    
    String listaMensagem(Iterable<Mensagem> lista){
        String html = "";

        for(Mensagem m : lista){
            html = html +
            "<h1>"+m.getTitulo()+"</h1>"+
             m.getMensagem()+"<br>"+
            "<br>"
            ;
        }
        return html;
    }


}