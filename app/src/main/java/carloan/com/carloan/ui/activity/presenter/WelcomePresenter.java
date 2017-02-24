package carloan.com.carloan.ui.activity.presenter;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import carloan.com.carloan.core.mvp.ActivityPresenter;
import carloan.com.carloan.ui.activity.contract.WelcomeContract;
import carloan.com.carloan.ui.activity.moudle.WelcomeMoudle;
import rx.Observable;

/**
 * Created by jiahua on 17-2-24.
 * Description：
 */

public class WelcomePresenter extends ActivityPresenter<WelcomeContract.IView> implements WelcomeContract.IPresenter
{
    @Inject
    protected WelcomeMoudle mMoudle;

    @Inject
    public WelcomePresenter()
    {
    }

    @Override
    public void verifyLoginState()
    {
        Observable.timer(2, TimeUnit.SECONDS)
                .compose(callbackOnIOThread())
                .flatMap(aLong -> mMoudle.loadAllUserInfo())
                .map(userInfos -> userInfos.size() > 0)
                .compose(verifyOnMainThread())
                .subscribe(aBoolean -> {
                    if (aBoolean)
                    {
                        getMvpView().action2main();
                    } else
                    {
                        getMvpView().action2Login();
                    }
                }, onError);

    }
}
