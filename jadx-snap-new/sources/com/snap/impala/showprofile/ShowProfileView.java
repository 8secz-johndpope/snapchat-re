package com.snap.impala.showprofile;

import android.content.Context;
import android.support.annotation.Keep;
import com.snap.composer.actions.ComposerAction;
import com.snap.composer.actions.ComposerActions;
import com.snap.composer.context.ComposerContext;
import com.snap.composer.views.ComposerView;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;

public final class ShowProfileView extends ComposerView {
    public static final String a = "show_profile";
    public static final String b = b;

    @Keep
    public interface ActionHandler {
        void dismiss(Object[] objArr);

        void hideShow(Object[] objArr);

        void onSubscribedStateUpdate(Object[] objArr);

        void openURL(Object[] objArr);

        void playStoryDoc(Object[] objArr);

        void shareUrl(Object[] objArr);

        void updateNotificationsOptInState(Object[] objArr);
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class b extends akcs implements akbl<ComposerContext, ajxw> {
        private /* synthetic */ Object[] a;

        public b(Object[] objArr) {
            this.a = objArr;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ComposerContext composerContext = (ComposerContext) obj;
            akcr.b(composerContext, "it");
            ComposerActions actions = composerContext.getActions();
            ComposerAction action = actions != null ? actions.getAction("onWatchedStateUpdate") : null;
            if (action != null) {
                action.perform(this.a);
            }
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
    }

    public ShowProfileView(Context context) {
        akcr.b(context, "context");
        super(context);
    }
}
