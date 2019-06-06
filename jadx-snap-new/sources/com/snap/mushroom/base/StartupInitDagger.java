package com.snap.mushroom.base;

import defpackage.rwm;
import defpackage.rwn;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class StartupInitDagger {

    @Retention(RetentionPolicy.CLASS)
    @interface StartupInitScope {
    }

    @StartupInitScope
    public interface StartupInitComponent {

        public interface Builder {
            StartupInitComponent build();
        }

        rwn hovaController();

        rwm syncer();
    }
}
