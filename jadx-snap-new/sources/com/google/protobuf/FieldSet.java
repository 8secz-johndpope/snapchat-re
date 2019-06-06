package com.google.protobuf;

import com.google.protobuf.Internal.EnumLite;
import com.google.protobuf.Internal.EnumLiteMap;
import com.google.protobuf.MessageLite.Builder;
import com.google.protobuf.WireFormat.FieldType;
import com.google.protobuf.WireFormat.JavaType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class FieldSet<FieldDescriptorType extends FieldDescriptorLite<FieldDescriptorType>> {
    private static final FieldSet DEFAULT_INSTANCE = new FieldSet(true);
    private final SmallSortedMap<FieldDescriptorType, Object> fields = SmallSortedMap.newFieldMap(16);
    private boolean hasLazyField = false;
    private boolean isImmutable;

    /* renamed from: com.google.protobuf.FieldSet$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType = new int[JavaType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00ed */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0133 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0101 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0086 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00ce */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x010b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0115 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0129 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(64:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(64:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(63:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(61:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(61:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(57:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(57:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        static {
            /*
            r0 = com.google.protobuf.WireFormat.FieldType.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = r0;
            r0 = 1;
            r1 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.google.protobuf.WireFormat.FieldType.DOUBLE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = com.google.protobuf.WireFormat.FieldType.FLOAT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = com.google.protobuf.WireFormat.FieldType.INT64;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = com.google.protobuf.WireFormat.FieldType.UINT64;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = 5;
            r5 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = com.google.protobuf.WireFormat.FieldType.INT32;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5[r6] = r4;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r5 = 6;
            r6 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;	 Catch:{ NoSuchFieldError -> 0x004b }
            r7 = com.google.protobuf.WireFormat.FieldType.FIXED64;	 Catch:{ NoSuchFieldError -> 0x004b }
            r7 = r7.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r6[r7] = r5;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r6 = 7;
            r7 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r8 = com.google.protobuf.WireFormat.FieldType.FIXED32;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r8 = r8.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r7[r8] = r6;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            r7 = 8;
            r8 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r9 = com.google.protobuf.WireFormat.FieldType.BOOL;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r9 = r9.ordinal();	 Catch:{ NoSuchFieldError -> 0x0062 }
            r8[r9] = r7;	 Catch:{ NoSuchFieldError -> 0x0062 }
        L_0x0062:
            r8 = 9;
            r9 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;	 Catch:{ NoSuchFieldError -> 0x006e }
            r10 = com.google.protobuf.WireFormat.FieldType.GROUP;	 Catch:{ NoSuchFieldError -> 0x006e }
            r10 = r10.ordinal();	 Catch:{ NoSuchFieldError -> 0x006e }
            r9[r10] = r8;	 Catch:{ NoSuchFieldError -> 0x006e }
        L_0x006e:
            r9 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;	 Catch:{ NoSuchFieldError -> 0x007a }
            r10 = com.google.protobuf.WireFormat.FieldType.MESSAGE;	 Catch:{ NoSuchFieldError -> 0x007a }
            r10 = r10.ordinal();	 Catch:{ NoSuchFieldError -> 0x007a }
            r11 = 10;
            r9[r10] = r11;	 Catch:{ NoSuchFieldError -> 0x007a }
        L_0x007a:
            r9 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r10 = com.google.protobuf.WireFormat.FieldType.STRING;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r10 = r10.ordinal();	 Catch:{ NoSuchFieldError -> 0x0086 }
            r11 = 11;
            r9[r10] = r11;	 Catch:{ NoSuchFieldError -> 0x0086 }
        L_0x0086:
            r9 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;	 Catch:{ NoSuchFieldError -> 0x0092 }
            r10 = com.google.protobuf.WireFormat.FieldType.BYTES;	 Catch:{ NoSuchFieldError -> 0x0092 }
            r10 = r10.ordinal();	 Catch:{ NoSuchFieldError -> 0x0092 }
            r11 = 12;
            r9[r10] = r11;	 Catch:{ NoSuchFieldError -> 0x0092 }
        L_0x0092:
            r9 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;	 Catch:{ NoSuchFieldError -> 0x009e }
            r10 = com.google.protobuf.WireFormat.FieldType.UINT32;	 Catch:{ NoSuchFieldError -> 0x009e }
            r10 = r10.ordinal();	 Catch:{ NoSuchFieldError -> 0x009e }
            r11 = 13;
            r9[r10] = r11;	 Catch:{ NoSuchFieldError -> 0x009e }
        L_0x009e:
            r9 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;	 Catch:{ NoSuchFieldError -> 0x00aa }
            r10 = com.google.protobuf.WireFormat.FieldType.SFIXED32;	 Catch:{ NoSuchFieldError -> 0x00aa }
            r10 = r10.ordinal();	 Catch:{ NoSuchFieldError -> 0x00aa }
            r11 = 14;
            r9[r10] = r11;	 Catch:{ NoSuchFieldError -> 0x00aa }
        L_0x00aa:
            r9 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;	 Catch:{ NoSuchFieldError -> 0x00b6 }
            r10 = com.google.protobuf.WireFormat.FieldType.SFIXED64;	 Catch:{ NoSuchFieldError -> 0x00b6 }
            r10 = r10.ordinal();	 Catch:{ NoSuchFieldError -> 0x00b6 }
            r11 = 15;
            r9[r10] = r11;	 Catch:{ NoSuchFieldError -> 0x00b6 }
        L_0x00b6:
            r9 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;	 Catch:{ NoSuchFieldError -> 0x00c2 }
            r10 = com.google.protobuf.WireFormat.FieldType.SINT32;	 Catch:{ NoSuchFieldError -> 0x00c2 }
            r10 = r10.ordinal();	 Catch:{ NoSuchFieldError -> 0x00c2 }
            r11 = 16;
            r9[r10] = r11;	 Catch:{ NoSuchFieldError -> 0x00c2 }
        L_0x00c2:
            r9 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;	 Catch:{ NoSuchFieldError -> 0x00ce }
            r10 = com.google.protobuf.WireFormat.FieldType.SINT64;	 Catch:{ NoSuchFieldError -> 0x00ce }
            r10 = r10.ordinal();	 Catch:{ NoSuchFieldError -> 0x00ce }
            r11 = 17;
            r9[r10] = r11;	 Catch:{ NoSuchFieldError -> 0x00ce }
        L_0x00ce:
            r9 = $SwitchMap$com$google$protobuf$WireFormat$FieldType;	 Catch:{ NoSuchFieldError -> 0x00da }
            r10 = com.google.protobuf.WireFormat.FieldType.ENUM;	 Catch:{ NoSuchFieldError -> 0x00da }
            r10 = r10.ordinal();	 Catch:{ NoSuchFieldError -> 0x00da }
            r11 = 18;
            r9[r10] = r11;	 Catch:{ NoSuchFieldError -> 0x00da }
        L_0x00da:
            r9 = com.google.protobuf.WireFormat.JavaType.values();
            r9 = r9.length;
            r9 = new int[r9];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = r9;
            r9 = $SwitchMap$com$google$protobuf$WireFormat$JavaType;	 Catch:{ NoSuchFieldError -> 0x00ed }
            r10 = com.google.protobuf.WireFormat.JavaType.INT;	 Catch:{ NoSuchFieldError -> 0x00ed }
            r10 = r10.ordinal();	 Catch:{ NoSuchFieldError -> 0x00ed }
            r9[r10] = r0;	 Catch:{ NoSuchFieldError -> 0x00ed }
        L_0x00ed:
            r0 = $SwitchMap$com$google$protobuf$WireFormat$JavaType;	 Catch:{ NoSuchFieldError -> 0x00f7 }
            r9 = com.google.protobuf.WireFormat.JavaType.LONG;	 Catch:{ NoSuchFieldError -> 0x00f7 }
            r9 = r9.ordinal();	 Catch:{ NoSuchFieldError -> 0x00f7 }
            r0[r9] = r1;	 Catch:{ NoSuchFieldError -> 0x00f7 }
        L_0x00f7:
            r0 = $SwitchMap$com$google$protobuf$WireFormat$JavaType;	 Catch:{ NoSuchFieldError -> 0x0101 }
            r1 = com.google.protobuf.WireFormat.JavaType.FLOAT;	 Catch:{ NoSuchFieldError -> 0x0101 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0101 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0101 }
        L_0x0101:
            r0 = $SwitchMap$com$google$protobuf$WireFormat$JavaType;	 Catch:{ NoSuchFieldError -> 0x010b }
            r1 = com.google.protobuf.WireFormat.JavaType.DOUBLE;	 Catch:{ NoSuchFieldError -> 0x010b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x010b }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x010b }
        L_0x010b:
            r0 = $SwitchMap$com$google$protobuf$WireFormat$JavaType;	 Catch:{ NoSuchFieldError -> 0x0115 }
            r1 = com.google.protobuf.WireFormat.JavaType.BOOLEAN;	 Catch:{ NoSuchFieldError -> 0x0115 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0115 }
            r0[r1] = r4;	 Catch:{ NoSuchFieldError -> 0x0115 }
        L_0x0115:
            r0 = $SwitchMap$com$google$protobuf$WireFormat$JavaType;	 Catch:{ NoSuchFieldError -> 0x011f }
            r1 = com.google.protobuf.WireFormat.JavaType.STRING;	 Catch:{ NoSuchFieldError -> 0x011f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x011f }
            r0[r1] = r5;	 Catch:{ NoSuchFieldError -> 0x011f }
        L_0x011f:
            r0 = $SwitchMap$com$google$protobuf$WireFormat$JavaType;	 Catch:{ NoSuchFieldError -> 0x0129 }
            r1 = com.google.protobuf.WireFormat.JavaType.BYTE_STRING;	 Catch:{ NoSuchFieldError -> 0x0129 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0129 }
            r0[r1] = r6;	 Catch:{ NoSuchFieldError -> 0x0129 }
        L_0x0129:
            r0 = $SwitchMap$com$google$protobuf$WireFormat$JavaType;	 Catch:{ NoSuchFieldError -> 0x0133 }
            r1 = com.google.protobuf.WireFormat.JavaType.ENUM;	 Catch:{ NoSuchFieldError -> 0x0133 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0133 }
            r0[r1] = r7;	 Catch:{ NoSuchFieldError -> 0x0133 }
        L_0x0133:
            r0 = $SwitchMap$com$google$protobuf$WireFormat$JavaType;	 Catch:{ NoSuchFieldError -> 0x013d }
            r1 = com.google.protobuf.WireFormat.JavaType.MESSAGE;	 Catch:{ NoSuchFieldError -> 0x013d }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x013d }
            r0[r1] = r8;	 Catch:{ NoSuchFieldError -> 0x013d }
        L_0x013d:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.FieldSet$AnonymousClass1.<clinit>():void");
        }
    }

    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        EnumLiteMap<?> getEnumType();

        JavaType getLiteJavaType();

        FieldType getLiteType();

        int getNumber();

        Builder internalMergeFrom(Builder builder, MessageLite messageLite);

        boolean isPacked();

        boolean isRepeated();
    }

    private FieldSet() {
    }

    private FieldSet(boolean z) {
        makeImmutable();
    }

    private void cloneFieldEntry(Map<FieldDescriptorType, Object> map, Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            map.put(fieldDescriptorLite, ((LazyField) value).getValue());
        } else {
            map.put(fieldDescriptorLite, value);
        }
    }

    private Object cloneIfMutable(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int computeElementSize(FieldType fieldType, int i, Object obj) {
        i = CodedOutputStream.computeTagSize(i);
        if (fieldType == FieldType.GROUP) {
            i <<= 1;
        }
        return i + computeElementSizeNoTag(fieldType, obj);
    }

    static int computeElementSizeNoTag(FieldType fieldType, Object obj) {
        switch (fieldType) {
            case DOUBLE:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case FLOAT:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case INT64:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case UINT64:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case INT32:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case FIXED64:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case FIXED32:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case BOOL:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case GROUP:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case MESSAGE:
                return obj instanceof LazyField ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case STRING:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj);
            case BYTES:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case UINT32:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case SFIXED32:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case SFIXED64:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case SINT32:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case SINT64:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case ENUM:
                return obj instanceof EnumLite ? CodedOutputStream.computeEnumSizeNoTag(((EnumLite) obj).getNumber()) : CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int computeFieldSize(FieldDescriptorLite<?> fieldDescriptorLite, Object obj) {
        FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            return computeElementSize(liteType, number, obj);
        }
        int i = 0;
        if (fieldDescriptorLite.isPacked()) {
            for (Object obj2 : (List) obj2) {
                i += computeElementSizeNoTag(liteType, obj2);
            }
            return (CodedOutputStream.computeTagSize(number) + i) + CodedOutputStream.computeRawVarint32Size(i);
        }
        for (Object obj22 : (List) obj22) {
            i += computeElementSize(liteType, number, obj22);
        }
        return i;
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> emptySet() {
        return DEFAULT_INSTANCE;
    }

    private int getMessageSetSerializedSize(Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        return (fieldDescriptorLite.getLiteJavaType() != JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) ? computeFieldSize(fieldDescriptorLite, value) : value instanceof LazyField ? CodedOutputStream.computeLazyFieldMessageSetExtensionSize(((FieldDescriptorLite) entry.getKey()).getNumber(), (LazyField) value) : CodedOutputStream.computeMessageSetExtensionSize(((FieldDescriptorLite) entry.getKey()).getNumber(), (MessageLite) value);
    }

    static int getWireFormatForFieldType(FieldType fieldType, boolean z) {
        return z ? 2 : fieldType.getWireType();
    }

    private boolean isInitialized(Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.getLiteJavaType() == JavaType.MESSAGE) {
            if (fieldDescriptorLite.isRepeated()) {
                for (MessageLite isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            }
            Object value = entry.getValue();
            if (value instanceof MessageLite) {
                if (!((MessageLite) value).isInitialized()) {
                    return false;
                }
            } else if (value instanceof LazyField) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    private void mergeFromField(Entry<FieldDescriptorType, Object> entry) {
        Comparable comparable = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        Object field;
        if (comparable.isRepeated()) {
            field = getField(comparable);
            if (field == null) {
                field = new ArrayList();
            }
            for (Object cloneIfMutable : (List) value) {
                ((List) field).add(cloneIfMutable(cloneIfMutable));
            }
            this.fields.put(comparable, field);
        } else if (comparable.getLiteJavaType() == JavaType.MESSAGE) {
            field = getField(comparable);
            if (field == null) {
                this.fields.put(comparable, cloneIfMutable(value));
                return;
            }
            this.fields.put(comparable, comparable.internalMergeFrom(((MessageLite) field).toBuilder(), (MessageLite) value).build());
        } else {
            this.fields.put(comparable, cloneIfMutable(value));
        }
    }

    public static <T extends FieldDescriptorLite<T>> FieldSet<T> newFieldSet() {
        return new FieldSet();
    }

    public static Object readPrimitiveField(CodedInputStream codedInputStream, FieldType fieldType, boolean z) {
        return WireFormat.readPrimitiveField(codedInputStream, fieldType, z ? Utf8Validation.STRICT : Utf8Validation.LOOSE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:32:0x0053 in {3, 8, 12, 13, 18, 19, 20, 21, 22, 23, 24, 25, 27, 29, 31} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private static void verifyType(com.google.protobuf.WireFormat.FieldType r2, java.lang.Object r3) {
        /*
        if (r3 == 0) goto L_0x004d;
        r0 = com.google.protobuf.FieldSet.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$JavaType;
        r2 = r2.getJavaType();
        r2 = r2.ordinal();
        r2 = r0[r2];
        r0 = 1;
        r1 = 0;
        switch(r2) {
            case 1: goto L_0x003f;
            case 2: goto L_0x003c;
            case 3: goto L_0x0039;
            case 4: goto L_0x0036;
            case 5: goto L_0x0033;
            case 6: goto L_0x0030;
            case 7: goto L_0x0027;
            case 8: goto L_0x001d;
            case 9: goto L_0x0014;
            default: goto L_0x0013;
        };
        goto L_0x0042;
        r2 = r3 instanceof com.google.protobuf.MessageLite;
        if (r2 != 0) goto L_0x0025;
        r2 = r3 instanceof com.google.protobuf.LazyField;
        if (r2 == 0) goto L_0x0042;
        goto L_0x0025;
        r2 = r3 instanceof java.lang.Integer;
        if (r2 != 0) goto L_0x0025;
        r2 = r3 instanceof com.google.protobuf.Internal.EnumLite;
        if (r2 == 0) goto L_0x0042;
        r1 = 1;
        goto L_0x0042;
        r2 = r3 instanceof com.google.protobuf.ByteString;
        if (r2 != 0) goto L_0x0025;
        r2 = r3 instanceof byte[];
        if (r2 == 0) goto L_0x0042;
        goto L_0x0025;
        r0 = r3 instanceof java.lang.String;
        goto L_0x0041;
        r0 = r3 instanceof java.lang.Boolean;
        goto L_0x0041;
        r0 = r3 instanceof java.lang.Double;
        goto L_0x0041;
        r0 = r3 instanceof java.lang.Float;
        goto L_0x0041;
        r0 = r3 instanceof java.lang.Long;
        goto L_0x0041;
        r0 = r3 instanceof java.lang.Integer;
        r1 = r0;
        if (r1 == 0) goto L_0x0045;
        return;
        r2 = new java.lang.IllegalArgumentException;
        r3 = "Wrong object type used with protocol message reflection.";
        r2.<init>(r3);
        throw r2;
        r2 = new java.lang.NullPointerException;
        r2.<init>();
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.FieldSet.verifyType(com.google.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    static void writeElement(CodedOutputStream codedOutputStream, FieldType fieldType, int i, Object obj) {
        if (fieldType == FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (MessageLite) obj);
            return;
        }
        codedOutputStream.writeTag(i, getWireFormatForFieldType(fieldType, false));
        writeElementNoTag(codedOutputStream, fieldType, obj);
    }

    static void writeElementNoTag(CodedOutputStream codedOutputStream, FieldType fieldType, Object obj) {
        switch (fieldType) {
            case DOUBLE:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case FLOAT:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                return;
            case INT64:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                return;
            case UINT64:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                return;
            case INT32:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                return;
            case FIXED64:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                return;
            case FIXED32:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                return;
            case BOOL:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                return;
            case GROUP:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                return;
            case MESSAGE:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                return;
            case STRING:
                if (obj instanceof ByteString) {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.writeStringNoTag((String) obj);
                    return;
                }
            case BYTES:
                if (obj instanceof ByteString) {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                    return;
                } else {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                    return;
                }
            case UINT32:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                return;
            case SFIXED32:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                return;
            case SFIXED64:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                return;
            case SINT32:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                return;
            case SINT64:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                return;
            case ENUM:
                if (!(obj instanceof EnumLite)) {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.writeEnumNoTag(((EnumLite) obj).getNumber());
                    return;
                }
        }
    }

    public static void writeField(FieldDescriptorLite<?> fieldDescriptorLite, Object obj, CodedOutputStream codedOutputStream) {
        FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (fieldDescriptorLite.isRepeated()) {
            List<Object> list = (List) obj;
            if (fieldDescriptorLite.isPacked()) {
                codedOutputStream.writeTag(number, 2);
                int i = 0;
                for (Object computeElementSizeNoTag : list) {
                    i += computeElementSizeNoTag(liteType, computeElementSizeNoTag);
                }
                codedOutputStream.writeRawVarint32(i);
                for (Object obj2 : list) {
                    writeElementNoTag(codedOutputStream, liteType, obj2);
                }
                return;
            }
            for (Object obj22 : list) {
                writeElement(codedOutputStream, liteType, number, obj22);
            }
        } else if (obj22 instanceof LazyField) {
            writeElement(codedOutputStream, liteType, number, ((LazyField) obj22).getValue());
        } else {
            writeElement(codedOutputStream, liteType, number, obj22);
        }
    }

    private void writeMessageSetTo(Entry<FieldDescriptorType, Object> entry, CodedOutputStream codedOutputStream) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.getLiteJavaType() != JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
            writeField(fieldDescriptorLite, entry.getValue(), codedOutputStream);
            return;
        }
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        codedOutputStream.writeMessageSetExtension(((FieldDescriptorLite) entry.getKey()).getNumber(), (MessageLite) value);
    }

    public final void addRepeatedField(FieldDescriptorType fieldDescriptorType, Object obj) {
        if (fieldDescriptorType.isRepeated()) {
            List arrayList;
            verifyType(fieldDescriptorType.getLiteType(), obj);
            Object field = getField(fieldDescriptorType);
            if (field == null) {
                arrayList = new ArrayList();
                this.fields.put((Comparable) fieldDescriptorType, (Object) arrayList);
            } else {
                arrayList = (List) field;
            }
            arrayList.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public final void clear() {
        this.fields.clear();
        this.hasLazyField = false;
    }

    public final void clearField(FieldDescriptorType fieldDescriptorType) {
        this.fields.remove(fieldDescriptorType);
        if (this.fields.isEmpty()) {
            this.hasLazyField = false;
        }
    }

    public final FieldSet<FieldDescriptorType> clone() {
        Entry arrayEntryAt;
        FieldSet newFieldSet = newFieldSet();
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            arrayEntryAt = this.fields.getArrayEntryAt(i);
            newFieldSet.setField((FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Entry arrayEntryAt2 : this.fields.getOverflowEntries()) {
            newFieldSet.setField((FieldDescriptorLite) arrayEntryAt2.getKey(), arrayEntryAt2.getValue());
        }
        newFieldSet.hasLazyField = this.hasLazyField;
        return newFieldSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldSet)) {
            return false;
        }
        return this.fields.equals(((FieldSet) obj).fields);
    }

    public final Map<FieldDescriptorType, Object> getAllFields() {
        if (!this.hasLazyField) {
            return this.fields.isImmutable() ? this.fields : Collections.unmodifiableMap(this.fields);
        } else {
            SmallSortedMap newFieldMap = SmallSortedMap.newFieldMap(16);
            for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
                cloneFieldEntry(newFieldMap, this.fields.getArrayEntryAt(i));
            }
            for (Entry cloneFieldEntry : this.fields.getOverflowEntries()) {
                cloneFieldEntry(newFieldMap, cloneFieldEntry);
            }
            if (this.fields.isImmutable()) {
                newFieldMap.makeImmutable();
            }
            return newFieldMap;
        }
    }

    public final Object getField(FieldDescriptorType fieldDescriptorType) {
        Object obj = this.fields.get(fieldDescriptorType);
        return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
    }

    public final int getMessageSetSerializedSize() {
        int i = 0;
        for (int i2 = 0; i2 < this.fields.getNumArrayEntries(); i2++) {
            i += getMessageSetSerializedSize(this.fields.getArrayEntryAt(i2));
        }
        for (Entry messageSetSerializedSize : this.fields.getOverflowEntries()) {
            i += getMessageSetSerializedSize(messageSetSerializedSize);
        }
        return i;
    }

    public final Object getRepeatedField(FieldDescriptorType fieldDescriptorType, int i) {
        if (fieldDescriptorType.isRepeated()) {
            Object field = getField(fieldDescriptorType);
            if (field != null) {
                return ((List) field).get(i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public final int getRepeatedFieldCount(FieldDescriptorType fieldDescriptorType) {
        if (fieldDescriptorType.isRepeated()) {
            Object field = getField(fieldDescriptorType);
            return field == null ? 0 : ((List) field).size();
        } else {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
    }

    public final int getSerializedSize() {
        Entry arrayEntryAt;
        int i = 0;
        for (int i2 = 0; i2 < this.fields.getNumArrayEntries(); i2++) {
            arrayEntryAt = this.fields.getArrayEntryAt(i2);
            i += computeFieldSize((FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Entry arrayEntryAt2 : this.fields.getOverflowEntries()) {
            i += computeFieldSize((FieldDescriptorLite) arrayEntryAt2.getKey(), arrayEntryAt2.getValue());
        }
        return i;
    }

    public final boolean hasField(FieldDescriptorType fieldDescriptorType) {
        if (!fieldDescriptorType.isRepeated()) {
            return this.fields.get(fieldDescriptorType) != null;
        } else {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
    }

    public final int hashCode() {
        return this.fields.hashCode();
    }

    public final boolean isImmutable() {
        return this.isImmutable;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            if (!isInitialized(this.fields.getArrayEntryAt(i))) {
                return false;
            }
        }
        for (Entry isInitialized : this.fields.getOverflowEntries()) {
            if (!isInitialized(isInitialized)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Entry<FieldDescriptorType, Object>> iterator() {
        return this.hasLazyField ? new LazyIterator(this.fields.entrySet().iterator()) : this.fields.entrySet().iterator();
    }

    public final void makeImmutable() {
        if (!this.isImmutable) {
            this.fields.makeImmutable();
            this.isImmutable = true;
        }
    }

    public final void mergeFrom(FieldSet<FieldDescriptorType> fieldSet) {
        for (int i = 0; i < fieldSet.fields.getNumArrayEntries(); i++) {
            mergeFromField(fieldSet.fields.getArrayEntryAt(i));
        }
        for (Entry mergeFromField : fieldSet.fields.getOverflowEntries()) {
            mergeFromField(mergeFromField);
        }
    }

    public final void setField(FieldDescriptorType fieldDescriptorType, Object obj) {
        if (!fieldDescriptorType.isRepeated()) {
            verifyType(fieldDescriptorType.getLiteType(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            for (Object verifyType : arrayList) {
                verifyType(fieldDescriptorType.getLiteType(), verifyType);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof LazyField) {
            this.hasLazyField = true;
        }
        this.fields.put((Comparable) fieldDescriptorType, obj);
    }

    public final void setRepeatedField(FieldDescriptorType fieldDescriptorType, int i, Object obj) {
        if (fieldDescriptorType.isRepeated()) {
            Object field = getField(fieldDescriptorType);
            if (field != null) {
                verifyType(fieldDescriptorType.getLiteType(), obj);
                ((List) field).set(i, obj);
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public final void writeMessageSetTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            writeMessageSetTo(this.fields.getArrayEntryAt(i), codedOutputStream);
        }
        for (Entry writeMessageSetTo : this.fields.getOverflowEntries()) {
            writeMessageSetTo(writeMessageSetTo, codedOutputStream);
        }
    }

    public final void writeTo(CodedOutputStream codedOutputStream) {
        Entry arrayEntryAt;
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            arrayEntryAt = this.fields.getArrayEntryAt(i);
            writeField((FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue(), codedOutputStream);
        }
        for (Entry arrayEntryAt2 : this.fields.getOverflowEntries()) {
            writeField((FieldDescriptorLite) arrayEntryAt2.getKey(), arrayEntryAt2.getValue(), codedOutputStream);
        }
    }
}
