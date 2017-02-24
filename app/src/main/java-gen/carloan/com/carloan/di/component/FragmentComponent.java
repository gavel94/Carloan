package carloan.com.carloan.di.component;

import android.support.v7.app.AppCompatActivity;

import carloan.com.carloan.di.FragmentScope;
import carloan.com.carloan.di.moudle.FragmentModule;
import dagger.Component;

/**
 * Created by jiahua on 17-2-22.
 * Description：
 */

@FragmentScope
@Component(dependencies = AppComponent.class, modules = FragmentModule.class)
public interface FragmentComponent
{
    AppCompatActivity getActivity();
}

