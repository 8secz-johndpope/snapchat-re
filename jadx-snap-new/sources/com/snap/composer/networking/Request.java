package com.snap.composer.networking;

import com.brightcove.player.captioning.TTMLParser.Tags;
import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.utils.JSConversions;
import com.snapchat.client.composer.utils.ComposerJsConvertible;
import defpackage.akco;
import defpackage.akcr;
import java.util.LinkedHashMap;
import java.util.Map;

public final class Request implements ComposerJsConvertible {
    public static final Companion Companion = new Companion();
    private final String a;
    private final String b;
    private final Map<String, Object> c;
    private final RequestBody d;
    private final String e;
    private final String f;
    private final boolean g;
    private final String h;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final Request fromJavaScript(Object obj) {
            if (obj instanceof Request) {
                return (Request) obj;
            }
            if (obj instanceof Map) {
                Map map;
                Map map2 = (Map) obj;
                Object obj2 = map2.get("fsnPath");
                String str = null;
                String asString = obj2 != null ? JSConversions.INSTANCE.asString(obj2) : null;
                obj2 = map2.get("url");
                String asString2 = obj2 != null ? JSConversions.INSTANCE.asString(obj2) : null;
                String str2 = map2.get("headers");
                if (str2 != null) {
                    Map map3 = (Map) (!(str2 instanceof Map) ? null : str2);
                    if (map3 != null) {
                        map = map3;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("Cannot cast ");
                        stringBuilder.append(str2);
                        stringBuilder.append(" to Map<String, Any?>");
                        throw new AttributeError(stringBuilder.toString());
                    }
                }
                map = null;
                obj2 = map2.get(Tags.BODY);
                RequestBody fromJavaScript = obj2 != null ? RequestBody.Companion.fromJavaScript(obj2) : null;
                obj2 = map2.get("method");
                String asString3 = obj2 != null ? JSConversions.INSTANCE.asString(obj2) : null;
                obj2 = map2.get("responseType");
                String asString4 = obj2 != null ? JSConversions.INSTANCE.asString(obj2) : null;
                boolean asBoolean = JSConversions.INSTANCE.asBoolean(map2.get("authenticated"));
                obj = map2.get("snapTokenScope");
                if (obj != null) {
                    str = JSConversions.INSTANCE.asString(obj);
                }
                return new Request(asString, asString2, map, fromJavaScript, asString3, asString4, asBoolean, str);
            }
            throw new AttributeError("Could not cast jsInstance to Map");
        }

        public final Map<String, Object> toJavaScript(Request request) {
            akcr.b(request, "instance");
            Map linkedHashMap = new LinkedHashMap();
            Object fsnPath = request.getFsnPath();
            if (fsnPath == null) {
                fsnPath = null;
            }
            linkedHashMap.put("fsnPath", fsnPath);
            fsnPath = request.getUrl();
            if (fsnPath == null) {
                fsnPath = null;
            }
            linkedHashMap.put("url", fsnPath);
            fsnPath = request.getHeaders();
            if (fsnPath == null) {
                fsnPath = null;
            }
            linkedHashMap.put("headers", fsnPath);
            fsnPath = request.getBody();
            if (fsnPath == null) {
                fsnPath = null;
            }
            linkedHashMap.put(Tags.BODY, fsnPath);
            fsnPath = request.getMethod();
            if (fsnPath == null) {
                fsnPath = null;
            }
            linkedHashMap.put("method", fsnPath);
            fsnPath = request.getResponseType();
            if (fsnPath == null) {
                fsnPath = null;
            }
            linkedHashMap.put("responseType", fsnPath);
            linkedHashMap.put("authenticated", Boolean.valueOf(request.getAuthenticated()));
            Object snapTokenScope = request.getSnapTokenScope();
            if (snapTokenScope == null) {
                snapTokenScope = null;
            }
            linkedHashMap.put("snapTokenScope", snapTokenScope);
            return linkedHashMap;
        }
    }

    public Request(String str, String str2, Map<String, ? extends Object> map, RequestBody requestBody, String str3, String str4, boolean z, String str5) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = requestBody;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = str5;
    }

    public static /* synthetic */ Request copy$default(Request request, String str, String str2, Map map, RequestBody requestBody, String str3, String str4, boolean z, String str5, int i, Object obj) {
        Request request2 = request;
        int i2 = i;
        return request.copy((i2 & 1) != 0 ? request2.a : str, (i2 & 2) != 0 ? request2.b : str2, (i2 & 4) != 0 ? request2.c : map, (i2 & 8) != 0 ? request2.d : requestBody, (i2 & 16) != 0 ? request2.e : str3, (i2 & 32) != 0 ? request2.f : str4, (i2 & 64) != 0 ? request2.g : z, (i2 & 128) != 0 ? request2.h : str5);
    }

    public final String component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final Map<String, Object> component3() {
        return this.c;
    }

    public final RequestBody component4() {
        return this.d;
    }

    public final String component5() {
        return this.e;
    }

    public final String component6() {
        return this.f;
    }

    public final boolean component7() {
        return this.g;
    }

    public final String component8() {
        return this.h;
    }

    public final Request copy(String str, String str2, Map<String, ? extends Object> map, RequestBody requestBody, String str3, String str4, boolean z, String str5) {
        return new Request(str, str2, map, requestBody, str3, str4, z, str5);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Request) {
                Request request = (Request) obj;
                if (akcr.a(this.a, request.a) && akcr.a(this.b, request.b) && akcr.a(this.c, request.c) && akcr.a(this.d, request.d) && akcr.a(this.e, request.e) && akcr.a(this.f, request.f)) {
                    if ((this.g == request.g ? 1 : null) == null || !akcr.a(this.h, request.h)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean getAuthenticated() {
        return this.g;
    }

    public final RequestBody getBody() {
        return this.d;
    }

    public final String getFsnPath() {
        return this.a;
    }

    public final Map<String, Object> getHeaders() {
        return this.c;
    }

    public final String getMethod() {
        return this.e;
    }

    public final String getResponseType() {
        return this.f;
    }

    public final String getSnapTokenScope() {
        return this.h;
    }

    public final String getUrl() {
        return this.b;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map map = this.c;
        hashCode = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        RequestBody requestBody = this.d;
        hashCode = (hashCode + (requestBody != null ? requestBody.hashCode() : 0)) * 31;
        str2 = this.e;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.f;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        int i2 = this.g;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        str2 = this.h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final Object toJavaScript() {
        return Companion.toJavaScript(this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Request(fsnPath=");
        stringBuilder.append(this.a);
        stringBuilder.append(", url=");
        stringBuilder.append(this.b);
        stringBuilder.append(", headers=");
        stringBuilder.append(this.c);
        stringBuilder.append(", body=");
        stringBuilder.append(this.d);
        stringBuilder.append(", method=");
        stringBuilder.append(this.e);
        stringBuilder.append(", responseType=");
        stringBuilder.append(this.f);
        stringBuilder.append(", authenticated=");
        stringBuilder.append(this.g);
        stringBuilder.append(", snapTokenScope=");
        stringBuilder.append(this.h);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
