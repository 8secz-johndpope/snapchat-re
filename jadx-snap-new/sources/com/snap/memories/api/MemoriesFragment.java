package com.snap.memories.api;

import com.snap.ui.deck.MainPageFragment;
import defpackage.ajdp;
import defpackage.ojb;
import defpackage.ojj;
import java.util.concurrent.TimeUnit;

public abstract class MemoriesFragment extends MainPageFragment {
    protected static final long a = TimeUnit.SECONDS.toMillis(60);

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

    public abstract ajdp<ojb> b();

    public abstract ajdp<ojj> f();
}
