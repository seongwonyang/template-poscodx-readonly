forEach: BoundedContext
path: {{nameCamelCase}}/{{nameCamelCase}}-facade/src/main/java/com/poscodx/sample/{{nameCamelCase}}/facade/rest/exception
fileName: ReadonlyExceptionHandler.java
---
package com.poscodx.sample.{{nameCamelCase}}.facade.rest.exception;

import com.poscodx.base.share.domain.errorobjects.PosBaseException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


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
@ControllerAdvice
public class ReadonlyExceptionHandler {

    private void logException(Exception e) {
        log.error(e.getMessage(), e);
    }

    @ExceptionHandler(PosBaseException.class)
    public ResponseEntity<String> handlePosBaseException(PosBaseException exception) {
        log.debug("=====handlePosBaseException=====");
        this.logException(exception);
        ResponseEntity retVal = ResponseEntity.status(exception.getCode()).body(exception.getMessage());
        return retVal;
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException exception) {
        log.debug("=====handleRuntimeException=====");
        this.logException(exception);
        PosBaseException e = new PosBaseException(exception);
        ResponseEntity retVal = ResponseEntity.status(e.getCode()).body(e.getMessage());
        return retVal;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception exception) {
        log.debug("=====handleException=====");
        this.logException(exception);
        PosBaseException e = new PosBaseException(exception);
        ResponseEntity retVal = ResponseEntity.status(e.getCode()).body(e.getMessage());
        return retVal;
    }
}
