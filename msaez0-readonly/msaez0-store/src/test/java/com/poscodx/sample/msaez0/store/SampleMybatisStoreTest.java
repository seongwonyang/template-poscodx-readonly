forEach: Aggregate
path: {{boundedContext.nameCamelCase}}/{{boundedContext.nameCamelCase}}-store/src/test/java/com/poscodx/sample/{{boundedContext.nameCamelCase}}/store
fileName: SampleMybatisStoreTest.java
---
package com.poscodx.sample.{{boundedContext.nameCamelCase}}.store;

import java.util.Map;
import com.poscodx.base.share.util.json.JsonUtil;
import com.poscodx.sample.{{boundedContext.nameCamelCase}}.store.SampleMybatisStore;
import com.poscodx.sample.{{boundedContext.nameCamelCase}}.store.domain.entity.Sample;
import com.poscodx.sample.{{boundedContext.nameCamelCase}}.store.postgresql.SamplePostgresqlMybatisStore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


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
@EnableAutoConfiguration
@SpringBootTest(classes = {
    ApplicationContext.class,
    {{namePascalCase}}PostgresqlMybatisStore.class
})
public class {{namePascalCase}}MybatisStoreTest {
    @Autowired
    private {{namePascalCase}}MybatisStore store;

    @Test
    public void getInfo() {
        {{namePascalCase}} entity = this.store.getInfo();
        String entityJson = JsonUtil.toJson(entity);
        System.out.println(entityJson);
        Map map = this.store.getInfoMap();
        String mapJson = JsonUtil.toJson(map);
        System.out.println(mapJson);
    }
}
