package com.example.groceryapp.api;


import com.example.groceryapp.model.Category;
import com.example.groceryapp.model.CategoryResult;
import com.example.groceryapp.model.Order;
import com.example.groceryapp.model.OrderItem;
import com.example.groceryapp.model.OrdersResult;
import com.example.groceryapp.model.PlaceOrder;
import com.example.groceryapp.model.ProductResult;
import com.example.groceryapp.model.Token;
import com.example.groceryapp.model.User;
import com.example.groceryapp.model.UserResult;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * RetrofitExample
 * https://github.com/quintuslabs/RetrofitExample
 * Created on 18-Feb-2019.
 * Created by : Santosh Kumar Dash:- http://santoshdash.epizy.com
 */

public interface RestService {

    @POST("api/v1/register")
    Call<UserResult> register(@Body User user);

    @POST("api/v1/login")
    Call<UserResult> login(@Body User user);

    @POST("api/v1/forgot_password")
    Call<UserResult> forgotPassword(@Body User user);

    @POST("api/v1/reset_password")
    Call<UserResult> resetPassword(@Body User user);

    @POST("api/v1/allcategory")
    Call<CategoryResult> allCategory(@Body Token token);

    @POST("api/v1/newProduct")
    Call<ProductResult> newProducts(@Body Token token);

    @POST("api/v1/homepage")
    Call<ProductResult> popularProducts(@Body Token token);

    @POST("api/v1/getlist")
    Call<ProductResult> getCategoryProduct(@Body Category category);

    @POST("api/v1/placeorder")
    Call<OrdersResult> confirmPlaceOrder(@Body PlaceOrder placeOrder);

    @POST("api/v1/orderDetails")
    Call<OrdersResult> orderDetails(@Body Order order);

    @POST("api/v1/updateUser")
    Call<UserResult> updateUser(@Body User user);

    @GET("api/v1/product/search")
    Call<ProductResult> searchProduct(@Query("s") String search);

    @POST("api/v1/singleOrderDetails")
    Call<OrdersResult> getOrderItems(@Body OrderItem orderItem);
}
