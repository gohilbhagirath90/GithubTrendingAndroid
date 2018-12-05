package com.android.githubtrendingandroid

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import demo.com.androidapp.data.models.Item
import kotlinx.android.synthetic.main.activity_repo_detail.*
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import com.android.githubtrendingandroid.model.Information
import com.squareup.picasso.Picasso

/**
 * Repository Detail Activity
 * showing the detail of Github Android Repository
 * @author Bhagirath
 */

class RepoDetailActivity : AppCompatActivity() {

    private var repo: Item? = null
    var context:Context?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repo_detail)
        context = this
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        repo = Information.viewedRepo
        if(repo != null){
            displayRepoInformation()
        }
    }

    /**
     * display repository information
     */
    private fun displayRepoInformation() {
        supportActionBar?.title = repo?.name
        Picasso.get().load(repo?.owner?.avatarUrl).into(profilePic)
        repoTitle.text = repo?.name
        repoDescription.text = repo?.fullName
        repoFullDescription.text = repo?.description
        repoWatchers.text = String.format("%,d", repo?.watchers)
        repoStars.text = String.format("%,d", repo?.stargazersCount)
        repoForks.text = String.format("%,d", repo?.forksCount)
        repoOpenIssues.text =  String.format("%,d", repo?.openIssues)
        repoLanguage.text = repo?.language
    }


    /**
     * Github button click event
     * @param view
     */
    fun btnOnGithubClicked(view: View){
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(repo?.htmlUrl))
        startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
