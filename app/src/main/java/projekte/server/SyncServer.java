package projekte.server;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import projekte.network.UploadFileClient;
import static projekte.network.RetrofitClient.BASE_URL;

public class SyncServer {
    public void sendFile() {

        RequestBody type = RequestBody.create(MediaType.parse("multipart/form-data"), "model");
        RequestBody fileName = RequestBody.create(MediaType.parse("multipart/form-data"), "coolPrintFile");
        
        MultipartBody.Part file = null;
        File uploadFile = new File("myFile.txt");

        FileWriter writer;
        try {
            writer = new FileWriter(uploadFile);
            writer.write("Hello X Y Z");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        
        // create RequestBody instance from file
        RequestBody filePart = RequestBody.create(MediaType.parse("application/octet-stream"),
                uploadFile);

        // MultipartBody.Part is used to send also the actual file name
        file = MultipartBody.Part.createFormData("file", uploadFile.getName(), filePart);

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(BASE_URL) // SERVER IP
                .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = builder.build();

        UploadFileClient client = retrofit.create(UploadFileClient.class);

        Call<ResponseBody> call = client.uploadFile(type, fileName, file);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call,
                    Response<ResponseBody> response) {
                System.out.println("Upload Success!");
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                System.out.println("Upload failed! " + t.getMessage());
            }
        });
    }
}
