package demo.com.androidapp.data.models

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Model class for Item
 * @author bhagirath
 */
class Item() : Parcelable{
    @SerializedName("id")
    @Expose
    var id: Int = 0
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("full_name")
    @Expose
    var fullName: String? = null
    @SerializedName("owner")
    @Expose
    var owner: Owner? = null
    @SerializedName("private")
    @Expose
    var isPrivate: Boolean = false
    @SerializedName("html_url")
    @Expose
    var htmlUrl: String? = null
    @SerializedName("description")
    @Expose
    var description: String? = null
    @SerializedName("fork")
    @Expose
    var isFork: Boolean = false
    @SerializedName("url")
    @Expose
    var url: String? = null
    @SerializedName("forks_url")
    @Expose
    var forksUrl: String? = null
    @SerializedName("keys_url")
    @Expose
    var keysUrl: String? = null
    @SerializedName("collaborators_url")
    @Expose
    var collaboratorsUrl: String? = null
    @SerializedName("teams_url")
    @Expose
    var teamsUrl: String? = null
    @SerializedName("hooks_url")
    @Expose
    var hooksUrl: String? = null
    @SerializedName("issue_events_url")
    @Expose
    var issueEventsUrl: String? = null
    @SerializedName("events_url")
    @Expose
    var eventsUrl: String? = null
    @SerializedName("assignees_url")
    @Expose
    var assigneesUrl: String? = null
    @SerializedName("branches_url")
    @Expose
    var branchesUrl: String? = null
    @SerializedName("tags_url")
    @Expose
    var tagsUrl: String? = null
    @SerializedName("blobs_url")
    @Expose
    var blobsUrl: String? = null
    @SerializedName("git_tags_url")
    @Expose
    var gitTagsUrl: String? = null
    @SerializedName("git_refs_url")
    @Expose
    var gitRefsUrl: String? = null
    @SerializedName("trees_url")
    @Expose
    var treesUrl: String? = null
    @SerializedName("statuses_url")
    @Expose
    var statusesUrl: String? = null
    @SerializedName("languages_url")
    @Expose
    var languagesUrl: String? = null
    @SerializedName("stargazers_url")
    @Expose
    var stargazersUrl: String? = null
    @SerializedName("contributors_url")
    @Expose
    var contributorsUrl: String? = null
    @SerializedName("subscribers_url")
    @Expose
    var subscribersUrl: String? = null
    @SerializedName("subscription_url")
    @Expose
    var subscriptionUrl: String? = null
    @SerializedName("commits_url")
    @Expose
    var commitsUrl: String? = null
    @SerializedName("git_commits_url")
    @Expose
    var gitCommitsUrl: String? = null
    @SerializedName("comments_url")
    @Expose
    var commentsUrl: String? = null
    @SerializedName("issue_comment_url")
    @Expose
    var issueCommentUrl: String? = null
    @SerializedName("contents_url")
    @Expose
    var contentsUrl: String? = null
    @SerializedName("compare_url")
    @Expose
    var compareUrl: String? = null
    @SerializedName("merges_url")
    @Expose
    var mergesUrl: String? = null
    @SerializedName("archive_url")
    @Expose
    var archiveUrl: String? = null
    @SerializedName("downloads_url")
    @Expose
    var downloadsUrl: String? = null
    @SerializedName("issues_url")
    @Expose
    var issuesUrl: String? = null
    @SerializedName("pulls_url")
    @Expose
    var pullsUrl: String? = null
    @SerializedName("milestones_url")
    @Expose
    var milestonesUrl: String? = null
    @SerializedName("notifications_url")
    @Expose
    var notificationsUrl: String? = null
    @SerializedName("labels_url")
    @Expose
    var labelsUrl: String? = null
    @SerializedName("releases_url")
    @Expose
    var releasesUrl: String? = null
    @SerializedName("deployments_url")
    @Expose
    var deploymentsUrl: String? = null
    @SerializedName("created_at")
    @Expose
    var createdAt: String? = null
    @SerializedName("updated_at")
    @Expose
    var updatedAt: String? = null
    @SerializedName("pushed_at")
    @Expose
    var pushedAt: String? = null
    @SerializedName("git_url")
    @Expose
    var gitUrl: String? = null
    @SerializedName("ssh_url")
    @Expose
    var sshUrl: String? = null
    @SerializedName("clone_url")
    @Expose
    var cloneUrl: String? = null
    @SerializedName("svn_url")
    @Expose
    var svnUrl: String? = null
    @SerializedName("homepage")
    @Expose
    var homepage: String? = null
    @SerializedName("size")
    @Expose
    var size: Int = 0
    @SerializedName("stargazers_count")
    @Expose
    var stargazersCount: Int = 0
    @SerializedName("watchers_count")
    @Expose
    var watchersCount: Int = 0
    @SerializedName("language")
    @Expose
    var language: String? = null
    @SerializedName("has_issues")
    @Expose
    var isHasIssues: Boolean = false
    @SerializedName("has_projects")
    @Expose
    var isHasProjects: Boolean = false
    @SerializedName("has_downloads")
    @Expose
    var isHasDownloads: Boolean = false
    @SerializedName("has_wiki")
    @Expose
    var isHasWiki: Boolean = false
    @SerializedName("has_pages")
    @Expose
    var isHasPages: Boolean = false
    @SerializedName("forks_count")
    @Expose
    var forksCount: Int = 0
    @SerializedName("mirror_url")
    @Expose
    var mirrorUrl: Any? = null
    @SerializedName("archived")
    @Expose
    var isArchived: Boolean = false
    @SerializedName("open_issues_count")
    @Expose
    var openIssuesCount: Int = 0
    @SerializedName("license")
    @Expose
    var license: License? = null
    @SerializedName("forks")
    @Expose
    var forks: Int = 0
    @SerializedName("open_issues")
    @Expose
    var openIssues: Int = 0
    @SerializedName("watchers")
    @Expose
    var watchers: Int = 0
    @SerializedName("default_branch")
    @Expose
    var defaultBranch: String? = null
    @SerializedName("score")
    @Expose
    var score: Float = 0.toFloat()

    constructor(parcel: Parcel) : this() {
        id = parcel.readInt()
        name = parcel.readString()
        fullName = parcel.readString()
        isPrivate = parcel.readByte() != 0.toByte()
        htmlUrl = parcel.readString()
        description = parcel.readString()
        isFork = parcel.readByte() != 0.toByte()
        url = parcel.readString()
        forksUrl = parcel.readString()
        keysUrl = parcel.readString()
        collaboratorsUrl = parcel.readString()
        teamsUrl = parcel.readString()
        hooksUrl = parcel.readString()
        issueEventsUrl = parcel.readString()
        eventsUrl = parcel.readString()
        assigneesUrl = parcel.readString()
        branchesUrl = parcel.readString()
        tagsUrl = parcel.readString()
        blobsUrl = parcel.readString()
        gitTagsUrl = parcel.readString()
        gitRefsUrl = parcel.readString()
        treesUrl = parcel.readString()
        statusesUrl = parcel.readString()
        languagesUrl = parcel.readString()
        stargazersUrl = parcel.readString()
        contributorsUrl = parcel.readString()
        subscribersUrl = parcel.readString()
        subscriptionUrl = parcel.readString()
        commitsUrl = parcel.readString()
        gitCommitsUrl = parcel.readString()
        commentsUrl = parcel.readString()
        issueCommentUrl = parcel.readString()
        contentsUrl = parcel.readString()
        compareUrl = parcel.readString()
        mergesUrl = parcel.readString()
        archiveUrl = parcel.readString()
        downloadsUrl = parcel.readString()
        issuesUrl = parcel.readString()
        pullsUrl = parcel.readString()
        milestonesUrl = parcel.readString()
        notificationsUrl = parcel.readString()
        labelsUrl = parcel.readString()
        releasesUrl = parcel.readString()
        deploymentsUrl = parcel.readString()
        createdAt = parcel.readString()
        updatedAt = parcel.readString()
        pushedAt = parcel.readString()
        gitUrl = parcel.readString()
        sshUrl = parcel.readString()
        cloneUrl = parcel.readString()
        svnUrl = parcel.readString()
        homepage = parcel.readString()
        size = parcel.readInt()
        stargazersCount = parcel.readInt()
        watchersCount = parcel.readInt()
        language = parcel.readString()
        isHasIssues = parcel.readByte() != 0.toByte()
        isHasProjects = parcel.readByte() != 0.toByte()
        isHasDownloads = parcel.readByte() != 0.toByte()
        isHasWiki = parcel.readByte() != 0.toByte()
        isHasPages = parcel.readByte() != 0.toByte()
        forksCount = parcel.readInt()
        isArchived = parcel.readByte() != 0.toByte()
        openIssuesCount = parcel.readInt()
        forks = parcel.readInt()
        openIssues = parcel.readInt()
        watchers = parcel.readInt()
        defaultBranch = parcel.readString()
        score = parcel.readFloat()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(name)
        parcel.writeString(fullName)
        parcel.writeByte(if (isPrivate) 1 else 0)
        parcel.writeString(htmlUrl)
        parcel.writeString(description)
        parcel.writeByte(if (isFork) 1 else 0)
        parcel.writeString(url)
        parcel.writeString(forksUrl)
        parcel.writeString(keysUrl)
        parcel.writeString(collaboratorsUrl)
        parcel.writeString(teamsUrl)
        parcel.writeString(hooksUrl)
        parcel.writeString(issueEventsUrl)
        parcel.writeString(eventsUrl)
        parcel.writeString(assigneesUrl)
        parcel.writeString(branchesUrl)
        parcel.writeString(tagsUrl)
        parcel.writeString(blobsUrl)
        parcel.writeString(gitTagsUrl)
        parcel.writeString(gitRefsUrl)
        parcel.writeString(treesUrl)
        parcel.writeString(statusesUrl)
        parcel.writeString(languagesUrl)
        parcel.writeString(stargazersUrl)
        parcel.writeString(contributorsUrl)
        parcel.writeString(subscribersUrl)
        parcel.writeString(subscriptionUrl)
        parcel.writeString(commitsUrl)
        parcel.writeString(gitCommitsUrl)
        parcel.writeString(commentsUrl)
        parcel.writeString(issueCommentUrl)
        parcel.writeString(contentsUrl)
        parcel.writeString(compareUrl)
        parcel.writeString(mergesUrl)
        parcel.writeString(archiveUrl)
        parcel.writeString(downloadsUrl)
        parcel.writeString(issuesUrl)
        parcel.writeString(pullsUrl)
        parcel.writeString(milestonesUrl)
        parcel.writeString(notificationsUrl)
        parcel.writeString(labelsUrl)
        parcel.writeString(releasesUrl)
        parcel.writeString(deploymentsUrl)
        parcel.writeString(createdAt)
        parcel.writeString(updatedAt)
        parcel.writeString(pushedAt)
        parcel.writeString(gitUrl)
        parcel.writeString(sshUrl)
        parcel.writeString(cloneUrl)
        parcel.writeString(svnUrl)
        parcel.writeString(homepage)
        parcel.writeInt(size)
        parcel.writeInt(stargazersCount)
        parcel.writeInt(watchersCount)
        parcel.writeString(language)
        parcel.writeByte(if (isHasIssues) 1 else 0)
        parcel.writeByte(if (isHasProjects) 1 else 0)
        parcel.writeByte(if (isHasDownloads) 1 else 0)
        parcel.writeByte(if (isHasWiki) 1 else 0)
        parcel.writeByte(if (isHasPages) 1 else 0)
        parcel.writeInt(forksCount)
        parcel.writeByte(if (isArchived) 1 else 0)
        parcel.writeInt(openIssuesCount)
        parcel.writeInt(forks)
        parcel.writeInt(openIssues)
        parcel.writeInt(watchers)
        parcel.writeString(defaultBranch)
        parcel.writeFloat(score)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Item> {
        override fun createFromParcel(parcel: Parcel): Item {
            return Item(parcel)
        }

        override fun newArray(size: Int): Array<Item?> {
            return arrayOfNulls(size)
        }
    }
}
