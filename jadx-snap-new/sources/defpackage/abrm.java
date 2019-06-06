package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Set;

/* renamed from: abrm */
final class abrm {
    final SharedPreferences a;

    abrm(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    /* Access modifiers changed, original: final */
    public final void a(Iterable<String> iterable) {
        Editor edit = this.a.edit();
        for (String remove : iterable) {
            edit.remove(remove);
        }
        edit.commit();
    }

    /* Access modifiers changed, original: final */
    public final void b(Iterable<abrp> iterable) {
        Editor edit = this.a.edit();
        for (abrp abrp : iterable) {
            if (abrp.b.isPresent()) {
                String str = abrp.a;
                Object obj = abrp.b.get();
                switch (abrp.c) {
                    case BOOLEAN:
                        edit.putBoolean(str, ((Boolean) obj).booleanValue());
                        break;
                    case INTEGER:
                        edit.putInt(str, ((Integer) obj).intValue());
                        break;
                    case LONG:
                        edit.putLong(str, ((Long) obj).longValue());
                        break;
                    case FLOAT:
                        edit.putFloat(str, ((Float) obj).floatValue());
                        break;
                    case STRING:
                        edit.putString(str, (String) obj);
                        break;
                    case STRINGSET:
                        edit.putStringSet(str, (Set) obj);
                        break;
                    default:
                        break;
                }
            }
            edit.remove(abrp.a);
        }
        edit.apply();
    }
}
