package com.stars.usercenter.common;

/**
 * @Description: 枚举异常错误
 * @Author: Stars
 * @Create: 2023-03-24     7:43
 */

public enum ErrorCode {
    /**
     * 成功
     */
    SUCCESS(0,"ok",""),
    /**
     * 请求参数错误
     */
    PARAMS_ERROR(40000,"请求参数错误",""),
    /**
     * 请求数据为空
     */
    NULL_ERROR(40001,"请求数据为空",""),
    /**
     * 未登录
     */
    NOT_LOGIN(40100,"未登录",""),
    /**
     * 无权限
     */
    NO_AUTH(40101,"无权限",""),
    /**
     * 系统内部异常
     */
    SYSTEM_ERROR(50000,"系统内部异常","");

    /**
     * 状态码
     */
    private final  int code;
    /**
     * 状态码信息
     */
    private final String message;
    /**
     * 状态码描述(详情)
     */
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }

}
