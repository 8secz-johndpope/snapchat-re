package defpackage;

import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.FriendmojiCategory;
import java.util.Calendar;
import java.util.Map;

/* renamed from: jjj */
public final class jjj {
    public static String a(CalendarDate calendarDate, ihh ihh) {
        boolean isSameDay;
        String str = "clock";
        akcr.b(ihh, str);
        akcr.b(ihh, str);
        if (calendarDate != null) {
            Object instance = Calendar.getInstance();
            akcr.a(instance, "calendar");
            instance.setTimeInMillis(ihh.a());
            isSameDay = calendarDate.isSameDay(instance);
        } else {
            isSameDay = false;
        }
        return isSameDay ? FriendmojiCategory.BIRTHDAY.getEmoji() : "";
    }

    public static String a(Map<String, String> map, FriendmojiCategory friendmojiCategory, ihh ihh, Integer num, Long l) {
        akcr.b(map, "friendmojiMap");
        akcr.b(friendmojiCategory, "category");
        akcr.b(ihh, "clock");
        if ((friendmojiCategory == FriendmojiCategory.STREAK ? 1 : null) == null) {
            String str = (String) map.get(friendmojiCategory.getCategory());
            if (str == null) {
                str = "";
            }
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (num != null) {
            int intValue = num.intValue();
            stringBuilder.append(intValue == 100 ? "💯" : String.valueOf(intValue));
        }
        stringBuilder.append((String) map.get(friendmojiCategory.getCategory()));
        if (l != null) {
            stringBuilder.append(((Number) l).longValue() % 2 == 0 ? "⏳" : "⌛");
        }
        Object stringBuilder2 = stringBuilder.toString();
        akcr.a(stringBuilder2, "streakEmojiBuilder.toString()");
        return stringBuilder2;
    }
}
