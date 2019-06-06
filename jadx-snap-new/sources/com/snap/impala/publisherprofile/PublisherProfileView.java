package com.snap.impala.publisherprofile;

import android.content.Context;
import android.support.annotation.Keep;
import com.snap.composer.views.ComposerView;
import defpackage.akcr;

public final class PublisherProfileView extends ComposerView {
    public static final String a = a;
    public static final String b = b;

    @Keep
    public interface ActionHandler {
        void dismiss(Object[] objArr);

        void hidePublisher(Object[] objArr);

        void openURL(Object[] objArr);

        void playStoryDoc(Object[] objArr);

        void setNotificationsState(Object[] objArr);

        void setSubscribeState(Object[] objArr);

        void shareURL(Object[] objArr);
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

    public PublisherProfileView(Context context) {
        akcr.b(context, "context");
        super(context);
    }
}
