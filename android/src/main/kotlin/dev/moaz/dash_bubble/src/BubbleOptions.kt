package dev.moaz.dash_bubble.src

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/** BubbleOptions is the class that contains the options for the bubble.
 * @param notificationTitle The title of the notification that will be shown when the bubble is running.
 * @param notificationText The text of the notification that will be shown when the bubble is running.
 * @param notificationIcon The icon of the notification that will be shown when the bubble is running.
 * @param bubbleIcon The icon of the bubble.
 * @param closeIcon The icon of the close button.
 * @param startLocationX The x coordinate of the bubble.
 * @param startLocationY The y coordinate of the bubble.
 * @param bubbleSize The size of the bubble.
 * @param enableClose Whether the bubble can be closed or not.
 * @param enableAnimateToEdge Whether the bubble can be animated to the edge or not.
 * @param enableBottomShadow Whether the bubble has a bottom shadow behind the close button or not.
 * @param keepAliveWhenAppExit Whether the bubble will be kept alive when the app is closed or not.
 */
@Parcelize
data class BubbleOptions(
    val notificationTitle: String?,
    val notificationText: String?,
    val notificationIcon: String?,
    val bubbleIcon: String?,
    val closeIcon: String?,
    val startLocationX: Int?,
    val startLocationY: Int?,
    val bubbleSize: Int?,
    val enableClose: Boolean?,
    val enableAnimateToEdge: Boolean?,
    val enableBottomShadow: Boolean?,
    val keepAliveWhenAppExit: Boolean?
) : Parcelable
