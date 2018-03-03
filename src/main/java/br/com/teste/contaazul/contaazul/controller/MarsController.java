package br.com.teste.contaazul.contaazul.controller;

import br.com.teste.contaazul.contaazul.service.MarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MarsController {

    @Autowired
    private MarsService marsService;

    @GetMapping("/mars/{comando}")
    public String mars(@PathVariable String comando) {
        return  marsService.executaComando(comando);

    }

}
