package com.snap.search.v2.composer;

import android.content.Context;
import android.support.annotation.Keep;
import com.snap.composer.views.ComposerView;
import defpackage.akcr;

public final class SearchView extends ComposerView {
    public static final String a = a;
    public static final String b = b;

    @Keep
    public interface ActionHandler {
        void dismiss(Object[] objArr);

        void openBusinessProfile(Object[] objArr);

        void openChat(Object[] objArr);

        void openGame(Object[] objArr);

        void openGroupChat(Object[] objArr);

        void openGroupProfile(Object[] objArr);

        void openLens(Object[] objArr);

        void openPublisherProfile(Object[] objArr);

        void openShowProfile(Object[] objArr);

        void openStore(Object[] objArr);

        void openUserProfile(Object[] objArr);

        void playBusinessStory(Object[] objArr);

        void playFeaturedStory(Object[] objArr);

        void playGroupStory(Object[] objArr);

        void playStoryDoc(Object[] objArr);

        void playUserStory(Object[] objArr);
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

    public SearchView(Context context) {
        akcr.b(context, "context");
        super(context);
    }
}
