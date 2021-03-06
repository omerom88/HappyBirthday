package omerrom.happybirthday.injection;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by omerom88 on 23-Oct-18
 */
@Module
public class AppModule {
    private Application application;

    public AppModule(Application application) {
        this.application = application;

    }

    @Provides
    @Singleton
    public Context provideContext() {
        return application;

    }


}
