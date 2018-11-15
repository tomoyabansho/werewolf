package jp.co.seesaa.intern.werewolf.view.game

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import jp.co.seesaa.intern.werewolf.R
import jp.co.seesaa.intern.werewolf.data.RoomData
import kotlinx.android.synthetic.main.item_room_list.view.*
import timber.log.Timber

class RoomListAdapter(context: Context, private val array: List<RoomData>)
    : RecyclerView.Adapter<RoomListAdapter.RoomListViewHolder>() {

    val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoomListViewHolder {
        return RoomListViewHolder(inflater.inflate(R.layout.item_room_list, parent, false))
    }

    override fun getItemCount(): Int {
        return array.size
    }

    override fun onBindViewHolder(holder: RoomListViewHolder, position: Int) {
        if (array.size > position) {
            Timber.d(array[position].name)
            holder.textView.text = array[position].name
        }
    }

    class RoomListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.room_name
    }
}