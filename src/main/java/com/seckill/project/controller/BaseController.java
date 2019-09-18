package com.seckill.project.controller;

import com.seckill.project.error.BusinessException;
import com.seckill.project.error.EmBusinessError;
import com.seckill.project.response.CommonReturnType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class BaseController {

    public static final String CONTENT_TYPE_FORMED = "application/x-www-form-urlencoded";

//    // 定义 exceptionhandler 解决未被 controller 层吸收的 exception
//    @ExceptionHandler(Exception.class)
//    @ResponseStatus(HttpStatus.OK) // TODO 这个注解到底干啥的 不知道呀
//    @ResponseBody
//    public Object handlerException (HttpServletRequest request, Exception ex) {
//        Map<Object, Object> responseData = new HashMap<>();
//        if (ex instanceof BusinessException) {
//            // 接收预定义异常 后 解析异常 分辨异常种类
//            BusinessException businessException = (BusinessException) ex;
//            responseData.put("errCode", businessException.getErrorCode());
//            responseData.put("errMsg", businessException.getErrMsg());
//        } else {
//            // 未预定义异常
//            responseData.put("errCode", EmBusinessError.UNKNOWN_ERROR.getErrorCode());
//            responseData.put("errMsg", EmBusinessError.UNKNOWN_ERROR.getErrMsg());
//        }
//        return CommonReturnType.create(responseData, "fail");
//    }
}
