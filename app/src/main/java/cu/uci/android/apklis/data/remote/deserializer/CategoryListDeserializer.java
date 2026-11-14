package cu.uci.android.apklis.data.remote.deserializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import defpackage.so;
import defpackage.yy;
import defpackage.zy;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1a0df518074f4dd74450620bea654c5df2a9b500bed11c7a4548e134026cf4ff */
/**
 * Gson JsonDeserializer parsing Apklis category list payloads.
 *
 * @obfuscated_class cu.uci.android.apklis.data.remote.deserializer.CategoryListDeserializer
 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcu/uci/android/apklis/data/remote/deserializer/CategoryListDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lyy;", "<init>", "()V", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CategoryListDeserializer implements JsonDeserializer<yy> {
    @Override // com.google.gson.JsonDeserializer
    public final yy deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        yy yyVar = new yy();
        if (jsonElement.isJsonArray()) {
            try {
                zy[] zyVarArr = (zy[]) jsonDeserializationContext.deserialize(jsonElement, zy[].class);
                zyVarArr.getClass();
                yyVar.e = so.u0(zyVarArr);
                return yyVar;
            } catch (Exception e) {
                throw new JsonParseException("Error deserializando array de categorías", e);
            }
        }
        if (!jsonElement.isJsonObject()) {
            return yyVar;
        }
        try {
            Object objDeserialize = jsonDeserializationContext.deserialize(jsonElement, yy.class);
            objDeserialize.getClass();
            return (yy) objDeserialize;
        } catch (Exception e2) {
            throw new JsonParseException("Error deserializando objeto paginado de categorías", e2);
        }
    }
}
