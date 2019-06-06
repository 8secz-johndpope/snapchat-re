package defpackage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

/* renamed from: abrg */
public final class abrg {
    private static final ThreadLocal<Random> a = new 1();

    /* renamed from: abrg$1 */
    static class 1 extends ThreadLocal<Random> {
        1() {
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ Object initialValue() {
            return new Random();
        }
    }

    public static int a(InputStream inputStream, File file) {
        file.getParentFile().mkdirs();
        file.createNewFile();
        OutputStream b = abrg.b(file);
        int a = abrg.a(inputStream, b);
        b.close();
        return a;
    }

    private static int a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[16384];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, 16384);
            if (read <= 0) {
                break;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
        return j > 2147483647L ? -1 : (int) j;
    }

    public static BufferedInputStream a(File file) {
        return new BufferedInputStream(abrg.d(file), 16384);
    }

    public static BufferedInputStream a(InputStream inputStream) {
        return new BufferedInputStream(inputStream, 16384);
    }

    public static BufferedInputStream a(String str) {
        return new BufferedInputStream(abrg.d(new File(str)), 16384);
    }

    public static BufferedOutputStream a(OutputStream outputStream) {
        return new BufferedOutputStream(outputStream, 16384);
    }

    public static String a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(((Random) a.get()).nextInt(Integer.MAX_VALUE));
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public static void a(File file, File file2) {
        Throwable th;
        Closeable closeable = null;
        Closeable fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                Closeable fileOutputStream = new FileOutputStream(file2);
                try {
                    abrg.b(fileInputStream, fileOutputStream);
                    abqt.a(fileInputStream);
                    abqt.a(fileOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    closeable = fileOutputStream;
                    abqt.a(fileInputStream);
                    abqt.a(closeable);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                abqt.a(fileInputStream);
                abqt.a(closeable);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            abqt.a(fileInputStream);
            abqt.a(closeable);
            throw th;
        }
    }

    public static void a(FileInputStream fileInputStream, FileOutputStream fileOutputStream) {
        Closeable channel = fileInputStream.getChannel();
        Closeable channel2 = fileOutputStream.getChannel();
        try {
            channel2.transferFrom(channel, 0, channel.size());
        } catch (IOException unused) {
        } catch (Throwable th) {
            abqt.a(channel);
            abqt.a(channel2);
        }
        abqt.a(channel);
        abqt.a(channel2);
    }

    public static byte[] a(InputStream inputStream, int i) {
        OutputStream aklo = new aklo(i);
        abrg.a(inputStream, aklo);
        return aklo.a();
    }

    public static long b(String str) {
        File file = new File(str);
        return file.exists() ? file.length() : 0;
    }

    public static BufferedOutputStream b(File file) {
        return new BufferedOutputStream(new FileOutputStream(file), 16384);
    }

    private static void b(FileInputStream fileInputStream, FileOutputStream fileOutputStream) {
        Closeable channel = fileInputStream.getChannel();
        Closeable channel2 = fileOutputStream.getChannel();
        try {
            channel.transferTo(0, channel.size(), channel2);
        } catch (IOException unused) {
        } catch (Throwable th) {
            abqt.a(channel);
            abqt.a(channel2);
        }
        abqt.a(channel);
        abqt.a(channel2);
    }

    public static byte[] b(InputStream inputStream) {
        return abrg.a(inputStream, 16384);
    }

    public static byte[] c(File file) {
        Throwable th;
        Closeable closeable = null;
        try {
            Closeable bufferedInputStream = new BufferedInputStream(abrg.d(file), 32768);
            try {
                byte[] a = abrg.a((InputStream) bufferedInputStream, (int) file.length());
                aklc.a(bufferedInputStream);
                return a;
            } catch (Throwable th2) {
                th = th2;
                closeable = bufferedInputStream;
                aklc.a(closeable);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            aklc.a(closeable);
            throw th;
        }
    }

    private static FileInputStream d(File file) {
        String str = "File '";
        StringBuilder stringBuilder;
        if (!file.exists()) {
            stringBuilder = new StringBuilder(str);
            stringBuilder.append(file);
            stringBuilder.append("' does not exist");
            throw new FileNotFoundException(stringBuilder.toString());
        } else if (file.isDirectory()) {
            stringBuilder = new StringBuilder(str);
            stringBuilder.append(file);
            stringBuilder.append("' exists but is a directory");
            throw new IOException(stringBuilder.toString());
        } else if (file.canRead()) {
            return new FileInputStream(file);
        } else {
            stringBuilder = new StringBuilder(str);
            stringBuilder.append(file);
            stringBuilder.append("' cannot be read");
            throw new IOException(stringBuilder.toString());
        }
    }
}
