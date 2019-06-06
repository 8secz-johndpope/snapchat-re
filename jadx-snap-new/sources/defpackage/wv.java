package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: wv */
public final class wv {
    JSONObject a = new JSONObject();

    public wv() {
        try {
            this.a.put("platform", "android");
        } catch (JSONException unused) {
        }
    }

    public final wv a(String str) {
        try {
            this.a.put("source", str);
        } catch (JSONException unused) {
        }
        return this;
    }

    public final wv b(String str) {
        try {
            this.a.put("integration", str);
        } catch (JSONException unused) {
        }
        return this;
    }

    public final wv c(String str) {
        try {
            this.a.put("sessionId", str);
        } catch (JSONException unused) {
        }
        return this;
    }

    public final String toString() {
        return this.a.toString();
    }
}
