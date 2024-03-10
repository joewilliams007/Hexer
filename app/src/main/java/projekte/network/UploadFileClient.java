package projekte.network;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface UploadFileClient {
    @Multipart

    @POST("uploadFile")
    Call<ResponseBody> uploadFile(
            @Part("type") RequestBody type,
            @Part("fileName") RequestBody fileName,
            @Part MultipartBody.Part file);
}
