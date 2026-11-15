package defpackage;

import com.google.gson.JsonObject;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rJK\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013JU\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006H'¢\u0006\u0004\b\u0018\u0010\u0019JK\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u001a\u0010\u0013JU\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u001b\u0010\u0016J3\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0004H'¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u0002H'¢\u0006\u0004\b!\u0010\"J3\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010#\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0004H'¢\u0006\u0004\b$\u0010\u001eJ+\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0014\b\u0001\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020%H'¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020 0\u00062\b\b\u0001\u0010\u001f\u001a\u00020\u0002H'¢\u0006\u0004\b)\u0010\rJ\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00062\b\b\u0001\u0010\u001f\u001a\u00020\u0002H'¢\u0006\u0004\b+\u0010\rJ3\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00062\b\b\u0001\u0010\u001f\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010-\u001a\u00020,H'¢\u0006\u0004\b/\u00100Jm\u00105\u001a\b\u0012\u0004\u0012\u00020.0\u00062\b\b\u0001\u0010\u001f\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010-\u001a\u00020,2\n\b\u0003\u00101\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u00102\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u00103\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u00104\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b5\u00106J)\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00062\b\b\u0001\u0010\u001f\u001a\u00020\u00022\b\b\u0003\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\b8\u0010\tJ)\u0010:\u001a\b\u0012\u0004\u0012\u00020.0\u00062\b\b\u0001\u0010\u001f\u001a\u00020\u00022\b\b\u0001\u00109\u001a\u00020\u0002H'¢\u0006\u0004\b:\u0010;J\u001f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00062\b\b\u0001\u0010=\u001a\u00020<H'¢\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\b\u0012\u0004\u0012\u00020>0\u00062\b\b\u0001\u0010=\u001a\u00020<H'¢\u0006\u0004\bA\u0010@J\u001f\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00062\b\b\u0001\u0010B\u001a\u00020\u0002H'¢\u0006\u0004\bD\u0010\rJ\u001b\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0E0\u0006H'¢\u0006\u0004\bG\u0010\u0019J\u001f\u0010I\u001a\b\u0012\u0004\u0012\u00020>0\u00062\b\b\u0001\u0010=\u001a\u00020HH'¢\u0006\u0004\bI\u0010JJ\u001f\u0010L\u001a\b\u0012\u0004\u0012\u00020>0\u00062\b\b\u0001\u0010=\u001a\u00020KH'¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\b\u0012\u0004\u0012\u00020>0\u00062\b\b\u0001\u0010=\u001a\u00020KH'¢\u0006\u0004\bN\u0010MJ\u001f\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\u00062\b\b\u0001\u0010=\u001a\u00020OH'¢\u0006\u0004\bQ\u0010RJ\u001f\u0010U\u001a\b\u0012\u0004\u0012\u00020T0\u00062\b\b\u0001\u0010=\u001a\u00020SH'¢\u0006\u0004\bU\u0010VJ%\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0E0\u00062\b\b\u0001\u0010=\u001a\u00020WH'¢\u0006\u0004\bY\u0010ZJ\u001f\u0010]\u001a\b\u0012\u0004\u0012\u00020>0\u00062\b\b\u0001\u0010\\\u001a\u00020[H'¢\u0006\u0004\b]\u0010^JQ\u0010f\u001a\b\u0012\u0004\u0012\u00020e0\u00062\b\b\u0001\u0010`\u001a\u00020_2\b\b\u0001\u0010a\u001a\u00020_2\b\b\u0001\u0010b\u001a\u00020_2\b\b\u0001\u00109\u001a\u00020_2\b\b\u0001\u0010c\u001a\u00020_2\b\b\u0001\u0010d\u001a\u00020_H'¢\u0006\u0004\bf\u0010gJ\u001f\u0010h\u001a\b\u0012\u0004\u0012\u00020>0\u00062\b\b\u0001\u0010a\u001a\u00020_H'¢\u0006\u0004\bh\u0010iJ\u001f\u0010j\u001a\b\u0012\u0004\u0012\u00020>0\u00062\b\b\u0001\u0010a\u001a\u00020_H'¢\u0006\u0004\bj\u0010iJ)\u0010m\u001a\b\u0012\u0004\u0012\u00020l0\u00062\b\b\u0001\u0010`\u001a\u00020_2\b\b\u0001\u0010k\u001a\u00020_H'¢\u0006\u0004\bm\u0010nJ)\u0010p\u001a\b\u0012\u0004\u0012\u00020>0\u00062\b\b\u0001\u0010k\u001a\u00020_2\b\b\u0001\u0010o\u001a\u00020_H'¢\u0006\u0004\bp\u0010nJ=\u0010r\u001a\b\u0012\u0004\u0012\u00020l0\u00062\b\b\u0001\u0010q\u001a\u00020\u00022\b\b\u0001\u0010`\u001a\u00020\u00022\b\b\u0001\u00109\u001a\u00020\u00022\b\b\u0001\u0010b\u001a\u00020\u0002H'¢\u0006\u0004\br\u0010sJ\u0015\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H'¢\u0006\u0004\bt\u0010\u0019J\u001f\u0010v\u001a\b\u0012\u0004\u0012\u00020u0\u00062\b\b\u0001\u00109\u001a\u00020\u0002H'¢\u0006\u0004\bv\u0010\rJ)\u0010z\u001a\b\u0012\u0004\u0012\u00020y0\u00062\b\b\u0001\u0010w\u001a\u00020\u00022\b\b\u0001\u0010\\\u001a\u00020xH'¢\u0006\u0004\bz\u0010{J)\u0010}\u001a\b\u0012\u0004\u0012\u00020u0\u00062\b\b\u0001\u00109\u001a\u00020\u00022\b\b\u0001\u0010\\\u001a\u00020|H'¢\u0006\u0004\b}\u0010~J-\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020u0\u00062\b\b\u0001\u00109\u001a\u00020\u00022\t\b\u0001\u0010\u0080\u0001\u001a\u00020\u007fH'¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J4\u0010\u0086\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0085\u00010E0\u00062\t\b\u0001\u0010\u0083\u0001\u001a\u00020\u00022\t\b\u0001\u0010\u0084\u0001\u001a\u00020\u0002H'¢\u0006\u0005\b\u0086\u0001\u0010;J)\u0010\u0087\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0085\u00010E0\u00062\t\b\u0001\u0010\u0083\u0001\u001a\u00020\u0002H'¢\u0006\u0005\b\u0087\u0001\u0010\rJ#\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u00062\t\b\u0001\u0010\\\u001a\u00030\u0088\u0001H'¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J.\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u00062\t\b\u0001\u0010\u008b\u0001\u001a\u00020\u00022\t\b\u0001\u0010\\\u001a\u00030\u008c\u0001H'¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001e\u0010\u0090\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008f\u00010E0\u0006H'¢\u0006\u0005\b\u0090\u0001\u0010\u0019J#\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u00062\t\b\u0001\u0010=\u001a\u00030\u0091\u0001H'¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J#\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u00062\t\b\u0001\u0010\\\u001a\u00030\u0094\u0001H'¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J#\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u00062\t\b\u0001\u0010=\u001a\u00030\u0097\u0001H'¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J7\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u00062\b\b\u0001\u0010\u001f\u001a\u00020\u00022\t\b\u0001\u0010\u009a\u0001\u001a\u00020_2\b\b\u0001\u00101\u001a\u00020_H'¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J!\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u00062\b\b\u0001\u0010\u001f\u001a\u00020\u0002H'¢\u0006\u0005\b\u009d\u0001\u0010\rJ,\u0010 \u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009f\u00010E0\u00062\u000b\b\u0001\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0017\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u0006H'¢\u0006\u0005\b¢\u0001\u0010\u0019J\"\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u00062\t\b\u0001\u0010\u008b\u0001\u001a\u00020\u0002H'¢\u0006\u0005\b£\u0001\u0010\rJ\u0017\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00020>0\u0006H'¢\u0006\u0005\b¤\u0001\u0010\u0019¨\u0006¥\u0001À\u0006\u0003"}, d2 = {"Lwh;", "", "", "type", "", "orderExclude", "Lhx;", "Lo30;", "n", "(Ljava/lang/String;I)Lhx;", "query", "Lrm;", "o", "(Ljava/lang/String;)Lhx;", "limit", "offset", "price", "priceGt", "s", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Lhx;", "categoriesIn", "j", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Lhx;", "Ljd0;", "N", "()Lhx;", "p", "X", "downloads", "J", "(III)Lhx;", "packageName", "Lhm;", "L", "(ILjava/lang/String;)Lhx;", "wishlist", "O", "", "params", "I", "(Ljava/util/Map;)Lhx;", "z", "Lim;", "B", "", "isPublic", "Lvu2;", "F", "(Ljava/lang/String;IZ)Lhx;", "rating", "ratingGte", "ratingLte", "version", "q", "(Ljava/lang/String;IIZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lhx;", "Lor2;", "v", "username", "k", "(Ljava/lang/String;Ljava/lang/String;)Lhx;", "Ldh0;", "request", "Ljava/lang/Void;", "f", "(Ldh0;)Lhx;", "M", "group", "Lyy;", "t", "", "Lzq;", "P", "Lvc3;", "C", "(Lvc3;)Lhx;", "Lb6;", "D", "(Lb6;)Lhx;", "U", "Lek0;", "Lfk0;", "E", "(Lek0;)Lhx;", "Lqh2;", "Lrh2;", "b", "(Lqh2;)Lhx;", "Lao;", "Lwn;", "Z", "(Lao;)Lhx;", "Lrz;", "body", "T", "(Lrz;)Lhx;", "Lms2;", "clientId", "phoneNumber", "password", "firstName", "lastName", "Lxh;", "l", "(Lms2;Lms2;Lms2;Lms2;Lms2;Lms2;)Lhx;", "V", "(Lms2;)Lhx;", "g", "token", "Lem3;", "d", "(Lms2;Lms2;)Lhx;", "newPassword", "e", "grantType", "K", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lhx;", "A", "Lpt3;", "i", "action", "Lcom/google/gson/JsonObject;", "Leu2;", "H", "(Ljava/lang/String;Lcom/google/gson/JsonObject;)Lhx;", "Lgt3;", "x", "(Ljava/lang/String;Lgt3;)Lhx;", "Ln22;", "avatar", "u", "(Ljava/lang/String;Ln22;)Lhx;", "status", "deviceId", "Luo1;", "c", "y", "Lp02;", "w", "(Lp02;)Lhx;", "uuid", "Lux;", "a0", "(Ljava/lang/String;Lux;)Lhx;", "Lf50;", "S", "Lh33;", "Q", "(Lh33;)Lhx;", "Lxh0;", "R", "(Lxh0;)Lhx;", "Li33;", "W", "(Li33;)Lhx;", "comment", "Y", "(Ljava/lang/String;Lms2;Lms2;)Lhx;", "a", "all", "Lv72;", "m", "(Ljava/lang/Integer;)Lhx;", "G", "h", "r", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface wh {
    @n21("o/user/me/")
    hx<String> A();

    @n21("v3/application/{packageName}/")
    hx<im> B(@mg2("packageName") String packageName);

    @ud2("v3/suggest/")
    hx<Void> C(@ot vc3 request);

    @ud2("v3/application/wishlist/")
    hx<Void> D(@ot b6 request);

    @ud2("v3/release/get_url/")
    hx<fk0> E(@ot ek0 request);

    @n21("v3/review/")
    hx<vu2> F(@ym2("app") String packageName, @ym2("limit") int limit, @ym2("public") boolean isPublic);

    @ud2("v3/notification/read-all/")
    hx<Void> G();

    @ud2("v3/action/{action}/")
    hx<eu2> H(@mg2("action") String action, @ot JsonObject body);

    @n21("v3/application/")
    hx<rm> I(@an2 Map<String, String> params);

    @n21("v3/application/")
    hx<rm> J(@ym2("downloads") int downloads, @ym2("limit") int limit, @ym2("offset") int offset);

    @b01
    @ud2("o/token/")
    hx<em3> K(@hu0("grant_type") String grantType, @hu0("client_id") String clientId, @hu0("username") String username, @hu0("password") String password);

    @n21("v3/application/")
    hx<hm> L(@ym2("downloads") int downloads, @ym2("package_name") String packageName);

    @td2("v3/application/delete_review/")
    hx<Void> M(@ot dh0 request);

    @n21("v3/dashboard/resume/")
    hx<jd0> N();

    @n21("v3/application/")
    hx<rm> O(@ym2("wishlist") int wishlist, @ym2("limit") int limit, @ym2("offset") int offset);

    @n21("v3/slider/")
    hx<List<zq>> P();

    @ud2("v3/complaint/")
    hx<Void> Q(@ot h33 request);

    @ud2("v3/device/")
    hx<Void> R(@ot xh0 body);

    @n21("v3/complaint_kind/")
    hx<List<f50>> S();

    @ud2("o/user/set_password/")
    hx<Void> T(@ot rz body);

    @f61(hasBody = true, method = "DELETE", path = "v3/application/wishlist/")
    hx<Void> U(@ot b6 request);

    @ud2("o/user/sms_send/")
    @m22
    hx<Void> V(@ig2("phone_number") ms2 phoneNumber);

    @ud2("v3/review/")
    hx<Void> W(@ot i33 request);

    @n21("v3/application/")
    hx<rm> X(@ym2("categories__in") String categoriesIn, @ym2("type") String type, @ym2("limit") int limit, @ym2("offset") int offset, @ym2("price") String price, @ym2("price__gt") String priceGt);

    @td2("v3/review/{packageName}/")
    @m22
    hx<Void> Y(@mg2("packageName") String packageName, @ig2("comment") ms2 comment, @ig2("rating") ms2 rating);

    @ud2("v3/application/apps_to_update/")
    hx<List<wn>> Z(@ot ao request);

    @f61(hasBody = false, method = "DELETE", path = "v3/review/{packageName}/")
    hx<Void> a(@mg2("packageName") String packageName);

    @ud2("license/v1/license/{uuid}/cancel/")
    hx<Void> a0(@mg2("uuid") String uuid, @ot ux body);

    @ud2("v3/application/pay_with_transfermovil/")
    hx<rh2> b(@ot qh2 request);

    @n21("license/v1/license/history/")
    hx<List<uo1>> c(@ym2("status") String status, @ym2("device") String deviceId);

    @ud2("o/user/activate_user/")
    @m22
    hx<em3> d(@ig2("client_id") ms2 clientId, @ig2("token") ms2 token);

    @ud2("o/user/change_password_with_tk/")
    @m22
    hx<Void> e(@ig2("token") ms2 token, @ig2("new_password") ms2 newPassword);

    @f61(hasBody = true, method = "DELETE", path = "v3/application/delete_review/")
    hx<Void> f(@ot dh0 request);

    @ud2("o/user/sms_forgot_password/")
    @m22
    hx<Void> g(@ig2("phone_number") ms2 phoneNumber);

    @f61(hasBody = false, method = "DELETE", path = "v3/notification/{uuid}/")
    hx<Void> h(@mg2("uuid") String uuid);

    @n21("v3/user/{username}/")
    hx<pt3> i(@mg2("username") String username);

    @n21("v3/application/")
    hx<rm> j(@ym2("search") String query, @ym2("categories__in") String categoriesIn, @ym2("limit") int limit, @ym2("offset") int offset, @ym2("price") String price, @ym2("price__gt") String priceGt);

    @n21("v3/review/")
    hx<vu2> k(@ym2("app") String packageName, @ym2("user_username") String username);

    @ud2("v3/user/")
    @m22
    hx<xh> l(@ig2("client_id") ms2 clientId, @ig2("phone_number") ms2 phoneNumber, @ig2("password") ms2 password, @ig2("username") ms2 username, @ig2("first_name") ms2 firstName, @ig2("last_name") ms2 lastName);

    @n21("v3/notification/")
    hx<List<v72>> m(@ym2("all") Integer all);

    @n21("v3/collection/")
    hx<o30> n(@ym2("type") String type, @ym2("order__exclude") int orderExclude);

    @n21("v3/application/")
    hx<rm> o(@ym2("search") String query);

    @n21("v3/application/")
    hx<rm> p(@ym2("categories__in") String categoriesIn, @ym2("limit") int limit, @ym2("offset") int offset, @ym2("price") String price, @ym2("price__gt") String priceGt);

    @n21("v3/review/")
    hx<vu2> q(@ym2("app") String packageName, @ym2("limit") int limit, @ym2("offset") int offset, @ym2("public") boolean isPublic, @ym2("rating") Integer rating, @ym2("rating__gte") Integer ratingGte, @ym2("rating__lte") Integer ratingLte, @ym2("version") String version);

    @f61(hasBody = false, method = "DELETE", path = "v3/notification/destroy_all/")
    hx<Void> r();

    @n21("v3/application/")
    hx<rm> s(@ym2("search") String query, @ym2("limit") int limit, @ym2("offset") int offset, @ym2("price") String price, @ym2("price__gt") String priceGt);

    @n21("v3/category/")
    hx<yy> t(@ym2("group") String group);

    @td2("v3/user/{username}/")
    @m22
    hx<pt3> u(@mg2("username") String username, @ig2 n22 avatar);

    @n21("v3/release/")
    hx<or2> v(@ym2("package_name") String packageName, @ym2("limit") int limit);

    @ud2("license/v1/license/migrate/")
    hx<Void> w(@ot p02 body);

    @td2("v3/user/{username}/")
    hx<pt3> x(@mg2("username") String username, @ot gt3 body);

    @n21("license/v1/license/history/")
    hx<List<uo1>> y(@ym2("status") String status);

    @n21("v3/application/")
    hx<hm> z(@ym2("package_name") String packageName);
}
