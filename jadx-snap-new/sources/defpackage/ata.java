package defpackage;

import org.opencv.imgproc.Imgproc;

/* renamed from: ata */
final class ata implements atm {
    private final int a = Imgproc.INTER_TAB_SIZE2;
    private final atm[] b;
    private final atb c;

    public ata(atm... atmArr) {
        this.b = atmArr;
        this.c = new atb();
    }

    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= Imgproc.INTER_TAB_SIZE2) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (atm atm : this.b) {
            if (stackTraceElementArr2.length <= Imgproc.INTER_TAB_SIZE2) {
                break;
            }
            stackTraceElementArr2 = atm.a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > Imgproc.INTER_TAB_SIZE2) {
            stackTraceElementArr2 = this.c.a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
