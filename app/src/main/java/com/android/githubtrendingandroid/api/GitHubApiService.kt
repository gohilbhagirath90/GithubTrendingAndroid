package demo.com.androidapp.data.remote

import demo.com.androidapp.data.models.Repo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * GitHub Api Service
 * @author Bhagirath
 */
interface GitHubApiService {

    @GET("search/repositories?q=android%20language:java&sort=stars&order=desc&per_page=10")
    fun getRepositories(@Query("page") page: Int): Call<Repo>
}
