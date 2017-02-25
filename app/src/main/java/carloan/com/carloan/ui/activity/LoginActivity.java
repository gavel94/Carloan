package carloan.com.carloan.ui.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.CountDownTimer;
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
{/**
     * 点击防抖动  单位毫秒
     */
    public static final int TIME_THROTTLE = 2000;
    /**
     * text改变响应 单位毫秒
     */
    public static final int TIME_DEBOUNCE = 500;
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

    @Override
    protected void initViews(Bundle savedInstanceState)
    {
        super.initViews(savedInstanceState);
        mBinding.toolbar.inflateMenu(R.menu.login_menu);
    }

    @Override
    protected void initData()
    {
        super.initData();
    }

    @Override
    protected void initEvents()
    {
        super.initEvents();
    }

    class TimeCount extends CountDownTimer
    {
        public TimeCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);//参数依次为总时长,和计时的时间间隔
        }

        @Override
        public void onFinish() {//计时完毕时触发
            mBinding.btSendCode.setText("重新发送");
            mBinding.btSendCode.setClickable(true);
            mBinding.btSendCode.setBackgroundResource(R.drawable.send_code_bg);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            //计时过程显示
            mBinding.btSendCode.setClickable(false);
            mBinding.btSendCode.setBackgroundResource(R.drawable.gray_bg);
            mBinding.btSendCode.setText(millisUntilFinished / 1000 + "秒");
        }
    }


}
