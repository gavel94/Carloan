package carloan.com.carloan.ui.activity.presenter;


import javax.inject.Inject;

import carloan.com.carloan.core.mvp.ActivityPresenter;
import carloan.com.carloan.ui.activity.contract.LoginContract;

/**
 * Created by jhhuang on 2016/12/13.
 * QQ:781913268
 * Description：MainPresenter
 */
public class LoginPresenter extends ActivityPresenter<LoginContract.IView> implements LoginContract.IPresenter
{

    @Inject
    public LoginPresenter()
    {
    }

}