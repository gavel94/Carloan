package carloan.com.carloan.ui.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;

import carloan.com.carloan.MainActivity;
import carloan.com.carloan.R;
import carloan.com.carloan.core.BaseActivity;
import carloan.com.carloan.databinding.ActivityWelcomeBinding;
import carloan.com.carloan.ui.activity.contract.WelcomeContract;
import carloan.com.carloan.ui.activity.presenter.WelcomePresenter;

/**
 * Created by jiahua on 17-2-24.
 * Description：
 */

public class WelcomeActivity extends BaseActivity<WelcomePresenter> implements WelcomeContract.IView
{
    private ActivityWelcomeBinding mBinding;

    @Override
    protected View loadContentView()
    {
        mBinding = DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.activity_welcome, null, false);
        return mBinding.getRoot();
    }

    @Override
    protected void initInject()
    {
        getActivityComponent().inject(this);
    }

    @Override
    protected void initData()
    {
        super.initData();
        mPresenter.verifyLoginState();
    }

    @Override
    public void action2Login()
    {
        startActivity(new Intent(mContext, LoginActivity.class));
        finish();
    }

    @Override
    public void action2main()
    {
        startActivity(new Intent(mContext, MainActivity.class));
        finish();
    }
}
