package demo.com.androidapp.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Retrofit Client Class
 * @author Bhagirath
 */

object RetrofitClient {

    private var retrofit: Retrofit? = null

    /**
     * get Retrofit client
     * @param baseUrl
     * @return retrofit
     */
    fun getClient(baseUrl: String): Retrofit {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
        }
        return retrofit!!
    }
}
