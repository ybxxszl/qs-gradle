package com.wjy.author.service.impl;

import com.wjy.author.entity.Author;
import com.wjy.author.mapper.AuthorMapper;
import com.wjy.author.service.IAuthorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ybxxszl
 * @since 2019-02-17
 */
@Service
public class AuthorServiceImpl extends ServiceImpl<AuthorMapper, Author> implements IAuthorService {

}
