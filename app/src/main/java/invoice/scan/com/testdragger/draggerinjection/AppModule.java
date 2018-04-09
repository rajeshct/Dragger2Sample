package invoice.scan.com.testdragger.draggerinjection;

import android.app.Application;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by admin on 3/20/2018.
 */

@Module
public class AppModule {

    private Application application;

    @Inject
    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Application getApplication() {
        return application;
    }

}
