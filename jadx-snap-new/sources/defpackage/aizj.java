package defpackage;

import com.google.common.base.Preconditions;
import com.looksery.sdk.domain.uriservice.LensTextInputConstants;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aizj */
final class aizj {
    private static ajai a = new ajai(ajai.d, "https");
    private static ajai b = new ajai(ajai.b, LensTextInputConstants.REQUEST_METHOD);
    private static ajai c = new ajai(ajai.b, "GET");
    private static ajai d = new ajai(aixo.g.a, "application/grpc");
    private static ajai e = new ajai("te", "trailers");

    public static List<ajai> a(aivl aivl, String str, String str2, String str3, boolean z) {
        Preconditions.checkNotNull(aivl, "headers");
        Preconditions.checkNotNull(str, "defaultPath");
        Preconditions.checkNotNull(str2, "authority");
        aivl.b(aixo.g);
        aivl.b(aixo.h);
        aivl.b(aixo.i);
        ArrayList arrayList = new ArrayList(aivl.c + 7);
        arrayList.add(a);
        arrayList.add(z ? c : b);
        arrayList.add(new ajai(ajai.e, str2));
        arrayList.add(new ajai(ajai.c, str));
        arrayList.add(new ajai(aixo.i.a, str3));
        arrayList.add(d);
        arrayList.add(e);
        byte[][] a = aize.a(aivl);
        for (int i = 0; i < a.length; i += 2) {
            akkg a2 = akkg.a(a[i]);
            String a3 = a2.a();
            Object obj = (a3.startsWith(":") || aixo.g.a.equalsIgnoreCase(a3) || aixo.i.a.equalsIgnoreCase(a3)) ? null : 1;
            if (obj != null) {
                arrayList.add(new ajai(a2, akkg.a(a[i + 1])));
            }
        }
        return arrayList;
    }
}
