package invoice.scan.com.testdragger.draggerinjection;

import javax.inject.Singleton;

import dagger.Component;
import invoice.scan.com.testdragger.MainActivity;

/**
 * Created by admin on 3/20/2018.
 */
@Singleton
@Component(modules = {ApiModule.class, AppModule.class})
public interface ApiComponents {
    void inject(MainActivity mainActivity);
}
