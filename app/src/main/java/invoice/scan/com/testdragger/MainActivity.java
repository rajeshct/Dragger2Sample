package invoice.scan.com.testdragger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import invoice.scan.com.testdragger.draggerinjection.ApiModule;
import invoice.scan.com.testdragger.draggerinjection.AppModule;

public class MainActivity extends AppCompatActivity {

    @Inject
    ApiModule apiModule;

    @Inject
    AppModule mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((ApplicationInitailizer) getApplication())
                .getApiComponents()
                .inject(this);
        Log.e("dd",apiModule.callApi().readData());
        Log.e("dd",mod.getApplication().getPackageName());
    }
}
