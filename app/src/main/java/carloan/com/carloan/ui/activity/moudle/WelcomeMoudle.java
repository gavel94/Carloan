package carloan.com.carloan.ui.activity.moudle;

import java.util.List;

import javax.inject.Inject;

import carloan.com.carloan.db.entity.UserInfo;
import carloan.com.carloan.db.impl.UserInfoDaoImpl;
import carloan.com.carloan.ui.activity.contract.WelcomeContract;
import rx.Observable;

/**
 * Created by jiahua on 17-2-24.
 * Description：
 */

public class    WelcomeMoudle implements WelcomeContract.IMoudle
{
    private UserInfoDaoImpl mUserInfoDao;

    @Inject
    public WelcomeMoudle(UserInfoDaoImpl userInfoDao)
    {
        this.mUserInfoDao = userInfoDao;
    }

    @Override
    public Observable<List<UserInfo>> loadAllUserInfo()
    {
        return mUserInfoDao.loadAll_rx();
    }
}
