package com.snap.composer.networking;

import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.utils.JSConversions;
import com.snap.core.db.record.UnlockablesModel;
import com.snapchat.client.composer.utils.ComposerJsConvertible;
import defpackage.akco;
import defpackage.akcr;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public final class RequestBody implements ComposerJsConvertible {
    public static final Companion Companion = new Companion();
    private final String a;
    private final byte[] b;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final RequestBody fromJavaScript(Object obj) {
            if (obj instanceof RequestBody) {
                return (RequestBody) obj;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                String asString = JSConversions.INSTANCE.asString(map.get("type"));
                obj = map.get(UnlockablesModel.DATA);
                byte[] bArr = null;
                if (obj != null) {
                    if (obj instanceof byte[]) {
                        bArr = obj;
                    }
                    bArr = bArr;
                    if (bArr == null) {
                        StringBuilder stringBuilder = new StringBuilder("Cannot cast ");
                        stringBuilder.append(obj);
                        stringBuilder.append(" to ByteArray");
                        throw new AttributeError(stringBuilder.toString());
                    }
                }
                return new RequestBody(asString, bArr);
            }
            throw new AttributeError("Could not cast jsInstance to Map");
        }

        public final Map<String, Object> toJavaScript(RequestBody requestBody) {
            akcr.b(requestBody, "instance");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("type", requestBody.getType());
            Object data = requestBody.getData();
            if (data == null) {
                data = null;
            }
            linkedHashMap.put(UnlockablesModel.DATA, data);
            return linkedHashMap;
        }
    }

    public RequestBody(String str, byte[] bArr) {
        akcr.b(str, "type");
        this.a = str;
        this.b = bArr;
    }

    public static /* synthetic */ RequestBody copy$default(RequestBody requestBody, String str, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requestBody.a;
        }
        if ((i & 2) != 0) {
            bArr = requestBody.b;
        }
        return requestBody.copy(str, bArr);
    }

    public final String component1() {
        return this.a;
    }

    public final byte[] component2() {
        return this.b;
    }

    public final RequestBody copy(String str, byte[] bArr) {
        akcr.b(str, "type");
        return new RequestBody(str, bArr);
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.snap.composer.networking.RequestBody;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.snap.composer.networking.RequestBody) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.b;
        r3 = r3.b;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.networking.RequestBody.equals(java.lang.Object):boolean");
    }

    public final byte[] getData() {
        return this.b;
    }

    public final String getType() {
        return this.a;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        byte[] bArr = this.b;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        }
        return hashCode + i;
    }

    public final Object toJavaScript() {
        return Companion.toJavaScript(this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RequestBody(type=");
        stringBuilder.append(this.a);
        stringBuilder.append(", data=");
        stringBuilder.append(Arrays.toString(this.b));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
