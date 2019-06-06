package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import com.brightcove.player.event.EventType;
import defpackage.cig.1;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: uq */
public final class uq {

    /* renamed from: uq$2 */
    static /* synthetic */ class 2 {
        static final /* synthetic */ int[] a = new int[chv.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = defpackage.chv.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.chv.Error;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.chv.Cancel;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.chv.Success;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.uq$2.<clinit>():void");
        }
    }

    private static ww a(xb xbVar, chc chc, chd chd, Intent intent) {
        String str = "code";
        String str2 = EventType.RESPONSE;
        String str3 = "client";
        ww wwVar = new ww();
        wwVar.a = chc.d;
        if ((chc instanceof cha) && xbVar != null) {
            wwVar.c = xbVar.a;
        }
        wwVar.m = uq.a(intent) ? "paypal-app" : "paypal-browser";
        JSONObject a = chd.a();
        try {
            JSONObject jSONObject = a.getJSONObject(str3);
            JSONObject jSONObject2 = a.getJSONObject(str2);
            if (!(!"mock".equalsIgnoreCase(jSONObject.getString(str3)) || jSONObject2.getString(str) == null || (chc instanceof cha))) {
                jSONObject = new JSONObject();
                StringBuilder stringBuilder = new StringBuilder("fake-code:");
                stringBuilder.append(TextUtils.join(" ", new HashSet(((cgy) chc).a)));
                a.put(str2, jSONObject.put(str, stringBuilder.toString()));
            }
        } catch (JSONException unused) {
        }
        if (a != null) {
            wwVar.b = a;
        }
        return wwVar;
    }

    private static xb a(Context context) {
        String str = "com.braintreepayments.api.PayPal.PAYPAL_REQUEST_KEY";
        SharedPreferences a = wc.a(context);
        try {
            byte[] decode = Base64.decode(a.getString(str, ""), 0);
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(decode, 0, decode.length);
            obtain.setDataPosition(0);
            xb xbVar = (xb) xb.CREATOR.createFromParcel(obtain);
            return xbVar;
        } catch (Exception unused) {
            return null;
        } finally {
            a.edit().remove(str).apply();
        }
    }

    protected static void a(final uk ukVar, int i, Intent intent) {
        chc b = uq.b(ukVar.j);
        if (i != -1 || intent == null || b == null) {
            String toLowerCase = b != null ? b.getClass().getSimpleName().toLowerCase() : "unknown";
            StringBuilder stringBuilder = new StringBuilder("paypal.");
            stringBuilder.append(toLowerCase);
            stringBuilder.append(".canceled");
            ukVar.a(stringBuilder.toString());
            if (i != 0) {
                ukVar.a(13591);
            }
            return;
        }
        chd a;
        boolean a2 = uq.a(intent);
        Context context = ukVar.j;
        chb.a(context);
        che che;
        if (intent != null && intent.getData() != null) {
            cic cic;
            che = chb.a;
            a = b.a(intent.getData());
            int i2 = 1.a[a.a.ordinal()];
            if (i2 == 1) {
                context = che.a;
                cic = cic.Error;
            } else if (i2 == 2) {
                context = che.a;
                cic = cic.Cancel;
            } else if (i2 == 3) {
                context = che.a;
                cic = cic.Return;
            }
            b.a(context, cic);
        } else if (intent == null || intent.getExtras() == null || intent.getExtras().isEmpty()) {
            b.a(context, cic.Cancel);
            a = new chd();
        } else {
            che = chb.a;
            Bundle extras = intent.getExtras();
            if (b.a(extras)) {
                b.a(che.a, cic.Return);
                a = cif.a(extras);
            } else {
                String str = "error";
                if (extras.containsKey(str)) {
                    b.a(che.a, cic.Error);
                    a = new chd(new chz(extras.getString(str)));
                } else {
                    b.a(che.a, cic.Error);
                    a = new chd(new chy("invalid wallet response"));
                }
            }
        }
        int i3 = 2.a[a.a.ordinal()];
        if (i3 == 1) {
            ukVar.a(new va(a.b.getMessage()));
            uq.a(ukVar, b, a2, "failed");
        } else if (i3 != 2) {
            if (i3 == 3) {
                us.a(ukVar, uq.a(uq.a(ukVar.j), b, a, intent), new vr() {
                    public final void a(Exception exception) {
                        ukVar.a(exception);
                    }

                    public final void a(xd xdVar) {
                        if ((xdVar instanceof wx) && ((wx) xdVar).a != null) {
                            ukVar.a("paypal.credit.accepted");
                        }
                        ukVar.a(xdVar);
                    }
                });
                uq.a(ukVar, b, a2, "succeeded");
            }
        } else {
            uq.a(ukVar, b, a2, "canceled");
            ukVar.a(13591);
        }
    }

    private static void a(uk ukVar, chc chc, boolean z, String str) {
        String str2 = chc instanceof cha ? "paypal-single-payment" : "paypal-future-payments";
        String str3 = z ? "appswitch" : "webswitch";
        ukVar.a(String.format("%s.%s.%s", new Object[]{str2, str3, str}));
    }

    private static boolean a(Intent intent) {
        return intent.getData() == null;
    }

    private static chc b(Context context) {
        String str = "";
        String str2 = "com.braintreepayments.api.PayPal.REQUEST_TYPE_KEY";
        String str3 = "com.braintreepayments.api.PayPal.REQUEST_KEY";
        SharedPreferences a = wc.a(context);
        try {
            Object createFromParcel;
            byte[] decode = Base64.decode(a.getString(str3, str), 0);
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(decode, 0, decode.length);
            obtain.setDataPosition(0);
            str = a.getString(str2, str);
            if (cgy.class.getSimpleName().equals(str)) {
                createFromParcel = cgy.CREATOR.createFromParcel(obtain);
            } else if (cgz.class.getSimpleName().equals(str)) {
                createFromParcel = cgz.CREATOR.createFromParcel(obtain);
            } else {
                if (cha.class.getSimpleName().equals(str)) {
                    createFromParcel = cha.CREATOR.createFromParcel(obtain);
                }
                a.edit().remove(str3).remove(str2).apply();
                return null;
            }
            chc chc = (chc) createFromParcel;
            a.edit().remove(str3).remove(str2).apply();
            return chc;
        } catch (Exception unused) {
        } catch (Throwable th) {
            a.edit().remove(str3).remove(str2).apply();
        }
    }
}
