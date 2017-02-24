package carloan.com.carloan.di.component;

import javax.inject.Singleton;

import carloan.com.carloan.App;
import carloan.com.carloan.db.generated.DaoSession;
import carloan.com.carloan.di.ContextLife;
import carloan.com.carloan.di.moudle.AppModule;
import dagger.Component;

/**
 * Created by jiahua on 17-2-22.
 * Description：
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent
{
    /**
     * @return 提供AppApplication
     */
    @ContextLife("Application")
    App getContext();

    DaoSession daoSessionHHelper();

}
