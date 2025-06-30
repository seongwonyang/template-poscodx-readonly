forEach: Aggregate
path: {{boundedContext.nameCamelCase}}/{{boundedContext.nameCamelCase}}-facade/src/main/java/com/poscodx/sample/{{boundedContext.nameCamelCase}}/facade/rest/store
fileName: {{namePascalCase}}Resource.java
---
package com.poscodx.sample.{{boundedContext.nameCamelCase}}.facade.rest.store;

import java.util.Map;
import com.poscodx.sample.{{boundedContext.nameCamelCase}}.store.domain.entity.{{namePascalCase}};
import com.poscodx.sample.{{boundedContext.nameCamelCase}}.store.domain.logic.{{namePascalCase}}Logic;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/{{nameCamelCase}}")
public class {{namePascalCase}}Resource {
    private final {{namePascalCase}}Logic logic;

    @GetMapping(path = "/getInfo")
    public {{namePascalCase}} getInfo() {
        return logic.getInfo();
    }

    @GetMapping(path = "/getInfoMap")
    public Map getInfoMap() {
        return logic.getInfoMap();
    }
}
