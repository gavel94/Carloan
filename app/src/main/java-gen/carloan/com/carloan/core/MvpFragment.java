package carloan.com.carloan.core;

import android.content.Context;
import android.os.Bundle;

import javax.inject.Inject;

import carloan.com.carloan.App;
import carloan.com.carloan.core.mvp.MvpView;
import carloan.com.carloan.core.mvp.Presenter;
import carloan.com.carloan.di.component.DaggerFragmentComponent;
import carloan.com.carloan.di.component.FragmentComponent;
import carloan.com.carloan.di.moudle.FragmentModule;

/**
 * Created by jhhuang on 2016/12/13.
 * QQ:781913268
 * Description：Mvp+dragger2
 */
public abstract class MvpFragment <T extends Presenter> extends IRxFragment implements MvpView
{
    protected Context mContext;
    @Inject
    protected T mPresenter;

    @Override
    public void onAttach(Context context)
    {
        mContext = context;
        super.onAttach(context);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        initInject();
        mPresenter.attachView(this);
    }

    protected FragmentComponent getFragmentComponent(){
        return DaggerFragmentComponent.builder()
                .appComponent(App.getAppComponent())
                .fragmentModule(getFragmentModule())
                .build();
    }

    protected FragmentModule getFragmentModule(){
        return new FragmentModule(this);
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        mPresenter.detachView();
    }

    protected abstract void initInject();
}