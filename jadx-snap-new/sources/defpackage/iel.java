package defpackage;

import android.app.Application;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.snapchat.android.framework.misc.AppContext;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* renamed from: iel */
public final class iel {
    public static String[] a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(Locale.getDefault().getLanguage());
        Application application = AppContext.get();
        if (application != null) {
            int i;
            InputMethodManager inputMethodManager = (InputMethodManager) application.getSystemService("input_method");
            Iterator it = inputMethodManager.getEnabledInputMethodList().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList((InputMethodInfo) it.next(), false)) {
                    String language = (VERSION.SDK_INT < 24 || inputMethodSubtype.getLanguageTag().isEmpty()) ? new Locale(inputMethodSubtype.getLocale()).getLanguage() : inputMethodSubtype.getLanguageTag();
                    if (!language.isEmpty()) {
                        linkedHashSet.add(language);
                    }
                }
            }
            if (VERSION.SDK_INT >= 24) {
                LocaleList localeList = LocaleList.getDefault();
                while (i < localeList.size()) {
                    linkedHashSet.add(localeList.get(i).getLanguage());
                    i++;
                }
            }
        }
        return (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
    }
}
