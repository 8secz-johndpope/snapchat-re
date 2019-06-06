package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.brightcove.player.event.Event;
import com.looksery.sdk.lenses.resources.BuildConfig;
import com.snap.framework.channel.ChannelInfoStore;
import java.util.Arrays;

/* renamed from: czk */
public class czk {
    final String a = "sc_referrer";
    final String b = "sc_ua";
    final String c = BuildConfig.FLAVOR;
    final String d = "https";
    final String e = "link";
    final ajxe f;
    final dib g;
    final Activity h;
    final abxu i;
    final gvp j;
    final ihh k;
    final abss l;
    final ilv m;
    final ira n;
    final diw o;
    final ajwy<ChannelInfoStore> p;

    /* renamed from: czk$a */
    static final class a extends akcs implements akbk<SharedPreferences> {
        private /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object format = String.format("%s.%s", Arrays.copyOf(new Object[]{"com.snapchat.android.analytics.framework", this.a.getPackageName()}, 2));
            akcr.a(format, "java.lang.String.format(format, *args)");
            return this.a.getSharedPreferences(format, 0);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(czk.class), "sharedPreferences", "getSharedPreferences()Landroid/content/SharedPreferences;");
    }

    public czk(dib dib, Activity activity, abxu abxu, gvp gvp, ihh ihh, abss abss, ilv ilv, ira ira, diw diw, ajwy<ChannelInfoStore> ajwy, Context context) {
        akcr.b(dib, "blizzardEventLogger");
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(abxu, "userIdProvider");
        akcr.b(gvp, "deepLinkUiMatcher");
        akcr.b(ihh, "clock");
        akcr.b(abss, "releaseManager");
        akcr.b(ilv, "graphene");
        akcr.b(ira, "identityApi");
        akcr.b(diw, "sessionSummaryManager");
        akcr.b(ajwy, "channelInfoStore");
        akcr.b(context, "context");
        this.g = dib;
        this.h = activity;
        this.i = abxu;
        this.j = gvp;
        this.k = ihh;
        this.l = abss;
        this.m = ilv;
        this.n = ira;
        this.o = diw;
        this.p = ajwy;
        this.f = ajxh.a(new a(context));
    }
}
