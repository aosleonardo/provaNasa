package br.com.teste.contaazul.contaazul.controller;

import br.com.teste.contaazul.contaazul.service.MarsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
@Api(value="Mars", description="Controle do robõ Mars")
public class MarsController {

    @Autowired
    private MarsService marsService;

    @GetMapping("/mars/{comando}")
    @ApiOperation(value = "Envia comandos para o Mars", notes = "Envia comandos para a locomoção do Mars e obtem como resposta sua posição em Marte.")
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Bad Request")})
    public String mars(@PathVariable String comando) {
        return  marsService.executaComando(comando);

    }

}
