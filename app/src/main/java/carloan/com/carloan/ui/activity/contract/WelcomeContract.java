package carloan.com.carloan.ui.activity.contract;

import java.util.List;

import carloan.com.carloan.core.mvp.ActivityView;
import carloan.com.carloan.db.entity.UserInfo;
import rx.Observable;

/**
 * Created by jiahua on 17-2-24.
 * Description：
 */

public interface WelcomeContract
{
    interface IMoudle
    {
        Observable<List<UserInfo>> loadAllUserInfo();
    }

    interface IView extends ActivityView
    {
        void action2Login();

        void action2main();
    }

    interface IPresenter
    {
        void verifyLoginState();
    }
}
