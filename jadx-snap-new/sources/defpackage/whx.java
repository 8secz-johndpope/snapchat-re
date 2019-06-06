package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.snap.framework.developer.BuildConfigInfo;
import com.snap.security.SecurityHttpInterface;
import com.snapchat.android.core.security.SCPluginWrapper;
import java.util.List;
import java.util.Set;

/* renamed from: whx */
public abstract class whx {
    static SecurityHttpInterface a(gcy gcy) {
        return (SecurityHttpInterface) gcy.a(SecurityHttpInterface.class);
    }

    static Set<List<akhn>> a(ajwy<iha> ajwy, ajwy<fwy> ajwy2, ajwy<abkk> ajwy3, zgb zgb, wim wim, BuildConfigInfo buildConfigInfo, gcw gcw, dib dib, ajwy<SCPluginWrapper> ajwy4) {
        return ImmutableSet.of(ImmutableList.of(new wih(buildConfigInfo), new wik(ajwy4), new wii((abkk) ajwy3.get(), zgb), wim, new wij(ajwy, ajwy2), new wil(gcw, abnm.a, dib)));
    }

    static whk a(Context context, BuildConfigInfo buildConfigInfo, zgb zgb, ifa ifa) {
        return new wit(context, buildConfigInfo, ifa);
    }
}
