package com.mapbox.services.android.telemetry.http;

import defpackage.akhn;
import defpackage.akhn.a;
import defpackage.akho;
import defpackage.akht;
import defpackage.akhu;
import defpackage.akhv;
import defpackage.akke;
import defpackage.akkl;
import defpackage.akko;

public final class GzipRequestInterceptor implements akhn {
    private akhu gzip(final akhu akhu) {
        return new akhu() {
            public long contentLength() {
                return -1;
            }

            public akho contentType() {
                return akhu.contentType();
            }

            public void writeTo(akke akke) {
                akke = akko.a(new akkl(akke));
                akhu.writeTo(akke);
                akke.close();
            }
        };
    }

    public final akhv intercept(a aVar) {
        akht a = aVar.a();
        if (a.d != null) {
            String str = "Content-Encoding";
            if (a.a(str) == null) {
                return aVar.a(a.d().a(str, "gzip").a(a.b, gzip(a.d)).a());
            }
        }
        return aVar.a(a);
    }
}
