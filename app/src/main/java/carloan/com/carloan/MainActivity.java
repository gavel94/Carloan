package carloan.com.carloan;


import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;

import carloan.com.carloan.core.BaseActivity;
import carloan.com.carloan.databinding.ActivityMainBinding;
import carloan.com.carloan.ui.activity.contract.MainContract;
import carloan.com.carloan.ui.activity.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.IView
{
    private ActivityMainBinding mBinding;
    @Override
    protected View loadContentView()
    {
        mBinding = DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.activity_main, null, false);
        return mBinding.getRoot();
    }

    @Override
    protected void initInject()
    {
        getActivityComponent().inject(this);
    }
}
