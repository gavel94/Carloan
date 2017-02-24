package carloan.com.carloan.ui.activity;

import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;

import carloan.com.carloan.R;
import carloan.com.carloan.core.BaseActivity;
import carloan.com.carloan.databinding.ActivityLoginBinding;
import carloan.com.carloan.ui.activity.contract.LoginContract;
import carloan.com.carloan.ui.activity.presenter.LoginPresenter;

/**
 * Created by jiahua on 17-2-24.
 * Description：
 */

public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.IView
{
    private ActivityLoginBinding mBinding;

    @Override
    protected View loadContentView()
    {
        mBinding = DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.activity_login, null, false);
        return mBinding.getRoot();
    }

    @Override
    protected void initInject()
    {
        getActivityComponent().inject(this);
    }
}
