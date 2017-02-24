package carloan.com.carloan.db.impl;

import java.util.List;

import javax.inject.Inject;

import carloan.com.carloan.db.entity.UserInfo;
import carloan.com.carloan.db.generated.DaoSession;
import carloan.com.carloan.db.generated.UserInfoDao;
import rx.Observable;

/**
 * Created by jiahua on 17-2-24.
 * Description：
 */

public class UserInfoDaoImpl
{
    private UserInfoDao mDao;

    @Inject
    public UserInfoDaoImpl(DaoSession session)
    {
        mDao = session.getUserInfoDao();
    }

    public Observable<List<UserInfo>> loadAll_rx()
    {
        return mDao.rx().loadAll();
    }
}
