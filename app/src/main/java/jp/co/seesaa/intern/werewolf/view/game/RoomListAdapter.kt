package jp.co.seesaa.intern.werewolf.view.game

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import jp.co.seesaa.intern.werewolf.R
import jp.co.seesaa.intern.werewolf.model.game.SelectRoomFragmentModel
import kotlinx.android.synthetic.main.item_room_list.view.*

class RoomListAdapter(private val context: Context, private val model: SelectRoomFragmentModel)
    : RecyclerView.Adapter<RoomListAdapter.RoomListViewHolder>() {

    val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoomListViewHolder {
        return RoomListViewHolder(inflater.inflate(R.layout.item_room_list, parent, false))
    }

    override fun getItemCount(): Int {
        return model.roomDatas.value?.size ?: 0
    }

    override fun onBindViewHolder(holder: RoomListViewHolder, position: Int) {
        val data = model.roomDatas.value ?: return
        if (data.size > position) {
            holder.textView.text = data[position].name
        }
    }

    class RoomListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.room_name
    }
}