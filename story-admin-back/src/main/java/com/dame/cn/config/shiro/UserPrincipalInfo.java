package com.dame.cn.config.shiro;

import com.dame.cn.config.jwt.JwtUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author LYQ
 * @description 必须指定 getId() 方法，目的就是为了告诉redis如何获取 key
 * @since 2020/4/22 16:56
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPrincipalInfo implements Serializable {

    private String token;

    public String getId(){
        return JwtUtil.parseJwt(this.token).getId();
    }

}
