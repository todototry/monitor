package com.ray.monitor.core.repository;

import com.ray.monitor.model.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rui on 2018/8/12.
 */
public interface UserInfoRepository extends CrudRepository<UserInfo, Long> {
    /** 通过username查找用户信息 **/
    UserInfo findByUsername(String username);

    UserInfo save (UserInfo userInfo);

}
