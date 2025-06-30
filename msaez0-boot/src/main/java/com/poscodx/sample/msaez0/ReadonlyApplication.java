forEach: BoundedContext
path: {{nameCamelCase}}/{{nameCamelCase}}-boot/src/main/java/com/posco/sample/{{nameCamelCase}}
fileName: ReadonlyApplication.java
---
package com.poscodx.sample.{{nameCamelCase}};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Auto generated class
 * 
 * 자동생성 프로그램 버전 : 1.0.0
 * 생성일시 :  2025-06-25 09:52:57.176
 * @FileName : 클래스에 대한 한글 명칭
 * Change history
 * @수정날짜;SCR_NO;수정자;수정내용
 * @2025-06-25 09:52:57.176;00000;홍길동;최초생성
 * 
 */
@SpringBootApplication
@EntityScan(basePackages = {
    "com.poscodx.sample.{{nameCamelCase}}",
    "com.poscodx.reuse.common.util.kafka.db"
})
@EnableJpaRepositories(basePackages = {
    "com.poscodx.sample.{{nameCamelCase}}",
    "com.poscodx.reuse.common.util.kafka.db"
})
@RestController
public class ReadonlyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadonlyApplication.class, args);
    }

    @GetMapping(path = "/health")
    public String health() {
        return "ok";
    }
}
