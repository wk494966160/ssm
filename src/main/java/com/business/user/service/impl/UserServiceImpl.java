package com.business.user.service.impl;


import com.business.base.service.impl.BaseServiceImpl;
import com.business.user.mapper.UserMapper;
import com.business.user.entity.User;
import com.business.user.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(readOnly = true)
public class UserServiceImpl extends BaseServiceImpl<UserMapper,User> implements IUserService {
}
