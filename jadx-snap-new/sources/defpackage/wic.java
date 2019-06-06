package defpackage;

import android.content.Context;
import com.snap.framework.developer.BuildConfigInfo;
import com.snapchat.android.core.security.SCPluginWrapper;
import java.util.List;
import java.util.Set;

/* renamed from: wic */
public final class wic implements aiqc<Set<List<akhn>>> {
    private final ajwy<Context> a;
    private final ajwy<iha> b;
    private final ajwy<fwy> c;
    private final ajwy<abkk> d;
    private final ajwy<zgb> e;
    private final ajwy<wim> f;
    private final ajwy<BuildConfigInfo> g;
    private final ajwy<gcw> h;
    private final ajwy<dib> i;
    private final ajwy<SCPluginWrapper> j;

    public static Set<List<akhn>> a(ajwy<iha> ajwy, ajwy<fwy> ajwy2, ajwy<abkk> ajwy3, zgb zgb, wim wim, BuildConfigInfo buildConfigInfo, gcw gcw, dib dib, ajwy<SCPluginWrapper> ajwy4) {
        return (Set) aiqf.a(whx.a(ajwy, ajwy2, ajwy3, zgb, wim, buildConfigInfo, gcw, dib, ajwy4), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        ajwy ajwy3 = this.c;
        ajwy ajwy4 = this.d;
        ajwy ajwy5 = this.e;
        ajwy ajwy6 = this.f;
        ajwy ajwy7 = this.g;
        ajwy ajwy8 = this.h;
        ajwy ajwy9 = this.i;
        ajwy ajwy10 = this.j;
        ajwy.get();
        return wic.a(ajwy2, ajwy3, ajwy4, (zgb) ajwy5.get(), (wim) ajwy6.get(), (BuildConfigInfo) ajwy7.get(), (gcw) ajwy8.get(), (dib) ajwy9.get(), ajwy10);
    }
}
