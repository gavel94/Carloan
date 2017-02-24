package carloan.com.carloan.ui.activity.presenter;


import javax.inject.Inject;

import carloan.com.carloan.core.mvp.ActivityPresenter;
import carloan.com.carloan.ui.activity.moudle.MainMoudle;
import carloan.com.carloan.ui.activity.contract.MainContract;

/**
 * Created by jhhuang on 2016/12/13.
 * QQ:781913268
 * Description：MainPresenter
 */
public class MainPresenter extends ActivityPresenter<MainContract.IView> implements MainContract.IPresenter
{
    @Inject
    protected MainMoudle mMoudle;

    @Inject
    public MainPresenter()
    {
    }

}