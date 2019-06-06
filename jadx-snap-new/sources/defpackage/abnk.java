package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import com.snapchat.android.R;
import com.snapchat.android.framework.misc.AppContext;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: abnk */
public final class abnk {
    private static final akty a = aktx.a("E HH:mm");
    private static final akty b = aktx.a("E h:mm a");
    private static final akty c = aktx.a("E");
    private static final akty d = aktx.a("MMM yyyy");
    private static final akty e = aktx.a("yyyy'年'M'月'");
    private static final akty f = aktx.a("yyyy'년' M'월'");
    private static final akty g = aktx.a("MMM d");
    private static final akty h = aktx.a("MMM d.");
    private static final akty i;
    private static final akty j = aktx.a("M'월' d'일'");
    private static final akty k;
    private static final akty l = aktx.a("d MMM");
    private static final akty m = aktx.a("d' de 'MMM");
    private static final akty n = aktx.a("d. MMM");
    private static final akty o = aktx.a("d, MMM");
    private static final akty p = aktx.a("dd MMM");
    private static final akty q = aktx.a("dd. MMM");
    private static final akty r = aktx.a("dd' de 'MMM");
    private static final akty s = aktx.a("d 'ta’' MMM");
    private static final akty t = aktx.a("'Ngày' dd 'tháng' M");

    static {
        String str = "M'月'd'日'";
        i = aktx.a(str);
        k = aktx.a(str);
    }

    private static String a(int i, Object... objArr) {
        return AppContext.get().getString(i, objArr);
    }

    public static String a(long j) {
        long j2 = j;
        akqy akqy = new akqy(System.currentTimeMillis());
        akqy akqy2 = new akqy(j2);
        long j3 = akqy.a - j2;
        int toDays = (int) TimeUnit.MILLISECONDS.toDays(j3);
        if (toDays >= 7) {
            return (toDays < 180 || akqy.a(akra.e) == akqy2.a(akra.e)) ? abnk.a(AppContext.get().getString(R.string.date_format_mmm_d)).format(Long.valueOf(j)) : abnk.a(AppContext.get().getString(R.string.date_format_mmm_d_yyyy)).format(Long.valueOf(j));
        } else {
            if (toDays == 6 && akqy2.a(akra.l) == akqy.a(akra.l)) {
                return abnk.a(AppContext.get().getString(R.string.date_format_mmm_d)).format(Long.valueOf(j));
            }
            String str = "EEEE";
            if (toDays >= 3) {
                return abnk.a(str).format(Long.valueOf(j));
            }
            int a = akqy.a(akra.p);
            Object obj = (a < 0 || a >= 4) ? null : 1;
            int toSeconds = (int) TimeUnit.MILLISECONDS.toSeconds(j3);
            int toMinutes = (int) TimeUnit.MILLISECONDS.toMinutes(j3);
            int toHours = (int) TimeUnit.MILLISECONDS.toHours(j3);
            if (obj != null) {
                a = (int) TimeUnit.MILLISECONDS.toHours(j3 - ((long) akqy.h()));
                if (a >= 48) {
                    return abnk.a(str).format(Long.valueOf(j));
                }
                if (a >= 24) {
                    return AppContext.get().getString(R.string.yesterday);
                }
                if (toHours != 0) {
                    return abnk.a(R.string.hours_ago_abbreviated, Integer.valueOf(toHours));
                } else if (toMinutes != 0) {
                    return abnk.a(R.string.minutes_ago_abbreviated, Integer.valueOf(toMinutes));
                } else if (toSeconds < 10) {
                    return AppContext.get().getString(R.string.just_now);
                } else {
                    return abnk.a(R.string.seconds_ago_abbreviated, Integer.valueOf(toSeconds));
                }
            } else if (toHours >= a + 24) {
                return abnk.a(str).format(Long.valueOf(j));
            } else {
                if (toHours >= 24) {
                    return AppContext.get().getString(R.string.yesterday);
                }
                if (toHours != 0) {
                    return abnk.a(R.string.hours_ago_abbreviated, Integer.valueOf(toHours));
                } else if (toMinutes != 0) {
                    return abnk.a(R.string.minutes_ago_abbreviated, Integer.valueOf(toMinutes));
                } else if (toSeconds < 10) {
                    return AppContext.get().getString(R.string.just_now);
                } else {
                    return abnk.a(R.string.seconds_ago_abbreviated, Integer.valueOf(toSeconds));
                }
            }
        }
    }

    public static String a(Context context, long j, boolean z) {
        long abs = Math.abs(System.currentTimeMillis() - j);
        long j2 = abs / 1000;
        if (j2 <= 10) {
            return z ? context.getString(R.string.just_now).toLowerCase(Locale.getDefault()) : context.getString(R.string.just_now);
        } else {
            if (abs < 60000) {
                return context.getString(R.string.seconds_ago_abbreviated, new Object[]{Long.valueOf(j2)});
            } else if (abs < 3600000) {
                return context.getString(R.string.minutes_ago_abbreviated, new Object[]{Long.valueOf(j2 / 60)});
            } else if (abs < 86400000) {
                return context.getString(R.string.hours_ago_abbreviated, new Object[]{Long.valueOf(j2 / 3600)});
            } else {
                akty akty;
                j2 /= 86400;
                boolean is24HourFormat = DateFormat.is24HourFormat(context);
                if (j2 == 1) {
                    akty = is24HourFormat ? a : b;
                } else if (j2 < 7) {
                    akty = c;
                } else {
                    String str = "ko";
                    String str2 = "ja";
                    String str3 = ukq.c;
                    String toLowerCase;
                    if (j2 < 365) {
                        toLowerCase = Locale.getDefault().toString().toLowerCase(Locale.US);
                        if (toLowerCase.startsWith("hr") || toLowerCase.startsWith("cs") || toLowerCase.startsWith("da") || toLowerCase.startsWith("de") || toLowerCase.startsWith("fi") || toLowerCase.startsWith("is") || toLowerCase.startsWith("it_ch") || toLowerCase.startsWith("no")) {
                            akty = n;
                        } else if (toLowerCase.startsWith("mk")) {
                            akty = o;
                        } else if (toLowerCase.startsWith("es_hn") || toLowerCase.startsWith("es_ni")) {
                            akty = r;
                        } else if (toLowerCase.startsWith("es") || toLowerCase.startsWith("pt")) {
                            akty = m;
                        } else {
                            String str4 = "ru";
                            if (!(toLowerCase.startsWith(str4) || toLowerCase.startsWith("be") || toLowerCase.startsWith("ca") || toLowerCase.startsWith("el") || toLowerCase.startsWith("en_au") || toLowerCase.startsWith("en_in") || toLowerCase.startsWith("en_nz") || toLowerCase.startsWith("et") || toLowerCase.startsWith("fr") || toLowerCase.startsWith("ga") || toLowerCase.startsWith("hi") || toLowerCase.startsWith("it") || toLowerCase.startsWith("lv"))) {
                                String str5 = "mt";
                                if (!(toLowerCase.startsWith(str5) || toLowerCase.startsWith("nl") || toLowerCase.startsWith("pl") || toLowerCase.startsWith("sv") || toLowerCase.startsWith("th") || toLowerCase.startsWith("uk"))) {
                                    if (toLowerCase.startsWith("ar") || toLowerCase.startsWith("bg") || toLowerCase.startsWith("en_gb") || toLowerCase.startsWith("en_ie") || toLowerCase.startsWith("en_mt") || toLowerCase.startsWith("en_za") || toLowerCase.startsWith("in") || toLowerCase.startsWith("ms") || toLowerCase.startsWith("ro") || toLowerCase.startsWith(str4) || toLowerCase.startsWith("tr") || toLowerCase.startsWith("zh_sg")) {
                                        akty = p;
                                    } else if (toLowerCase.startsWith("sl") || toLowerCase.startsWith("sr")) {
                                        akty = q;
                                    } else if (toLowerCase.startsWith(str5)) {
                                        akty = s;
                                    } else if (toLowerCase.startsWith("vi")) {
                                        akty = t;
                                    } else if (toLowerCase.startsWith(str3)) {
                                        akty = k;
                                    } else if (toLowerCase.startsWith(str2)) {
                                        akty = i;
                                    } else if (toLowerCase.startsWith(str)) {
                                        akty = j;
                                    } else if (toLowerCase.startsWith("hu")) {
                                        akty = h;
                                    } else if (toLowerCase.startsWith("sq") || toLowerCase.startsWith("en") || toLowerCase.startsWith("lt") || toLowerCase.startsWith("sk")) {
                                        akty = g;
                                    }
                                }
                            }
                            akty = l;
                        }
                    } else {
                        toLowerCase = Locale.getDefault().toString().toLowerCase(Locale.US);
                        akty = (toLowerCase.startsWith(str3) || toLowerCase.startsWith(str2)) ? e : toLowerCase.startsWith(str) ? f : d;
                    }
                }
                return akty.a(j);
            }
        }
    }

    private static java.text.DateFormat a(String str) {
        return new SimpleDateFormat(str, Locale.getDefault());
    }
}
