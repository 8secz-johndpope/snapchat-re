package com.snap.creativekit.lib.ui.loading;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import defpackage.akcr;
import java.util.List;

public final class CreativeKitLiteLoadingFragment extends BaseCreativeKitLoadingFragment {

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
        if (arguments != null ? arguments.getBoolean("com.snap.deeplink.after_login") : false) {
            arguments = getArguments();
            return arguments != null ? arguments.getString("ck_lite_calling_package") : null;
        } else {
            FragmentActivity activity = getActivity();
            return activity != null ? activity.getCallingPackage() : null;
        }
    }

    public final String j() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("deeplink_uri");
            if (string != null) {
                Object parse = Uri.parse(string);
                akcr.a(parse, "Uri.parse(uri)");
                List pathSegments = parse.getPathSegments();
                if (pathSegments.size() > 1) {
                    return (String) pathSegments.get(1);
                }
            }
        }
        return null;
    }

    public final boolean k() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("deeplink_uri");
            if (string != null) {
                Object parse = Uri.parse(string);
                akcr.a(parse, "Uri.parse(uri)");
                return akcr.a((String) parse.getPathSegments().get(0), (Object) "camera");
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
                return akcr.a((String) parse.getPathSegments().get(0), (Object) "preview");
            }
        }
        return false;
    }
}
