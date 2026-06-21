package com.example.volumecontrol

import android.content.Context
import android.media.AudioManager
import android.service.quicksettings.Tile
import android.service.quicksettings.TileService

class VolumeUpTileService : TileService() {

    override fun onStartListening() {
        super.onStartListening()
        qsTile.state = Tile.STATE_ACTIVE
        qsTile.updateTile()
    }

    override fun onClick() {
        super.onClick()
        val audioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
        audioManager.adjustStreamVolume(
            AudioManager.STREAM_RING,
            AudioManager.ADJUST_RAISE,
            AudioManager.FLAG_SHOW_UI
        )
    }
}
