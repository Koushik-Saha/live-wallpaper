package com.example.varianttecnology.androidlivewallpaper.Remote;

import com.example.varianttecnology.androidlivewallpaper.Model.AnalyzeModel.ComputerVision;
import com.example.varianttecnology.androidlivewallpaper.Model.AnalyzeModel.URLUpload;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface IComputerVision {
    @Headers({
            "Content-Type:application/json",
            "Ocp-Apim-Subscription-Key: fcd7579a1a604fe7804210a3a875c628"

    })
    @POST
    Call<ComputerVision> analyzeImage(@Url String apiEndpoint, @Body URLUpload url);
}
