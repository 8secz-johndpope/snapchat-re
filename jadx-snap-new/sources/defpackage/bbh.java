package defpackage;

import com.google.android.gms.internal.zzaky;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
/* renamed from: bbh */
public class bbh {

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: bbh$b */
    public @interface b {
        String a();

        boolean b() default true;
    }

    /* renamed from: bbh$a */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public final void a(Map<String, String> map) {
        String str;
        StringBuilder stringBuilder;
        String str2;
        String str3 = "Server option \"";
        HashMap hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            b bVar = (b) field.getAnnotation(b.class);
            if (bVar != null) {
                hashMap.put(bVar.a(), field);
            }
        }
        if (hashMap.isEmpty()) {
            zzaky.zzcz("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Entry entry : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException unused) {
                    str = (String) entry.getKey();
                    stringBuilder = new StringBuilder(String.valueOf(str).length() + 49);
                    stringBuilder.append(str3);
                    stringBuilder.append(str);
                    str = "\" could not be set: Illegal Access";
                    stringBuilder.append(str);
                    zzaky.zzcz(stringBuilder.toString());
                } catch (IllegalArgumentException unused2) {
                    str = (String) entry.getKey();
                    stringBuilder = new StringBuilder(String.valueOf(str).length() + 43);
                    stringBuilder.append(str3);
                    stringBuilder.append(str);
                    str = "\" could not be set: Bad Type";
                    stringBuilder.append(str);
                    zzaky.zzcz(stringBuilder.toString());
                }
            } else {
                str2 = (String) entry.getKey();
                str = (String) entry.getValue();
                StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str2).length() + 31) + String.valueOf(str).length());
                stringBuilder2.append("Unexpected server option: ");
                stringBuilder2.append(str2);
                stringBuilder2.append(" = \"");
                stringBuilder2.append(str);
                stringBuilder2.append("\"");
                zzaky.zzby(stringBuilder2.toString());
            }
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        for (Field field3 : hashMap.values()) {
            if (((b) field3.getAnnotation(b.class)).b()) {
                str = "Required server option missing: ";
                str2 = String.valueOf(((b) field3.getAnnotation(b.class)).a());
                zzaky.zzcz(str2.length() != 0 ? str.concat(str2) : new String(str));
                if (stringBuilder3.length() > 0) {
                    stringBuilder3.append(ppy.d);
                }
                stringBuilder3.append(((b) field3.getAnnotation(b.class)).a());
            }
        }
        if (stringBuilder3.length() > 0) {
            String str4 = "Required server option(s) missing: ";
            String valueOf = String.valueOf(stringBuilder3.toString());
            throw new a(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
        }
    }
}
