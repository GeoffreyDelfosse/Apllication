package com.example.myapptest;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    @GET("accounts")
    Call<List<Post>> getPosts();
}
