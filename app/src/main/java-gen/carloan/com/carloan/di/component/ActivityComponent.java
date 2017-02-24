package carloan.com.carloan.di.component;

import android.support.v7.app.AppCompatActivity;

import carloan.com.carloan.MainActivity;
import carloan.com.carloan.di.ActivityScope;
import carloan.com.carloan.di.moudle.ActivityModule;
import carloan.com.carloan.ui.activity.LoginActivity;
import carloan.com.carloan.ui.activity.WelcomeActivity;
import dagger.Component;

/**
 * Created by jiahua on 17-2-22.
 * Description：
 */

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent
{
    AppCompatActivity getActivity();

    void inject(MainActivity mainActivity);

    void inject(WelcomeActivity welcomeActivity);

    void inject(LoginActivity loginActivity);

}