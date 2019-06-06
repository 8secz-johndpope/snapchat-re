package defpackage;

import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: ww */
public final class ww extends xc<ww> {
    public String a;
    public JSONObject b = new JSONObject();
    public String c;

    public final String a() {
        return "paypal_accounts";
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        jSONObject2.put("correlationId", this.a);
        jSONObject2.put("intent", this.c);
        Iterator keys = this.b.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            jSONObject2.put(str, this.b.get(str));
        }
        jSONObject.put("paypalAccount", jSONObject2);
    }

    public final String b() {
        return "PayPalAccount";
    }
}
