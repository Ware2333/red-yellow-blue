package com.ryb.oauth.mapper;

import com.ryb.core.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 常坤
 */
@Mapper
@Repository
public interface UserMapper {
    /**
     * 校验用户
     *
     * @param user
     * @return
     */
    User authUser(User user);
}
