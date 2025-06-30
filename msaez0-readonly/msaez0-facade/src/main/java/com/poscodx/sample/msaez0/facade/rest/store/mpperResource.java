forEach: BoundedContext
path: {{nameCamelCase}}/{{nameCamelCase}}-facade/src/main/java/com/poscodx/sample/{{nameCamelCase}}/facade/rest/store
fileName: mpperResource.java
---
package com.poscodx.sample.{{nameCamelCase}}.facade.rest.store;

import java.util.List;
import java.util.Map;
import com.poscodx.sample.{{nameCamelCase}}.store.domain.logic.mpperLogic;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping(path = "/mpper")
public class mpperResource {
    private final mpperLogic logic;

    @PostMapping(path = "/findById")
    public List<Map> findById(@RequestBody Map params) {
        return logic.findById(params);
    }
}
