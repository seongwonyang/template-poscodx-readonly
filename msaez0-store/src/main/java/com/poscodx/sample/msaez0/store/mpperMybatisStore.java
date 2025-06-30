forEach: BoundedContext
path: {{nameCamelCase}}/{{nameCamelCase}}-store/src/main/java/com/poscodx/sample/{{nameCamelCase}}/store
fileName: {{namePascalCase}}MybatisStore.java
---
package com.poscodx.sample.{{nameCamelCase}}.store;

import java.util.List;
import java.util.Map;


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
public interface mpperMybatisStore {

    List<Map> findById(Map params);
}
