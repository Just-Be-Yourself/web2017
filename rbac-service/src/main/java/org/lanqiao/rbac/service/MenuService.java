package org.lanqiao.rbac.service;

import org.lanqiao.rbac.repository.MenuMapper;
import org.lanqiao.rbac.entity.Menu;
import org.lanqiao.rbac.base.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by zhengwei on 2017/08/23.
 */
@Service
@Transactional(readOnly=true)
public class MenuService extends AbstractService<Menu> {
    // 因为泛型注入，所以这里不必声明mapper的依赖
}