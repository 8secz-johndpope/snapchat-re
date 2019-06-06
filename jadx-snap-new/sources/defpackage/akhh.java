package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: akhh */
public interface akhh {
    public static final akhh a = new 1();

    /* renamed from: akhh$1 */
    class 1 implements akhh {
        1() {
        }

        public final List<InetAddress> a(String str) {
            if (str != null) {
                return Arrays.asList(InetAddress.getAllByName(str));
            }
            throw new UnknownHostException("hostname == null");
        }
    }

    List<InetAddress> a(String str);
}
