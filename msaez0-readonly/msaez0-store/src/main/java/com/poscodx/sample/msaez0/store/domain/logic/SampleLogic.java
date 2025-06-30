forEach: Aggregate
path: {{boundedContext.nameCamelCase}}/{{boundedContext.nameCamelCase}}-store/src/main/java/com/poscodx/sample/{{boundedContext.nameCamelCase}}/store/domain/logic
fileName: {{namePascalCase}}Logic.java
---
package com.poscodx.sample.{{boundedContext.nameCamelCase}}.store.domain.logic;

import java.util.Map;
import com.poscodx.sample.{{boundedContext.nameCamelCase}}.store.SampleMybatisStore;
import com.poscodx.sample.{{boundedContext.nameCamelCase}}.store.domain.entity.Sample;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


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
@Service
public class {{namePascalCase}}Logic {
    private final {{namePascalCase}}MybatisStore store;

    public {{namePascalCase}} getInfo() {
        return store.getInfo();
    }

    public Map getInfoMap() {
        return store.getInfoMap();
    }
}
