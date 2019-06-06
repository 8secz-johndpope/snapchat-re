package defpackage;

import android.os.Build;
import android.os.Build.VERSION;
import com.google.common.base.Optional;

/* renamed from: dre */
public final class dre implements ftk {
    private static Optional<Boolean> a() {
        return Build.MODEL.startsWith("SM-G97") ? Optional.absent() : Optional.of(Boolean.FALSE);
    }

    private static Optional<Boolean> a(boolean z, boolean z2) {
        Object obj;
        if (VERSION.SDK_INT >= 28) {
            obj = Boolean.TRUE;
        } else {
            if (z2) {
                String str = Build.MODEL;
                if (!(dre.a(str) || dre.b(str) || dre.c(str) || (!z && dre.d(str)))) {
                    return Optional.absent();
                }
            }
            obj = Boolean.FALSE;
        }
        return Optional.of(obj);
    }

    private static String a(float f, float f2) {
        StringBuilder stringBuilder = new StringBuilder("{mWidth=");
        stringBuilder.append(f);
        stringBuilder.append(", mHeight=");
        stringBuilder.append(f2);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    private static String a(int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder("{width=");
        stringBuilder.append(i);
        stringBuilder.append(", height=");
        stringBuilder.append(i2);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    private static boolean a(java.lang.String r3) {
        /*
        r0 = r3.hashCode();
        r1 = 1;
        r2 = 0;
        switch(r0) {
            case -2067222092: goto L_0x02a4;
            case -2067221999: goto L_0x0299;
            case -2038157992: goto L_0x028e;
            case -1984448352: goto L_0x0283;
            case -1665224655: goto L_0x0279;
            case -1598694618: goto L_0x026e;
            case -1398047634: goto L_0x0263;
            case -612885453: goto L_0x0258;
            case -401868948: goto L_0x024d;
            case -401812278: goto L_0x0242;
            case -401812249: goto L_0x0237;
            case -401812247: goto L_0x022c;
            case -401784256: goto L_0x0220;
            case -401725790: goto L_0x0214;
            case -401695968: goto L_0x0208;
            case -401692947: goto L_0x01fc;
            case -399129168: goto L_0x01f0;
            case -399129161: goto L_0x01e4;
            case -399102258: goto L_0x01d8;
            case -399102033: goto L_0x01cc;
            case -399102029: goto L_0x01c0;
            case -399102028: goto L_0x01b4;
            case -399102027: goto L_0x01a8;
            case -399044600: goto L_0x019c;
            case -399044598: goto L_0x0190;
            case -399044593: goto L_0x0184;
            case -398985008: goto L_0x0178;
            case -398982863: goto L_0x016c;
            case -395230391: goto L_0x0160;
            case -395230375: goto L_0x0154;
            case -256779675: goto L_0x0148;
            case -11821766: goto L_0x013c;
            case 1987233: goto L_0x0131;
            case 2736640: goto L_0x0125;
            case 2737753: goto L_0x0119;
            case 18976911: goto L_0x010d;
            case 19060549: goto L_0x0101;
            case 61542055: goto L_0x00f6;
            case 61604342: goto L_0x00eb;
            case 64461575: goto L_0x00e0;
            case 66214468: goto L_0x00d5;
            case 66365407: goto L_0x00ca;
            case 73785380: goto L_0x00be;
            case 255009972: goto L_0x00b2;
            case 256857014: goto L_0x00a6;
            case 512739038: goto L_0x009a;
            case 514519366: goto L_0x008e;
            case 516433063: goto L_0x0082;
            case 770401486: goto L_0x0076;
            case 807373873: goto L_0x006a;
            case 807702473: goto L_0x005e;
            case 836186643: goto L_0x0052;
            case 837106128: goto L_0x0046;
            case 1311240606: goto L_0x003a;
            case 1311240609: goto L_0x002e;
            case 1467059320: goto L_0x0022;
            case 1691544290: goto L_0x0017;
            case 2078826762: goto L_0x000b;
            default: goto L_0x0009;
        };
    L_0x0009:
        goto L_0x02af;
    L_0x000b:
        r0 = "GT-I9505";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0013:
        r3 = 10;
        goto L_0x02b0;
    L_0x0017:
        r0 = "CPH1723";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x001f:
        r3 = 3;
        goto L_0x02b0;
    L_0x0022:
        r0 = "Redmi 5 Plus";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x002a:
        r3 = 23;
        goto L_0x02b0;
    L_0x002e:
        r0 = "ONEPLUS A3003";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0036:
        r3 = 22;
        goto L_0x02b0;
    L_0x003a:
        r0 = "ONEPLUS A3000";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0042:
        r3 = 21;
        goto L_0x02b0;
    L_0x0046:
        r0 = "LGMS210";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x004e:
        r3 = 15;
        goto L_0x02b0;
    L_0x0052:
        r0 = "LGLS676";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x005a:
        r3 = 14;
        goto L_0x02b0;
    L_0x005e:
        r0 = "LG-X230";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0066:
        r3 = 13;
        goto L_0x02b0;
    L_0x006a:
        r0 = "LG-M150";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0072:
        r3 = 12;
        goto L_0x02b0;
    L_0x0076:
        r0 = "SM-S327VL";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x007e:
        r3 = 27;
        goto L_0x02b0;
    L_0x0082:
        r0 = "SM-J727R4";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x008a:
        r3 = 51;
        goto L_0x02b0;
    L_0x008e:
        r0 = "SM-J500FN";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0096:
        r3 = 47;
        goto L_0x02b0;
    L_0x009a:
        r0 = "SM-J327T1";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x00a2:
        r3 = 43;
        goto L_0x02b0;
    L_0x00a6:
        r0 = "SM-A500FU";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x00ae:
        r3 = 29;
        goto L_0x02b0;
    L_0x00b2:
        r0 = "SM-A300FU";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x00ba:
        r3 = 28;
        goto L_0x02b0;
    L_0x00be:
        r0 = "N9560";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x00c6:
        r3 = 20;
        goto L_0x02b0;
    L_0x00ca:
        r0 = "F8331";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x00d2:
        r3 = 7;
        goto L_0x02b0;
    L_0x00d5:
        r0 = "F3111";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x00dd:
        r3 = 6;
        goto L_0x02b0;
    L_0x00e0:
        r0 = "D6603";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x00e8:
        r3 = 4;
        goto L_0x02b0;
    L_0x00eb:
        r0 = "A37fw";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x00f3:
        r3 = 2;
        goto L_0x02b0;
    L_0x00f6:
        r0 = "A1601";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x00fe:
        r3 = 0;
        goto L_0x02b0;
    L_0x0101:
        r0 = "GT-I9301I";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0109:
        r3 = 9;
        goto L_0x02b0;
    L_0x010d:
        r0 = "GT-I9060I";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0115:
        r3 = 8;
        goto L_0x02b0;
    L_0x0119:
        r0 = "Z982";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0121:
        r3 = 57;
        goto L_0x02b0;
    L_0x0125:
        r0 = "Z835";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x012d:
        r3 = 56;
        goto L_0x02b0;
    L_0x0131:
        r0 = "A37f";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0139:
        r3 = 1;
        goto L_0x02b0;
    L_0x013c:
        r0 = "Moto C Plus";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0144:
        r3 = 17;
        goto L_0x02b0;
    L_0x0148:
        r0 = "HTC Desire 530";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0150:
        r3 = 11;
        goto L_0x02b0;
    L_0x0154:
        r0 = "SM-N910V";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x015c:
        r3 = 54;
        goto L_0x02b0;
    L_0x0160:
        r0 = "SM-N910F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0168:
        r3 = 53;
        goto L_0x02b0;
    L_0x016c:
        r0 = "SM-J727V";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0174:
        r3 = 52;
        goto L_0x02b0;
    L_0x0178:
        r0 = "SM-J700P";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0180:
        r3 = 50;
        goto L_0x02b0;
    L_0x0184:
        r0 = "SM-J500M";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x018c:
        r3 = 49;
        goto L_0x02b0;
    L_0x0190:
        r0 = "SM-J500H";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0198:
        r3 = 48;
        goto L_0x02b0;
    L_0x019c:
        r0 = "SM-J500F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x01a4:
        r3 = 46;
        goto L_0x02b0;
    L_0x01a8:
        r0 = "SM-J327V";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x01b0:
        r3 = 44;
        goto L_0x02b0;
    L_0x01b4:
        r0 = "SM-J327U";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x01bc:
        r3 = 45;
        goto L_0x02b0;
    L_0x01c0:
        r0 = "SM-J327T";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x01c8:
        r3 = 42;
        goto L_0x02b0;
    L_0x01cc:
        r0 = "SM-J327P";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x01d4:
        r3 = 41;
        goto L_0x02b0;
    L_0x01d8:
        r0 = "SM-J320H";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x01e0:
        r3 = 40;
        goto L_0x02b0;
    L_0x01e4:
        r0 = "SM-J250M";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x01ec:
        r3 = 39;
        goto L_0x02b0;
    L_0x01f0:
        r0 = "SM-J250F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x01f8:
        r3 = 38;
        goto L_0x02b0;
    L_0x01fc:
        r0 = "SM-G935T";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0204:
        r3 = 37;
        goto L_0x02b0;
    L_0x0208:
        r0 = "SM-G901F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0210:
        r3 = 36;
        goto L_0x02b0;
    L_0x0214:
        r0 = "SM-G800F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x021c:
        r3 = 35;
        goto L_0x02b0;
    L_0x0220:
        r0 = "SM-G615F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0228:
        r3 = 34;
        goto L_0x02b0;
    L_0x022c:
        r0 = "SM-G531H";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0234:
        r3 = 33;
        goto L_0x02b0;
    L_0x0237:
        r0 = "SM-G531F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x023f:
        r3 = 32;
        goto L_0x02b0;
    L_0x0242:
        r0 = "SM-G530H";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x024a:
        r3 = 31;
        goto L_0x02b0;
    L_0x024d:
        r0 = "SM-G361F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0255:
        r3 = 30;
        goto L_0x02b0;
    L_0x0258:
        r0 = "SAMSUNG-SM-J327A";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0260:
        r3 = 26;
        goto L_0x02b0;
    L_0x0263:
        r0 = "SM-T560";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x026b:
        r3 = 55;
        goto L_0x02b0;
    L_0x026e:
        r0 = "Redmi Note 5A Prime";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0276:
        r3 = 25;
        goto L_0x02b0;
    L_0x0279:
        r0 = "DRA-L21";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0281:
        r3 = 5;
        goto L_0x02b0;
    L_0x0283:
        r0 = "Moto C";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x028b:
        r3 = 16;
        goto L_0x02b0;
    L_0x028e:
        r0 = "Redmi Note 3";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x0296:
        r3 = 24;
        goto L_0x02b0;
    L_0x0299:
        r0 = "MYA-L41";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x02a1:
        r3 = 19;
        goto L_0x02b0;
    L_0x02a4:
        r0 = "MYA-L11";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02af;
    L_0x02ac:
        r3 = 18;
        goto L_0x02b0;
    L_0x02af:
        r3 = -1;
    L_0x02b0:
        switch(r3) {
            case 0: goto L_0x02b4;
            case 1: goto L_0x02b4;
            case 2: goto L_0x02b4;
            case 3: goto L_0x02b4;
            case 4: goto L_0x02b4;
            case 5: goto L_0x02b4;
            case 6: goto L_0x02b4;
            case 7: goto L_0x02b4;
            case 8: goto L_0x02b4;
            case 9: goto L_0x02b4;
            case 10: goto L_0x02b4;
            case 11: goto L_0x02b4;
            case 12: goto L_0x02b4;
            case 13: goto L_0x02b4;
            case 14: goto L_0x02b4;
            case 15: goto L_0x02b4;
            case 16: goto L_0x02b4;
            case 17: goto L_0x02b4;
            case 18: goto L_0x02b4;
            case 19: goto L_0x02b4;
            case 20: goto L_0x02b4;
            case 21: goto L_0x02b4;
            case 22: goto L_0x02b4;
            case 23: goto L_0x02b4;
            case 24: goto L_0x02b4;
            case 25: goto L_0x02b4;
            case 26: goto L_0x02b4;
            case 27: goto L_0x02b4;
            case 28: goto L_0x02b4;
            case 29: goto L_0x02b4;
            case 30: goto L_0x02b4;
            case 31: goto L_0x02b4;
            case 32: goto L_0x02b4;
            case 33: goto L_0x02b4;
            case 34: goto L_0x02b4;
            case 35: goto L_0x02b4;
            case 36: goto L_0x02b4;
            case 37: goto L_0x02b4;
            case 38: goto L_0x02b4;
            case 39: goto L_0x02b4;
            case 40: goto L_0x02b4;
            case 41: goto L_0x02b4;
            case 42: goto L_0x02b4;
            case 43: goto L_0x02b4;
            case 44: goto L_0x02b4;
            case 45: goto L_0x02b4;
            case 46: goto L_0x02b4;
            case 47: goto L_0x02b4;
            case 48: goto L_0x02b4;
            case 49: goto L_0x02b4;
            case 50: goto L_0x02b4;
            case 51: goto L_0x02b4;
            case 52: goto L_0x02b4;
            case 53: goto L_0x02b4;
            case 54: goto L_0x02b4;
            case 55: goto L_0x02b4;
            case 56: goto L_0x02b4;
            case 57: goto L_0x02b4;
            default: goto L_0x02b3;
        };
    L_0x02b3:
        return r2;
    L_0x02b4:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dre.a(java.lang.String):boolean");
    }

    private static boolean b(java.lang.String r3) {
        /*
        r0 = r3.hashCode();
        r1 = 1;
        r2 = 0;
        switch(r0) {
            case -2067222092: goto L_0x0418;
            case -2067222060: goto L_0x040d;
            case -2067221999: goto L_0x0402;
            case -2038157992: goto L_0x03f7;
            case -2038157991: goto L_0x03ed;
            case -2038157990: goto L_0x03e2;
            case -1829611392: goto L_0x03d7;
            case -1741219148: goto L_0x03cc;
            case -1741219055: goto L_0x03c1;
            case -1718208531: goto L_0x03b6;
            case -1667515259: goto L_0x03ab;
            case -1633494888: goto L_0x03a0;
            case -1633494887: goto L_0x0394;
            case -1598694618: goto L_0x0388;
            case -1546863967: goto L_0x037c;
            case -1546863966: goto L_0x0370;
            case -1439067993: goto L_0x0364;
            case -1409346233: goto L_0x0358;
            case -1348392670: goto L_0x034c;
            case -1337755104: goto L_0x0340;
            case -1337755102: goto L_0x0334;
            case -1337755073: goto L_0x0328;
            case -1175695475: goto L_0x031c;
            case -910708052: goto L_0x0310;
            case -910707990: goto L_0x0304;
            case -824669407: goto L_0x02f8;
            case -824660750: goto L_0x02ec;
            case -739642433: goto L_0x02e0;
            case -708142669: goto L_0x02d4;
            case -708142656: goto L_0x02c8;
            case -708142633: goto L_0x02bc;
            case -708142625: goto L_0x02b0;
            case -708141525: goto L_0x02a4;
            case -708141524: goto L_0x0298;
            case -663204424: goto L_0x028c;
            case -663204393: goto L_0x0280;
            case -332519570: goto L_0x0274;
            case -200849224: goto L_0x0269;
            case -200849222: goto L_0x025d;
            case -190690485: goto L_0x0251;
            case -143589744: goto L_0x0246;
            case -143589743: goto L_0x023a;
            case -143589742: goto L_0x022e;
            case -142338061: goto L_0x0222;
            case -142337348: goto L_0x0217;
            case -142337346: goto L_0x020b;
            case -61991021: goto L_0x01ff;
            case 14988919: goto L_0x01f3;
            case 30754035: goto L_0x01e7;
            case 42960289: goto L_0x01db;
            case 42960320: goto L_0x01cf;
            case 42960351: goto L_0x01c3;
            case 64201311: goto L_0x01b7;
            case 74271989: goto L_0x01ab;
            case 112553216: goto L_0x019f;
            case 232345167: goto L_0x0193;
            case 369886754: goto L_0x0187;
            case 394885390: goto L_0x017b;
            case 394886103: goto L_0x0170;
            case 439365017: goto L_0x0165;
            case 439365079: goto L_0x0159;
            case 598324935: goto L_0x014d;
            case 682960319: goto L_0x0141;
            case 682960381: goto L_0x0135;
            case 693119104: goto L_0x0129;
            case 694966146: goto L_0x011d;
            case 742989238: goto L_0x0111;
            case 751035156: goto L_0x0105;
            case 970833154: goto L_0x00f9;
            case 970833185: goto L_0x00ed;
            case 1241611815: goto L_0x00e1;
            case 1246700170: goto L_0x00d5;
            case 1266625585: goto L_0x00c9;
            case 1266625645: goto L_0x00bd;
            case 1278969152: goto L_0x00b2;
            case 1467059320: goto L_0x00a6;
            case 1497897820: goto L_0x009a;
            case 1497897882: goto L_0x008e;
            case 1588010899: goto L_0x0082;
            case 1588010961: goto L_0x0076;
            case 1666510246: goto L_0x006a;
            case 1741049676: goto L_0x005e;
            case 1755176840: goto L_0x0052;
            case 1842372385: goto L_0x0046;
            case 1842372387: goto L_0x003a;
            case 1935569556: goto L_0x002e;
            case 2059069705: goto L_0x0022;
            case 2059069767: goto L_0x0017;
            case 2059069768: goto L_0x000b;
            default: goto L_0x0009;
        };
    L_0x0009:
        goto L_0x0423;
    L_0x000b:
        r0 = "RNE-L22";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0013:
        r3 = 59;
        goto L_0x0424;
    L_0x0017:
        r0 = "RNE-L21";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x001f:
        r3 = 2;
        goto L_0x0424;
    L_0x0022:
        r0 = "RNE-L01";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x002a:
        r3 = 61;
        goto L_0x0424;
    L_0x002e:
        r0 = "PAR-LX1M";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0036:
        r3 = 88;
        goto L_0x0424;
    L_0x003a:
        r0 = "WAS-LX3";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0042:
        r3 = 83;
        goto L_0x0424;
    L_0x0046:
        r0 = "WAS-LX1";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x004e:
        r3 = 12;
        goto L_0x0424;
    L_0x0052:
        r0 = "CRO-U00";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x005a:
        r3 = 86;
        goto L_0x0424;
    L_0x005e:
        r0 = "MHA-L29";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0066:
        r3 = 42;
        goto L_0x0424;
    L_0x006a:
        r0 = "COL-L29";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0072:
        r3 = 41;
        goto L_0x0424;
    L_0x0076:
        r0 = "CLT-L29";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x007e:
        r3 = 9;
        goto L_0x0424;
    L_0x0082:
        r0 = "CLT-L09";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x008a:
        r3 = 29;
        goto L_0x0424;
    L_0x008e:
        r0 = "VTR-L29";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0096:
        r3 = 31;
        goto L_0x0424;
    L_0x009a:
        r0 = "VTR-L09";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x00a2:
        r3 = 14;
        goto L_0x0424;
    L_0x00a6:
        r0 = "Redmi 5 Plus";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x00ae:
        r3 = 24;
        goto L_0x0424;
    L_0x00b2:
        r0 = "WAS-LX1A";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x00ba:
        r3 = 7;
        goto L_0x0424;
    L_0x00bd:
        r0 = "CAM-L21";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x00c5:
        r3 = 22;
        goto L_0x0424;
    L_0x00c9:
        r0 = "CAM-L03";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x00d1:
        r3 = 67;
        goto L_0x0424;
    L_0x00d5:
        r0 = "VKY-L29";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x00dd:
        r3 = 76;
        goto L_0x0424;
    L_0x00e1:
        r0 = "Redmi Note 5A";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x00e9:
        r3 = 47;
        goto L_0x0424;
    L_0x00ed:
        r0 = "LLD-L31";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x00f5:
        r3 = 39;
        goto L_0x0424;
    L_0x00f9:
        r0 = "LLD-L21";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0101:
        r3 = 78;
        goto L_0x0424;
    L_0x0105:
        r0 = "LDN-L21";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x010d:
        r3 = 8;
        goto L_0x0424;
    L_0x0111:
        r0 = "BND-L21";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0119:
        r3 = 35;
        goto L_0x0424;
    L_0x011d:
        r0 = "BLN-L21";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0125:
        r3 = 26;
        goto L_0x0424;
    L_0x0129:
        r0 = "BLL-L21";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0131:
        r3 = 55;
        goto L_0x0424;
    L_0x0135:
        r0 = "BLA-L29";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x013d:
        r3 = 20;
        goto L_0x0424;
    L_0x0141:
        r0 = "BLA-L09";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0149:
        r3 = 80;
        goto L_0x0424;
    L_0x014d:
        r0 = "Redmi Note 5 Pro";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0155:
        r3 = 13;
        goto L_0x0424;
    L_0x0159:
        r0 = "HUAWEI NXT-L29";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0161:
        r3 = 60;
        goto L_0x0424;
    L_0x0165:
        r0 = "HUAWEI NXT-L09";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x016d:
        r3 = 0;
        goto L_0x0424;
    L_0x0170:
        r0 = "PRA-LX1";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0178:
        r3 = 3;
        goto L_0x0424;
    L_0x017b:
        r0 = "PRA-LA1";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0183:
        r3 = 43;
        goto L_0x0424;
    L_0x0187:
        r0 = "BAC-L21";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x018f:
        r3 = 48;
        goto L_0x0424;
    L_0x0193:
        r0 = "PLK-L01";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x019b:
        r3 = 54;
        goto L_0x0424;
    L_0x019f:
        r0 = "FRD-L09";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x01a7:
        r3 = 18;
        goto L_0x0424;
    L_0x01ab:
        r0 = "Mi A2";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x01b3:
        r3 = 68;
        goto L_0x0424;
    L_0x01b7:
        r0 = "AUM-L29";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x01bf:
        r3 = 63;
        goto L_0x0424;
    L_0x01c3:
        r0 = "ATU-L31";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x01cb:
        r3 = 49;
        goto L_0x0424;
    L_0x01cf:
        r0 = "ATU-L21";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x01d7:
        r3 = 36;
        goto L_0x0424;
    L_0x01db:
        r0 = "ATU-L11";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x01e3:
        r3 = 85;
        goto L_0x0424;
    L_0x01e7:
        r0 = "LLD-AL10";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x01ef:
        r3 = 74;
        goto L_0x0424;
    L_0x01f3:
        r0 = "KIW-L21";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x01fb:
        r3 = 46;
        goto L_0x0424;
    L_0x01ff:
        r0 = "FLA-LX1";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0207:
        r3 = 73;
        goto L_0x0424;
    L_0x020b:
        r0 = "FIG-LX3";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0213:
        r3 = 62;
        goto L_0x0424;
    L_0x0217:
        r0 = "FIG-LX1";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x021f:
        r3 = 6;
        goto L_0x0424;
    L_0x0222:
        r0 = "FIG-LA1";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x022a:
        r3 = 64;
        goto L_0x0424;
    L_0x022e:
        r0 = "ANE-LX3";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0236:
        r3 = 40;
        goto L_0x0424;
    L_0x023a:
        r0 = "ANE-LX2";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0242:
        r3 = 69;
        goto L_0x0424;
    L_0x0246:
        r0 = "ANE-LX1";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x024e:
        r3 = 1;
        goto L_0x0424;
    L_0x0251:
        r0 = "ALP-L29";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0259:
        r3 = 82;
        goto L_0x0424;
    L_0x025d:
        r0 = "ALE-L23";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0265:
        r3 = 53;
        goto L_0x0424;
    L_0x0269:
        r0 = "ALE-L21";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0271:
        r3 = 4;
        goto L_0x0424;
    L_0x0274:
        r0 = "TRT-LX1";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x027c:
        r3 = 77;
        goto L_0x0424;
    L_0x0280:
        r0 = "EVA-L19";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0288:
        r3 = 70;
        goto L_0x0424;
    L_0x028c:
        r0 = "EVA-L09";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0294:
        r3 = 19;
        goto L_0x0424;
    L_0x0298:
        r0 = "Redmi Y2";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x02a0:
        r3 = 52;
        goto L_0x0424;
    L_0x02a4:
        r0 = "Redmi Y1";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x02ac:
        r3 = 71;
        goto L_0x0424;
    L_0x02b0:
        r0 = "Redmi 5A";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x02b8:
        r3 = 21;
        goto L_0x0424;
    L_0x02bc:
        r0 = "Redmi 4X";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x02c4:
        r3 = 15;
        goto L_0x0424;
    L_0x02c8:
        r0 = "Redmi 4A";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x02d0:
        r3 = 23;
        goto L_0x0424;
    L_0x02d4:
        r0 = "Redmi 3S";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x02dc:
        r3 = 45;
        goto L_0x0424;
    L_0x02e0:
        r0 = "HUAWEI RIO-L01";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x02e8:
        r3 = 65;
        goto L_0x0424;
    L_0x02ec:
        r0 = "HUAWEI CUN-U29";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x02f4:
        r3 = 72;
        goto L_0x0424;
    L_0x02f8:
        r0 = "HUAWEI CUN-L21";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0300:
        r3 = 50;
        goto L_0x0424;
    L_0x0304:
        r0 = "EML-L29";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x030c:
        r3 = 16;
        goto L_0x0424;
    L_0x0310:
        r0 = "EML-L09";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0318:
        r3 = 34;
        goto L_0x0424;
    L_0x031c:
        r0 = "STF-L09";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0324:
        r3 = 27;
        goto L_0x0424;
    L_0x0328:
        r0 = "HUAWEI VNS-L31";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0330:
        r3 = 10;
        goto L_0x0424;
    L_0x0334:
        r0 = "HUAWEI VNS-L23";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x033c:
        r3 = 79;
        goto L_0x0424;
    L_0x0340:
        r0 = "HUAWEI VNS-L21";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0348:
        r3 = 17;
        goto L_0x0424;
    L_0x034c:
        r0 = "SNE-LX1";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0354:
        r3 = 66;
        goto L_0x0424;
    L_0x0358:
        r0 = "SLA-L22";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0360:
        r3 = 33;
        goto L_0x0424;
    L_0x0364:
        r0 = "HUAWEI LUA-U22";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x036c:
        r3 = 75;
        goto L_0x0424;
    L_0x0370:
        r0 = "Redmi 5";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0378:
        r3 = 25;
        goto L_0x0424;
    L_0x037c:
        r0 = "Redmi 4";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0384:
        r3 = 30;
        goto L_0x0424;
    L_0x0388:
        r0 = "Redmi Note 5A Prime";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0390:
        r3 = 56;
        goto L_0x0424;
    L_0x0394:
        r0 = "INE-LX2";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x039c:
        r3 = 87;
        goto L_0x0424;
    L_0x03a0:
        r0 = "INE-LX1";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x03a8:
        r3 = 28;
        goto L_0x0424;
    L_0x03ab:
        r0 = "HUAWEI GRA-L09";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x03b3:
        r3 = 57;
        goto L_0x0424;
    L_0x03b6:
        r0 = "TRT-L21A";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x03be:
        r3 = 37;
        goto L_0x0424;
    L_0x03c1:
        r0 = "NEM-L51";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x03c9:
        r3 = 84;
        goto L_0x0424;
    L_0x03cc:
        r0 = "NEM-L21";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x03d4:
        r3 = 58;
        goto L_0x0424;
    L_0x03d7:
        r0 = "DLI-L22";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x03df:
        r3 = 81;
        goto L_0x0424;
    L_0x03e2:
        r0 = "Redmi Note 5";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x03ea:
        r3 = 11;
        goto L_0x0424;
    L_0x03ed:
        r0 = "Redmi Note 4";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x03f5:
        r3 = 5;
        goto L_0x0424;
    L_0x03f7:
        r0 = "Redmi Note 3";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x03ff:
        r3 = 38;
        goto L_0x0424;
    L_0x0402:
        r0 = "MYA-L41";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x040a:
        r3 = 44;
        goto L_0x0424;
    L_0x040d:
        r0 = "MYA-L22";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0415:
        r3 = 32;
        goto L_0x0424;
    L_0x0418:
        r0 = "MYA-L11";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0423;
    L_0x0420:
        r3 = 51;
        goto L_0x0424;
    L_0x0423:
        r3 = -1;
    L_0x0424:
        switch(r3) {
            case 0: goto L_0x0428;
            case 1: goto L_0x0428;
            case 2: goto L_0x0428;
            case 3: goto L_0x0428;
            case 4: goto L_0x0428;
            case 5: goto L_0x0428;
            case 6: goto L_0x0428;
            case 7: goto L_0x0428;
            case 8: goto L_0x0428;
            case 9: goto L_0x0428;
            case 10: goto L_0x0428;
            case 11: goto L_0x0428;
            case 12: goto L_0x0428;
            case 13: goto L_0x0428;
            case 14: goto L_0x0428;
            case 15: goto L_0x0428;
            case 16: goto L_0x0428;
            case 17: goto L_0x0428;
            case 18: goto L_0x0428;
            case 19: goto L_0x0428;
            case 20: goto L_0x0428;
            case 21: goto L_0x0428;
            case 22: goto L_0x0428;
            case 23: goto L_0x0428;
            case 24: goto L_0x0428;
            case 25: goto L_0x0428;
            case 26: goto L_0x0428;
            case 27: goto L_0x0428;
            case 28: goto L_0x0428;
            case 29: goto L_0x0428;
            case 30: goto L_0x0428;
            case 31: goto L_0x0428;
            case 32: goto L_0x0428;
            case 33: goto L_0x0428;
            case 34: goto L_0x0428;
            case 35: goto L_0x0428;
            case 36: goto L_0x0428;
            case 37: goto L_0x0428;
            case 38: goto L_0x0428;
            case 39: goto L_0x0428;
            case 40: goto L_0x0428;
            case 41: goto L_0x0428;
            case 42: goto L_0x0428;
            case 43: goto L_0x0428;
            case 44: goto L_0x0428;
            case 45: goto L_0x0428;
            case 46: goto L_0x0428;
            case 47: goto L_0x0428;
            case 48: goto L_0x0428;
            case 49: goto L_0x0428;
            case 50: goto L_0x0428;
            case 51: goto L_0x0428;
            case 52: goto L_0x0428;
            case 53: goto L_0x0428;
            case 54: goto L_0x0428;
            case 55: goto L_0x0428;
            case 56: goto L_0x0428;
            case 57: goto L_0x0428;
            case 58: goto L_0x0428;
            case 59: goto L_0x0428;
            case 60: goto L_0x0428;
            case 61: goto L_0x0428;
            case 62: goto L_0x0428;
            case 63: goto L_0x0428;
            case 64: goto L_0x0428;
            case 65: goto L_0x0428;
            case 66: goto L_0x0428;
            case 67: goto L_0x0428;
            case 68: goto L_0x0428;
            case 69: goto L_0x0428;
            case 70: goto L_0x0428;
            case 71: goto L_0x0428;
            case 72: goto L_0x0428;
            case 73: goto L_0x0428;
            case 74: goto L_0x0428;
            case 75: goto L_0x0428;
            case 76: goto L_0x0428;
            case 77: goto L_0x0428;
            case 78: goto L_0x0428;
            case 79: goto L_0x0428;
            case 80: goto L_0x0428;
            case 81: goto L_0x0428;
            case 82: goto L_0x0428;
            case 83: goto L_0x0428;
            case 84: goto L_0x0428;
            case 85: goto L_0x0428;
            case 86: goto L_0x0428;
            case 87: goto L_0x0428;
            case 88: goto L_0x0428;
            default: goto L_0x0427;
        };
    L_0x0427:
        return r2;
    L_0x0428:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dre.b(java.lang.String):boolean");
    }

    private static boolean c(java.lang.String r3) {
        /*
        r0 = r3.hashCode();
        r1 = 1;
        r2 = 0;
        switch(r0) {
            case -1821433538: goto L_0x02bc;
            case -1819586496: goto L_0x02b1;
            case -1819585535: goto L_0x02a6;
            case -1285164580: goto L_0x029b;
            case -612945252: goto L_0x0290;
            case -612885670: goto L_0x0285;
            case -399162803: goto L_0x027b;
            case -399162802: goto L_0x0271;
            case -399162801: goto L_0x0266;
            case -399162797: goto L_0x025b;
            case -399162796: goto L_0x0251;
            case -399162772: goto L_0x0246;
            case -399162765: goto L_0x023a;
            case -399161842: goto L_0x022e;
            case -399161841: goto L_0x0222;
            case -399161840: goto L_0x0216;
            case -399161835: goto L_0x020a;
            case -399161832: goto L_0x01fe;
            case -399161825: goto L_0x01f2;
            case -399102260: goto L_0x01e6;
            case -399102259: goto L_0x01da;
            case -399102253: goto L_0x01ce;
            case -399102244: goto L_0x01c2;
            case -399102241: goto L_0x01b6;
            case -399043653: goto L_0x01aa;
            case -399043639: goto L_0x019e;
            case -399043637: goto L_0x0192;
            case -399043634: goto L_0x0186;
            case -399043633: goto L_0x017a;
            case -399043626: goto L_0x016e;
            case -398985004: goto L_0x0162;
            case -398984071: goto L_0x0156;
            case -398984070: goto L_0x014a;
            case -398984057: goto L_0x013e;
            case -398984052: goto L_0x0132;
            case 81950909: goto L_0x0127;
            case 510884864: goto L_0x011b;
            case 510885484: goto L_0x010f;
            case 512731906: goto L_0x0103;
            case 512732124: goto L_0x00f7;
            case 512732252: goto L_0x00eb;
            case 512732411: goto L_0x00df;
            case 512732507: goto L_0x00d3;
            case 512732526: goto L_0x00c7;
            case 514549157: goto L_0x00bb;
            case 514549160: goto L_0x00af;
            case 514549188: goto L_0x00a3;
            case 514549374: goto L_0x0097;
            case 514549622: goto L_0x008b;
            case 516366813: goto L_0x007f;
            case 516396202: goto L_0x0073;
            case 516396230: goto L_0x0067;
            case 516396416: goto L_0x005b;
            case 768547717: goto L_0x004f;
            case 770394759: goto L_0x0043;
            case 807318104: goto L_0x0038;
            case 835377813: goto L_0x002d;
            case 835379425: goto L_0x0022;
            case 836187603: goto L_0x0017;
            case 1490819771: goto L_0x000b;
            default: goto L_0x0009;
        };
    L_0x0009:
        goto L_0x02c7;
    L_0x000b:
        r0 = "Nexus 6P";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x0013:
        r3 = 59;
        goto L_0x02c8;
    L_0x0017:
        r0 = "LGLS775";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x001f:
        r3 = 3;
        goto L_0x02c8;
    L_0x0022:
        r0 = "LGL82VL";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x002a:
        r3 = 2;
        goto L_0x02c8;
    L_0x002d:
        r0 = "LGL81AL";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x0035:
        r3 = 1;
        goto L_0x02c8;
    L_0x0038:
        r0 = "LG-K540";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x0040:
        r3 = 0;
        goto L_0x02c8;
    L_0x0043:
        r0 = "SM-S320VL";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x004b:
        r3 = 24;
        goto L_0x02c8;
    L_0x004f:
        r0 = "SM-S120VL";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x0057:
        r3 = 19;
        goto L_0x02c8;
    L_0x005b:
        r0 = "SM-J710MN";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x0063:
        r3 = 55;
        goto L_0x02c8;
    L_0x0067:
        r0 = "SM-J710GN";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x006f:
        r3 = 54;
        goto L_0x02c8;
    L_0x0073:
        r0 = "SM-J710FQ";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x007b:
        r3 = 53;
        goto L_0x02c8;
    L_0x007f:
        r0 = "SM-J700T1";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x0087:
        r3 = 50;
        goto L_0x02c8;
    L_0x008b:
        r0 = "SM-J510UN";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x0093:
        r3 = 46;
        goto L_0x02c8;
    L_0x0097:
        r0 = "SM-J510MN";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x009f:
        r3 = 45;
        goto L_0x02c8;
    L_0x00a3:
        r0 = "SM-J510GN";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x00ab:
        r3 = 44;
        goto L_0x02c8;
    L_0x00af:
        r0 = "SM-J510FQ";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x00b7:
        r3 = 43;
        goto L_0x02c8;
    L_0x00bb:
        r0 = "SM-J510FN";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x00c3:
        r3 = 42;
        goto L_0x02c8;
    L_0x00c7:
        r0 = "SM-J320ZN";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x00cf:
        r3 = 30;
        goto L_0x02c8;
    L_0x00d3:
        r0 = "SM-J320YZ";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x00db:
        r3 = 26;
        goto L_0x02c8;
    L_0x00df:
        r0 = "SM-J320W8";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x00e7:
        r3 = 37;
        goto L_0x02c8;
    L_0x00eb:
        r0 = "SM-J320R4";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x00f3:
        r3 = 27;
        goto L_0x02c8;
    L_0x00f7:
        r0 = "SM-J320N0";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x00ff:
        r3 = 23;
        goto L_0x02c8;
    L_0x0103:
        r0 = "SM-J320FN";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x010b:
        r3 = 38;
        goto L_0x02c8;
    L_0x010f:
        r0 = "SM-J120ZN";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x0117:
        r3 = 22;
        goto L_0x02c8;
    L_0x011b:
        r0 = "SM-J120FN";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x0123:
        r3 = 13;
        goto L_0x02c8;
    L_0x0127:
        r0 = "VS835";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x012f:
        r3 = 4;
        goto L_0x02c8;
    L_0x0132:
        r0 = "SM-J710K";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x013a:
        r3 = 57;
        goto L_0x02c8;
    L_0x013e:
        r0 = "SM-J710F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x0146:
        r3 = 52;
        goto L_0x02c8;
    L_0x014a:
        r0 = "SM-J7109";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x0152:
        r3 = 58;
        goto L_0x02c8;
    L_0x0156:
        r0 = "SM-J7108";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x015e:
        r3 = 56;
        goto L_0x02c8;
    L_0x0162:
        r0 = "SM-J700T";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x016a:
        r3 = 51;
        goto L_0x02c8;
    L_0x016e:
        r0 = "SM-J510S";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x0176:
        r3 = 49;
        goto L_0x02c8;
    L_0x017a:
        r0 = "SM-J510L";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x0182:
        r3 = 48;
        goto L_0x02c8;
    L_0x0186:
        r0 = "SM-J510K";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x018e:
        r3 = 47;
        goto L_0x02c8;
    L_0x0192:
        r0 = "SM-J510H";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x019a:
        r3 = 39;
        goto L_0x02c8;
    L_0x019e:
        r0 = "SM-J510F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x01a6:
        r3 = 41;
        goto L_0x02c8;
    L_0x01aa:
        r0 = "SM-J5108";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x01b2:
        r3 = 40;
        goto L_0x02c8;
    L_0x01b6:
        r0 = "SM-J320Y";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x01be:
        r3 = 25;
        goto L_0x02c8;
    L_0x01c2:
        r0 = "SM-J320V";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x01ca:
        r3 = 28;
        goto L_0x02c8;
    L_0x01ce:
        r0 = "SM-J320M";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x01d6:
        r3 = 33;
        goto L_0x02c8;
    L_0x01da:
        r0 = "SM-J320G";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x01e2:
        r3 = 32;
        goto L_0x02c8;
    L_0x01e6:
        r0 = "SM-J320F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x01ee:
        r3 = 31;
        goto L_0x02c8;
    L_0x01f2:
        r0 = "SM-J120W";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x01fa:
        r3 = 17;
        goto L_0x02c8;
    L_0x01fe:
        r0 = "SM-J120P";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x0206:
        r3 = 18;
        goto L_0x02c8;
    L_0x020a:
        r0 = "SM-J120M";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x0212:
        r3 = 14;
        goto L_0x02c8;
    L_0x0216:
        r0 = "SM-J120H";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x021e:
        r3 = 20;
        goto L_0x02c8;
    L_0x0222:
        r0 = "SM-J120G";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x022a:
        r3 = 21;
        goto L_0x02c8;
    L_0x022e:
        r0 = "SM-J120F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x0236:
        r3 = 12;
        goto L_0x02c8;
    L_0x023a:
        r0 = "SM-J111M";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x0242:
        r3 = 9;
        goto L_0x02c8;
    L_0x0246:
        r0 = "SM-J111F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x024e:
        r3 = 8;
        goto L_0x02c8;
    L_0x0251:
        r0 = "SM-J110M";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x0259:
        r3 = 7;
        goto L_0x02c8;
    L_0x025b:
        r0 = "SM-J110L";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x0263:
        r3 = 11;
        goto L_0x02c8;
    L_0x0266:
        r0 = "SM-J110H";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x026e:
        r3 = 10;
        goto L_0x02c8;
    L_0x0271:
        r0 = "SM-J110G";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x0279:
        r3 = 6;
        goto L_0x02c8;
    L_0x027b:
        r0 = "SM-J110F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x0283:
        r3 = 5;
        goto L_0x02c8;
    L_0x0285:
        r0 = "SAMSUNG-SM-J320A";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x028d:
        r3 = 36;
        goto L_0x02c8;
    L_0x0290:
        r0 = "SAMSUNG-SM-J120A";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x0298:
        r3 = 16;
        goto L_0x02c8;
    L_0x029b:
        r0 = "SM-J320VPP";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x02a3:
        r3 = 29;
        goto L_0x02c8;
    L_0x02a6:
        r0 = "SAMSUNG-SM-J321AZ";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x02ae:
        r3 = 35;
        goto L_0x02c8;
    L_0x02b1:
        r0 = "SAMSUNG-SM-J320AZ";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x02b9:
        r3 = 34;
        goto L_0x02c8;
    L_0x02bc:
        r0 = "SAMSUNG-SM-J120AZ";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x02c7;
    L_0x02c4:
        r3 = 15;
        goto L_0x02c8;
    L_0x02c7:
        r3 = -1;
    L_0x02c8:
        switch(r3) {
            case 0: goto L_0x02cc;
            case 1: goto L_0x02cc;
            case 2: goto L_0x02cc;
            case 3: goto L_0x02cc;
            case 4: goto L_0x02cc;
            case 5: goto L_0x02cc;
            case 6: goto L_0x02cc;
            case 7: goto L_0x02cc;
            case 8: goto L_0x02cc;
            case 9: goto L_0x02cc;
            case 10: goto L_0x02cc;
            case 11: goto L_0x02cc;
            case 12: goto L_0x02cc;
            case 13: goto L_0x02cc;
            case 14: goto L_0x02cc;
            case 15: goto L_0x02cc;
            case 16: goto L_0x02cc;
            case 17: goto L_0x02cc;
            case 18: goto L_0x02cc;
            case 19: goto L_0x02cc;
            case 20: goto L_0x02cc;
            case 21: goto L_0x02cc;
            case 22: goto L_0x02cc;
            case 23: goto L_0x02cc;
            case 24: goto L_0x02cc;
            case 25: goto L_0x02cc;
            case 26: goto L_0x02cc;
            case 27: goto L_0x02cc;
            case 28: goto L_0x02cc;
            case 29: goto L_0x02cc;
            case 30: goto L_0x02cc;
            case 31: goto L_0x02cc;
            case 32: goto L_0x02cc;
            case 33: goto L_0x02cc;
            case 34: goto L_0x02cc;
            case 35: goto L_0x02cc;
            case 36: goto L_0x02cc;
            case 37: goto L_0x02cc;
            case 38: goto L_0x02cc;
            case 39: goto L_0x02cc;
            case 40: goto L_0x02cc;
            case 41: goto L_0x02cc;
            case 42: goto L_0x02cc;
            case 43: goto L_0x02cc;
            case 44: goto L_0x02cc;
            case 45: goto L_0x02cc;
            case 46: goto L_0x02cc;
            case 47: goto L_0x02cc;
            case 48: goto L_0x02cc;
            case 49: goto L_0x02cc;
            case 50: goto L_0x02cc;
            case 51: goto L_0x02cc;
            case 52: goto L_0x02cc;
            case 53: goto L_0x02cc;
            case 54: goto L_0x02cc;
            case 55: goto L_0x02cc;
            case 56: goto L_0x02cc;
            case 57: goto L_0x02cc;
            case 58: goto L_0x02cc;
            case 59: goto L_0x02cc;
            default: goto L_0x02cb;
        };
    L_0x02cb:
        return r2;
    L_0x02cc:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dre.c(java.lang.String):boolean");
    }

    private static boolean d(java.lang.String r3) {
        /*
        r0 = r3.hashCode();
        r1 = 1;
        r2 = 0;
        switch(r0) {
            case -2098361282: goto L_0x09dc;
            case -2051268073: goto L_0x09d1;
            case -2051268046: goto L_0x09c6;
            case -2051267045: goto L_0x09bb;
            case -2051266155: goto L_0x09b0;
            case -1972811777: goto L_0x09a5;
            case -1943069989: goto L_0x099a;
            case -1934099638: goto L_0x098f;
            case -1905354785: goto L_0x0984;
            case -1722555150: goto L_0x0979;
            case -1664044123: goto L_0x096e;
            case -1664042542: goto L_0x0963;
            case -1644115030: goto L_0x0957;
            case -1603814658: goto L_0x094b;
            case -1521111778: goto L_0x093f;
            case -1398166829: goto L_0x0933;
            case -1398166824: goto L_0x0927;
            case -1398051630: goto L_0x091b;
            case -1398051627: goto L_0x090f;
            case -1398050455: goto L_0x0903;
            case -1398050450: goto L_0x08f7;
            case -1398049587: goto L_0x08eb;
            case -1398047665: goto L_0x08df;
            case -1398047660: goto L_0x08d3;
            case -1398044903: goto L_0x08c7;
            case -1344269924: goto L_0x08bb;
            case -1146332947: goto L_0x08af;
            case -1128328904: goto L_0x08a3;
            case -1023729913: goto L_0x0897;
            case -1011441535: goto L_0x088b;
            case -996085787: goto L_0x087f;
            case -989286599: goto L_0x0873;
            case -954206007: goto L_0x0867;
            case -783193035: goto L_0x085b;
            case -749316732: goto L_0x084f;
            case -742946286: goto L_0x0843;
            case -741122146: goto L_0x0837;
            case -733828194: goto L_0x082b;
            case -603645438: goto L_0x081f;
            case -585938072: goto L_0x0813;
            case -516345554: goto L_0x0807;
            case -407237147: goto L_0x07fb;
            case -407236164: goto L_0x07ef;
            case -405509269: goto L_0x07e3;
            case -405449687: goto L_0x07d7;
            case -403602623: goto L_0x07cb;
            case -403602621: goto L_0x07bf;
            case -401869783: goto L_0x07b3;
            case -401869778: goto L_0x07a7;
            case -401868979: goto L_0x079b;
            case -401868978: goto L_0x078f;
            case -401868972: goto L_0x0783;
            case -401868969: goto L_0x0777;
            case -401868965: goto L_0x076b;
            case -401868963: goto L_0x075f;
            case -401867043: goto L_0x0753;
            case -401866871: goto L_0x0747;
            case -401866854: goto L_0x073b;
            case -401810344: goto L_0x072f;
            case -401808458: goto L_0x0723;
            case -401785394: goto L_0x0717;
            case -401784433: goto L_0x070b;
            case -399163762: goto L_0x06ff;
            case -399163609: goto L_0x06f3;
            case -399163602: goto L_0x06e7;
            case -399163590: goto L_0x06db;
            case -399163578: goto L_0x06cf;
            case -399163576: goto L_0x06c3;
            case -398982869: goto L_0x06b7;
            case -390606766: goto L_0x06ab;
            case -389897572: goto L_0x069f;
            case -389895653: goto L_0x0693;
            case -389863993: goto L_0x0687;
            case -389863936: goto L_0x067b;
            case -389862018: goto L_0x066f;
            case -389862014: goto L_0x0663;
            case -389862012: goto L_0x0657;
            case -256781659: goto L_0x064b;
            case -256778745: goto L_0x063f;
            case -256778737: goto L_0x0633;
            case -216577771: goto L_0x0627;
            case -139615931: goto L_0x061b;
            case -70927522: goto L_0x060f;
            case -45021228: goto L_0x0603;
            case -30755450: goto L_0x05f7;
            case 1987109: goto L_0x05eb;
            case 2379088: goto L_0x05df;
            case 2736575: goto L_0x05d3;
            case 2736576: goto L_0x05c7;
            case 2737666: goto L_0x05bb;
            case 2737759: goto L_0x05af;
            case 27945097: goto L_0x05a3;
            case 46785467: goto L_0x0598;
            case 49506529: goto L_0x058d;
            case 50425441: goto L_0x0582;
            case 50426402: goto L_0x0577;
            case 50428187: goto L_0x056c;
            case 50429253: goto L_0x0561;
            case 50429257: goto L_0x0556;
            case 50429261: goto L_0x054b;
            case 50429266: goto L_0x053f;
            case 50429275: goto L_0x0533;
            case 50429276: goto L_0x0527;
            case 53199633: goto L_0x051b;
            case 61631450: goto L_0x050f;
            case 61631649: goto L_0x0503;
            case 61656593: goto L_0x04f7;
            case 63539136: goto L_0x04eb;
            case 64428901: goto L_0x04df;
            case 64428962: goto L_0x04d3;
            case 70477566: goto L_0x04c7;
            case 72320640: goto L_0x04bb;
            case 81947929: goto L_0x04af;
            case 83015825: goto L_0x04a3;
            case 84834087: goto L_0x0497;
            case 84867618: goto L_0x048b;
            case 84868537: goto L_0x047f;
            case 217243225: goto L_0x0473;
            case 303482086: goto L_0x0467;
            case 327496670: goto L_0x045b;
            case 327496684: goto L_0x044f;
            case 340383225: goto L_0x0443;
            case 426938693: goto L_0x0437;
            case 426940565: goto L_0x042b;
            case 426963499: goto L_0x041f;
            case 426963965: goto L_0x0413;
            case 427029370: goto L_0x0407;
            case 428781273: goto L_0x03fb;
            case 428781274: goto L_0x03ef;
            case 484384258: goto L_0x03e3;
            case 614761276: goto L_0x03d7;
            case 619773998: goto L_0x03cb;
            case 636356058: goto L_0x03bf;
            case 768598417: goto L_0x03b3;
            case 770394759: goto L_0x03a7;
            case 772331112: goto L_0x039b;
            case 797149721: goto L_0x038f;
            case 797152604: goto L_0x0383;
            case 800989877: goto L_0x0377;
            case 807106808: goto L_0x036b;
            case 807108518: goto L_0x035f;
            case 807110652: goto L_0x0353;
            case 807112328: goto L_0x0347;
            case 807112481: goto L_0x033b;
            case 807226812: goto L_0x032f;
            case 807226814: goto L_0x0323;
            case 807227708: goto L_0x0317;
            case 807227710: goto L_0x030b;
            case 807228733: goto L_0x02ff;
            case 807229662: goto L_0x02f3;
            case 807229666: goto L_0x02e7;
            case 807229723: goto L_0x02db;
            case 807230627: goto L_0x02cf;
            case 807230653: goto L_0x02c3;
            case 807231521: goto L_0x02b7;
            case 807231529: goto L_0x02ab;
            case 807231614: goto L_0x029f;
            case 807314136: goto L_0x0293;
            case 807314198: goto L_0x0287;
            case 807314229: goto L_0x027b;
            case 807315159: goto L_0x026f;
            case 807315221: goto L_0x0263;
            case 807317050: goto L_0x0257;
            case 807317081: goto L_0x024b;
            case 807317980: goto L_0x023f;
            case 807318042: goto L_0x0233;
            case 807318135: goto L_0x0227;
            case 807318142: goto L_0x021b;
            case 807373873: goto L_0x020f;
            case 807373874: goto L_0x0203;
            case 807373876: goto L_0x01f7;
            case 807374679: goto L_0x01eb;
            case 807374710: goto L_0x01df;
            case 807374834: goto L_0x01d3;
            case 807374841: goto L_0x01c7;
            case 807644751: goto L_0x01bb;
            case 807645004: goto L_0x01af;
            case 807645744: goto L_0x01a3;
            case 825331256: goto L_0x0197;
            case 826030853: goto L_0x018b;
            case 835290393: goto L_0x017f;
            case 836186606: goto L_0x0173;
            case 836186611: goto L_0x0167;
            case 836187541: goto L_0x015b;
            case 836189583: goto L_0x014f;
            case 837016910: goto L_0x0143;
            case 837106128: goto L_0x0137;
            case 837107123: goto L_0x012b;
            case 837107187: goto L_0x011f;
            case 837107342: goto L_0x0113;
            case 837109135: goto L_0x0107;
            case 837110035: goto L_0x00fb;
            case 844494301: goto L_0x00ef;
            case 913735715: goto L_0x00e3;
            case 981595148: goto L_0x00d7;
            case 1008354852: goto L_0x00cb;
            case 1028456736: goto L_0x00bf;
            case 1050856524: goto L_0x00b3;
            case 1282382175: goto L_0x00a7;
            case 1401381862: goto L_0x009b;
            case 1410778899: goto L_0x008f;
            case 1432047478: goto L_0x0083;
            case 1445350394: goto L_0x0077;
            case 1654574027: goto L_0x006b;
            case 1654574029: goto L_0x005f;
            case 1682560693: goto L_0x0053;
            case 1787567210: goto L_0x0047;
            case 1910580632: goto L_0x003b;
            case 1938028195: goto L_0x002f;
            case 1969713294: goto L_0x0023;
            case 2029456693: goto L_0x0017;
            case 2042568164: goto L_0x000b;
            default: goto L_0x0009;
        };
    L_0x0009:
        goto L_0x09e7;
    L_0x000b:
        r0 = "BGH Joy Smart AXS II";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0013:
        r3 = 24;
        goto L_0x09e8;
    L_0x0017:
        r0 = "MediaPad T1 8.0 Pro";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x001f:
        r3 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        goto L_0x09e8;
    L_0x0023:
        r0 = "C6740N";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x002b:
        r3 = 28;
        goto L_0x09e8;
    L_0x002f:
        r0 = "B3-A20";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0037:
        r3 = 23;
        goto L_0x09e8;
    L_0x003b:
        r0 = "A466BG";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0043:
        r3 = 14;
        goto L_0x09e8;
    L_0x0047:
        r0 = "KYOCERA-C6745";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x004f:
        r3 = 52;
        goto L_0x09e8;
    L_0x0053:
        r0 = "ASUS_X008D";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x005b:
        r3 = 21;
        goto L_0x09e8;
    L_0x005f:
        r0 = "Le X509";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0067:
        r3 = 55;
        goto L_0x09e8;
    L_0x006b:
        r0 = "Le X507";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0073:
        r3 = 54;
        goto L_0x09e8;
    L_0x0077:
        r0 = "VS810PP";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x007f:
        r3 = 199; // 0xc7 float:2.79E-43 double:9.83E-322;
        goto L_0x09e8;
    L_0x0083:
        r0 = "Lenovo X2-EU";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x008b:
        r3 = 62;
        goto L_0x09e8;
    L_0x008f:
        r0 = "Lenovo A1000";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0097:
        r3 = 57;
        goto L_0x09e8;
    L_0x009b:
        r0 = "HTC Desire 626 dual sim";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x00a3:
        r3 = 43;
        goto L_0x09e8;
    L_0x00a7:
        r0 = "HTC Desire 626GPLUS dual sim";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x00af:
        r3 = 44;
        goto L_0x09e8;
    L_0x00b3:
        r0 = "ZTE BLADE A110";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x00bb:
        r3 = 211; // 0xd3 float:2.96E-43 double:1.042E-321;
        goto L_0x09e8;
    L_0x00bf:
        r0 = "LG-VS450PP";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x00c7:
        r3 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        goto L_0x09e8;
    L_0x00cb:
        r0 = "HTC Desire 628 dual sim";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x00d3:
        r3 = 46;
        goto L_0x09e8;
    L_0x00d7:
        r0 = "H30-U10";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x00df:
        r3 = 34;
        goto L_0x09e8;
    L_0x00e3:
        r0 = "PULP FAB 4G";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x00eb:
        r3 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        goto L_0x09e8;
    L_0x00ef:
        r0 = "LGUS215";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x00f7:
        r3 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        goto L_0x09e8;
    L_0x00fb:
        r0 = "LGMS631";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0103:
        r3 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        goto L_0x09e8;
    L_0x0107:
        r0 = "LGMS550";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x010f:
        r3 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        goto L_0x09e8;
    L_0x0113:
        r0 = "LGMS395";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x011b:
        r3 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        goto L_0x09e8;
    L_0x011f:
        r0 = "LGMS345";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0127:
        r3 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        goto L_0x09e8;
    L_0x012b:
        r0 = "LGMS323";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0133:
        r3 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        goto L_0x09e8;
    L_0x0137:
        r0 = "LGMS210";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x013f:
        r3 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        goto L_0x09e8;
    L_0x0143:
        r0 = "LGMP260";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x014b:
        r3 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        goto L_0x09e8;
    L_0x014f:
        r0 = "LGLS991";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0157:
        r3 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        goto L_0x09e8;
    L_0x015b:
        r0 = "LGLS755";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0163:
        r3 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        goto L_0x09e8;
    L_0x0167:
        r0 = "LGLS665";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x016f:
        r3 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        goto L_0x09e8;
    L_0x0173:
        r0 = "LGLS660";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x017b:
        r3 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        goto L_0x09e8;
    L_0x017f:
        r0 = "LGL53BL";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0187:
        r3 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        goto L_0x09e8;
    L_0x018b:
        r0 = "LGAS992";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0193:
        r3 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        goto L_0x09e8;
    L_0x0197:
        r0 = "HTC Desire 526G dual sim";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x019f:
        r3 = 40;
        goto L_0x09e8;
    L_0x01a3:
        r0 = "LG-V521";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x01ab:
        r3 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        goto L_0x09e8;
    L_0x01af:
        r0 = "LG-V495";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x01b7:
        r3 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        goto L_0x09e8;
    L_0x01bb:
        r0 = "LG-V410";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x01c3:
        r3 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        goto L_0x09e8;
    L_0x01c7:
        r0 = "LG-M257";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x01cf:
        r3 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        goto L_0x09e8;
    L_0x01d3:
        r0 = "LG-M250";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x01db:
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        goto L_0x09e8;
    L_0x01df:
        r0 = "LG-M210";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x01e7:
        r3 = 100;
        goto L_0x09e8;
    L_0x01eb:
        r0 = "LG-M200";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x01f3:
        r3 = 99;
        goto L_0x09e8;
    L_0x01f7:
        r0 = "LG-M153";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x01ff:
        r3 = 98;
        goto L_0x09e8;
    L_0x0203:
        r0 = "LG-M151";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x020b:
        r3 = 97;
        goto L_0x09e8;
    L_0x020f:
        r0 = "LG-M150";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0217:
        r3 = 96;
        goto L_0x09e8;
    L_0x021b:
        r0 = "LG-K557";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0223:
        r3 = 94;
        goto L_0x09e8;
    L_0x0227:
        r0 = "LG-K550";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x022f:
        r3 = 93;
        goto L_0x09e8;
    L_0x0233:
        r0 = "LG-K520";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x023b:
        r3 = 92;
        goto L_0x09e8;
    L_0x023f:
        r0 = "LG-K500";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0247:
        r3 = 90;
        goto L_0x09e8;
    L_0x024b:
        r0 = "LG-K420";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0253:
        r3 = 89;
        goto L_0x09e8;
    L_0x0257:
        r0 = "LG-K410";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x025f:
        r3 = 88;
        goto L_0x09e8;
    L_0x0263:
        r0 = "LG-K240";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x026b:
        r3 = 87;
        goto L_0x09e8;
    L_0x026f:
        r0 = "LG-K220";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0277:
        r3 = 86;
        goto L_0x09e8;
    L_0x027b:
        r0 = "LG-K130";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0283:
        r3 = 85;
        goto L_0x09e8;
    L_0x0287:
        r0 = "LG-K120";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x028f:
        r3 = 84;
        goto L_0x09e8;
    L_0x0293:
        r0 = "LG-K100";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x029b:
        r3 = 83;
        goto L_0x09e8;
    L_0x029f:
        r0 = "LG-H840";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x02a7:
        r3 = 82;
        goto L_0x09e8;
    L_0x02ab:
        r0 = "LG-H818";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x02b3:
        r3 = 81;
        goto L_0x09e8;
    L_0x02b7:
        r0 = "LG-H810";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x02bf:
        r3 = 80;
        goto L_0x09e8;
    L_0x02c3:
        r0 = "LG-H740";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x02cb:
        r3 = 79;
        goto L_0x09e8;
    L_0x02cf:
        r0 = "LG-H735";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x02d7:
        r3 = 78;
        goto L_0x09e8;
    L_0x02db:
        r0 = "LG-H650";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x02e3:
        r3 = 77;
        goto L_0x09e8;
    L_0x02e7:
        r0 = "LG-H635";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x02ef:
        r3 = 76;
        goto L_0x09e8;
    L_0x02f3:
        r0 = "LG-H631";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x02fb:
        r3 = 75;
        goto L_0x09e8;
    L_0x02ff:
        r0 = "LG-H542";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0307:
        r3 = 74;
        goto L_0x09e8;
    L_0x030b:
        r0 = "LG-H422";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0313:
        r3 = 73;
        goto L_0x09e8;
    L_0x0317:
        r0 = "LG-H420";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x031f:
        r3 = 72;
        goto L_0x09e8;
    L_0x0323:
        r0 = "LG-H345";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x032b:
        r3 = 71;
        goto L_0x09e8;
    L_0x032f:
        r0 = "LG-H343";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0337:
        r3 = 70;
        goto L_0x09e8;
    L_0x033b:
        r0 = "LG-D850";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0343:
        r3 = 67;
        goto L_0x09e8;
    L_0x0347:
        r0 = "LG-D802";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x034f:
        r3 = 66;
        goto L_0x09e8;
    L_0x0353:
        r0 = "LG-D680";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x035b:
        r3 = 65;
        goto L_0x09e8;
    L_0x035f:
        r0 = "LG-D415";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0367:
        r3 = 64;
        goto L_0x09e8;
    L_0x036b:
        r0 = "LG-D280";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0373:
        r3 = 63;
        goto L_0x09e8;
    L_0x0377:
        r0 = "SM-T560NU";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x037f:
        r3 = 189; // 0xbd float:2.65E-43 double:9.34E-322;
        goto L_0x09e8;
    L_0x0383:
        r0 = "SM-T116NU";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x038b:
        r3 = 176; // 0xb0 float:2.47E-43 double:8.7E-322;
        goto L_0x09e8;
    L_0x038f:
        r0 = "SM-T113NU";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0397:
        r3 = 174; // 0xae float:2.44E-43 double:8.6E-322;
        goto L_0x09e8;
    L_0x039b:
        r0 = "SM-S550TL";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x03a3:
        r3 = 171; // 0xab float:2.4E-43 double:8.45E-322;
        goto L_0x09e8;
    L_0x03a7:
        r0 = "SM-S320VL";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x03af:
        r3 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        goto L_0x09e8;
    L_0x03b3:
        r0 = "Hisense F20";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x03bb:
        r3 = 35;
        goto L_0x09e8;
    L_0x03bf:
        r0 = "L-EMENT_403";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x03c7:
        r3 = 53;
        goto L_0x09e8;
    L_0x03cb:
        r0 = "ASUS_X008DC";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x03d3:
        r3 = 22;
        goto L_0x09e8;
    L_0x03d7:
        r0 = "CUBOT DINOSAUR";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x03df:
        r3 = 29;
        goto L_0x09e8;
    L_0x03e3:
        r0 = "STARXTREM 6";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x03eb:
        r3 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        goto L_0x09e8;
    L_0x03ef:
        r0 = "SM-G550T2";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x03f7:
        r3 = 156; // 0x9c float:2.19E-43 double:7.7E-322;
        goto L_0x09e8;
    L_0x03fb:
        r0 = "SM-G550T1";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0403:
        r3 = 155; // 0x9b float:2.17E-43 double:7.66E-322;
        goto L_0x09e8;
    L_0x0407:
        r0 = "SM-G386T1";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x040f:
        r3 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        goto L_0x09e8;
    L_0x0413:
        r0 = "SM-G360R6";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x041b:
        r3 = 147; // 0x93 float:2.06E-43 double:7.26E-322;
        goto L_0x09e8;
    L_0x041f:
        r0 = "SM-G360BT";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0427:
        r3 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
        goto L_0x09e8;
    L_0x042b:
        r0 = "SM-G357FZ";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0433:
        r3 = 141; // 0x8d float:1.98E-43 double:6.97E-322;
        goto L_0x09e8;
    L_0x0437:
        r0 = "SM-G355HN";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x043f:
        r3 = 139; // 0x8b float:1.95E-43 double:6.87E-322;
        goto L_0x09e8;
    L_0x0443:
        r0 = "vivo 1611";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x044b:
        r3 = 197; // 0xc5 float:2.76E-43 double:9.73E-322;
        goto L_0x09e8;
    L_0x044f:
        r0 = "Alcatel_4060O";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0457:
        r3 = 19;
        goto L_0x09e8;
    L_0x045b:
        r0 = "Alcatel_4060A";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0463:
        r3 = 18;
        goto L_0x09e8;
    L_0x0467:
        r0 = "GT-S7275R";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x046f:
        r3 = 33;
        goto L_0x09e8;
    L_0x0473:
        r0 = "ALCATEL ONE TOUCH 7041X";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x047b:
        r3 = 17;
        goto L_0x09e8;
    L_0x047f:
        r0 = "Z963U";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0487:
        r3 = 208; // 0xd0 float:2.91E-43 double:1.03E-321;
        goto L_0x09e8;
    L_0x048b:
        r0 = "Z955A";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0493:
        r3 = 205; // 0xcd float:2.87E-43 double:1.013E-321;
        goto L_0x09e8;
    L_0x0497:
        r0 = "Z818L";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x049f:
        r3 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        goto L_0x09e8;
    L_0x04a3:
        r0 = "X9079";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x04ab:
        r3 = 201; // 0xc9 float:2.82E-43 double:9.93E-322;
        goto L_0x09e8;
    L_0x04af:
        r0 = "VS501";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x04b7:
        r3 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;
        goto L_0x09e8;
    L_0x04bb:
        r0 = "LENNY";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x04c3:
        r3 = 56;
        goto L_0x09e8;
    L_0x04c7:
        r0 = "JERRY";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x04cf:
        r3 = 50;
        goto L_0x09e8;
    L_0x04d3:
        r0 = "D5322";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x04db:
        r3 = 31;
        goto L_0x09e8;
    L_0x04df:
        r0 = "D5303";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x04e7:
        r3 = 30;
        goto L_0x09e8;
    L_0x04eb:
        r0 = "C6740";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x04f3:
        r3 = 27;
        goto L_0x09e8;
    L_0x04f7:
        r0 = "A50TI";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x04ff:
        r3 = 16;
        goto L_0x09e8;
    L_0x0503:
        r0 = "A466T";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x050b:
        r3 = 15;
        goto L_0x09e8;
    L_0x050f:
        r0 = "A460G";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0517:
        r3 = 13;
        goto L_0x09e8;
    L_0x051b:
        r0 = "8050D";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0523:
        r3 = 11;
        goto L_0x09e8;
    L_0x0527:
        r0 = "5056X";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x052f:
        r3 = 10;
        goto L_0x09e8;
    L_0x0533:
        r0 = "5056W";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x053b:
        r3 = 9;
        goto L_0x09e8;
    L_0x053f:
        r0 = "5056N";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0547:
        r3 = 8;
        goto L_0x09e8;
    L_0x054b:
        r0 = "5056I";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0553:
        r3 = 7;
        goto L_0x09e8;
    L_0x0556:
        r0 = "5056E";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x055e:
        r3 = 6;
        goto L_0x09e8;
    L_0x0561:
        r0 = "5056A";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0569:
        r3 = 5;
        goto L_0x09e8;
    L_0x056c:
        r0 = "5042T";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0574:
        r3 = 4;
        goto L_0x09e8;
    L_0x0577:
        r0 = "5027B";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x057f:
        r3 = 3;
        goto L_0x09e8;
    L_0x0582:
        r0 = "5017B";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x058a:
        r3 = 2;
        goto L_0x09e8;
    L_0x058d:
        r0 = "4060W";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0595:
        r3 = 1;
        goto L_0x09e8;
    L_0x0598:
        r0 = "0PJA2";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x05a0:
        r3 = 0;
        goto L_0x09e8;
    L_0x05a3:
        r0 = "Wooze_I5";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x05ab:
        r3 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        goto L_0x09e8;
    L_0x05af:
        r0 = "Z988";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x05b7:
        r3 = 210; // 0xd2 float:2.94E-43 double:1.04E-321;
        goto L_0x09e8;
    L_0x05bb:
        r0 = "Z958";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x05c3:
        r3 = 206; // 0xce float:2.89E-43 double:1.02E-321;
        goto L_0x09e8;
    L_0x05c7:
        r0 = "Z813";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x05cf:
        r3 = 203; // 0xcb float:2.84E-43 double:1.003E-321;
        goto L_0x09e8;
    L_0x05d3:
        r0 = "Z812";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x05db:
        r3 = 202; // 0xca float:2.83E-43 double:1.0E-321;
        goto L_0x09e8;
    L_0x05df:
        r0 = "N817";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x05e7:
        r3 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        goto L_0x09e8;
    L_0x05eb:
        r0 = "A33f";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x05f3:
        r3 = 12;
        goto L_0x09e8;
    L_0x05f7:
        r0 = "Archos 55 Platinum";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x05ff:
        r3 = 20;
        goto L_0x09e8;
    L_0x0603:
        r0 = "BGO-DL09";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x060b:
        r3 = 25;
        goto L_0x09e8;
    L_0x060f:
        r0 = "HTC Desire 526GPLUS dual sim";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0617:
        r3 = 41;
        goto L_0x09e8;
    L_0x061b:
        r0 = "Swift 2";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0623:
        r3 = 194; // 0xc2 float:2.72E-43 double:9.6E-322;
        goto L_0x09e8;
    L_0x0627:
        r0 = "HM NOTE 1S";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x062f:
        r3 = 38;
        goto L_0x09e8;
    L_0x0633:
        r0 = "HTC Desire 628";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x063b:
        r3 = 45;
        goto L_0x09e8;
    L_0x063f:
        r0 = "HTC Desire 620";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0647:
        r3 = 42;
        goto L_0x09e8;
    L_0x064b:
        r0 = "HTC Desire 310";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0653:
        r3 = 39;
        goto L_0x09e8;
    L_0x0657:
        r0 = "SM-T377V";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x065f:
        r3 = 186; // 0xba float:2.6E-43 double:9.2E-322;
        goto L_0x09e8;
    L_0x0663:
        r0 = "SM-T377T";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x066b:
        r3 = 185; // 0xb9 float:2.59E-43 double:9.14E-322;
        goto L_0x09e8;
    L_0x066f:
        r0 = "SM-T377P";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0677:
        r3 = 184; // 0xb8 float:2.58E-43 double:9.1E-322;
        goto L_0x09e8;
    L_0x067b:
        r0 = "SM-T357T";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0683:
        r3 = 183; // 0xb7 float:2.56E-43 double:9.04E-322;
        goto L_0x09e8;
    L_0x0687:
        r0 = "SM-T355Y";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x068f:
        r3 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;
        goto L_0x09e8;
    L_0x0693:
        r0 = "SM-T237P";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x069b:
        r3 = 178; // 0xb2 float:2.5E-43 double:8.8E-322;
        goto L_0x09e8;
    L_0x069f:
        r0 = "SM-T217S";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x06a7:
        r3 = 177; // 0xb1 float:2.48E-43 double:8.74E-322;
        goto L_0x09e8;
    L_0x06ab:
        r0 = "SM-S978L";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x06b3:
        r3 = 172; // 0xac float:2.41E-43 double:8.5E-322;
        goto L_0x09e8;
    L_0x06b7:
        r0 = "SM-J727P";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x06bf:
        r3 = 167; // 0xa7 float:2.34E-43 double:8.25E-322;
        goto L_0x09e8;
    L_0x06c3:
        r0 = "SM-J106H";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x06cb:
        r3 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        goto L_0x09e8;
    L_0x06cf:
        r0 = "SM-J106F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x06d7:
        r3 = 165; // 0xa5 float:2.31E-43 double:8.15E-322;
        goto L_0x09e8;
    L_0x06db:
        r0 = "SM-J105Y";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x06e3:
        r3 = 164; // 0xa4 float:2.3E-43 double:8.1E-322;
        goto L_0x09e8;
    L_0x06e7:
        r0 = "SM-J105M";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x06ef:
        r3 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        goto L_0x09e8;
    L_0x06f3:
        r0 = "SM-J105F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x06fb:
        r3 = 162; // 0xa2 float:2.27E-43 double:8.0E-322;
        goto L_0x09e8;
    L_0x06ff:
        r0 = "SM-J100H";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0707:
        r3 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        goto L_0x09e8;
    L_0x070b:
        r0 = "SM-G6100";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0713:
        r3 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        goto L_0x09e8;
    L_0x0717:
        r0 = "SM-G6000";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x071f:
        r3 = 158; // 0x9e float:2.21E-43 double:7.8E-322;
        goto L_0x09e8;
    L_0x0723:
        r0 = "SM-G5700";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x072b:
        r3 = 157; // 0x9d float:2.2E-43 double:7.76E-322;
        goto L_0x09e8;
    L_0x072f:
        r0 = "SM-G550T";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0737:
        r3 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
        goto L_0x09e8;
    L_0x073b:
        r0 = "SM-G386W";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0743:
        r3 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
        goto L_0x09e8;
    L_0x0747:
        r0 = "SM-G386F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x074f:
        r3 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        goto L_0x09e8;
    L_0x0753:
        r0 = "SM-G3815";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x075b:
        r3 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        goto L_0x09e8;
    L_0x075f:
        r0 = "SM-G360V";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0767:
        r3 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        goto L_0x09e8;
    L_0x076b:
        r0 = "SM-G360T";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0773:
        r3 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        goto L_0x09e8;
    L_0x0777:
        r0 = "SM-G360P";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x077f:
        r3 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
        goto L_0x09e8;
    L_0x0783:
        r0 = "SM-G360M";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x078b:
        r3 = 145; // 0x91 float:2.03E-43 double:7.16E-322;
        goto L_0x09e8;
    L_0x078f:
        r0 = "SM-G360G";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0797:
        r3 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        goto L_0x09e8;
    L_0x079b:
        r0 = "SM-G360F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x07a3:
        r3 = 143; // 0x8f float:2.0E-43 double:7.07E-322;
        goto L_0x09e8;
    L_0x07a7:
        r0 = "SM-G355M";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x07af:
        r3 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        goto L_0x09e8;
    L_0x07b3:
        r0 = "SM-G355H";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x07bb:
        r3 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        goto L_0x09e8;
    L_0x07bf:
        r0 = "SM-E700H";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x07c7:
        r3 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        goto L_0x09e8;
    L_0x07cb:
        r0 = "SM-E700F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x07d3:
        r3 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
        goto L_0x09e8;
    L_0x07d7:
        r0 = "SM-C7000";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x07df:
        r3 = 135; // 0x87 float:1.89E-43 double:6.67E-322;
        goto L_0x09e8;
    L_0x07e3:
        r0 = "SM-C5000";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x07eb:
        r3 = 134; // 0x86 float:1.88E-43 double:6.6E-322;
        goto L_0x09e8;
    L_0x07ef:
        r0 = "SM-A910F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x07f7:
        r3 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        goto L_0x09e8;
    L_0x07fb:
        r0 = "SM-A9000";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0803:
        r3 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        goto L_0x09e8;
    L_0x0807:
        r0 = "Tab2A7-20F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x080f:
        r3 = 195; // 0xc3 float:2.73E-43 double:9.63E-322;
        goto L_0x09e8;
    L_0x0813:
        r0 = "Turk Telekom TT175";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x081b:
        r3 = 196; // 0xc4 float:2.75E-43 double:9.7E-322;
        goto L_0x09e8;
    L_0x081f:
        r0 = "SAMSUNG-SM-T377A";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0827:
        r3 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        goto L_0x09e8;
    L_0x082b:
        r0 = "LG-TP260";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0833:
        r3 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        goto L_0x09e8;
    L_0x0837:
        r0 = "LG-LS777";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x083f:
        r3 = 95;
        goto L_0x09e8;
    L_0x0843:
        r0 = "LG-K500n";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x084b:
        r3 = 91;
        goto L_0x09e8;
    L_0x084f:
        r0 = "LG-D852G";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0857:
        r3 = 68;
        goto L_0x09e8;
    L_0x085b:
        r0 = "Nexus 6";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0863:
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        goto L_0x09e8;
    L_0x0867:
        r0 = "STARXTREM5";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x086f:
        r3 = 193; // 0xc1 float:2.7E-43 double:9.54E-322;
        goto L_0x09e8;
    L_0x0873:
        r0 = "HUAWEI Y330-U01";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x087b:
        r3 = 49;
        goto L_0x09e8;
    L_0x087f:
        r0 = "Lenovo TB3-710F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0887:
        r3 = 61;
        goto L_0x09e8;
    L_0x088b:
        r0 = "STARADDICT 6";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0893:
        r3 = 191; // 0xbf float:2.68E-43 double:9.44E-322;
        goto L_0x09e8;
    L_0x0897:
        r0 = "Lenovo TB2-X30F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x089f:
        r3 = 60;
        goto L_0x09e8;
    L_0x08a3:
        r0 = "Lenovo TB-X103F";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x08ab:
        r3 = 59;
        goto L_0x09e8;
    L_0x08af:
        r0 = "Lenovo A2020a40";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x08b7:
        r3 = 58;
        goto L_0x09e8;
    L_0x08bb:
        r0 = "SM-J100VPP";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x08c3:
        r3 = 161; // 0xa1 float:2.26E-43 double:7.95E-322;
        goto L_0x09e8;
    L_0x08c7:
        r0 = "SM-T813";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x08cf:
        r3 = 190; // 0xbe float:2.66E-43 double:9.4E-322;
        goto L_0x09e8;
    L_0x08d3:
        r0 = "SM-T555";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x08db:
        r3 = 188; // 0xbc float:2.63E-43 double:9.3E-322;
        goto L_0x09e8;
    L_0x08df:
        r0 = "SM-T550";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x08e7:
        r3 = 187; // 0xbb float:2.62E-43 double:9.24E-322;
        goto L_0x09e8;
    L_0x08eb:
        r0 = "SM-T350";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x08f3:
        r3 = 181; // 0xb5 float:2.54E-43 double:8.94E-322;
        goto L_0x09e8;
    L_0x08f7:
        r0 = "SM-T285";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x08ff:
        r3 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        goto L_0x09e8;
    L_0x0903:
        r0 = "SM-T280";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x090b:
        r3 = 179; // 0xb3 float:2.51E-43 double:8.84E-322;
        goto L_0x09e8;
    L_0x090f:
        r0 = "SM-T116";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0917:
        r3 = 175; // 0xaf float:2.45E-43 double:8.65E-322;
        goto L_0x09e8;
    L_0x091b:
        r0 = "SM-T113";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0923:
        r3 = 173; // 0xad float:2.42E-43 double:8.55E-322;
        goto L_0x09e8;
    L_0x0927:
        r0 = "SM-P555";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x092f:
        r3 = 169; // 0xa9 float:2.37E-43 double:8.35E-322;
        goto L_0x09e8;
    L_0x0933:
        r0 = "SM-P550";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x093b:
        r3 = 168; // 0xa8 float:2.35E-43 double:8.3E-322;
        goto L_0x09e8;
    L_0x093f:
        r0 = "HTC One_M8 Eye";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0947:
        r3 = 47;
        goto L_0x09e8;
    L_0x094b:
        r0 = "BLU DASH M2";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0953:
        r3 = 26;
        goto L_0x09e8;
    L_0x0957:
        r0 = "LG-H340AR";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x095f:
        r3 = 69;
        goto L_0x09e8;
    L_0x0963:
        r0 = "Z963VL";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x096b:
        r3 = 209; // 0xd1 float:2.93E-43 double:1.033E-321;
        goto L_0x09e8;
    L_0x096e:
        r0 = "Z962BL";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0976:
        r3 = 207; // 0xcf float:2.9E-43 double:1.023E-321;
        goto L_0x09e8;
    L_0x0979:
        r0 = "K6000 Pro";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0981:
        r3 = 51;
        goto L_0x09e8;
    L_0x0984:
        r0 = "SAMSUNG-SM-G360AZ";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x098c:
        r3 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        goto L_0x09e8;
    L_0x098f:
        r0 = "Echo POWER";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x0997:
        r3 = 32;
        goto L_0x09e8;
    L_0x099a:
        r0 = "Hisense L675";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x09a2:
        r3 = 36;
        goto L_0x09e8;
    L_0x09a5:
        r0 = "HM NOTE 1LTE";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x09ad:
        r3 = 37;
        goto L_0x09e8;
    L_0x09b0:
        r0 = "LGL41C";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x09b8:
        r3 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        goto L_0x09e8;
    L_0x09bb:
        r0 = "LGL33L";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x09c3:
        r3 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        goto L_0x09e8;
    L_0x09c6:
        r0 = "LGL22C";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x09ce:
        r3 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        goto L_0x09e8;
    L_0x09d1:
        r0 = "LGL21G";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x09d9:
        r3 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        goto L_0x09e8;
    L_0x09dc:
        r0 = "HTC_0PJA10";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x09e7;
    L_0x09e4:
        r3 = 48;
        goto L_0x09e8;
    L_0x09e7:
        r3 = -1;
    L_0x09e8:
        switch(r3) {
            case 0: goto L_0x09ec;
            case 1: goto L_0x09ec;
            case 2: goto L_0x09ec;
            case 3: goto L_0x09ec;
            case 4: goto L_0x09ec;
            case 5: goto L_0x09ec;
            case 6: goto L_0x09ec;
            case 7: goto L_0x09ec;
            case 8: goto L_0x09ec;
            case 9: goto L_0x09ec;
            case 10: goto L_0x09ec;
            case 11: goto L_0x09ec;
            case 12: goto L_0x09ec;
            case 13: goto L_0x09ec;
            case 14: goto L_0x09ec;
            case 15: goto L_0x09ec;
            case 16: goto L_0x09ec;
            case 17: goto L_0x09ec;
            case 18: goto L_0x09ec;
            case 19: goto L_0x09ec;
            case 20: goto L_0x09ec;
            case 21: goto L_0x09ec;
            case 22: goto L_0x09ec;
            case 23: goto L_0x09ec;
            case 24: goto L_0x09ec;
            case 25: goto L_0x09ec;
            case 26: goto L_0x09ec;
            case 27: goto L_0x09ec;
            case 28: goto L_0x09ec;
            case 29: goto L_0x09ec;
            case 30: goto L_0x09ec;
            case 31: goto L_0x09ec;
            case 32: goto L_0x09ec;
            case 33: goto L_0x09ec;
            case 34: goto L_0x09ec;
            case 35: goto L_0x09ec;
            case 36: goto L_0x09ec;
            case 37: goto L_0x09ec;
            case 38: goto L_0x09ec;
            case 39: goto L_0x09ec;
            case 40: goto L_0x09ec;
            case 41: goto L_0x09ec;
            case 42: goto L_0x09ec;
            case 43: goto L_0x09ec;
            case 44: goto L_0x09ec;
            case 45: goto L_0x09ec;
            case 46: goto L_0x09ec;
            case 47: goto L_0x09ec;
            case 48: goto L_0x09ec;
            case 49: goto L_0x09ec;
            case 50: goto L_0x09ec;
            case 51: goto L_0x09ec;
            case 52: goto L_0x09ec;
            case 53: goto L_0x09ec;
            case 54: goto L_0x09ec;
            case 55: goto L_0x09ec;
            case 56: goto L_0x09ec;
            case 57: goto L_0x09ec;
            case 58: goto L_0x09ec;
            case 59: goto L_0x09ec;
            case 60: goto L_0x09ec;
            case 61: goto L_0x09ec;
            case 62: goto L_0x09ec;
            case 63: goto L_0x09ec;
            case 64: goto L_0x09ec;
            case 65: goto L_0x09ec;
            case 66: goto L_0x09ec;
            case 67: goto L_0x09ec;
            case 68: goto L_0x09ec;
            case 69: goto L_0x09ec;
            case 70: goto L_0x09ec;
            case 71: goto L_0x09ec;
            case 72: goto L_0x09ec;
            case 73: goto L_0x09ec;
            case 74: goto L_0x09ec;
            case 75: goto L_0x09ec;
            case 76: goto L_0x09ec;
            case 77: goto L_0x09ec;
            case 78: goto L_0x09ec;
            case 79: goto L_0x09ec;
            case 80: goto L_0x09ec;
            case 81: goto L_0x09ec;
            case 82: goto L_0x09ec;
            case 83: goto L_0x09ec;
            case 84: goto L_0x09ec;
            case 85: goto L_0x09ec;
            case 86: goto L_0x09ec;
            case 87: goto L_0x09ec;
            case 88: goto L_0x09ec;
            case 89: goto L_0x09ec;
            case 90: goto L_0x09ec;
            case 91: goto L_0x09ec;
            case 92: goto L_0x09ec;
            case 93: goto L_0x09ec;
            case 94: goto L_0x09ec;
            case 95: goto L_0x09ec;
            case 96: goto L_0x09ec;
            case 97: goto L_0x09ec;
            case 98: goto L_0x09ec;
            case 99: goto L_0x09ec;
            case 100: goto L_0x09ec;
            case 101: goto L_0x09ec;
            case 102: goto L_0x09ec;
            case 103: goto L_0x09ec;
            case 104: goto L_0x09ec;
            case 105: goto L_0x09ec;
            case 106: goto L_0x09ec;
            case 107: goto L_0x09ec;
            case 108: goto L_0x09ec;
            case 109: goto L_0x09ec;
            case 110: goto L_0x09ec;
            case 111: goto L_0x09ec;
            case 112: goto L_0x09ec;
            case 113: goto L_0x09ec;
            case 114: goto L_0x09ec;
            case 115: goto L_0x09ec;
            case 116: goto L_0x09ec;
            case 117: goto L_0x09ec;
            case 118: goto L_0x09ec;
            case 119: goto L_0x09ec;
            case 120: goto L_0x09ec;
            case 121: goto L_0x09ec;
            case 122: goto L_0x09ec;
            case 123: goto L_0x09ec;
            case 124: goto L_0x09ec;
            case 125: goto L_0x09ec;
            case 126: goto L_0x09ec;
            case 127: goto L_0x09ec;
            case 128: goto L_0x09ec;
            case 129: goto L_0x09ec;
            case 130: goto L_0x09ec;
            case 131: goto L_0x09ec;
            case 132: goto L_0x09ec;
            case 133: goto L_0x09ec;
            case 134: goto L_0x09ec;
            case 135: goto L_0x09ec;
            case 136: goto L_0x09ec;
            case 137: goto L_0x09ec;
            case 138: goto L_0x09ec;
            case 139: goto L_0x09ec;
            case 140: goto L_0x09ec;
            case 141: goto L_0x09ec;
            case 142: goto L_0x09ec;
            case 143: goto L_0x09ec;
            case 144: goto L_0x09ec;
            case 145: goto L_0x09ec;
            case 146: goto L_0x09ec;
            case 147: goto L_0x09ec;
            case 148: goto L_0x09ec;
            case 149: goto L_0x09ec;
            case 150: goto L_0x09ec;
            case 151: goto L_0x09ec;
            case 152: goto L_0x09ec;
            case 153: goto L_0x09ec;
            case 154: goto L_0x09ec;
            case 155: goto L_0x09ec;
            case 156: goto L_0x09ec;
            case 157: goto L_0x09ec;
            case 158: goto L_0x09ec;
            case 159: goto L_0x09ec;
            case 160: goto L_0x09ec;
            case 161: goto L_0x09ec;
            case 162: goto L_0x09ec;
            case 163: goto L_0x09ec;
            case 164: goto L_0x09ec;
            case 165: goto L_0x09ec;
            case 166: goto L_0x09ec;
            case 167: goto L_0x09ec;
            case 168: goto L_0x09ec;
            case 169: goto L_0x09ec;
            case 170: goto L_0x09ec;
            case 171: goto L_0x09ec;
            case 172: goto L_0x09ec;
            case 173: goto L_0x09ec;
            case 174: goto L_0x09ec;
            case 175: goto L_0x09ec;
            case 176: goto L_0x09ec;
            case 177: goto L_0x09ec;
            case 178: goto L_0x09ec;
            case 179: goto L_0x09ec;
            case 180: goto L_0x09ec;
            case 181: goto L_0x09ec;
            case 182: goto L_0x09ec;
            case 183: goto L_0x09ec;
            case 184: goto L_0x09ec;
            case 185: goto L_0x09ec;
            case 186: goto L_0x09ec;
            case 187: goto L_0x09ec;
            case 188: goto L_0x09ec;
            case 189: goto L_0x09ec;
            case 190: goto L_0x09ec;
            case 191: goto L_0x09ec;
            case 192: goto L_0x09ec;
            case 193: goto L_0x09ec;
            case 194: goto L_0x09ec;
            case 195: goto L_0x09ec;
            case 196: goto L_0x09ec;
            case 197: goto L_0x09ec;
            case 198: goto L_0x09ec;
            case 199: goto L_0x09ec;
            case 200: goto L_0x09ec;
            case 201: goto L_0x09ec;
            case 202: goto L_0x09ec;
            case 203: goto L_0x09ec;
            case 204: goto L_0x09ec;
            case 205: goto L_0x09ec;
            case 206: goto L_0x09ec;
            case 207: goto L_0x09ec;
            case 208: goto L_0x09ec;
            case 209: goto L_0x09ec;
            case 210: goto L_0x09ec;
            case 211: goto L_0x09ec;
            default: goto L_0x09eb;
        };
    L_0x09eb:
        return r2;
    L_0x09ec:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dre.d(java.lang.String):boolean");
    }

    private static com.google.common.base.Optional<java.lang.Boolean> e(java.lang.String r1) {
        /*
        r0 = r1.hashCode();
        switch(r0) {
            case -1855483509: goto L_0x00ab;
            case -1855483478: goto L_0x00a1;
            case -615500520: goto L_0x0096;
            case -401695999: goto L_0x008b;
            case -401691216: goto L_0x0081;
            case -401691208: goto L_0x0077;
            case -401691194: goto L_0x006d;
            case -401691186: goto L_0x0063;
            case -401691061: goto L_0x0058;
            case -401691039: goto L_0x004d;
            case -401691031: goto L_0x0042;
            case 78732520: goto L_0x0037;
            case 78732521: goto L_0x002c;
            case 432326502: goto L_0x0020;
            case 432475510: goto L_0x0015;
            case 432480315: goto L_0x0009;
            default: goto L_0x0007;
        };
    L_0x0007:
        goto L_0x00b5;
    L_0x0009:
        r0 = "SM-G955XN";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x00b5;
    L_0x0011:
        r1 = 11;
        goto L_0x00b6;
    L_0x0015:
        r0 = "SM-G950XN";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x00b5;
    L_0x001d:
        r1 = 4;
        goto L_0x00b6;
    L_0x0020:
        r0 = "SM-G900W8";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x00b5;
    L_0x0028:
        r1 = 14;
        goto L_0x00b6;
    L_0x002c:
        r0 = "SCV36";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x00b5;
    L_0x0034:
        r1 = 1;
        goto L_0x00b6;
    L_0x0037:
        r0 = "SCV35";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x00b5;
    L_0x003f:
        r1 = 8;
        goto L_0x00b6;
    L_0x0042:
        r0 = "SM-G955N";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x00b5;
    L_0x004a:
        r1 = 10;
        goto L_0x00b6;
    L_0x004d:
        r0 = "SM-G955F";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x00b5;
    L_0x0055:
        r1 = 9;
        goto L_0x00b6;
    L_0x0058:
        r0 = "SM-G9550";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x00b5;
    L_0x0060:
        r1 = 12;
        goto L_0x00b6;
    L_0x0063:
        r0 = "SM-G950N";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x00b5;
    L_0x006b:
        r1 = 3;
        goto L_0x00b6;
    L_0x006d:
        r0 = "SM-G950F";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x00b5;
    L_0x0075:
        r1 = 2;
        goto L_0x00b6;
    L_0x0077:
        r0 = "SM-G9508";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x00b5;
    L_0x007f:
        r1 = 6;
        goto L_0x00b6;
    L_0x0081:
        r0 = "SM-G9500";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x00b5;
    L_0x0089:
        r1 = 5;
        goto L_0x00b6;
    L_0x008b:
        r0 = "SM-G900F";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x00b5;
    L_0x0093:
        r1 = 13;
        goto L_0x00b6;
    L_0x0096:
        r0 = "SAMSUNG-SM-G891A";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x00b5;
    L_0x009e:
        r1 = 15;
        goto L_0x00b6;
    L_0x00a1:
        r0 = "SC-03J";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x00b5;
    L_0x00a9:
        r1 = 7;
        goto L_0x00b6;
    L_0x00ab:
        r0 = "SC-02J";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x00b5;
    L_0x00b3:
        r1 = 0;
        goto L_0x00b6;
    L_0x00b5:
        r1 = -1;
    L_0x00b6:
        switch(r1) {
            case 0: goto L_0x00be;
            case 1: goto L_0x00be;
            case 2: goto L_0x00be;
            case 3: goto L_0x00be;
            case 4: goto L_0x00be;
            case 5: goto L_0x00be;
            case 6: goto L_0x00be;
            case 7: goto L_0x00be;
            case 8: goto L_0x00be;
            case 9: goto L_0x00be;
            case 10: goto L_0x00be;
            case 11: goto L_0x00be;
            case 12: goto L_0x00be;
            case 13: goto L_0x00be;
            case 14: goto L_0x00be;
            case 15: goto L_0x00be;
            default: goto L_0x00b9;
        };
    L_0x00b9:
        r1 = com.google.common.base.Optional.absent();
        return r1;
    L_0x00be:
        r1 = java.lang.Boolean.FALSE;
        r1 = com.google.common.base.Optional.of(r1);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dre.e(java.lang.String):com.google.common.base.Optional");
    }

    /* JADX WARNING: Removed duplicated region for block: B:488:0x077c A:{SKIP} */
    /* JADX WARNING: Missing block: B:16:0x0058, code skipped:
            if (r0.equals("Pixel 2") != false) goto L_0x005c;
     */
    /* JADX WARNING: Missing block: B:482:0x076c, code skipped:
            if (r0.equals("SM-G930P") != false) goto L_0x077a;
     */
    /* JADX WARNING: Missing block: B:713:0x0ade, code skipped:
            if (r0.equals("ANE-LX1") != false) goto L_0x0b9f;
     */
    public final com.google.common.base.Optional<java.lang.Boolean> a(defpackage.fth r19) {
        /*
        r18 = this;
        r0 = r19;
        r1 = r0 instanceof defpackage.dnd;
        if (r1 == 0) goto L_0x0bdd;
    L_0x0006:
        r1 = defpackage.dre.1.a;
        r0 = (defpackage.dnd) r0;
        r0 = r0.ordinal();
        r0 = r1[r0];
        r3 = 30;
        r4 = 8;
        r5 = 3;
        r6 = 19;
        r7 = 18;
        r8 = 6;
        r9 = 36;
        r10 = 33;
        r11 = 28;
        r12 = 2;
        r13 = -1;
        r14 = 0;
        r15 = 1;
        switch(r0) {
            case 1: goto L_0x0959;
            case 2: goto L_0x0954;
            case 3: goto L_0x094f;
            case 4: goto L_0x078c;
            case 5: goto L_0x0746;
            case 6: goto L_0x0515;
            case 7: goto L_0x04f1;
            case 8: goto L_0x04cd;
            case 9: goto L_0x049b;
            case 10: goto L_0x048a;
            case 11: goto L_0x0485;
            case 12: goto L_0x0480;
            case 13: goto L_0x047b;
            case 14: goto L_0x0476;
            case 15: goto L_0x046f;
            case 16: goto L_0x0468;
            case 17: goto L_0x009d;
            case 18: goto L_0x0037;
            case 19: goto L_0x0030;
            case 20: goto L_0x0029;
            default: goto L_0x0027;
        };
    L_0x0027:
        goto L_0x0bdd;
    L_0x0029:
        r0 = android.os.Build.MODEL;
        r0 = defpackage.dre.e(r0);
        return r0;
    L_0x0030:
        r0 = java.lang.Boolean.FALSE;
        r0 = com.google.common.base.Optional.of(r0);
        return r0;
    L_0x0037:
        r0 = android.os.Build.MODEL;
        r1 = r0.hashCode();
        r2 = 1105847544; // 0x41e9e4f8 float:29.236801 double:5.46361281E-315;
        if (r1 == r2) goto L_0x0052;
    L_0x0042:
        r2 = 1905056540; // 0x718cdb1c float:1.3949692E30 double:9.4122299E-315;
        if (r1 == r2) goto L_0x0048;
    L_0x0047:
        goto L_0x005b;
    L_0x0048:
        r1 = "Pixel 2 XL";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x005b;
    L_0x0050:
        r14 = 1;
        goto L_0x005c;
    L_0x0052:
        r1 = "Pixel 2";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x005b;
    L_0x005a:
        goto L_0x005c;
    L_0x005b:
        r14 = -1;
    L_0x005c:
        if (r14 == 0) goto L_0x0096;
    L_0x005e:
        if (r14 == r15) goto L_0x0096;
    L_0x0060:
        r1 = "ONEPLUS A5";
        r1 = r0.startsWith(r1);
        if (r1 != 0) goto L_0x008f;
    L_0x0068:
        r1 = "ONEPLUS A6";
        r1 = r0.startsWith(r1);
        if (r1 == 0) goto L_0x0071;
    L_0x0070:
        goto L_0x008f;
    L_0x0071:
        r1 = "SM-[GN]96[05].*";
        r1 = java.util.regex.Pattern.compile(r1);
        r0 = r1.matcher(r0);
        r0 = r0.matches();
        if (r0 == 0) goto L_0x0088;
    L_0x0081:
        r0 = java.lang.Boolean.TRUE;
        r0 = com.google.common.base.Optional.of(r0);
        return r0;
    L_0x0088:
        r0 = java.lang.Boolean.FALSE;
        r0 = com.google.common.base.Optional.of(r0);
        return r0;
    L_0x008f:
        r0 = java.lang.Boolean.TRUE;
        r0 = com.google.common.base.Optional.of(r0);
        return r0;
    L_0x0096:
        r0 = java.lang.Boolean.TRUE;
        r0 = com.google.common.base.Optional.of(r0);
        return r0;
    L_0x009d:
        r0 = android.os.Build.MODEL;
        r16 = r0.hashCode();
        switch(r16) {
            case -2038157991: goto L_0x043d;
            case -2008646560: goto L_0x0432;
            case -1903597116: goto L_0x0427;
            case -1899992405: goto L_0x041c;
            case -1899932823: goto L_0x0411;
            case -1899903032: goto L_0x0406;
            case -1855483544: goto L_0x03fb;
            case -1855483538: goto L_0x03f0;
            case -1855483513: goto L_0x03e5;
            case -1855483511: goto L_0x03da;
            case -1855483509: goto L_0x03d0;
            case -1855483508: goto L_0x03c5;
            case -1855483478: goto L_0x03b9;
            case -1855483477: goto L_0x03ad;
            case -1855483452: goto L_0x03a1;
            case -1855483451: goto L_0x0395;
            case -1855483450: goto L_0x0389;
            case -1855483419: goto L_0x037d;
            case -1815885685: goto L_0x0371;
            case -1471353647: goto L_0x0366;
            case -1284603925: goto L_0x035a;
            case -1168015927: goto L_0x034e;
            case -987624008: goto L_0x0343;
            case -896079046: goto L_0x0337;
            case -733828194: goto L_0x032b;
            case -682170771: goto L_0x031f;
            case -615500551: goto L_0x0313;
            case -615500520: goto L_0x0307;
            case -615479409: goto L_0x02fb;
            case -615477487: goto L_0x02ef;
            case -615477332: goto L_0x02e3;
            case -615476526: goto L_0x02d7;
            case -615476371: goto L_0x02cb;
            case -612766289: goto L_0x02bf;
            case -609014762: goto L_0x02b3;
            case -609013801: goto L_0x02a7;
            case -609012840: goto L_0x029b;
            case -401784411: goto L_0x028f;
            case -401717084: goto L_0x0283;
            case -401717064: goto L_0x0277;
            case -399102029: goto L_0x026b;
            case -399102026: goto L_0x025f;
            case -390611819: goto L_0x0253;
            case 3272512: goto L_0x0247;
            case 49505672: goto L_0x023c;
            case 61542055: goto L_0x0231;
            case 62658882: goto L_0x0225;
            case 62662761: goto L_0x0219;
            case 62930933: goto L_0x020d;
            case 78722876: goto L_0x0201;
            case 78722877: goto L_0x01f5;
            case 78732516: goto L_0x01e9;
            case 78732518: goto L_0x01dd;
            case 78732520: goto L_0x01d1;
            case 78732521: goto L_0x01c5;
            case 78732523: goto L_0x01b9;
            case 78732524: goto L_0x01ad;
            case 78732546: goto L_0x01a1;
            case 85646018: goto L_0x0195;
            case 102694224: goto L_0x0189;
            case 323671686: goto L_0x017d;
            case 327542665: goto L_0x0171;
            case 394885390: goto L_0x0165;
            case 394886103: goto L_0x0159;
            case 512739038: goto L_0x014d;
            case 751035156: goto L_0x0142;
            case 837016910: goto L_0x0136;
            case 902094234: goto L_0x012a;
            case 1105847544: goto L_0x011e;
            case 1241611807: goto L_0x0112;
            case 1278930793: goto L_0x0106;
            case 1311330013: goto L_0x00fa;
            case 1358894773: goto L_0x00ef;
            case 1429316420: goto L_0x00e4;
            case 1905056540: goto L_0x00d8;
            case 1942425418: goto L_0x00cc;
            case 1950858990: goto L_0x00c0;
            case 1950859011: goto L_0x00b4;
            case 2118883325: goto L_0x00a8;
            default: goto L_0x00a6;
        };
    L_0x00a6:
        goto L_0x0448;
    L_0x00a8:
        r1 = "moto g(6) play";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x00b0:
        r1 = 78;
        goto L_0x0449;
    L_0x00b4:
        r1 = "SCH-R970X";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x00bc:
        r1 = 54;
        goto L_0x0449;
    L_0x00c0:
        r1 = "SCH-R970C";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x00c8:
        r1 = 53;
        goto L_0x0449;
    L_0x00cc:
        r1 = "SCH-I545L";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x00d4:
        r1 = 49;
        goto L_0x0449;
    L_0x00d8:
        r1 = "Pixel 2 XL";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x00e0:
        r1 = 16;
        goto L_0x0449;
    L_0x00e4:
        r1 = "HUAWEI ALE-L04";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x00ec:
        r1 = 6;
        goto L_0x0449;
    L_0x00ef:
        r1 = "HUAWEI ALE-CL00";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x00f7:
        r1 = 5;
        goto L_0x0449;
    L_0x00fa:
        r1 = "ONEPLUS A6013";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0102:
        r1 = 12;
        goto L_0x0449;
    L_0x0106:
        r1 = "WAS-L03T";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x010e:
        r1 = 77;
        goto L_0x0449;
    L_0x0112:
        r1 = "Redmi Note 4X";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x011a:
        r1 = 18;
        goto L_0x0449;
    L_0x011e:
        r1 = "Pixel 2";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0126:
        r1 = 15;
        goto L_0x0449;
    L_0x012a:
        r1 = "SM-S975LSGH-S970G";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0132:
        r1 = 74;
        goto L_0x0449;
    L_0x0136:
        r1 = "LGMP260";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x013e:
        r1 = 9;
        goto L_0x0449;
    L_0x0142:
        r1 = "LDN-L21";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x014a:
        r1 = 7;
        goto L_0x0449;
    L_0x014d:
        r1 = "SM-J327T1";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0155:
        r1 = 71;
        goto L_0x0449;
    L_0x0159:
        r1 = "PRA-LX1";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0161:
        r1 = 14;
        goto L_0x0449;
    L_0x0165:
        r1 = "PRA-LA1";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x016d:
        r1 = 13;
        goto L_0x0449;
    L_0x0171:
        r1 = "SGH-M919V";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0179:
        r1 = 66;
        goto L_0x0449;
    L_0x017d:
        r1 = "SGH-I337M";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0185:
        r1 = 64;
        goto L_0x0449;
    L_0x0189:
        r1 = "Moto G Play";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0191:
        r1 = 11;
        goto L_0x0449;
    L_0x0195:
        r1 = "SCH-I545PP";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x019d:
        r1 = 50;
        goto L_0x0449;
    L_0x01a1:
        r1 = "SCV40";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x01a9:
        r1 = 63;
        goto L_0x0449;
    L_0x01ad:
        r1 = "SCV39";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x01b5:
        r1 = 62;
        goto L_0x0449;
    L_0x01b9:
        r1 = "SCV38";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x01c1:
        r1 = 61;
        goto L_0x0449;
    L_0x01c5:
        r1 = "SCV36";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x01cd:
        r1 = 60;
        goto L_0x0449;
    L_0x01d1:
        r1 = "SCV35";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x01d9:
        r1 = 59;
        goto L_0x0449;
    L_0x01dd:
        r1 = "SCV33";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x01e5:
        r1 = 58;
        goto L_0x0449;
    L_0x01e9:
        r1 = "SCV31";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x01f1:
        r1 = 57;
        goto L_0x0449;
    L_0x01f5:
        r1 = "SCL23";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x01fd:
        r1 = 56;
        goto L_0x0449;
    L_0x0201:
        r1 = "SCL22";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0209:
        r1 = 55;
        goto L_0x0449;
    L_0x020d:
        r1 = "SCH-R970";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0215:
        r1 = 52;
        goto L_0x0449;
    L_0x0219:
        r1 = "SCH-I959";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0221:
        r1 = 51;
        goto L_0x0449;
    L_0x0225:
        r1 = "SCH-I545";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x022d:
        r1 = 48;
        goto L_0x0449;
    L_0x0231:
        r1 = "A1601";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0239:
        r1 = 2;
        goto L_0x0449;
    L_0x023c:
        r1 = "404SC";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0244:
        r1 = 1;
        goto L_0x0449;
    L_0x0247:
        r1 = "Moto G (5)";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x024f:
        r1 = 10;
        goto L_0x0449;
    L_0x0253:
        r1 = "SM-S920L";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x025b:
        r1 = 73;
        goto L_0x0449;
    L_0x025f:
        r1 = "SM-J327W";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0267:
        r1 = 72;
        goto L_0x0449;
    L_0x026b:
        r1 = "SM-J327T";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0273:
        r1 = 70;
        goto L_0x0449;
    L_0x0277:
        r1 = "SM-G892U";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x027f:
        r1 = 69;
        goto L_0x0449;
    L_0x0283:
        r1 = "SM-G892A";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x028b:
        r1 = 68;
        goto L_0x0449;
    L_0x028f:
        r1 = "SM-G610F";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0297:
        r1 = 67;
        goto L_0x0449;
    L_0x029b:
        r1 = "SAMSUNG-SM-N920A";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x02a3:
        r1 = 36;
        goto L_0x0449;
    L_0x02a7:
        r1 = "SAMSUNG-SM-N910A";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x02af:
        r1 = 35;
        goto L_0x0449;
    L_0x02b3:
        r1 = "SAMSUNG-SM-N900A";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x02bb:
        r1 = 34;
        goto L_0x0449;
    L_0x02bf:
        r2 = "SAMSUNG-SM-J727A";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x0448;
    L_0x02c7:
        r1 = 32;
        goto L_0x0449;
    L_0x02cb:
        r1 = "SAMSUNG-SM-G935A";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x02d3:
        r1 = 31;
        goto L_0x0449;
    L_0x02d7:
        r1 = "SAMSUNG-SM-G930A";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x02df:
        r1 = 29;
        goto L_0x0449;
    L_0x02e3:
        r1 = "SAMSUNG-SM-G925A";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x02eb:
        r1 = 28;
        goto L_0x0449;
    L_0x02ef:
        r1 = "SAMSUNG-SM-G920A";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x02f7:
        r1 = 26;
        goto L_0x0449;
    L_0x02fb:
        r1 = "SAMSUNG-SM-G900A";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0303:
        r1 = 24;
        goto L_0x0449;
    L_0x0307:
        r1 = "SAMSUNG-SM-G891A";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x030f:
        r1 = 23;
        goto L_0x0449;
    L_0x0313:
        r1 = "SAMSUNG-SM-G890A";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x031b:
        r1 = 22;
        goto L_0x0449;
    L_0x031f:
        r1 = "SGH-M919";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0327:
        r1 = 65;
        goto L_0x0449;
    L_0x032b:
        r1 = "LG-TP260";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0333:
        r1 = 8;
        goto L_0x0449;
    L_0x0337:
        r1 = "SAMSUNG-SGH-I337";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x033f:
        r1 = 19;
        goto L_0x0449;
    L_0x0343:
        r1 = "A1601fw";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x034b:
        r1 = 3;
        goto L_0x0449;
    L_0x034e:
        r1 = "SPH-L720T";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0356:
        r1 = 76;
        goto L_0x0449;
    L_0x035a:
        r1 = "SPH-L720";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0362:
        r1 = 75;
        goto L_0x0449;
    L_0x0366:
        r1 = "Autana LTE";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x036e:
        r1 = 4;
        goto L_0x0449;
    L_0x0371:
        r1 = "SAMSUNG-SM-J727AZ";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0379:
        r1 = 33;
        goto L_0x0449;
    L_0x037d:
        r1 = "SC-05G";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0385:
        r1 = 47;
        goto L_0x0449;
    L_0x0389:
        r1 = "SC-04G";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0391:
        r1 = 46;
        goto L_0x0449;
    L_0x0395:
        r1 = "SC-04F";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x039d:
        r1 = 45;
        goto L_0x0449;
    L_0x03a1:
        r1 = "SC-04E";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x03a9:
        r1 = 44;
        goto L_0x0449;
    L_0x03ad:
        r1 = "SC-03K";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x03b5:
        r1 = 43;
        goto L_0x0449;
    L_0x03b9:
        r1 = "SC-03J";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x03c1:
        r1 = 42;
        goto L_0x0449;
    L_0x03c5:
        r1 = "SC-02K";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x03cd:
        r1 = 41;
        goto L_0x0449;
    L_0x03d0:
        r1 = "SC-02J";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x03d8:
        r1 = 0;
        goto L_0x0449;
    L_0x03da:
        r1 = "SC-02H";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x03e2:
        r1 = 40;
        goto L_0x0449;
    L_0x03e5:
        r1 = "SC-02F";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x03ed:
        r1 = 39;
        goto L_0x0449;
    L_0x03f0:
        r1 = "SC-01L";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x03f8:
        r1 = 38;
        goto L_0x0449;
    L_0x03fb:
        r1 = "SC-01F";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0403:
        r1 = 37;
        goto L_0x0449;
    L_0x0406:
        r1 = "SAMSUNG-SM-G930AZ";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x040e:
        r1 = 30;
        goto L_0x0449;
    L_0x0411:
        r1 = "SAMSUNG-SM-G920AZ";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0419:
        r1 = 27;
        goto L_0x0449;
    L_0x041c:
        r1 = "SAMSUNG-SM-G900AZ";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0424:
        r1 = 25;
        goto L_0x0449;
    L_0x0427:
        r1 = "SAMSUNG-SM-G530AZ";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x042f:
        r1 = 21;
        goto L_0x0449;
    L_0x0432:
        r1 = "SAMSUNG-SGH-I337Z";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x043a:
        r1 = 20;
        goto L_0x0449;
    L_0x043d:
        r1 = "Redmi Note 4";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x0448;
    L_0x0445:
        r1 = 17;
        goto L_0x0449;
    L_0x0448:
        r1 = -1;
    L_0x0449:
        switch(r1) {
            case 0: goto L_0x045a;
            case 1: goto L_0x045a;
            case 2: goto L_0x045a;
            case 3: goto L_0x045a;
            case 4: goto L_0x045a;
            case 5: goto L_0x045a;
            case 6: goto L_0x045a;
            case 7: goto L_0x045a;
            case 8: goto L_0x045a;
            case 9: goto L_0x045a;
            case 10: goto L_0x045a;
            case 11: goto L_0x045a;
            case 12: goto L_0x045a;
            case 13: goto L_0x045a;
            case 14: goto L_0x045a;
            case 15: goto L_0x045a;
            case 16: goto L_0x045a;
            case 17: goto L_0x045a;
            case 18: goto L_0x045a;
            case 19: goto L_0x045a;
            case 20: goto L_0x045a;
            case 21: goto L_0x045a;
            case 22: goto L_0x045a;
            case 23: goto L_0x045a;
            case 24: goto L_0x045a;
            case 25: goto L_0x045a;
            case 26: goto L_0x045a;
            case 27: goto L_0x045a;
            case 28: goto L_0x045a;
            case 29: goto L_0x045a;
            case 30: goto L_0x045a;
            case 31: goto L_0x045a;
            case 32: goto L_0x045a;
            case 33: goto L_0x045a;
            case 34: goto L_0x045a;
            case 35: goto L_0x045a;
            case 36: goto L_0x045a;
            case 37: goto L_0x045a;
            case 38: goto L_0x045a;
            case 39: goto L_0x045a;
            case 40: goto L_0x045a;
            case 41: goto L_0x045a;
            case 42: goto L_0x045a;
            case 43: goto L_0x045a;
            case 44: goto L_0x045a;
            case 45: goto L_0x045a;
            case 46: goto L_0x045a;
            case 47: goto L_0x045a;
            case 48: goto L_0x045a;
            case 49: goto L_0x045a;
            case 50: goto L_0x045a;
            case 51: goto L_0x045a;
            case 52: goto L_0x045a;
            case 53: goto L_0x045a;
            case 54: goto L_0x045a;
            case 55: goto L_0x045a;
            case 56: goto L_0x045a;
            case 57: goto L_0x045a;
            case 58: goto L_0x045a;
            case 59: goto L_0x045a;
            case 60: goto L_0x045a;
            case 61: goto L_0x045a;
            case 62: goto L_0x045a;
            case 63: goto L_0x045a;
            case 64: goto L_0x045a;
            case 65: goto L_0x045a;
            case 66: goto L_0x045a;
            case 67: goto L_0x045a;
            case 68: goto L_0x045a;
            case 69: goto L_0x045a;
            case 70: goto L_0x045a;
            case 71: goto L_0x045a;
            case 72: goto L_0x045a;
            case 73: goto L_0x045a;
            case 74: goto L_0x045a;
            case 75: goto L_0x045a;
            case 76: goto L_0x045a;
            case 77: goto L_0x045a;
            case 78: goto L_0x045a;
            default: goto L_0x044c;
        };
    L_0x044c:
        r1 = "(SM-(G9(0|30|35|60|55|65|20|25)|J7|N950|J5|A5|N960|N900|N91[06]|A310|I950|A530|G53[01]|N920)|RNE-L[02][13]|WAS-LX|ALE-L|HUAWEI VNS-L|GT-I950|SHV-E300|SHV-E330).*";
        r1 = java.util.regex.Pattern.compile(r1);
        r0 = r1.matcher(r0);
        r15 = r0.matches();
    L_0x045a:
        if (r15 == 0) goto L_0x0461;
    L_0x045c:
        r0 = com.google.common.base.Optional.absent();
        return r0;
    L_0x0461:
        r0 = java.lang.Boolean.FALSE;
        r0 = com.google.common.base.Optional.of(r0);
        return r0;
    L_0x0468:
        r0 = java.lang.Boolean.TRUE;
        r0 = com.google.common.base.Optional.of(r0);
        return r0;
    L_0x046f:
        r0 = java.lang.Boolean.TRUE;
        r0 = com.google.common.base.Optional.of(r0);
        return r0;
    L_0x0476:
        r0 = defpackage.dre.a(r14, r14);
        return r0;
    L_0x047b:
        r0 = defpackage.dre.a(r15, r14);
        return r0;
    L_0x0480:
        r0 = defpackage.dre.a(r14, r15);
        return r0;
    L_0x0485:
        r0 = defpackage.dre.a(r15, r15);
        return r0;
    L_0x048a:
        r0 = android.os.Build.MODEL;
        r1 = "SM-G96";
        r0 = r0.startsWith(r1);
        r0 = java.lang.Boolean.valueOf(r0);
        r0 = com.google.common.base.Optional.of(r0);
        return r0;
    L_0x049b:
        r0 = android.os.Build.MODEL;
        r1 = "S";
        r0 = r0.startsWith(r1);
        if (r0 == 0) goto L_0x04c4;
    L_0x04a5:
        r0 = android.os.Build.MODEL;
        r1 = "SM";
        r0 = r0.startsWith(r1);
        if (r0 != 0) goto L_0x04c3;
    L_0x04af:
        r0 = android.os.Build.MODEL;
        r1 = "SAMSUNG";
        r0 = r0.startsWith(r1);
        if (r0 != 0) goto L_0x04c3;
    L_0x04b9:
        r0 = android.os.Build.MODEL;
        r1 = "SC";
        r0 = r0.startsWith(r1);
        if (r0 == 0) goto L_0x04c4;
    L_0x04c3:
        r14 = 1;
    L_0x04c4:
        r0 = java.lang.Boolean.valueOf(r14);
        r0 = com.google.common.base.Optional.of(r0);
        return r0;
    L_0x04cd:
        r0 = android.os.Build.MODEL;
        r1 = r0.hashCode();
        r2 = -200849224; // 0xfffffffff40748b8 float:-4.287323E31 double:NaN;
        if (r1 == r2) goto L_0x04d9;
    L_0x04d8:
        goto L_0x04e2;
    L_0x04d9:
        r1 = "ALE-L21";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x04e2;
    L_0x04e1:
        goto L_0x04e3;
    L_0x04e2:
        r14 = -1;
    L_0x04e3:
        if (r14 == 0) goto L_0x04ea;
    L_0x04e5:
        r0 = com.google.common.base.Optional.absent();
        return r0;
    L_0x04ea:
        r0 = java.lang.Boolean.FALSE;
        r0 = com.google.common.base.Optional.of(r0);
        return r0;
    L_0x04f1:
        r0 = android.os.Build.MODEL;
        r1 = r0.hashCode();
        r2 = -200849224; // 0xfffffffff40748b8 float:-4.287323E31 double:NaN;
        if (r1 == r2) goto L_0x04fd;
    L_0x04fc:
        goto L_0x0506;
    L_0x04fd:
        r1 = "ALE-L21";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0506;
    L_0x0505:
        goto L_0x0507;
    L_0x0506:
        r14 = -1;
    L_0x0507:
        if (r14 == 0) goto L_0x050e;
    L_0x0509:
        r0 = com.google.common.base.Optional.absent();
        return r0;
    L_0x050e:
        r0 = java.lang.Boolean.FALSE;
        r0 = com.google.common.base.Optional.of(r0);
        return r0;
    L_0x0515:
        r0 = android.os.Build.MODEL;
        r16 = r0.hashCode();
        switch(r16) {
            case -1905354785: goto L_0x0729;
            case -1903597116: goto L_0x071e;
            case -1377793024: goto L_0x0713;
            case -401868995: goto L_0x0708;
            case -401868993: goto L_0x06fd;
            case -401868992: goto L_0x06f2;
            case -401868979: goto L_0x06e7;
            case -401868977: goto L_0x06dc;
            case -401868972: goto L_0x06d1;
            case -401868969: goto L_0x06c6;
            case -401868965: goto L_0x06bb;
            case -401868963: goto L_0x06b0;
            case -401868948: goto L_0x06a4;
            case -401868946: goto L_0x0698;
            case -401868941: goto L_0x068c;
            case -401866809: goto L_0x0680;
            case -401866778: goto L_0x0674;
            case -401812280: goto L_0x0669;
            case -401812278: goto L_0x065e;
            case -401812273: goto L_0x0653;
            case -401812270: goto L_0x0647;
            case -401812266: goto L_0x063b;
            case -401812263: goto L_0x062f;
            case -401812261: goto L_0x0623;
            case -401812249: goto L_0x0617;
            case -401812247: goto L_0x060b;
            case -401812242: goto L_0x05ff;
            case -401812230: goto L_0x05f3;
            case -390641610: goto L_0x05e7;
            case -390611819: goto L_0x05db;
            case 426963628: goto L_0x05cf;
            case 426963659: goto L_0x05c3;
            case 426963686: goto L_0x05b7;
            case 426963965: goto L_0x05ab;
            case 426964022: goto L_0x059f;
            case 426964647: goto L_0x0593;
            case 428720799: goto L_0x0588;
            case 428720861: goto L_0x057d;
            case 428720892: goto L_0x0572;
            case 428721168: goto L_0x0567;
            case 428721298: goto L_0x055b;
            case 428721510: goto L_0x0550;
            case 428721632: goto L_0x0544;
            case 428721635: goto L_0x0538;
            case 428721691: goto L_0x052c;
            case 428722129: goto L_0x0520;
            default: goto L_0x051e;
        };
    L_0x051e:
        goto L_0x0734;
    L_0x0520:
        r1 = "SM-G531BT";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x0528:
        r1 = 20;
        goto L_0x0735;
    L_0x052c:
        r1 = "SM-G530T1";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x0534:
        r1 = 12;
        goto L_0x0735;
    L_0x0538:
        r1 = "SM-G530R7";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x0540:
        r1 = 9;
        goto L_0x0735;
    L_0x0544:
        r1 = "SM-G530R4";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x054c:
        r1 = 16;
        goto L_0x0735;
    L_0x0550:
        r1 = "SM-G530MU";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x0558:
        r1 = 7;
        goto L_0x0735;
    L_0x055b:
        r1 = "SM-G530FZ";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x0563:
        r1 = 17;
        goto L_0x0735;
    L_0x0567:
        r1 = "SM-G530BT";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x056f:
        r1 = 1;
        goto L_0x0735;
    L_0x0572:
        r1 = "SM-G5309W";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x057a:
        r1 = 6;
        goto L_0x0735;
    L_0x057d:
        r1 = "SM-G5308W";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x0585:
        r1 = 3;
        goto L_0x0735;
    L_0x0588:
        r1 = "SM-G5306W";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x0590:
        r1 = 2;
        goto L_0x0735;
    L_0x0593:
        r1 = "SM-G361HU";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x059b:
        r1 = 35;
        goto L_0x0735;
    L_0x059f:
        r1 = "SM-G360T1";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x05a7:
        r1 = 38;
        goto L_0x0735;
    L_0x05ab:
        r1 = "SM-G360R6";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x05b3:
        r1 = 30;
        goto L_0x0735;
    L_0x05b7:
        r1 = "SM-G360HU";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x05bf:
        r1 = 25;
        goto L_0x0735;
    L_0x05c3:
        r1 = "SM-G360GY";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x05cb:
        r1 = 43;
        goto L_0x0735;
    L_0x05cf:
        r1 = "SM-G360FY";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x05d7:
        r1 = 27;
        goto L_0x0735;
    L_0x05db:
        r1 = "SM-S920L";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x05e3:
        r1 = 14;
        goto L_0x0735;
    L_0x05e7:
        r2 = "SM-S820L";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0734;
    L_0x05ef:
        r1 = 32;
        goto L_0x0735;
    L_0x05f3:
        r1 = "SM-G531Y";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x05fb:
        r1 = 23;
        goto L_0x0735;
    L_0x05ff:
        r1 = "SM-G531M";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x0607:
        r1 = 22;
        goto L_0x0735;
    L_0x060b:
        r1 = "SM-G531H";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x0613:
        r1 = 19;
        goto L_0x0735;
    L_0x0617:
        r1 = "SM-G531F";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x061f:
        r1 = 21;
        goto L_0x0735;
    L_0x0623:
        r1 = "SM-G530Y";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x062b:
        r1 = 8;
        goto L_0x0735;
    L_0x062f:
        r1 = "SM-G530W";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x0637:
        r1 = 11;
        goto L_0x0735;
    L_0x063b:
        r1 = "SM-G530T";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x0643:
        r1 = 15;
        goto L_0x0735;
    L_0x0647:
        r1 = "SM-G530P";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x064f:
        r1 = 13;
        goto L_0x0735;
    L_0x0653:
        r1 = "SM-G530M";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x065b:
        r1 = 5;
        goto L_0x0735;
    L_0x065e:
        r1 = "SM-G530H";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x0666:
        r1 = 0;
        goto L_0x0735;
    L_0x0669:
        r1 = "SM-G530F";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x0671:
        r1 = 4;
        goto L_0x0735;
    L_0x0674:
        r1 = "SM-G389F";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x067c:
        r1 = 45;
        goto L_0x0735;
    L_0x0680:
        r1 = "SM-G388F";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x0688:
        r1 = 44;
        goto L_0x0735;
    L_0x068c:
        r1 = "SM-G361M";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x0694:
        r1 = 37;
        goto L_0x0735;
    L_0x0698:
        r1 = "SM-G361H";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x06a0:
        r1 = 34;
        goto L_0x0735;
    L_0x06a4:
        r1 = "SM-G361F";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x06ac:
        r1 = 36;
        goto L_0x0735;
    L_0x06b0:
        r1 = "SM-G360V";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x06b8:
        r1 = 33;
        goto L_0x0735;
    L_0x06bb:
        r1 = "SM-G360T";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x06c3:
        r1 = 39;
        goto L_0x0735;
    L_0x06c6:
        r1 = "SM-G360P";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x06ce:
        r1 = 31;
        goto L_0x0735;
    L_0x06d1:
        r1 = "SM-G360M";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x06d9:
        r1 = 28;
        goto L_0x0735;
    L_0x06dc:
        r1 = "SM-G360H";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x06e4:
        r1 = 24;
        goto L_0x0735;
    L_0x06e7:
        r1 = "SM-G360F";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x06ef:
        r1 = 26;
        goto L_0x0735;
    L_0x06f2:
        r1 = "SM-G3609";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x06fa:
        r1 = 42;
        goto L_0x0735;
    L_0x06fd:
        r1 = "SM-G3608";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x0705:
        r1 = 41;
        goto L_0x0735;
    L_0x0708:
        r1 = "SM-G3606";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x0710:
        r1 = 40;
        goto L_0x0735;
    L_0x0713:
        r1 = "gprimelteacg";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x071b:
        r1 = 10;
        goto L_0x0735;
    L_0x071e:
        r1 = "SAMSUNG-SM-G530AZ";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x0726:
        r1 = 18;
        goto L_0x0735;
    L_0x0729:
        r1 = "SAMSUNG-SM-G360AZ";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0734;
    L_0x0731:
        r1 = 29;
        goto L_0x0735;
    L_0x0734:
        r1 = -1;
    L_0x0735:
        switch(r1) {
            case 0: goto L_0x073f;
            case 1: goto L_0x073f;
            case 2: goto L_0x073f;
            case 3: goto L_0x073f;
            case 4: goto L_0x073f;
            case 5: goto L_0x073f;
            case 6: goto L_0x073f;
            case 7: goto L_0x073f;
            case 8: goto L_0x073f;
            case 9: goto L_0x073f;
            case 10: goto L_0x073f;
            case 11: goto L_0x073f;
            case 12: goto L_0x073f;
            case 13: goto L_0x073f;
            case 14: goto L_0x073f;
            case 15: goto L_0x073f;
            case 16: goto L_0x073f;
            case 17: goto L_0x073f;
            case 18: goto L_0x073f;
            case 19: goto L_0x073f;
            case 20: goto L_0x073f;
            case 21: goto L_0x073f;
            case 22: goto L_0x073f;
            case 23: goto L_0x073f;
            case 24: goto L_0x073f;
            case 25: goto L_0x073f;
            case 26: goto L_0x073f;
            case 27: goto L_0x073f;
            case 28: goto L_0x073f;
            case 29: goto L_0x073f;
            case 30: goto L_0x073f;
            case 31: goto L_0x073f;
            case 32: goto L_0x073f;
            case 33: goto L_0x073f;
            case 34: goto L_0x073f;
            case 35: goto L_0x073f;
            case 36: goto L_0x073f;
            case 37: goto L_0x073f;
            case 38: goto L_0x073f;
            case 39: goto L_0x073f;
            case 40: goto L_0x073f;
            case 41: goto L_0x073f;
            case 42: goto L_0x073f;
            case 43: goto L_0x073f;
            case 44: goto L_0x073f;
            case 45: goto L_0x073f;
            default: goto L_0x0738;
        };
    L_0x0738:
        r0 = java.lang.Boolean.TRUE;
        r0 = com.google.common.base.Optional.of(r0);
        return r0;
    L_0x073f:
        r0 = java.lang.Boolean.FALSE;
        r0 = com.google.common.base.Optional.of(r0);
        return r0;
    L_0x0746:
        r0 = android.os.Build.MODEL;
        r1 = r0.hashCode();
        r2 = -615476526; // 0xffffffffdb5092d2 float:-5.8708226E16 double:NaN;
        if (r1 == r2) goto L_0x076f;
    L_0x0751:
        r2 = -401693106; // 0xffffffffe80ea64e float:-2.6945753E24 double:NaN;
        if (r1 == r2) goto L_0x0766;
    L_0x0756:
        r2 = -401693100; // 0xffffffffe80ea654 float:-2.694577E24 double:NaN;
        if (r1 == r2) goto L_0x075c;
    L_0x075b:
        goto L_0x0779;
    L_0x075c:
        r1 = "SM-G930V";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0779;
    L_0x0764:
        r14 = 1;
        goto L_0x077a;
    L_0x0766:
        r1 = "SM-G930P";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0779;
    L_0x076e:
        goto L_0x077a;
    L_0x076f:
        r1 = "SAMSUNG-SM-G930A";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0779;
    L_0x0777:
        r14 = 2;
        goto L_0x077a;
    L_0x0779:
        r14 = -1;
    L_0x077a:
        if (r14 == 0) goto L_0x0787;
    L_0x077c:
        if (r14 == r15) goto L_0x0787;
    L_0x077e:
        if (r14 == r12) goto L_0x0787;
    L_0x0780:
        r0 = java.lang.Boolean.FALSE;
        r0 = com.google.common.base.Optional.of(r0);
        return r0;
    L_0x0787:
        r0 = com.google.common.base.Optional.absent();
        return r0;
    L_0x078c:
        r0 = android.os.Build.MODEL;
        r16 = r0.hashCode();
        switch(r16) {
            case -1899903032: goto L_0x0935;
            case -1855483511: goto L_0x092a;
            case -615500520: goto L_0x091f;
            case -615476526: goto L_0x0915;
            case -615476371: goto L_0x090a;
            case -401693138: goto L_0x08ff;
            case -401693130: goto L_0x08f4;
            case -401693116: goto L_0x08ea;
            case -401693111: goto L_0x08df;
            case -401693110: goto L_0x08d4;
            case -401693106: goto L_0x08ca;
            case -401693103: goto L_0x08bf;
            case -401693102: goto L_0x08b4;
            case -401693101: goto L_0x08a8;
            case -401693100: goto L_0x089d;
            case -401693098: goto L_0x0892;
            case -401692983: goto L_0x0886;
            case -401692961: goto L_0x087a;
            case -401692956: goto L_0x086e;
            case -401692955: goto L_0x0862;
            case -401692951: goto L_0x0856;
            case -401692948: goto L_0x084a;
            case -401692947: goto L_0x083e;
            case -401692946: goto L_0x0832;
            case -401692945: goto L_0x0826;
            case -401692943: goto L_0x081a;
            case 78732518: goto L_0x080e;
            case 432415716: goto L_0x0802;
            case 432415718: goto L_0x07f6;
            case 432415719: goto L_0x07ea;
            case 432415775: goto L_0x07de;
            case 432415855: goto L_0x07d2;
            case 432415864: goto L_0x07c6;
            case 432415875: goto L_0x07bb;
            case 432420521: goto L_0x07af;
            case 432420660: goto L_0x07a3;
            case 432420680: goto L_0x0797;
            default: goto L_0x0795;
        };
    L_0x0795:
        goto L_0x093f;
    L_0x0797:
        r1 = "SM-G935W8";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x079f:
        r1 = 25;
        goto L_0x0940;
    L_0x07a3:
        r1 = "SM-G935VC";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x07ab:
        r1 = 30;
        goto L_0x0940;
    L_0x07af:
        r1 = "SM-G935R4";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x07b7:
        r1 = 35;
        goto L_0x0940;
    L_0x07bb:
        r1 = "SM-G930W8";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x07c3:
        r1 = 7;
        goto L_0x0940;
    L_0x07c6:
        r1 = "SM-G930VL";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x07ce:
        r1 = 17;
        goto L_0x0940;
    L_0x07d2:
        r1 = "SM-G930VC";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x07da:
        r1 = 12;
        goto L_0x0940;
    L_0x07de:
        r1 = "SM-G930T1";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x07e6:
        r1 = 16;
        goto L_0x0940;
    L_0x07ea:
        r1 = "SM-G930R7";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x07f2:
        r1 = 11;
        goto L_0x0940;
    L_0x07f6:
        r1 = "SM-G930R6";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x07fe:
        r1 = 15;
        goto L_0x0940;
    L_0x0802:
        r1 = "SM-G930R4";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x080a:
        r1 = 19;
        goto L_0x0940;
    L_0x080e:
        r1 = "SCV33";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x0816:
        r1 = 22;
        goto L_0x0940;
    L_0x081a:
        r1 = "SM-G935X";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x0822:
        r1 = 24;
        goto L_0x0940;
    L_0x0826:
        r1 = "SM-G935V";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x082e:
        r1 = 36;
        goto L_0x0940;
    L_0x0832:
        r1 = "SM-G935U";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x083a:
        r1 = 34;
        goto L_0x0940;
    L_0x083e:
        r1 = "SM-G935T";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x0846:
        r1 = 33;
        goto L_0x0940;
    L_0x084a:
        r1 = "SM-G935S";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x0852:
        r1 = 28;
        goto L_0x0940;
    L_0x0856:
        r2 = "SM-G935P";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x093f;
    L_0x085e:
        r1 = 32;
        goto L_0x0940;
    L_0x0862:
        r1 = "SM-G935L";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x086a:
        r1 = 27;
        goto L_0x0940;
    L_0x086e:
        r1 = "SM-G935K";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x0876:
        r1 = 26;
        goto L_0x0940;
    L_0x087a:
        r1 = "SM-G935F";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x0882:
        r1 = 23;
        goto L_0x0940;
    L_0x0886:
        r1 = "SM-G9350";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x088e:
        r1 = 31;
        goto L_0x0940;
    L_0x0892:
        r1 = "SM-G930X";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x089a:
        r1 = 6;
        goto L_0x0940;
    L_0x089d:
        r1 = "SM-G930V";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x08a5:
        r1 = 5;
        goto L_0x0940;
    L_0x08a8:
        r1 = "SM-G930U";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x08b0:
        r1 = 18;
        goto L_0x0940;
    L_0x08b4:
        r1 = "SM-G930T";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x08bc:
        r1 = 4;
        goto L_0x0940;
    L_0x08bf:
        r1 = "SM-G930S";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x08c7:
        r1 = 10;
        goto L_0x0940;
    L_0x08ca:
        r1 = "SM-G930P";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x08d2:
        r1 = 3;
        goto L_0x0940;
    L_0x08d4:
        r1 = "SM-G930L";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x08dc:
        r1 = 9;
        goto L_0x0940;
    L_0x08df:
        r1 = "SM-G930K";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x08e7:
        r1 = 8;
        goto L_0x0940;
    L_0x08ea:
        r1 = "SM-G930F";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x08f2:
        r1 = 2;
        goto L_0x0940;
    L_0x08f4:
        r1 = "SM-G9308";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x08fc:
        r1 = 14;
        goto L_0x0940;
    L_0x08ff:
        r1 = "SM-G9300";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x0907:
        r1 = 13;
        goto L_0x0940;
    L_0x090a:
        r1 = "SAMSUNG-SM-G935A";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x0912:
        r1 = 29;
        goto L_0x0940;
    L_0x0915:
        r1 = "SAMSUNG-SM-G930A";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x091d:
        r1 = 0;
        goto L_0x0940;
    L_0x091f:
        r1 = "SAMSUNG-SM-G891A";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x0927:
        r1 = 20;
        goto L_0x0940;
    L_0x092a:
        r1 = "SC-02H";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x0932:
        r1 = 21;
        goto L_0x0940;
    L_0x0935:
        r1 = "SAMSUNG-SM-G930AZ";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x093f;
    L_0x093d:
        r1 = 1;
        goto L_0x0940;
    L_0x093f:
        r1 = -1;
    L_0x0940:
        switch(r1) {
            case 0: goto L_0x0948;
            case 1: goto L_0x0948;
            case 2: goto L_0x0948;
            case 3: goto L_0x0948;
            case 4: goto L_0x0948;
            case 5: goto L_0x0948;
            case 6: goto L_0x0948;
            case 7: goto L_0x0948;
            case 8: goto L_0x0948;
            case 9: goto L_0x0948;
            case 10: goto L_0x0948;
            case 11: goto L_0x0948;
            case 12: goto L_0x0948;
            case 13: goto L_0x0948;
            case 14: goto L_0x0948;
            case 15: goto L_0x0948;
            case 16: goto L_0x0948;
            case 17: goto L_0x0948;
            case 18: goto L_0x0948;
            case 19: goto L_0x0948;
            case 20: goto L_0x0948;
            case 21: goto L_0x0948;
            case 22: goto L_0x0948;
            case 23: goto L_0x0948;
            case 24: goto L_0x0948;
            case 25: goto L_0x0948;
            case 26: goto L_0x0948;
            case 27: goto L_0x0948;
            case 28: goto L_0x0948;
            case 29: goto L_0x0948;
            case 30: goto L_0x0948;
            case 31: goto L_0x0948;
            case 32: goto L_0x0948;
            case 33: goto L_0x0948;
            case 34: goto L_0x0948;
            case 35: goto L_0x0948;
            case 36: goto L_0x0948;
            default: goto L_0x0943;
        };
    L_0x0943:
        r0 = com.google.common.base.Optional.absent();
        return r0;
    L_0x0948:
        r0 = java.lang.Boolean.TRUE;
        r0 = com.google.common.base.Optional.of(r0);
        return r0;
    L_0x094f:
        r0 = defpackage.dre.a();
        return r0;
    L_0x0954:
        r0 = defpackage.dre.a();
        return r0;
    L_0x0959:
        r0 = android.os.Build.MODEL;
        r1 = android.os.Build.MANUFACTURER;
        r2 = android.os.Build.VERSION.SDK_INT;
        r17 = r0.hashCode();
        switch(r17) {
            case -1843903812: goto L_0x0b93;
            case -1843337783: goto L_0x0b88;
            case -1639407958: goto L_0x0b7e;
            case -1639405665: goto L_0x0b74;
            case -1402487484: goto L_0x0b69;
            case -1402487453: goto L_0x0b5e;
            case -1401921455: goto L_0x0b53;
            case -1348392670: goto L_0x0b48;
            case -1348392669: goto L_0x0b3d;
            case -1348392668: goto L_0x0b32;
            case -910708052: goto L_0x0b27;
            case -910707990: goto L_0x0b1c;
            case -751278897: goto L_0x0b11;
            case -745620776: goto L_0x0b06;
            case -741120166: goto L_0x0afa;
            case -647504505: goto L_0x0aee;
            case -527438964: goto L_0x0ae2;
            case -143589744: goto L_0x0ad8;
            case -143589743: goto L_0x0acc;
            case -143589742: goto L_0x0ac0;
            case -78463250: goto L_0x0ab4;
            case 77128294: goto L_0x0aa8;
            case 231741377: goto L_0x0a9c;
            case 231741378: goto L_0x0a90;
            case 231741385: goto L_0x0a84;
            case 807231707: goto L_0x0a79;
            case 807231708: goto L_0x0a6e;
            case 807231709: goto L_0x0a63;
            case 807231710: goto L_0x0a58;
            case 844501278: goto L_0x0a4c;
            case 1105847544: goto L_0x0a40;
            case 1340241500: goto L_0x0a34;
            case 1340241562: goto L_0x0a28;
            case 1355752223: goto L_0x0a1c;
            case 1401893879: goto L_0x0a10;
            case 1402459908: goto L_0x0a04;
            case 1588010894: goto L_0x09f8;
            case 1588010899: goto L_0x09ec;
            case 1588010961: goto L_0x09e0;
            case 1741644260: goto L_0x09d4;
            case 1741644322: goto L_0x09c8;
            case 1832520436: goto L_0x09bc;
            case 1833086465: goto L_0x09b0;
            case 1905056540: goto L_0x09a4;
            case 1983396589: goto L_0x0998;
            case 1983396590: goto L_0x098c;
            case 1983962618: goto L_0x0980;
            case 1983962619: goto L_0x0974;
            case 2143033516: goto L_0x0968;
            default: goto L_0x0966;
        };
    L_0x0966:
        goto L_0x0b9e;
    L_0x0968:
        r3 = "HW-01K";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0970:
        r3 = 21;
        goto L_0x0b9f;
    L_0x0974:
        r3 = "CLT-TL01";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x097c:
        r3 = 29;
        goto L_0x0b9f;
    L_0x0980:
        r3 = "CLT-TL00";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0988:
        r3 = 28;
        goto L_0x0b9f;
    L_0x098c:
        r3 = "CLT-AL01";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0994:
        r3 = 24;
        goto L_0x0b9f;
    L_0x0998:
        r3 = "CLT-AL00";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x09a0:
        r3 = 22;
        goto L_0x0b9f;
    L_0x09a4:
        r3 = "Pixel 2 XL";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x09ac:
        r3 = 16;
        goto L_0x0b9f;
    L_0x09b0:
        r3 = "EML-TL00";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x09b8:
        r3 = 20;
        goto L_0x0b9f;
    L_0x09bc:
        r3 = "EML-AL00";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x09c4:
        r3 = 17;
        goto L_0x0b9f;
    L_0x09c8:
        r3 = "HMA-L29";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x09d0:
        r3 = 35;
        goto L_0x0b9f;
    L_0x09d4:
        r3 = "HMA-L09";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x09dc:
        r3 = 34;
        goto L_0x0b9f;
    L_0x09e0:
        r3 = "CLT-L29";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x09e8:
        r3 = 27;
        goto L_0x0b9f;
    L_0x09ec:
        r3 = "CLT-L09";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x09f4:
        r3 = 26;
        goto L_0x0b9f;
    L_0x09f8:
        r3 = "CLT-L04";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0a00:
        r3 = 25;
        goto L_0x0b9f;
    L_0x0a04:
        r3 = "EVR-TL00";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0a0c:
        r3 = 45;
        goto L_0x0b9f;
    L_0x0a10:
        r3 = "EVR-AL00";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0a18:
        r3 = 43;
        goto L_0x0b9f;
    L_0x0a1c:
        r3 = "CLT-AL00l";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0a24:
        r3 = 23;
        goto L_0x0b9f;
    L_0x0a28:
        r3 = "LYA-L29";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0a30:
        r3 = 40;
        goto L_0x0b9f;
    L_0x0a34:
        r3 = "LYA-L09";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0a3c:
        r3 = 39;
        goto L_0x0b9f;
    L_0x0a40:
        r3 = "Pixel 2";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0a48:
        r3 = 15;
        goto L_0x0b9f;
    L_0x0a4c:
        r3 = "LGUS997";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0a54:
        r3 = 12;
        goto L_0x0b9f;
    L_0x0a58:
        r3 = "LG-H873";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0a60:
        r3 = 7;
        goto L_0x0b9f;
    L_0x0a63:
        r3 = "LG-H872";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0a6b:
        r3 = 5;
        goto L_0x0b9f;
    L_0x0a6e:
        r3 = "LG-H871";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0a76:
        r3 = 4;
        goto L_0x0b9f;
    L_0x0a79:
        r3 = "LG-H870";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0a81:
        r3 = 1;
        goto L_0x0b9f;
    L_0x0a84:
        r3 = "LGM-G600S";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0a8c:
        r3 = 11;
        goto L_0x0b9f;
    L_0x0a90:
        r3 = "LGM-G600L";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0a98:
        r3 = 10;
        goto L_0x0b9f;
    L_0x0a9c:
        r3 = "LGM-G600K";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0aa4:
        r3 = 9;
        goto L_0x0b9f;
    L_0x0aa8:
        r3 = "Pixel";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0ab0:
        r3 = 13;
        goto L_0x0b9f;
    L_0x0ab4:
        r3 = "Pixel XL";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0abc:
        r3 = 14;
        goto L_0x0b9f;
    L_0x0ac0:
        r3 = "ANE-LX3";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0ac8:
        r3 = 32;
        goto L_0x0b9f;
    L_0x0acc:
        r3 = "ANE-LX2";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0ad4:
        r3 = 31;
        goto L_0x0b9f;
    L_0x0ad8:
        r4 = "ANE-LX1";
        r4 = r0.equals(r4);
        if (r4 == 0) goto L_0x0b9e;
    L_0x0ae0:
        goto L_0x0b9f;
    L_0x0ae2:
        r3 = "LYA-AL00P";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0aea:
        r3 = 42;
        goto L_0x0b9f;
    L_0x0aee:
        r3 = "EVR-L29";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0af6:
        r3 = 44;
        goto L_0x0b9f;
    L_0x0afa:
        r3 = "LG-LS993";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0b02:
        r3 = 8;
        goto L_0x0b9f;
    L_0x0b06:
        r3 = "LG-H870S";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0b0e:
        r3 = 3;
        goto L_0x0b9f;
    L_0x0b11:
        r3 = "LG-AS993";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0b19:
        r3 = 0;
        goto L_0x0b9f;
    L_0x0b1c:
        r3 = "EML-L29";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0b24:
        r3 = 19;
        goto L_0x0b9f;
    L_0x0b27:
        r3 = "EML-L09";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0b2f:
        r3 = 18;
        goto L_0x0b9f;
    L_0x0b32:
        r3 = "SNE-LX3";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0b3a:
        r3 = 48;
        goto L_0x0b9f;
    L_0x0b3d:
        r3 = "SNE-LX2";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0b45:
        r3 = 47;
        goto L_0x0b9f;
    L_0x0b48:
        r3 = "SNE-LX1";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0b50:
        r3 = 46;
        goto L_0x0b9f;
    L_0x0b53:
        r3 = "LYA-TL00";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0b5b:
        r3 = 41;
        goto L_0x0b9f;
    L_0x0b5e:
        r3 = "LYA-AL10";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0b66:
        r3 = 38;
        goto L_0x0b9f;
    L_0x0b69:
        r3 = "LYA-AL00";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0b71:
        r3 = 37;
        goto L_0x0b9f;
    L_0x0b74:
        r3 = "LG-H872PR";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0b7c:
        r3 = 6;
        goto L_0x0b9f;
    L_0x0b7e:
        r3 = "LG-H870DS";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0b86:
        r3 = 2;
        goto L_0x0b9f;
    L_0x0b88:
        r3 = "HMA-TL00";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0b90:
        r3 = 36;
        goto L_0x0b9f;
    L_0x0b93:
        r3 = "HMA-AL00";
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x0b9e;
    L_0x0b9b:
        r3 = 33;
        goto L_0x0b9f;
    L_0x0b9e:
        r3 = -1;
    L_0x0b9f:
        switch(r3) {
            case 0: goto L_0x0bb1;
            case 1: goto L_0x0bb1;
            case 2: goto L_0x0bb1;
            case 3: goto L_0x0bb1;
            case 4: goto L_0x0bb1;
            case 5: goto L_0x0bb1;
            case 6: goto L_0x0bb1;
            case 7: goto L_0x0bb1;
            case 8: goto L_0x0bb1;
            case 9: goto L_0x0bb1;
            case 10: goto L_0x0bb1;
            case 11: goto L_0x0bb1;
            case 12: goto L_0x0bb1;
            case 13: goto L_0x0bb1;
            case 14: goto L_0x0bb1;
            case 15: goto L_0x0bb1;
            case 16: goto L_0x0bb1;
            case 17: goto L_0x0bb1;
            case 18: goto L_0x0bb1;
            case 19: goto L_0x0bb1;
            case 20: goto L_0x0bb1;
            case 21: goto L_0x0bb1;
            case 22: goto L_0x0bb1;
            case 23: goto L_0x0bb1;
            case 24: goto L_0x0bb1;
            case 25: goto L_0x0bb1;
            case 26: goto L_0x0bb1;
            case 27: goto L_0x0bb1;
            case 28: goto L_0x0bb1;
            case 29: goto L_0x0bb1;
            case 30: goto L_0x0bb1;
            case 31: goto L_0x0bb1;
            case 32: goto L_0x0bb1;
            case 33: goto L_0x0bb1;
            case 34: goto L_0x0bb1;
            case 35: goto L_0x0bb1;
            case 36: goto L_0x0bb1;
            case 37: goto L_0x0bb1;
            case 38: goto L_0x0bb1;
            case 39: goto L_0x0bb1;
            case 40: goto L_0x0bb1;
            case 41: goto L_0x0bb1;
            case 42: goto L_0x0bb1;
            case 43: goto L_0x0bb1;
            case 44: goto L_0x0bb1;
            case 45: goto L_0x0bb1;
            case 46: goto L_0x0bb1;
            case 47: goto L_0x0bb1;
            case 48: goto L_0x0bb1;
            default: goto L_0x0ba2;
        };
    L_0x0ba2:
        r3 = "SM-G96";
        r3 = r0.startsWith(r3);
        if (r3 == 0) goto L_0x0bb8;
    L_0x0baa:
        r0 = java.lang.Boolean.TRUE;
        r0 = com.google.common.base.Optional.of(r0);
        return r0;
    L_0x0bb1:
        r0 = java.lang.Boolean.TRUE;
        r0 = com.google.common.base.Optional.of(r0);
        return r0;
    L_0x0bb8:
        r3 = "SM-N96";
        r0 = r0.startsWith(r3);
        if (r0 == 0) goto L_0x0bc7;
    L_0x0bc0:
        r0 = java.lang.Boolean.TRUE;
        r0 = com.google.common.base.Optional.of(r0);
        return r0;
    L_0x0bc7:
        r0 = "huawei";
        r0 = r1.equalsIgnoreCase(r0);
        if (r0 == 0) goto L_0x0bd8;
    L_0x0bcf:
        if (r2 < r11) goto L_0x0bd8;
    L_0x0bd1:
        r0 = java.lang.Boolean.TRUE;
        r0 = com.google.common.base.Optional.of(r0);
        return r0;
    L_0x0bd8:
        r0 = com.google.common.base.Optional.absent();
        return r0;
    L_0x0bdd:
        r0 = com.google.common.base.Optional.absent();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dre.a(fth):com.google.common.base.Optional");
    }

    public final Optional<Float> b(fth fth) {
        return Optional.absent();
    }

    public final Optional<Double> c(fth fth) {
        return Optional.absent();
    }

    /* JADX WARNING: Missing block: B:97:0x0180, code skipped:
            if (r8.equals("HMA-AL00") != false) goto L_0x0184;
     */
    /* JADX WARNING: Missing block: B:106:0x01a5, code skipped:
            return com.google.common.base.Optional.of(java.lang.Integer.valueOf(r8));
     */
    /* JADX WARNING: Missing block: B:112:0x01bb, code skipped:
            if (r8.equals("HTCEVOV4G") != false) goto L_0x01e7;
     */
    public final com.google.common.base.Optional<java.lang.Integer> d(defpackage.fth r8) {
        /*
        r7 = this;
        r0 = r8 instanceof defpackage.dnd;
        if (r0 == 0) goto L_0x01f9;
    L_0x0004:
        r0 = defpackage.dre.1.a;
        r8 = (defpackage.dnd) r8;
        r8 = r8.ordinal();
        r8 = r0[r8];
        r0 = 0;
        r1 = -1;
        r2 = 4;
        r3 = 3;
        r4 = 2;
        r5 = 1;
        switch(r8) {
            case 21: goto L_0x01ab;
            case 22: goto L_0x0019;
            case 23: goto L_0x0019;
            default: goto L_0x0017;
        };
    L_0x0017:
        goto L_0x01f9;
    L_0x0019:
        r8 = android.os.Build.MODEL;
        r6 = r8.hashCode();
        switch(r6) {
            case -1843903812: goto L_0x017a;
            case -1843337783: goto L_0x0170;
            case -1402487484: goto L_0x0166;
            case -1402487453: goto L_0x015c;
            case -1401921455: goto L_0x0151;
            case -1348392670: goto L_0x0146;
            case -1348392669: goto L_0x013b;
            case -1348392668: goto L_0x0130;
            case -910708052: goto L_0x0125;
            case -910707990: goto L_0x011a;
            case -647504505: goto L_0x010f;
            case -527438964: goto L_0x0104;
            case -143589744: goto L_0x00f8;
            case -143589743: goto L_0x00ec;
            case -143589742: goto L_0x00e0;
            case 1340241500: goto L_0x00d5;
            case 1340241562: goto L_0x00ca;
            case 1355752223: goto L_0x00be;
            case 1401893879: goto L_0x00b2;
            case 1402459908: goto L_0x00a6;
            case 1588010894: goto L_0x009a;
            case 1588010899: goto L_0x008e;
            case 1588010961: goto L_0x0082;
            case 1741644260: goto L_0x0077;
            case 1741644322: goto L_0x006c;
            case 1833086465: goto L_0x0060;
            case 1983396589: goto L_0x0054;
            case 1983396590: goto L_0x0048;
            case 1983962618: goto L_0x003c;
            case 1983962619: goto L_0x0030;
            case 2143033516: goto L_0x0024;
            default: goto L_0x0022;
        };
    L_0x0022:
        goto L_0x0183;
    L_0x0024:
        r0 = "HW-01K";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x002c:
        r0 = 19;
        goto L_0x0184;
    L_0x0030:
        r0 = "CLT-TL01";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x0038:
        r0 = 27;
        goto L_0x0184;
    L_0x003c:
        r0 = "CLT-TL00";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x0044:
        r0 = 26;
        goto L_0x0184;
    L_0x0048:
        r0 = "CLT-AL01";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x0050:
        r0 = 22;
        goto L_0x0184;
    L_0x0054:
        r0 = "CLT-AL00";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x005c:
        r0 = 20;
        goto L_0x0184;
    L_0x0060:
        r0 = "EML-TL00";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x0068:
        r0 = 18;
        goto L_0x0184;
    L_0x006c:
        r0 = "HMA-L29";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x0074:
        r0 = 2;
        goto L_0x0184;
    L_0x0077:
        r0 = "HMA-L09";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x007f:
        r0 = 1;
        goto L_0x0184;
    L_0x0082:
        r0 = "CLT-L29";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x008a:
        r0 = 25;
        goto L_0x0184;
    L_0x008e:
        r0 = "CLT-L09";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x0096:
        r0 = 24;
        goto L_0x0184;
    L_0x009a:
        r0 = "CLT-L04";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x00a2:
        r0 = 23;
        goto L_0x0184;
    L_0x00a6:
        r0 = "EVR-TL00";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x00ae:
        r0 = 12;
        goto L_0x0184;
    L_0x00b2:
        r0 = "EVR-AL00";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x00ba:
        r0 = 10;
        goto L_0x0184;
    L_0x00be:
        r0 = "CLT-AL00l";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x00c6:
        r0 = 21;
        goto L_0x0184;
    L_0x00ca:
        r0 = "LYA-L29";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x00d2:
        r0 = 7;
        goto L_0x0184;
    L_0x00d5:
        r0 = "LYA-L09";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x00dd:
        r0 = 6;
        goto L_0x0184;
    L_0x00e0:
        r0 = "ANE-LX3";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x00e8:
        r0 = 30;
        goto L_0x0184;
    L_0x00ec:
        r0 = "ANE-LX2";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x00f4:
        r0 = 29;
        goto L_0x0184;
    L_0x00f8:
        r0 = "ANE-LX1";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x0100:
        r0 = 28;
        goto L_0x0184;
    L_0x0104:
        r0 = "LYA-AL00P";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x010c:
        r0 = 9;
        goto L_0x0184;
    L_0x010f:
        r0 = "EVR-L29";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x0117:
        r0 = 11;
        goto L_0x0184;
    L_0x011a:
        r0 = "EML-L29";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x0122:
        r0 = 17;
        goto L_0x0184;
    L_0x0125:
        r0 = "EML-L09";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x012d:
        r0 = 16;
        goto L_0x0184;
    L_0x0130:
        r0 = "SNE-LX3";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x0138:
        r0 = 15;
        goto L_0x0184;
    L_0x013b:
        r0 = "SNE-LX2";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x0143:
        r0 = 14;
        goto L_0x0184;
    L_0x0146:
        r0 = "SNE-LX1";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x014e:
        r0 = 13;
        goto L_0x0184;
    L_0x0151:
        r0 = "LYA-TL00";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x0159:
        r0 = 8;
        goto L_0x0184;
    L_0x015c:
        r0 = "LYA-AL10";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x0164:
        r0 = 5;
        goto L_0x0184;
    L_0x0166:
        r0 = "LYA-AL00";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x016e:
        r0 = 4;
        goto L_0x0184;
    L_0x0170:
        r0 = "HMA-TL00";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x0183;
    L_0x0178:
        r0 = 3;
        goto L_0x0184;
    L_0x017a:
        r2 = "HMA-AL00";
        r8 = r8.equals(r2);
        if (r8 == 0) goto L_0x0183;
    L_0x0182:
        goto L_0x0184;
    L_0x0183:
        r0 = -1;
    L_0x0184:
        r8 = 1440; // 0x5a0 float:2.018E-42 double:7.115E-321;
        switch(r0) {
            case 0: goto L_0x019d;
            case 1: goto L_0x019d;
            case 2: goto L_0x019d;
            case 3: goto L_0x019d;
            case 4: goto L_0x019d;
            case 5: goto L_0x019d;
            case 6: goto L_0x019d;
            case 7: goto L_0x019d;
            case 8: goto L_0x019d;
            case 9: goto L_0x019d;
            case 10: goto L_0x019d;
            case 11: goto L_0x019d;
            case 12: goto L_0x019d;
            case 13: goto L_0x019d;
            case 14: goto L_0x019d;
            case 15: goto L_0x019d;
            case 16: goto L_0x019d;
            case 17: goto L_0x019d;
            case 18: goto L_0x019d;
            case 19: goto L_0x019d;
            case 20: goto L_0x019d;
            case 21: goto L_0x019d;
            case 22: goto L_0x019d;
            case 23: goto L_0x019d;
            case 24: goto L_0x019d;
            case 25: goto L_0x019d;
            case 26: goto L_0x019d;
            case 27: goto L_0x019d;
            case 28: goto L_0x019d;
            case 29: goto L_0x019d;
            case 30: goto L_0x019d;
            default: goto L_0x0189;
        };
    L_0x0189:
        r0 = android.os.Build.MODEL;
        r1 = "SM-G96";
        r0 = r0.startsWith(r1);
        if (r0 != 0) goto L_0x019d;
    L_0x0193:
        r0 = android.os.Build.MODEL;
        r1 = "SM-N96";
        r0 = r0.startsWith(r1);
        if (r0 == 0) goto L_0x01a6;
    L_0x019d:
        r8 = java.lang.Integer.valueOf(r8);
        r8 = com.google.common.base.Optional.of(r8);
        return r8;
    L_0x01a6:
        r8 = com.google.common.base.Optional.absent();
        return r8;
    L_0x01ab:
        r8 = android.os.Build.MODEL;
        r6 = r8.hashCode();
        switch(r6) {
            case -1213081314: goto L_0x01dc;
            case -667757462: goto L_0x01d2;
            case -417632473: goto L_0x01c8;
            case -61679713: goto L_0x01be;
            case 469954146: goto L_0x01b5;
            default: goto L_0x01b4;
        };
    L_0x01b4:
        goto L_0x01e6;
    L_0x01b5:
        r6 = "HTCEVOV4G";
        r8 = r8.equals(r6);
        if (r8 == 0) goto L_0x01e6;
    L_0x01bd:
        goto L_0x01e7;
    L_0x01be:
        r0 = "ADR6400L";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x01e6;
    L_0x01c6:
        r0 = 1;
        goto L_0x01e7;
    L_0x01c8:
        r0 = "ADR6350";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x01e6;
    L_0x01d0:
        r0 = 4;
        goto L_0x01e7;
    L_0x01d2:
        r0 = "HTC PH39100";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x01e6;
    L_0x01da:
        r0 = 2;
        goto L_0x01e7;
    L_0x01dc:
        r0 = "HTC Sensation 4G";
        r8 = r8.equals(r0);
        if (r8 == 0) goto L_0x01e6;
    L_0x01e4:
        r0 = 3;
        goto L_0x01e7;
    L_0x01e6:
        r0 = -1;
    L_0x01e7:
        if (r0 == 0) goto L_0x01f6;
    L_0x01e9:
        if (r0 == r5) goto L_0x01f6;
    L_0x01eb:
        if (r0 == r4) goto L_0x01f6;
    L_0x01ed:
        if (r0 == r3) goto L_0x01f6;
    L_0x01ef:
        if (r0 == r2) goto L_0x01f6;
    L_0x01f1:
        r8 = com.google.common.base.Optional.absent();
        return r8;
    L_0x01f6:
        r8 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        goto L_0x019d;
    L_0x01f9:
        r8 = com.google.common.base.Optional.absent();
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dre.d(fth):com.google.common.base.Optional");
    }

    public final Optional<Long> e(fth fth) {
        return Optional.absent();
    }

    /* JADX WARNING: Missing block: B:10:0x0036, code skipped:
            if (r9.equals("SM-G930F") != false) goto L_0x004e;
     */
    /* JADX WARNING: Missing block: B:28:0x0069, code skipped:
            return com.google.common.base.Optional.of(r9);
     */
    /* JADX WARNING: Missing block: B:90:0x015e, code skipped:
            if (r9.equals("SGH-S970G") != false) goto L_0x02af;
     */
    /* JADX WARNING: Missing block: B:185:0x02c5, code skipped:
            r9 = defpackage.dre.a(r9, r0);
     */
    public final com.google.common.base.Optional<java.lang.String> f(defpackage.fth r9) {
        /*
        r8 = this;
        r0 = r9 instanceof defpackage.dnd;
        if (r0 == 0) goto L_0x02e6;
    L_0x0004:
        r0 = defpackage.dre.1.a;
        r9 = (defpackage.dnd) r9;
        r9 = r9.ordinal();
        r9 = r0[r9];
        r0 = "SM-T210R";
        r1 = 19;
        r2 = 0;
        r3 = 3;
        r4 = 2;
        r5 = 1;
        r6 = -1;
        switch(r9) {
            case 24: goto L_0x02d0;
            case 25: goto L_0x0093;
            case 26: goto L_0x0093;
            case 27: goto L_0x006e;
            case 28: goto L_0x001c;
            default: goto L_0x001a;
        };
    L_0x001a:
        goto L_0x02e6;
    L_0x001c:
        r9 = android.os.Build.MODEL;
        r0 = r9.hashCode();
        switch(r0) {
            case -615476526: goto L_0x0043;
            case -401693121: goto L_0x0039;
            case -401693116: goto L_0x0030;
            case -401692961: goto L_0x0026;
            default: goto L_0x0025;
        };
    L_0x0025:
        goto L_0x004d;
    L_0x0026:
        r0 = "SM-G935F";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x004d;
    L_0x002e:
        r2 = 1;
        goto L_0x004e;
    L_0x0030:
        r0 = "SM-G930F";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x004d;
    L_0x0038:
        goto L_0x004e;
    L_0x0039:
        r0 = "SM-G930A";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x004d;
    L_0x0041:
        r2 = 2;
        goto L_0x004e;
    L_0x0043:
        r0 = "SAMSUNG-SM-G930A";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x004d;
    L_0x004b:
        r2 = 3;
        goto L_0x004e;
    L_0x004d:
        r2 = -1;
    L_0x004e:
        r9 = 1082759578; // 0x4089999a float:4.3 double:5.3495431E-315;
        if (r2 == 0) goto L_0x006a;
    L_0x0053:
        if (r2 == r5) goto L_0x006a;
    L_0x0055:
        if (r2 == r4) goto L_0x005e;
    L_0x0057:
        if (r2 == r3) goto L_0x005e;
    L_0x0059:
        r9 = com.google.common.base.Optional.absent();
        return r9;
    L_0x005e:
        r0 = 1085695590; // 0x40b66666 float:5.7 double:5.36404893E-315;
    L_0x0061:
        r9 = defpackage.dre.a(r0, r9);
    L_0x0065:
        r9 = com.google.common.base.Optional.of(r9);
        return r9;
    L_0x006a:
        r0 = 1085905306; // 0x40b9999a float:5.8 double:5.365085063E-315;
        goto L_0x0061;
    L_0x006e:
        r9 = android.os.Build.MODEL;
        r0 = r9.hashCode();
        r1 = 2078823192; // 0x7be85318 float:2.4125964E36 double:1.027075123E-314;
        if (r0 == r1) goto L_0x007a;
    L_0x0079:
        goto L_0x0083;
    L_0x007a:
        r0 = "GT-I9190";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x0083;
    L_0x0082:
        goto L_0x0084;
    L_0x0083:
        r2 = -1;
    L_0x0084:
        if (r2 == 0) goto L_0x008b;
    L_0x0086:
        r9 = com.google.common.base.Optional.absent();
        return r9;
    L_0x008b:
        r9 = 1075717342; // 0x401e24de float:2.4710002 double:5.314749833E-315;
        r9 = defpackage.dre.a(r9, r9);
        goto L_0x0065;
    L_0x0093:
        r9 = android.os.Build.MODEL;
        r7 = r9.hashCode();
        switch(r7) {
            case -2008646560: goto L_0x02a3;
            case -1855483452: goto L_0x0299;
            case -1284603925: goto L_0x028e;
            case -1168015927: goto L_0x0283;
            case -896079046: goto L_0x0278;
            case -682170771: goto L_0x026d;
            case -468818394: goto L_0x0262;
            case -468818392: goto L_0x0257;
            case -468818390: goto L_0x024c;
            case -401812249: goto L_0x0241;
            case -401812247: goto L_0x0236;
            case -401812242: goto L_0x022b;
            case -401812230: goto L_0x021f;
            case -399133971: goto L_0x0213;
            case -390606859: goto L_0x0207;
            case -389897790: goto L_0x01fd;
            case 19120253: goto L_0x01f1;
            case 19120270: goto L_0x01e5;
            case 19120330: goto L_0x01d9;
            case 19120342: goto L_0x01cd;
            case 19120361: goto L_0x01c1;
            case 19121219: goto L_0x01b5;
            case 62658882: goto L_0x01a9;
            case 62662761: goto L_0x019e;
            case 62930933: goto L_0x0192;
            case 85646018: goto L_0x0186;
            case 323671686: goto L_0x017a;
            case 327542657: goto L_0x016e;
            case 327542665: goto L_0x0162;
            case 333089263: goto L_0x0158;
            case 428722129: goto L_0x014c;
            case 1602934481: goto L_0x0141;
            case 1602934482: goto L_0x0136;
            case 1602934489: goto L_0x012b;
            case 1602937364: goto L_0x011f;
            case 1602937365: goto L_0x0113;
            case 1645724080: goto L_0x0107;
            case 1684408014: goto L_0x00fb;
            case 1942425418: goto L_0x00ef;
            case 1950858990: goto L_0x00e3;
            case 2078826757: goto L_0x00d8;
            case 2078826762: goto L_0x00cd;
            case 2078826763: goto L_0x00c1;
            case 2078826764: goto L_0x00b5;
            case 2078826765: goto L_0x00aa;
            case 2078826793: goto L_0x009e;
            default: goto L_0x009c;
        };
    L_0x009c:
        goto L_0x02ae;
    L_0x009e:
        r0 = "GT-I9515";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x00a6:
        r1 = 26;
        goto L_0x02af;
    L_0x00aa:
        r0 = "GT-I9508";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x00b2:
        r1 = 7;
        goto L_0x02af;
    L_0x00b5:
        r0 = "GT-I9507";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x00bd:
        r1 = 24;
        goto L_0x02af;
    L_0x00c1:
        r0 = "GT-I9506";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x00c9:
        r1 = 30;
        goto L_0x02af;
    L_0x00cd:
        r0 = "GT-I9505";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x00d5:
        r1 = 6;
        goto L_0x02af;
    L_0x00d8:
        r0 = "GT-I9500";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x00e0:
        r1 = 1;
        goto L_0x02af;
    L_0x00e3:
        r0 = "SCH-R970C";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x00eb:
        r1 = 13;
        goto L_0x02af;
    L_0x00ef:
        r0 = "SCH-I545L";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x00f7:
        r1 = 15;
        goto L_0x02af;
    L_0x00fb:
        r0 = "ASUS_Z00AD";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x0103:
        r1 = 39;
        goto L_0x02af;
    L_0x0107:
        r0 = "CH-R970X";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x010f:
        r1 = 14;
        goto L_0x02af;
    L_0x0113:
        r0 = "SHV-E330L";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x011b:
        r1 = 32;
        goto L_0x02af;
    L_0x011f:
        r0 = "SHV-E330K";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x0127:
        r1 = 31;
        goto L_0x02af;
    L_0x012b:
        r0 = "SHV-E300S";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x0133:
        r1 = 5;
        goto L_0x02af;
    L_0x0136:
        r0 = "SHV-E300L";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x013e:
        r1 = 4;
        goto L_0x02af;
    L_0x0141:
        r0 = "SHV-E300K";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x0149:
        r1 = 3;
        goto L_0x02af;
    L_0x014c:
        r0 = "SM-G531BT";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x0154:
        r1 = 41;
        goto L_0x02af;
    L_0x0158:
        r0 = "SGH-S970G";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x0160:
        goto L_0x02af;
    L_0x0162:
        r0 = "SGH-M919V";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x016a:
        r1 = 12;
        goto L_0x02af;
    L_0x016e:
        r0 = "SGH-M919N";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x0176:
        r1 = 34;
        goto L_0x02af;
    L_0x017a:
        r0 = "SGH-I337M";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x0182:
        r1 = 11;
        goto L_0x02af;
    L_0x0186:
        r0 = "SCH-I545PP";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x018e:
        r1 = 23;
        goto L_0x02af;
    L_0x0192:
        r0 = "SCH-R970";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x019a:
        r1 = 21;
        goto L_0x02af;
    L_0x019e:
        r0 = "SCH-I959";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x01a6:
        r1 = 2;
        goto L_0x02af;
    L_0x01a9:
        r0 = "SCH-I545";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x01b1:
        r1 = 22;
        goto L_0x02af;
    L_0x01b5:
        r0 = "GT-I9515L";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x01bd:
        r1 = 27;
        goto L_0x02af;
    L_0x01c1:
        r0 = "GT-I9508V";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x01c9:
        r1 = 29;
        goto L_0x02af;
    L_0x01cd:
        r0 = "GT-I9508C";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x01d5:
        r1 = 8;
        goto L_0x02af;
    L_0x01d9:
        r0 = "GT-I9507V";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x01e1:
        r1 = 25;
        goto L_0x02af;
    L_0x01e5:
        r0 = "GT-I9505X";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x01ed:
        r1 = 28;
        goto L_0x02af;
    L_0x01f1:
        r0 = "GT-I9505G";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x01f9:
        r1 = 33;
        goto L_0x02af;
    L_0x01fd:
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x0203:
        r1 = 38;
        goto L_0x02af;
    L_0x0207:
        r0 = "SM-S975L";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x020f:
        r1 = 18;
        goto L_0x02af;
    L_0x0213:
        r0 = "SM-J200H";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x021b:
        r1 = 45;
        goto L_0x02af;
    L_0x021f:
        r0 = "SM-G531Y";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x0227:
        r1 = 44;
        goto L_0x02af;
    L_0x022b:
        r0 = "SM-G531M";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x0233:
        r1 = 43;
        goto L_0x02af;
    L_0x0236:
        r0 = "SM-G531H";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x023e:
        r1 = 40;
        goto L_0x02af;
    L_0x0241:
        r0 = "SM-G531F";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x0249:
        r1 = 42;
        goto L_0x02af;
    L_0x024c:
        r0 = "ONE A2005";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x0254:
        r1 = 37;
        goto L_0x02af;
    L_0x0257:
        r0 = "ONE A2003";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x025f:
        r1 = 36;
        goto L_0x02af;
    L_0x0262:
        r0 = "ONE A2001";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x026a:
        r1 = 35;
        goto L_0x02af;
    L_0x026d:
        r0 = "SGH-M919";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x0275:
        r1 = 20;
        goto L_0x02af;
    L_0x0278:
        r0 = "SAMSUNG-SGH-I337";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x0280:
        r1 = 10;
        goto L_0x02af;
    L_0x0283:
        r0 = "SPH-L720T";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x028b:
        r1 = 16;
        goto L_0x02af;
    L_0x028e:
        r0 = "SPH-L720";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x0296:
        r1 = 17;
        goto L_0x02af;
    L_0x0299:
        r0 = "SC-04E";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x02a1:
        r1 = 0;
        goto L_0x02af;
    L_0x02a3:
        r0 = "SAMSUNG-SGH-I337Z";
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02ae;
    L_0x02ab:
        r1 = 9;
        goto L_0x02af;
    L_0x02ae:
        r1 = -1;
    L_0x02af:
        r9 = 720; // 0x2d0 float:1.009E-42 double:3.557E-321;
        r0 = 1280; // 0x500 float:1.794E-42 double:6.324E-321;
        switch(r1) {
            case 0: goto L_0x02bb;
            case 1: goto L_0x02bb;
            case 2: goto L_0x02bb;
            case 3: goto L_0x02bb;
            case 4: goto L_0x02bb;
            case 5: goto L_0x02bb;
            case 6: goto L_0x02bb;
            case 7: goto L_0x02bb;
            case 8: goto L_0x02bb;
            case 9: goto L_0x02bb;
            case 10: goto L_0x02bb;
            case 11: goto L_0x02bb;
            case 12: goto L_0x02bb;
            case 13: goto L_0x02bb;
            case 14: goto L_0x02bb;
            case 15: goto L_0x02bb;
            case 16: goto L_0x02bb;
            case 17: goto L_0x02bb;
            case 18: goto L_0x02bb;
            case 19: goto L_0x02bb;
            case 20: goto L_0x02bb;
            case 21: goto L_0x02bb;
            case 22: goto L_0x02bb;
            case 23: goto L_0x02bb;
            case 24: goto L_0x02bb;
            case 25: goto L_0x02bb;
            case 26: goto L_0x02bb;
            case 27: goto L_0x02bb;
            case 28: goto L_0x02bb;
            case 29: goto L_0x02bb;
            case 30: goto L_0x02bb;
            case 31: goto L_0x02bb;
            case 32: goto L_0x02bb;
            case 33: goto L_0x02bb;
            case 34: goto L_0x02bb;
            case 35: goto L_0x02bb;
            case 36: goto L_0x02bb;
            case 37: goto L_0x02bb;
            case 38: goto L_0x02cb;
            case 39: goto L_0x02c1;
            case 40: goto L_0x02bb;
            case 41: goto L_0x02bb;
            case 42: goto L_0x02bb;
            case 43: goto L_0x02bb;
            case 44: goto L_0x02bb;
            case 45: goto L_0x02bb;
            default: goto L_0x02b6;
        };
    L_0x02b6:
        r9 = com.google.common.base.Optional.absent();
        return r9;
    L_0x02bb:
        r9 = defpackage.dre.a(r0, r9);
        goto L_0x0065;
    L_0x02c1:
        r9 = 1080; // 0x438 float:1.513E-42 double:5.336E-321;
        r0 = 1920; // 0x780 float:2.69E-42 double:9.486E-321;
    L_0x02c5:
        r9 = defpackage.dre.a(r9, r0);
        goto L_0x0065;
    L_0x02cb:
        r9 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r0 = 576; // 0x240 float:8.07E-43 double:2.846E-321;
        goto L_0x02c5;
    L_0x02d0:
        r9 = android.os.Build.VERSION.SDK_INT;
        if (r9 != r1) goto L_0x02e1;
    L_0x02d4:
        r9 = android.os.Build.MODEL;
        r9 = r9.equals(r0);
        if (r9 == 0) goto L_0x02e1;
    L_0x02dc:
        r9 = 640; // 0x280 float:8.97E-43 double:3.16E-321;
        r0 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        goto L_0x02c5;
    L_0x02e1:
        r9 = com.google.common.base.Optional.absent();
        return r9;
    L_0x02e6:
        r9 = com.google.common.base.Optional.absent();
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dre.f(fth):com.google.common.base.Optional");
    }

    public final ajdp<Optional<Object>> g(fth fth) {
        return ajdp.b(Optional.absent());
    }

    public final void h(fth fth) {
    }

    public final void i(fth fth) {
    }
}
