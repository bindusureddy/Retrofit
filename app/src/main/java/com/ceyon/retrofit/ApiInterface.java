package com.ceyon.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

public interface ApiInterface {


    @POST("readcontacts.php")//last notation of url
    Call<List<Contact>> getContacts();
}
