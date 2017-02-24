package carloan.com.carloan.di.moudle;

import javax.inject.Singleton;

import carloan.com.carloan.App;
import carloan.com.carloan.db.THDevOpenHelper;
import carloan.com.carloan.db.generated.DaoMaster;
import carloan.com.carloan.db.generated.DaoSession;
import carloan.com.carloan.di.ContextLife;
import dagger.Module;
import dagger.Provides;

/**
 * Created by jiahua on 17-2-22.
 * Description：
 */
@Module
public class AppModule
{
    private final App application;

    public AppModule(App application)
    {
        this.application = application;
    }

    @Provides
    @Singleton
    @ContextLife("Application")
    App provideApplicationContext()
    {
        return application;
    }

    @Provides
    @Singleton
    DaoSession provideDaoSession()
    {
        return new DaoMaster(new THDevOpenHelper(application, "app_db", null).getWritableDatabase()).newSession();
    }
}
