package com.snap.venuefeedback;

import android.content.Context;
import android.support.annotation.Keep;
import com.snap.composer.views.ComposerView;
import defpackage.akcr;

public final class VenueFeedbackView extends ComposerView {

    @Keep
    public interface ActionHandler {
        void didSubmitFeedback(Object[] objArr);

        void didTapBack(Object[] objArr);
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

    public VenueFeedbackView(Context context) {
        akcr.b(context, "context");
        super(context);
    }
}
