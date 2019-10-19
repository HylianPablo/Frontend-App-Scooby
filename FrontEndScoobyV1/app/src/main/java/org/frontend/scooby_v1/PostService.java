package org.frontend.scooby_v1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostService {

    String API_ROUTE = "51.83.70.87:3000/paddock";

    @GET(API_ROUTE)
    Call< List<Post> > getPost();

}