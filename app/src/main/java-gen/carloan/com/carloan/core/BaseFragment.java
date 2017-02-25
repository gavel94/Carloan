package carloan.com.carloan.core;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import carloan.com.carloan.core.mvp.FragmentPresenter;
import carloan.com.carloan.core.mvp.FragmentView;

/**
 * Created by jhhuang on 2017/2/22.
 * QQ:781913268
 * Description：BaseFragment
 */
public abstract class BaseFragment<T extends FragmentPresenter> extends MvpFragment<T> implements FragmentView
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        return loadContentView(inflater, container, savedInstanceState);
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState)
    {
        super.onLazyInitView(savedInstanceState);
        initViews(savedInstanceState);
        initData();
        initEvent();
    }

    @Override
    public void hideLoading()
    {
        try
        {
            ((BaseActivity) mContext).hideLoading();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void showLoading()
    {
        try
        {
            ((BaseActivity) mContext).showLoading();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void showLoading(String msg)
    {
        try
        {
            ((BaseActivity) mContext).showLoading(msg);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void toast(String msg)
    {
        ((BaseActivity) mContext).toast(msg);
    }

    @Override
    public void toast(int resId)
    {
        ((BaseActivity) mContext).toast(resId);
    }

    /**
     * 加载视图
     */
    protected abstract View loadContentView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);

    /**
     * initialize the view in the layout
     *
     * @param savedInstanceState
     */
    protected void initViews(Bundle savedInstanceState)
    {

    }

    /**
     * initialize the Activity data
     */
    protected void initData()
    {

    }

    /**
     * initialize event
     */
    protected void initEvent()
    {

    }
}