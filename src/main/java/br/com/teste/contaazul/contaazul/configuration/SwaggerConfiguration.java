package br.com.teste.contaazul.contaazul.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket commercialPlaceApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("nasa")
                .select()
                .paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("br.com.teste.contaazul.contaazul.controller"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "Prova Conta Azul",
                "API para Nasa",
                "V1.0.0",
                "",
                "License of API",
                "Termos de serviço",
                "API license URL");
        return apiInfo;
    }
}
