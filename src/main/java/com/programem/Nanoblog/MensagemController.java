package com.programem.Nanoblog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
    
@Controller
@RequestMapping("/nanoblog")
public class MensagemController {

    @Autowired
    private MensagemRepository mensagemRepository;

    
    private Lista lista = new Lista();

    @GetMapping("/")
    public String mensagem(){
      return "Mensagem";
    }

    @PostMapping(path="/insere") // Map ONLY POST Requests
    public @ResponseBody String addNewMensagem (
         @RequestParam String titulo
        ,@RequestParam String mensagem
        ) {

            Mensagem m = new Mensagem();

            m.setTitulo(titulo);
            m.setMensagem(mensagem);

            mensagemRepository.save(m);

            return titulo+" "+mensagem;
    }

    @GetMapping(path="/lista")
    public @ResponseBody String getAllMensagem() {
   return lista.listaMensagem(mensagemRepository.findAll());
  }
}