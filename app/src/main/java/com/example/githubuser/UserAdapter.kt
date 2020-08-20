package com.example.githubuser

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_detail_user.*

class UserAdapter(private val context: Context,
    private val list : List<User>,
    private val listener : (User) -> Unit) : RecyclerView.Adapter<UserAdapter.viewHolder>() {

    class viewHolder(item : View) : RecyclerView.ViewHolder(item){
        val imgPhoto : ImageView = item.findViewById(R.id.img_photo)
        val tvFullName : TextView = item.findViewById(R.id.tv_fullName)
        val tvUserName : TextView = item.findViewById(R.id.tv_username)
        val repository : TextView = item.findViewById(R.id.detail_repository)
        val followers : TextView = item.findViewById(R.id.detail_followers)
        val following : TextView = item.findViewById(R.id.detail_following)

        fun bind(user: User, listener: (User) -> Unit){

            imgPhoto.setImageResource(user.avatar)
            tvFullName.text = user.name
            tvUserName.text = user.username
            repository.text = user.repository.toString()
            followers.text = user.followers.toString()
            following.text = user.following.toString()

            itemView.setOnClickListener {
                listener(user)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder =
        viewHolder(LayoutInflater.from(context).inflate(R.layout.item_list, parent, false))

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.bind(list[position],listener)
    }
}
