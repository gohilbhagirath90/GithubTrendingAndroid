package demo.com.androidapp.data.remote

/**
 * API Utils class
 * @author Bhagirath
 */
object ApiUtils {

    // Github API base URL
    private const val BASE_URL = "https://api.github.com/"

    val gitHubApiService: GitHubApiService
        get() = RetrofitClient.getClient(BASE_URL).create(GitHubApiService::class.java)
}
