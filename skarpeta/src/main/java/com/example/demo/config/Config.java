package com.example.demo.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;

import java.util.List;

import static java.util.Collections.singletonList;

@Configuration
public class Config {
//    @Bean
//    public Docket swaggerApi(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .ignoredParameterTypes(UsernamePasswordAuthenticationToken.class)
//                .select()
//                .paths(PathSelector. regex("^(?!/(error).*$).*$"))
//                .build()
//                .securitySchemes(singletonList(createSchema()))
//                .securityContexts(singletonList(createContext()));
//    }
//
//    private SecurityContext createContext(){
//        return SecurityContext.builder()
//                .secutiryReferences(createRef())
//                .forPaths(PathSelectors.any())
//                .build();
//    }
//
//    private List<SecurityReference> createRef(){
//        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
//        authorizationScopes[0] = authorizationScope;
//        return singletonList(new SecurityReference("apiKey", authorizationScopes));
//    }
//
//    private SecurityScheme createSchema(){
//        return new ApiKey("apiKey", "Authorization", "header");
//    }
}
