package com.snap.creativekit.lib.ui.loading;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import defpackage.akcr;

public final class CreativeKitLoadingFragment extends BaseCreativeKitLoadingFragment {

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

    public final String i() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            PendingIntent pendingIntent = (PendingIntent) arguments.getParcelable("RESULT_INTENT");
            if (pendingIntent != null) {
                return pendingIntent.getCreatorPackage();
            }
        }
        return null;
    }

    public final String j() {
        Bundle arguments = getArguments();
        return arguments != null ? arguments.getString("KIT_VERSION") : null;
    }

    public final boolean k() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("deeplink_uri");
            if (string != null) {
                Object parse = Uri.parse(string);
                akcr.a(parse, "Uri.parse(uri)");
                return akcr.a(parse.getHost(), (Object) "camera");
            }
        }
        return false;
    }

    public final boolean l() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("deeplink_uri");
            if (string != null) {
                Object parse = Uri.parse(string);
                akcr.a(parse, "Uri.parse(uri)");
                return akcr.a(parse.getHost(), (Object) "preview");
            }
        }
        return false;
    }
}
