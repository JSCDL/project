package com.example.mybackend.demo.entity.Resp;

/*import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;*/
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
/*@ApiModel(description = "通用返回对象")*/
public class RestBean<T> {
    /*@ApiModelProperty(value = "状态码")*/
    int code;
    String reason;

    T data;

    public RestBean(int code, String reason) {
        this.reason = reason;
        this.code = code;
    }

    public RestBean(String reason, int code, T data) {
        this.reason = reason;
        this.code = code;
        this.data = data;
    }
}
