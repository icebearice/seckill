package com.seckill.project.error;

// 包装器业务异常类实现 其实就是接收 异常后 将异常进行包装 统一返回
// 所以说 穿进来的 CommonError 一定得是 事先写好的异常类型
// 这里只起到包装的作用 所有的异常会到这里进行包装处理 EMBusinessError 就是个枚举类型
public class BusinessException extends Exception implements CommonError {

    private CommonError commonError;

    // 直接接受 EmBusinessError的传参用于构造业务异常
    public BusinessException(CommonError commonError) {
        super();
        this.commonError = commonError;
    }

    // 接收自定义 errMsg 的方式构造业务异常
    public BusinessException(CommonError commonError, String errMsg) {
        super();
        this.commonError = commonError;
        this.commonError.setErrMsg(errMsg);
    }

    @Override
    public int getErrorCode() {
        return this.commonError.getErrorCode();
    }

    @Override
    public String getErrMsg() {
        return this.commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }
}
