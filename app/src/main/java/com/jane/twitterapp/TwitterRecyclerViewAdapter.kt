package com.jane.twitterapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterRecyclerViewAdapter(var TwitterList: List<Tweet>):RecyclerView.Adapter<TwitterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitterViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.twitter_list_item,parent,false)
        return  TwitterViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: TwitterViewHolder, position: Int) {
        var currentTwitter = TwitterList.get(position)
        holder.tvHandle.text = currentTwitter.Handle
        holder.tvName.text = currentTwitter.name
        holder.tvTweet.text = currentTwitter.Tweet
        holder.tvnum1.text = currentTwitter.tvnum1
        holder.tvnum2.text = currentTwitter.tvnum2
        holder.tvnum3.text = currentTwitter.tvnum3







    }

    override fun getItemCount(): Int {
        return TwitterList.size }

}





class TwitterViewHolder(itemView: View):
RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvHandle = itemView.findViewById<TextView>(R.id.tvHandle)
    var tvTweet = itemView.findViewById<TextView>(R.id.tvTweet)
    var tvnum1 = itemView.findViewById<TextView>(R.id.tvnum1)
    var tvnum2 = itemView.findViewById<TextView>(R.id.tvnum2)
    var tvnum3 = itemView.findViewById<TextView>(R.id.tvnum3)
//    var ivreply = itemView.findViewById<TextView>(R.id.ivreply)
//    var ivRetweet = itemView.findViewById<TextView>(R.id.ivRetweet)
//    var ivLikes = itemView.findViewById<TextView>(R.id.ivLikes)
//    var ivshare = itemView.findViewById<TextView>(R.id.ivshare)









}