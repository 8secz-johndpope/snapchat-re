package defpackage;

import com.snap.core.db.record.LocalMessageActionModel;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: vpp */
public final class vpp implements vps {
    private final dib a;

    public vpp(dib dib) {
        akcr.b(dib, "blizzardEventLogger");
        this.a = dib;
    }

    public final void a(aayb aayb, String str, aayc aayc, aaya aaya, aayd aayd, String str2) {
        akcr.b(aayb, "source");
        akcr.b(aaya, LocalMessageActionModel.ACTIONTYPE);
        akcr.b(aayd, "action");
        aaco aaco = new aaco();
        aaco.a(aayb);
        aaco.a(str);
        aaco.a(aayc);
        aaco.a(aaya);
        aaco.a(aayd);
        if (str != null) {
            if ((((CharSequence) str).length() > 0 ? 1 : null) != null && (aayc == aayc.SNAPCODE || aayc == aayc.SNAPCODE_BITMOJI)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(aayc.name());
                stringBuilder.append(str);
                String stringBuilder2 = stringBuilder.toString();
                Charset charset = akfp.a;
                if (stringBuilder2 != null) {
                    Object bytes = stringBuilder2.getBytes(charset);
                    akcr.a(bytes, "(this as java.lang.String).getBytes(charset)");
                    bytes = UUID.nameUUIDFromBytes(bytes).toString();
                    akcr.a(bytes, "UUID.nameUUIDFromBytes((…toByteArray()).toString()");
                    if (akcr.a(bytes, (Object) str2)) {
                        aaco.b(bytes);
                    }
                } else {
                    throw new ajxt("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
        this.a.a((aajt) aaco);
    }

    public final void a(aayb aayb, String str, aayc aayc, aaya aaya, aayd aayd, String str2, String str3) {
        akcr.b(aayb, "source");
        akcr.b(aaya, LocalMessageActionModel.ACTIONTYPE);
        akcr.b(aayd, "action");
        StringBuilder stringBuilder = new StringBuilder("onGeofilterCameraScanAction, with\n                source: ");
        stringBuilder.append(aayb);
        stringBuilder.append(",\n                data: ");
        stringBuilder.append(str);
        stringBuilder.append(",\n                scanType: ");
        stringBuilder.append(aayc);
        stringBuilder.append(",\n                actionType: ");
        stringBuilder.append(aaya);
        stringBuilder.append(",\n                action: ");
        stringBuilder.append(aayd);
        stringBuilder.append(",\n                filterGeofilterId: ");
        stringBuilder.append(null);
        stringBuilder.append(",\n                filterGeolensId: ");
        stringBuilder.append(str2);
        akfu.b(stringBuilder.toString());
        aanl aanl = new aanl();
        aanl.a(aayb);
        aanl.a(str);
        aanl.a(aayc);
        aanl.a(aaya);
        aanl.a(aayd);
        aanl.a();
        aanl.c(str2);
        aanl.b(str3);
        if (str2 == null) {
            str2 = null;
        }
        if (str2 != null) {
            aanl.d(str2);
        }
        this.a.a((aajt) aanl);
    }
}
