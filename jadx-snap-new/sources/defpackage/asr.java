package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: asr */
final class asr implements asa {
    final asj a;

    /* renamed from: asr$1 */
    class 1 implements InvocationHandler {
        1() {
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (objArr.length == 4) {
                String str = (String) objArr[0];
                String str2 = (String) objArr[1];
                Bundle bundle = (Bundle) objArr[2];
                if (!(str == null || str.equals("crash"))) {
                    asj asj = asr.this.a;
                    try {
                        StringBuilder stringBuilder = new StringBuilder("$A$:");
                        stringBuilder.append(asr.a(str2, bundle));
                        asj.a(stringBuilder.toString());
                    } catch (JSONException unused) {
                        aiqj.a().d("CrashlyticsCore", "Unable to serialize Firebase Analytics event; ".concat(String.valueOf(str2)));
                    }
                }
                return null;
            }
            throw new RuntimeException("Unexpected AppMeasurement.OnEventListener signature");
        }
    }

    asr(asj asj) {
        this.a = asj;
    }

    private Class<?> a(String str) {
        try {
            return this.a.f.getClassLoader().loadClass(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private Object a(Class<?> cls) {
        try {
            return cls.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(cls, new Object[]{this.a.f});
        } catch (Exception unused) {
            return null;
        }
    }

    static String a(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    private boolean a(Class<?> cls, Object obj, String str) {
        Throwable e;
        aiqr a;
        String str2;
        String str3 = "CrashlyticsCore";
        Class a2 = a("com.google.android.gms.measurement.AppMeasurement$OnEventListener");
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, new Class[]{a2});
            Object[] objArr = new Object[1];
            objArr[0] = Proxy.newProxyInstance(this.a.f.getClassLoader(), new Class[]{a2}, new 1());
            declaredMethod.invoke(obj, objArr);
            return true;
        } catch (NoSuchMethodException e2) {
            e = e2;
            a = aiqj.a();
            str = String.valueOf(str);
            str2 = "Expected method missing: ";
            a.b(str3, str2.concat(str), e);
            return false;
        } catch (InvocationTargetException e3) {
            e = e3;
            a = aiqj.a();
            str = String.valueOf(str);
            str2 = "Cannot invoke method: ";
            a.b(str3, str2.concat(str), e);
            return false;
        } catch (IllegalAccessException e4) {
            e = e4;
            a = aiqj.a();
            str = String.valueOf(str);
            str2 = "Cannot access method: ";
            a.b(str3, str2.concat(str), e);
            return false;
        }
    }

    public final boolean a() {
        aiqr a;
        String str;
        Class a2 = a("com.google.android.gms.measurement.AppMeasurement");
        String str2 = "CrashlyticsCore";
        if (a2 == null) {
            a = aiqj.a();
            str = "Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.";
        } else {
            Object a3 = a(a2);
            if (a3 != null) {
                return a(a2, a3, "registerOnMeasurementEventListener");
            }
            a = aiqj.a();
            str = "Could not create an instance of Firebase Analytics.";
        }
        a.d(str2, str);
        return false;
    }
}
