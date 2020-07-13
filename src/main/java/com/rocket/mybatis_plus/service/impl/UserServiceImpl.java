package com.rocket.mybatis_plus.service.impl;

import com.rocket.mybatis_plus.entity.User;
import com.rocket.mybatis_plus.mapper.UserMapper;
import com.rocket.mybatis_plus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ZhangAo
 * @since 2020-07-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
