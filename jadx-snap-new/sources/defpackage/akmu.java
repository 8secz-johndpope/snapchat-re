package defpackage;

import com.addlive.djinni.LogicError;
import java.util.Calendar;
import java.util.Date;

/* renamed from: akmu */
public final class akmu {
    static {
        r0 = new int[8][];
        r0[0] = new int[]{14};
        r0[1] = new int[]{13};
        r0[2] = new int[]{12};
        r0[3] = new int[]{11, 10};
        r0[4] = new int[]{5, 5, 9};
        r0[5] = new int[]{2, LogicError.INVALID_SCOPE};
        r0[6] = new int[]{1};
        r0[7] = new int[]{0};
    }

    public static Date a(Date date, int i, int i2) {
        if (date != null) {
            Calendar instance = Calendar.getInstance();
            instance.setLenient(false);
            instance.setTime(date);
            instance.set(i, i2);
            return instance.getTime();
        }
        throw new IllegalArgumentException("The date must not be null");
    }
}
