package io.TrayectoriasLaborales.client.api;

import io.TrayectoriasLaborales.client.ApiCallback;
import io.TrayectoriasLaborales.client.ApiClient;
import io.TrayectoriasLaborales.client.ApiException;
import io.TrayectoriasLaborales.client.ApiResponse;
import io.TrayectoriasLaborales.client.Configuration;
import io.TrayectoriasLaborales.client.Pair;
import io.TrayectoriasLaborales.client.ProgressRequestBody;
import io.TrayectoriasLaborales.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.TrayectoriasLaborales.client.model.Busqueda;
import io.TrayectoriasLaborales.client.model.Respuesta;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrayectoriasLaboralesApi {
    private ApiClient apiClient;
    public TrayectoriasLaboralesApi() {
        this(Configuration.getDefaultApiClient());
    }
    public TrayectoriasLaboralesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call consultaCall(String xApiKey, String username, String password, Busqueda busqueda, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = busqueda;
        String localVarPath = "/consulta";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private okhttp3.Call consultaValidateBeforeCall(String xApiKey,  String username, String password, Busqueda busqueda, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling consulta(Async)");
        }

        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling consulta(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling consulta(Async)");
        }
        if (busqueda == null) {
            throw new ApiException("Missing the required parameter 'busqueda' when calling consulta(Async)");
        }
        
        okhttp3.Call call = consultaCall(xApiKey,  username, password, busqueda, progressListener, progressRequestListener);
        return call;
    }
    
    public Respuesta consulta(String xApiKey,  String username, String password, Busqueda busqueda) throws ApiException {
        ApiResponse<Respuesta> resp = consultaWithHttpInfo(xApiKey,  username, password, busqueda);
        return resp.getData();
    }
    
    public ApiResponse<Respuesta> consultaWithHttpInfo(String xApiKey, String username, String password, Busqueda busqueda) throws ApiException {
        okhttp3.Call call = consultaValidateBeforeCall(xApiKey, username, password, busqueda, null, null);
        Type localVarReturnType = new TypeToken<Respuesta>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call consultaAsync(String xApiKey, String username, String password, Busqueda busqueda, final ApiCallback<Respuesta> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = consultaValidateBeforeCall(xApiKey, username, password, busqueda, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Respuesta>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
}
