package defpackage;

import android.net.Uri;
import com.samsung.android.sdk.camera.SCamera;

/* renamed from: yjx */
public final class yjx {
    final String a;
    final yjv b;
    final String c;
    final String d;
    public final String e;
    public final String f;
    private final ajxe g = ajxh.a(new a(this));
    private final String h;

    /* renamed from: yjx$a */
    static final class a extends akcs implements akbk<String> {
        private /* synthetic */ yjx a;

        a(yjx yjx) {
            this.a = yjx;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            yjx yjx = this.a;
            int i = yjy.a[yjx.b.ordinal()];
            String str = null;
            String str2 = "Uri.parse(baseUrl)\n     …              .toString()";
            Object obj = null;
            CharSequence charSequence;
            Object obj2;
            if (i == 1) {
                charSequence = yjx.d;
                obj2 = (charSequence == null || charSequence.length() == 0) ? 1 : null;
                if (obj2 == null) {
                    str = yjx.d;
                } else {
                    charSequence = yjx.c;
                    if (charSequence == null || charSequence.length() == 0) {
                        obj = 1;
                    }
                    if (obj == null) {
                        str = Uri.parse(yjx.c).buildUpon().appendQueryParameter("lt", SCamera.CAMERA_ID_FRONT).build().toString();
                        akcr.a((Object) str, str2);
                    }
                }
            } else if (i != 2) {
                str = yjx.c;
            } else {
                String str3;
                charSequence = yjx.c;
                obj2 = (charSequence == null || charSequence.length() == 0) ? 1 : null;
                if (obj2 == null) {
                    str3 = yjx.c;
                } else {
                    charSequence = yjx.d;
                    if (charSequence == null || charSequence.length() == 0) {
                        obj = 1;
                    }
                    if (obj == null) {
                        str3 = yjx.d;
                    }
                }
                str = yjx.a(str3);
            }
            if (str == null) {
                str = yjx.c;
            }
            if (str == null) {
                return "";
            }
            if (yjx.a == null) {
                return str;
            }
            Object uri = Uri.parse(str).buildUpon().appendQueryParameter("snap_id", yjx.a).build().toString();
            akcr.a(uri, str2);
            return uri;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(yjx.class), "mediaUrl", "getMediaUrl()Ljava/lang/String;");
    }

    public yjx(String str, yjv yjv, String str2, String str3, String str4, String str5, String str6) {
        akcr.b(yjv, "thumbnailSize");
        this.a = str;
        this.b = yjv;
        this.h = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    static String a(String str) {
        String str2 = "254";
        Object uri = Uri.parse(str).buildUpon().appendQueryParameter("w", str2).appendQueryParameter("h", str2).build().toString();
        akcr.a(uri, "Uri.parse(baseUrl)\n     …              .toString()");
        return uri;
    }

    public final String a() {
        return (String) this.g.b();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Thumbnail info:\n");
        StringBuilder stringBuilder2 = new StringBuilder("snapId: ");
        String str = this.a;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        stringBuilder2.append(str);
        stringBuilder2.append(10);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder("thumbnailSize: ");
        stringBuilder2.append(this.b.name());
        stringBuilder2.append(10);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder("mediaId: ");
        String str3 = this.h;
        if (str3 == null) {
            str3 = str2;
        }
        stringBuilder2.append(str3);
        stringBuilder2.append(10);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder("noAuthMediaUrl: ");
        str3 = this.c;
        if (str3 == null) {
            str3 = str2;
        }
        stringBuilder2.append(str3);
        stringBuilder2.append(10);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder("noAuthLargeThumbnailMediaUrl: ");
        str3 = this.d;
        if (str3 == null) {
            str3 = str2;
        }
        stringBuilder2.append(str3);
        stringBuilder2.append(10);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder("mediaKey: ");
        str3 = this.e;
        if (str3 == null) {
            str3 = str2;
        }
        stringBuilder2.append(str3);
        stringBuilder2.append(10);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder("mediaIv: ");
        str3 = this.f;
        if (str3 != null) {
            str2 = str3;
        }
        stringBuilder2.append(str2);
        stringBuilder2.append(10);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder("mediaUrl: ");
        stringBuilder2.append(a());
        stringBuilder2.append(10);
        stringBuilder.append(stringBuilder2.toString());
        Object stringBuilder3 = stringBuilder.toString();
        akcr.a(stringBuilder3, "StringBuilder(\"Thumbnail…\\n\")\n        }.toString()");
        return stringBuilder3;
    }
}
