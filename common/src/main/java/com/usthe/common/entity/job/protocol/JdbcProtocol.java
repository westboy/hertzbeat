package com.usthe.common.entity.job.protocol;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 公共的jdbc规范实现的数据库配置信息
 *
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JdbcProtocol {
    /**
     * 对端主机ip或域名
     */
    private String host;
    /**
     * 端口号
     */
    private Integer port;
    /**
     * 数据库用户名(可选)
     */
    private String username;
    /**
     * 数据库密码(可选)
     */
    private String password;
    /**
     * 数据库链接url eg: jdbc:mysql://localhost:3306
     */
    private String url;
}