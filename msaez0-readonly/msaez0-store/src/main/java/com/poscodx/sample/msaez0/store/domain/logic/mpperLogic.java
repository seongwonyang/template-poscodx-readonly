forEach: BoundedContext
path: {{nameCamelCase}}/{{nameCamelCase}}-store/src/main/java/com/poscodx/sample/{{nameCamelCase}}/store/domain/logic
fileName: {{namePascalCase}}Logic.java
---
package com.poscodx.sample.{{nameCamelCase}}.store.domain.logic;

import java.util.List;
import java.util.Map;
import com.poscodx.sample.{{nameCamelCase}}.store.mpperMybatisStore;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
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
public class mpperLogic {
    private final MessageSource messageSource;
    private final mpperMybatisStore store;

    public List<Map> findById(Map params) {
        return store.findById(params);
    }
}
