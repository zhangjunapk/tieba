package org.zj.tieba.service;

import org.zj.tieba.bean.User;

public interface IUserService {

    User getUserById(int id);

    /**
     * 添加用户
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     * 删除指定的用户
     * @param id
     * @return
     */
    boolean deleteUser(int id);

    /**
     * 更新指定id的用户资料
     * @param user
     * @return
     */
    boolean modifyUser(User user);

    /**
     * 更新指定用户的权限
     * @param id
     * @param permission
     * @return
     */
    boolean setPermission(int id,String permission);

    /**
     * check
     * @param user
     * @return
     */
    User checkUser(User user);
}
