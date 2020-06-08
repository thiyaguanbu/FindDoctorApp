package com.perfm.finddoctorapp.web


import springfox.documentation.builders.PathSelectors.regex

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2


@Configuration
@EnableSwagger2
class SwaggerConfiguration {

    @Bean
    open fun api(): Docket = Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.perfm.finddoctorapp"))
            .paths(regex("/api/doctor.*"))
            .build()
            .apiInfo(metaInfoMethod())

    private fun metaInfoMethod(): ApiInfo? {
        return ApiInfoBuilder()
            .title("Find a Doctor App")
            .description("This is a Simple Spring Boot application with Mongodb and Apache kafka using Kotlin\"")
            .version("1.0.1")
            .license("Apache License Version 2.0")
            .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
            .contact(Contact("Anbu", "http://localhost:8086/", "ttt@gmail.com"))
            .build()
}
}