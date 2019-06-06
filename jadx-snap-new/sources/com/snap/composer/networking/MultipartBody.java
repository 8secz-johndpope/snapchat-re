package com.snap.composer.networking;

import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.utils.JSConversions;
import com.snap.core.db.record.UnlockablesModel;
import com.snapchat.client.composer.utils.ComposerJsConvertible;
import defpackage.akco;
import defpackage.akcr;
import java.util.LinkedHashMap;
import java.util.Map;

public final class MultipartBody implements ComposerJsConvertible {
    public static final Companion Companion = new Companion();
    private final String a;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final MultipartBody fromJavaScript(Object obj) {
            if (obj instanceof MultipartBody) {
                return (MultipartBody) obj;
            }
            if (obj instanceof Map) {
                return new MultipartBody(JSConversions.INSTANCE.asString(((Map) obj).get(UnlockablesModel.DATA)));
            }
            throw new AttributeError("Could not cast jsInstance to Map");
        }

        public final Map<String, Object> toJavaScript(MultipartBody multipartBody) {
            akcr.b(multipartBody, "instance");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(UnlockablesModel.DATA, multipartBody.getData());
            return linkedHashMap;
        }
    }

    public MultipartBody(String str) {
        akcr.b(str, UnlockablesModel.DATA);
        this.a = str;
    }

    public static /* synthetic */ MultipartBody copy$default(MultipartBody multipartBody, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multipartBody.a;
        }
        return multipartBody.copy(str);
    }

    public final String component1() {
        return this.a;
    }

    public final MultipartBody copy(String str) {
        akcr.b(str, UnlockablesModel.DATA);
        return new MultipartBody(str);
    }

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((com.snap.composer.networking.MultipartBody) r2).a) != false) goto L_0x0015;
     */
    public final boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof com.snap.composer.networking.MultipartBody;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (com.snap.composer.networking.MultipartBody) r2;
        r0 = r1.a;
        r2 = r2.a;
        r2 = defpackage.akcr.a(r0, r2);
        if (r2 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r2 = 0;
        return r2;
    L_0x0015:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.networking.MultipartBody.equals(java.lang.Object):boolean");
    }

    public final String getData() {
        return this.a;
    }

    public final int hashCode() {
        String str = this.a;
        return str != null ? str.hashCode() : 0;
    }

    public final Object toJavaScript() {
        return Companion.toJavaScript(this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MultipartBody(data=");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
