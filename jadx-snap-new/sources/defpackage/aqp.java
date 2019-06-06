package defpackage;

import java.util.List;

/* renamed from: aqp */
public interface aqp {
    List<aqo> getBoxes();

    <T extends aqo> List<T> getBoxes(Class<T> cls, boolean z);
}
