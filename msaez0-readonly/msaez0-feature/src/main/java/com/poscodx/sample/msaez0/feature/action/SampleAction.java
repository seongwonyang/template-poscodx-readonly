forEach: Aggregate
path: {{boundedContext.nameCamelCase}}/{{boundedContext.nameCamelCase}}-feature/src/main/java/com/poscodx/sample/{{boundedContext.nameCamelCase}}/feature/action
fileName: {{namePascalCase}}Action.java
---
package com.poscodx.sample.{{boundedContext.nameCamelCase}}.feature.action;

import com.poscodx.sample.{{boundedContext.nameCamelCase}}.store.domain.logic.{{namePascalCase}}Logic;
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
public class SampleAction {
    private final MessageSource messageSource;
    private final {{namePascalCase}}Logic logic;
    
    /* 
    // TODO : Biz Logic 구현 
    // 1. 필요한 컴포넌트 선언 
    private final SomeComponent someComponent; 
    private final SomeLogic someLogic; 

    // 2. 필요한 메소드 정의 및 구현 
    public void someMethod() { 
        someComponent.someMethod(); 
        someLogic.someMethod(); 
        logic.someMethod(); 
    } 
    public String someMessageTest(Locale locale, String ... args) { 
        return messageSource.getMessage("SOME_MESSAGE_ID", args, locale);
    } 
    */ 

}
