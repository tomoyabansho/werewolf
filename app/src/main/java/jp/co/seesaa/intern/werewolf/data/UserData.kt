package jp.co.seesaa.intern.werewolf.data

import java.io.Serializable

data class UserData(val id: String, var name: String, var battles: Int, var wins: Int, var loses: Int) : Serializable