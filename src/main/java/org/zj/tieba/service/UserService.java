package org.zj.tieba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zj.tieba.bean.User;
import org.zj.tieba.dao.IDeleteDao;
import org.zj.tieba.dao.IInsertDao;
import org.zj.tieba.dao.IQueryDao;
import org.zj.tieba.dao.IUpdateDao;

@Service
public class UserService implements IUserService {

    @Autowired
    IQueryDao queryDao;

    @Autowired
    IDeleteDao deleteDao;

    @Autowired
    IInsertDao insertDao;

    @Autowired
    IUpdateDao updateDao;


    @Override
    public User getUserById(int id) {
        return queryDao.selectUserById(id);
    }

    @Override
    public boolean addUser(User user) {
        return insertDao.insertUser(user);
    }

    @Override
    public boolean deleteUser(int id) {
        return deleteDao.deleteUser(id);
    }

    @Override
    public boolean modifyUser(User user) {
        return updateDao.updateUser(user);
    }

    @Override
    public boolean setPermission(int id, String permission) {
        return updateDao.updateUserPermission(id,permission);
    }

    @Override
    public User checkUser(User user) {
        return null;
    }


}
