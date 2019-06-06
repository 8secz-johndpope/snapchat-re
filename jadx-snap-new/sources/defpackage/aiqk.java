package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: aiqk */
final class aiqk implements Callable<Map<String, aiqq>> {
    private String a;

    aiqk(String str) {
        this.a = str;
    }

    private static aiqq a(ZipEntry zipEntry, ZipFile zipFile) {
        Throwable e;
        StringBuilder stringBuilder;
        Throwable th;
        Closeable inputStream;
        try {
            inputStream = zipFile.getInputStream(zipEntry);
            try {
                Properties properties = new Properties();
                properties.load(inputStream);
                String property = properties.getProperty("fabric-identifier");
                String property2 = properties.getProperty("fabric-version");
                String property3 = properties.getProperty("fabric-build-type");
                if (TextUtils.isEmpty(property) || TextUtils.isEmpty(property2)) {
                    StringBuilder stringBuilder2 = new StringBuilder("Invalid format of fabric file,");
                    stringBuilder2.append(zipEntry.getName());
                    throw new IllegalStateException(stringBuilder2.toString());
                }
                aiqq aiqq = new aiqq(property, property2, property3);
                airf.a(inputStream);
                return aiqq;
            } catch (IOException e2) {
                e = e2;
                try {
                    stringBuilder = new StringBuilder("Error when parsing fabric properties ");
                    stringBuilder.append(zipEntry.getName());
                    aiqj.a().c("Fabric", stringBuilder.toString(), e);
                    airf.a(inputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    airf.a(inputStream);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            inputStream = null;
            stringBuilder = new StringBuilder("Error when parsing fabric properties ");
            stringBuilder.append(zipEntry.getName());
            aiqj.a().c("Fabric", stringBuilder.toString(), e);
            airf.a(inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            airf.a(inputStream);
            throw th;
        }
    }

    private static Map<String, aiqq> a() {
        HashMap hashMap = new HashMap();
        try {
            Class.forName("com.google.android.gms.ads.AdView");
            aiqq aiqq = new aiqq("com.google.firebase.firebase-ads", "0.0.0", "binary");
            hashMap.put(aiqq.a, aiqq);
            aiqj.a().b("Fabric", "Found kit: com.google.firebase.firebase-ads");
        } catch (Exception unused) {
        }
        return hashMap;
    }

    private Map<String, aiqq> b() {
        HashMap hashMap = new HashMap();
        ZipFile zipFile = new ZipFile(this.a);
        Enumeration entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            if (zipEntry.getName().startsWith("fabric/") && zipEntry.getName().length() > 7) {
                aiqq a = aiqk.a(zipEntry, zipFile);
                if (a != null) {
                    hashMap.put(a.a, a);
                    aiqj.a().b("Fabric", String.format("Found kit:[%s] version:[%s]", new Object[]{a.a, a.b}));
                }
            }
        }
        try {
            zipFile.close();
        } catch (IOException unused) {
        }
        return hashMap;
    }

    public final /* synthetic */ Object call() {
        HashMap hashMap = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hashMap.putAll(aiqk.a());
        hashMap.putAll(b());
        aiqr a = aiqj.a();
        StringBuilder stringBuilder = new StringBuilder("finish scanning in ");
        stringBuilder.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        a.b("Fabric", stringBuilder.toString());
        return hashMap;
    }
}
