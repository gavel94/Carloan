package carloan.com.carloan.core;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import carloan.com.carloan.App;
import carloan.com.carloan.core.mvp.MvpView;
import carloan.com.carloan.core.mvp.Presenter;
import carloan.com.carloan.di.component.ActivityComponent;
import carloan.com.carloan.di.component.DaggerActivityComponent;
import carloan.com.carloan.di.moudle.ActivityModule;

/**
 * Created by jhhuang on 2016/12/13.
 * QQ:781913268
 * Description：Mvp + dragger2
 */
public abstract class MvpActivity<T extends Presenter> extends IRxActivity implements MvpView
{
    @Inject
    protected T mPresenter;
    protected AppCompatActivity mContext;

    @SuppressWarnings("unchecked")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        initInject();
        mContext = this;
        if (mPresenter != null)
        {
            mPresenter.attachView(this);
        }
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        mPresenter.detachView();
    }

    /**
     * dragger2注册
     */
    protected abstract void initInject();

    protected ActivityComponent getActivityComponent()
    {
        return DaggerActivityComponent.builder()
                .appComponent(App.getAppComponent())
                .activityModule(getActivityModule())
                .build();
    }

    protected ActivityModule getActivityModule()
    {
        return new ActivityModule(this);
    }
}