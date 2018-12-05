package com.android.githubtrendingandroid

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import demo.com.androidapp.data.models.Item
import demo.com.androidapp.data.models.Repo
import demo.com.androidapp.data.remote.ApiUtils
import demo.com.androidapp.data.remote.GitHubApiService
import demo.com.androidapp.userinterface.viewholders.RepositoryItemViewHolder
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Main Activity
 * showing the list of Github trending Android Repository
 * @author Bhagirath
 */

class GithubTrendingActivity : AppCompatActivity() {
    private var context: Context? = null
    private var mGitHubApiService: GitHubApiService? = null
    var repositoryList: MutableList<Item> = arrayListOf()
    lateinit var adapter: RepositoryItemViewHolder
    var page = 1
    private var layoutManager: LinearLayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = this
        mGitHubApiService = ApiUtils.gitHubApiService
        initView()
        getGithubTrendingRepository()
    }

    /**
     * Get Github Trending Android Repository
     */
    private fun getGithubTrendingRepository() {
        progressCircular.visibility = View.VISIBLE
        mGitHubApiService?.getRepositories(page)?.enqueue(object : Callback<Repo> {
            override fun onFailure(call: Call<Repo>?, t: Throwable?) {

            }
            override fun onResponse(call: Call<Repo>?, response: Response<Repo>?) {
                if (response != null) {
                    if (response.isSuccessful) {
                        var repo = response.body()
                        repositoryList.addAll(repo?.items!!)
                        adapter.repositories = repositoryList
                        adapter.notifyDataSetChanged()
                        progressCircular.visibility = View.GONE

                    }
                }
            }

        })
    }

    /**
     * initialize views
     */
    private fun initView() {
        layoutManager = LinearLayoutManager(context)
        recycleListTrending.layoutManager = layoutManager
        adapter = RepositoryItemViewHolder(repositoryList)
        recycleListTrending.adapter = adapter
        recycleListTrending.addItemDecoration(
            DividerItemDecoration(
                context,
                DividerItemDecoration.VERTICAL
            )
        )
        setupRecyclerListener()
    }


    private val lastVisibleItemPosition: Int
        get() = layoutManager!!.findLastVisibleItemPosition()


    /**
     * Setting up recycler listener for endless pagination
     */
    private fun setupRecyclerListener() {
        recycleListTrending.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recycleListTrending, newState)
                val totalItemCount = recyclerView!!.layoutManager!!.itemCount
                if (totalItemCount == lastVisibleItemPosition + 1) {

                    // Last item visible now, increment page count and load more repository
                    page += 1
                    getGithubTrendingRepository()
                }
            }
        })
    }
}
