package com.snap.composer.networking;

import com.brightcove.player.captioning.TTMLParser.Tags;
import com.snap.composer.exceptions.AttributeError;
import com.snapchat.client.composer.utils.ComposerJsConvertible;
import defpackage.akco;
import defpackage.akcr;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public final class Response implements ComposerJsConvertible {
    public static final Companion Companion = new Companion();
    private final Map<String, Object> a;
    private final byte[] b;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final Response fromJavaScript(Object obj) {
            if (obj instanceof Response) {
                return (Response) obj;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                String str = "headers";
                Object obj2 = map.get(str);
                Object obj3 = null;
                if (!(obj2 instanceof Map)) {
                    obj2 = null;
                }
                Map map2 = (Map) obj2;
                String str2 = "Cannot cast ";
                StringBuilder stringBuilder;
                if (map2 != null) {
                    str = Tags.BODY;
                    Object obj4 = map.get(str);
                    if (obj4 instanceof byte[]) {
                        obj3 = obj4;
                    }
                    byte[] bArr = (byte[]) obj3;
                    if (bArr != null) {
                        return new Response(map2, bArr);
                    }
                    stringBuilder = new StringBuilder(str2);
                    stringBuilder.append(map.get(str));
                    stringBuilder.append(" to ByteArray");
                    throw new AttributeError(stringBuilder.toString());
                }
                stringBuilder = new StringBuilder(str2);
                stringBuilder.append(map.get(str));
                stringBuilder.append(" to Map<String, Any?>");
                throw new AttributeError(stringBuilder.toString());
            }
            throw new AttributeError("Could not cast jsInstance to Map");
        }

        public final Map<String, Object> toJavaScript(Response response) {
            akcr.b(response, "instance");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("headers", response.getHeaders());
            linkedHashMap.put(Tags.BODY, response.getBody());
            return linkedHashMap;
        }
    }

    public Response(Map<String, ? extends Object> map, byte[] bArr) {
        akcr.b(map, "headers");
        akcr.b(bArr, Tags.BODY);
        this.a = map;
        this.b = bArr;
    }

    public static /* synthetic */ Response copy$default(Response response, Map map, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            map = response.a;
        }
        if ((i & 2) != 0) {
            bArr = response.b;
        }
        return response.copy(map, bArr);
    }

    public final Map<String, Object> component1() {
        return this.a;
    }

    public final byte[] component2() {
        return this.b;
    }

    public final Response copy(Map<String, ? extends Object> map, byte[] bArr) {
        akcr.b(map, "headers");
        akcr.b(bArr, Tags.BODY);
        return new Response(map, bArr);
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.snap.composer.networking.Response;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.snap.composer.networking.Response) r3;
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
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.networking.Response.equals(java.lang.Object):boolean");
    }

    public final byte[] getBody() {
        return this.b;
    }

    public final Map<String, Object> getHeaders() {
        return this.a;
    }

    public final int hashCode() {
        Map map = this.a;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
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
        StringBuilder stringBuilder = new StringBuilder("Response(headers=");
        stringBuilder.append(this.a);
        stringBuilder.append(", body=");
        stringBuilder.append(Arrays.toString(this.b));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
