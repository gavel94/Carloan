package carloan.com.carloan.core.mvp;

/**
 * Created by jhhuang on 2016/12/13.
 * QQ:781913268
 * Description：MvpView
 */
public interface MvpView
{
    void showLoading();

    void hideLoading();

    void toast(String msg);

    void toast(int resId);
}
