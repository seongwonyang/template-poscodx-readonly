forEach: Aggregate
path: {{boundedContext.nameCamelCase}}/{{boundedContext.nameCamelCase}}-store/src/main/java/com/poscodx/sample/{{boundedContext.nameCamelCase}}/store/postgresql/mapper
fileName: {{namePascalCase}}Mapper.java
---
package com.poscodx.sample.{{boundedContext.nameCamelCase}}.store.postgresql.mapper;

import java.util.Map;
import com.poscodx.sample.{{boundedContext.nameCamelCase}}.store.domain.entity.Sample;
import org.apache.ibatis.annotations.Mapper;


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
@Mapper
public interface {{namePascalCase}}Mapper {

    {{namePascalCase}} getInfo();

    Map getInfoMap();
}
