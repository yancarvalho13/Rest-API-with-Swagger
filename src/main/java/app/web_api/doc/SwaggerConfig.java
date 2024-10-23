package app.web_api.doc;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("web-api")
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    public io.swagger.v3.oas.models.OpenAPI customOpenAPI() {
        return new io.swagger.v3.oas.models.OpenAPI()
                .info(new Info().title("ESTUDO DE UMA REST API")
                        .description("Exemplo de uso de um Spring REST API com SWAGGER")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Seu Nome")
                                .url("http://www.seusite.com.br")
                                .email("voce@seusite.com.br")));
    }
}
