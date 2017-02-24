package carloan.com.carloan;

import android.app.Application;

import com.jiahuaandroid.basetools.utils.CUtils;
import com.orhanobut.logger.Logger;
import com.tbruyelle.rxpermissions.RxPermissions;

import carloan.com.carloan.di.component.AppComponent;
import carloan.com.carloan.di.component.DaggerAppComponent;
import carloan.com.carloan.di.moudle.AppModule;

/**
 * Created by jiahua on 17-2-22.
 *  Description：
 */

public class App extends Application
{
    private static App instance;

    @Override
    public void onCreate()
    {
        super.onCreate();
        instance = this;
        //初始化日志
        Logger.init(getPackageName());
        //动态权限日志
        RxPermissions.getInstance(this).setLogging(BuildConfig.DEBUG);
        //工具加载
        CUtils.init(this);
    }

    public static AppComponent getAppComponent(){
        return DaggerAppComponent.builder()
                .appModule(new AppModule(instance))
                .build();
    }
}
