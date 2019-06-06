package defpackage;

import java.util.Arrays;

/* renamed from: cnh */
public final class cnh {
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    private final String f;
    private final String g;
    private final long h;

    public cnh(ajwy<ftl> ajwy) {
        akcr.b(ajwy, "compositeConfigurationProvider");
        Object j = ((ftl) ajwy.get()).j(cld.SNAPCHAT_TRACKING_HOST);
        akcr.a(j, "compositeConfigurationPr…y.SNAPCHAT_TRACKING_HOST)");
        this.f = j;
        String str = "https://%s/";
        Object format = String.format(str, Arrays.copyOf(new Object[]{this.f}, 1));
        str = "java.lang.String.format(format, *args)";
        akcr.a(format, str);
        this.a = format;
        format = ((ftl) ajwy.get()).j(cld.SNAPCHAT_PIXEL_TRACKING_PATH);
        akcr.a(format, "compositeConfigurationPr…CHAT_PIXEL_TRACKING_PATH)");
        this.g = format;
        String str2 = "https://%s%s";
        j = String.format(str2, Arrays.copyOf(new Object[]{this.f, this.g}, 2));
        akcr.a(j, str);
        this.b = j;
        j = ((ftl) ajwy.get()).j(cld.SNAPCHAT_PIXEL_TRACKING_COOKIE_NAME);
        akcr.a(j, "compositeConfigurationPr…XEL_TRACKING_COOKIE_NAME)");
        this.c = j;
        j = ((ftl) ajwy.get()).j(cld.SNAPCHAT_PIXEL_TRACKING_CLIENT_TTL_COOKIE_NAME);
        akcr.a(j, "compositeConfigurationPr…G_CLIENT_TTL_COOKIE_NAME)");
        this.d = j;
        this.h = ((ftl) ajwy.get()).h(cld.SNAPCHAT_TRACKING_CLIENT_TTL_MS) / 1000;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.d);
        stringBuilder.append("=; domain=.snapchat.com; path=/; max-age=");
        stringBuilder.append(this.h);
        stringBuilder.append("; secure");
        this.e = stringBuilder.toString();
    }

    public static String a(String str) {
        akcr.b(str, "cookie");
        String str2 = "set-cookie:%s";
        Object format = String.format(str2, Arrays.copyOf(new Object[]{str}, 1));
        akcr.a(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
