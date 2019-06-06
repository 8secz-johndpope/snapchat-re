package defpackage;

import android.content.Context;
import com.addlive.djinni.CommunicationError;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: awk */
public class awk {
    private static volatile Integer a;

    public static int a(Context context) {
        if (a == null) {
            synchronized (awk.class) {
                if (a == null) {
                    int i;
                    long a = awj.a(context);
                    int i2 = CommunicationError.CLIENT_VERSION_NOT_SUPPORTED;
                    if (a == -1) {
                        ArrayList arrayList = new ArrayList();
                        int a2 = awj.a();
                        a2 = a2 <= 0 ? -1 : a2 == 1 ? 2008 : a2 <= 3 ? CommunicationError.CLIENT_VERSION_NOT_SUPPORTED : 2012;
                        awk.a(arrayList, a2);
                        long b = (long) awj.b();
                        a2 = b == -1 ? -1 : b <= 528000 ? 2008 : b <= 620000 ? CommunicationError.ALREADY_JOINED : b <= 1020000 ? 2010 : b <= 1220000 ? CommunicationError.CLIENT_VERSION_NOT_SUPPORTED : b <= 1520000 ? 2012 : b <= 2020000 ? 2013 : 2014;
                        awk.a(arrayList, a2);
                        long a3 = awj.a(context);
                        if (a3 <= 0) {
                            i2 = -1;
                        } else if (a3 <= 201326592) {
                            i2 = 2008;
                        } else if (a3 <= 304087040) {
                            i2 = CommunicationError.ALREADY_JOINED;
                        } else if (a3 <= 536870912) {
                            i2 = 2010;
                        } else if (a3 > 1073741824) {
                            i2 = a3 <= 1610612736 ? 2012 : a3 <= 2147483648L ? 2013 : 2014;
                        }
                        awk.a(arrayList, i2);
                        if (arrayList.isEmpty()) {
                            i = -1;
                        } else {
                            Collections.sort(arrayList);
                            if ((arrayList.size() & 1) == 1) {
                                i = ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
                            } else {
                                a2 = (arrayList.size() / 2) - 1;
                                i = ((Integer) arrayList.get(a2)).intValue() + ((((Integer) arrayList.get(a2 + 1)).intValue() - ((Integer) arrayList.get(a2)).intValue()) / 2);
                            }
                        }
                    } else if (a <= 805306368) {
                        i = awj.a() <= 1 ? CommunicationError.ALREADY_JOINED : 2010;
                    } else {
                        if (a > 1073741824) {
                            if (a <= 1610612736) {
                                if (awj.b() < 1800000) {
                                }
                            } else if (a > 2147483648L) {
                                i = a <= 3221225472L ? 2014 : CommunicationError.NEW_USER_CONNECTED_SAME_ID;
                            }
                            i = 2013;
                        } else if (awj.b() < 1300000) {
                            i = CommunicationError.CLIENT_VERSION_NOT_SUPPORTED;
                        }
                        i = 2012;
                    }
                    a = Integer.valueOf(i);
                }
            }
        }
        return a.intValue();
    }

    private static void a(ArrayList<Integer> arrayList, int i) {
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }
}
