package invoice.scan.com.testdragger.draggerinjection;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import invoice.scan.com.testdragger.otherfiles.CallApi;

/**
 * Created by admin on 3/23/2018.
 */
@Module
public class ApiModule {

    @Inject
    public ApiModule() {
    }


    @Provides
    @Singleton
    public CallApi callApi() {
        return new CallApi();
    }
}
