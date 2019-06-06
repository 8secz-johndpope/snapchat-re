package com.snap.composer.serengeti.bridge.dagger;

import android.content.Context;
import com.snap.composer.serengeti.bridge.SerengetiActionModuleFactory;
import com.snapchat.client.composer.ModuleFactory;
import defpackage.ajei;
import defpackage.akcr;
import defpackage.kee;
import defpackage.kem;
import defpackage.kep;
import defpackage.wll;
import defpackage.wlt;
import defpackage.wmp;
import java.util.Arrays;

public final class SerengetiBridgeModules {

    public static final class UserModule {
        public final ModuleFactory providesSerengetiBridge(Context context, ajei ajei, wmp wmp, kee kee, kee kee2, kem kem, kep kep, wlt wlt) {
            akcr.b(context, "context");
            akcr.b(ajei, "disposable");
            akcr.b(wmp, "makeRequest");
            akcr.b(kee, "getBusinessProfile");
            akcr.b(kee2, "setBusinessProfileAction");
            akcr.b(kem, "getWatchStateAction");
            akcr.b(kep, "setWatchStateAction");
            akcr.b(wlt, "logBlizzardEventAction");
            Object asList = Arrays.asList(new wll[]{wmp, kee, kee2, kem, kep, wlt});
            akcr.a(asList, "Arrays.asList(\n         …  logBlizzardEventAction)");
            return new SerengetiActionModuleFactory(context, ajei, asList);
        }
    }
}
