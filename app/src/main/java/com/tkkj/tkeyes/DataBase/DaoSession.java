package com.tkkj.tkeyes.DataBase;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.tkkj.tkeyes.model.User;
import com.tkkj.tkeyes.model.FramModel;
import com.tkkj.tkeyes.Entity.UserEntity;
import com.tkkj.tkeyes.Entity.RegisterEntity;

import com.tkkj.tkeyes.DataBase.UserDao;
import com.tkkj.tkeyes.DataBase.FramModelDao;
import com.tkkj.tkeyes.DataBase.UserEntityDao;
import com.tkkj.tkeyes.DataBase.RegisterEntityDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig userDaoConfig;
    private final DaoConfig framModelDaoConfig;
    private final DaoConfig userEntityDaoConfig;
    private final DaoConfig registerEntityDaoConfig;

    private final UserDao userDao;
    private final FramModelDao framModelDao;
    private final UserEntityDao userEntityDao;
    private final RegisterEntityDao registerEntityDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        userDaoConfig = daoConfigMap.get(UserDao.class).clone();
        userDaoConfig.initIdentityScope(type);

        framModelDaoConfig = daoConfigMap.get(FramModelDao.class).clone();
        framModelDaoConfig.initIdentityScope(type);

        userEntityDaoConfig = daoConfigMap.get(UserEntityDao.class).clone();
        userEntityDaoConfig.initIdentityScope(type);

        registerEntityDaoConfig = daoConfigMap.get(RegisterEntityDao.class).clone();
        registerEntityDaoConfig.initIdentityScope(type);

        userDao = new UserDao(userDaoConfig, this);
        framModelDao = new FramModelDao(framModelDaoConfig, this);
        userEntityDao = new UserEntityDao(userEntityDaoConfig, this);
        registerEntityDao = new RegisterEntityDao(registerEntityDaoConfig, this);

        registerDao(User.class, userDao);
        registerDao(FramModel.class, framModelDao);
        registerDao(UserEntity.class, userEntityDao);
        registerDao(RegisterEntity.class, registerEntityDao);
    }
    
    public void clear() {
        userDaoConfig.clearIdentityScope();
        framModelDaoConfig.clearIdentityScope();
        userEntityDaoConfig.clearIdentityScope();
        registerEntityDaoConfig.clearIdentityScope();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public FramModelDao getFramModelDao() {
        return framModelDao;
    }

    public UserEntityDao getUserEntityDao() {
        return userEntityDao;
    }

    public RegisterEntityDao getRegisterEntityDao() {
        return registerEntityDao;
    }

}
