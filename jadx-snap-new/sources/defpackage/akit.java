package defpackage;

import com.looksery.sdk.domain.uriservice.LensTextInputConstants;

/* renamed from: akit */
public final class akit {
    public static boolean a(String str) {
        return str.equals(LensTextInputConstants.REQUEST_METHOD) || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    public static boolean b(String str) {
        return akit.a(str) || str.equals("OPTIONS") || str.equals("DELETE") || str.equals("PROPFIND") || str.equals("MKCOL") || str.equals("LOCK");
    }
}
