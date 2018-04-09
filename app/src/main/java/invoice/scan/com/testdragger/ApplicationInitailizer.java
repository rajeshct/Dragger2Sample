package invoice.scan.com.testdragger;

import android.app.Application;

import invoice.scan.com.testdragger.draggerinjection.ApiComponents;
import invoice.scan.com.testdragger.draggerinjection.AppModule;
import invoice.scan.com.testdragger.draggerinjection.DaggerApiComponents;


/**
 * Created by admin on 3/20/2018.
 */

public class ApplicationInitailizer extends Application {

    ApiComponents apiComponents;

    @Override
    public void onCreate() {
        super.onCreate();
        apiComponents = DaggerApiComponents.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public ApiComponents getApiComponents() {
        return apiComponents;
    }
}
