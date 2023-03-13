package com.keven.campus.service;

import com.keven.campus.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author 周鑫杰
 * @description 针对表【t_campus_user(用户表)】的数据库操作Service
 * @createDate 2023-01-18 17:27:53
 */
public interface UserService extends IService<User> {

    User getInfo(Long userId);
}
