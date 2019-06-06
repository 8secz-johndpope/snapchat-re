package com.snap.impala.snappro.core;

import android.content.Context;
import android.support.annotation.Keep;
import com.snap.composer.views.ComposerView;
import defpackage.akcr;

public final class ImpalaMainView extends ComposerView {
    public static final String a = "impala";
    public static final String b = b;

    @Keep
    public interface ActionHandler {
        void addSnapToBusinessStory(Object[] objArr);

        void back(Object[] objArr);

        void dismiss(Object[] objArr);

        void getFriends(Object[] objArr);

        void observeBusinessProfile(Object[] objArr);

        void present(Object[] objArr);

        void push(Object[] objArr);

        void reloadManagedBusinessProfiles(Object[] objArr);
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public ImpalaMainView(Context context) {
        akcr.b(context, "context");
        super(context);
    }
}
