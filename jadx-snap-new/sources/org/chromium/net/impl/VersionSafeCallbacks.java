package org.chromium.net.impl;

import defpackage.akov;
import defpackage.akpd;
import defpackage.akpe;
import defpackage.akpi;
import defpackage.akpk;
import defpackage.akpl;
import defpackage.akpm;
import defpackage.akpn;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

public final class VersionSafeCallbacks {

    public static final class c extends defpackage.akpi.a {
        final defpackage.akpi.a a;

        public c(defpackage.akpi.a aVar) {
            super(aVar.a());
            this.a = aVar;
        }

        public final Executor a() {
            return this.a.a();
        }

        public final void a(akpi akpi) {
            this.a.a(akpi);
        }
    }

    public static final class e extends defpackage.akpm.b {
        private final defpackage.akpm.b a;

        public e(defpackage.akpm.b bVar) {
            this.a = bVar;
        }

        public final void a(akpm akpm, akpn akpn) {
            this.a.a(akpm, akpn);
        }

        public final void a(akpm akpm, akpn akpn, akov akov) {
            this.a.a(akpm, akpn, akov);
        }

        public final void a(akpm akpm, akpn akpn, String str) {
            this.a.a(akpm, akpn, str);
        }

        public final void a(akpm akpm, akpn akpn, ByteBuffer byteBuffer) {
            this.a.a(akpm, akpn, byteBuffer);
        }

        public final void b(akpm akpm, akpn akpn) {
            this.a.b(akpm, akpn);
        }

        public final void c(akpm akpm, akpn akpn) {
            this.a.c(akpm, akpn);
        }
    }

    public static final class d extends akpk {
        public final akpk a;

        public d(akpk akpk) {
            this.a = akpk;
        }

        public final long a() {
            return this.a.a();
        }

        public final void a(akpl akpl) {
            this.a.a(akpl);
        }

        public final void a(akpl akpl, ByteBuffer byteBuffer) {
            this.a.a(akpl, byteBuffer);
        }

        public final void close() {
            this.a.close();
        }
    }

    public static final class UrlRequestStatusListener extends defpackage.akpm.c {
    }

    public static final class a extends akpd {
        final akpd a;

        public final Executor a() {
            return this.a.a();
        }

        public final boolean equals(Object obj) {
            return (obj == null || !(obj instanceof a)) ? false : this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class b extends akpe {
        final akpe a;

        public final Executor a() {
            return this.a.a();
        }

        public final boolean equals(Object obj) {
            return (obj == null || !(obj instanceof b)) ? false : this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }
}
