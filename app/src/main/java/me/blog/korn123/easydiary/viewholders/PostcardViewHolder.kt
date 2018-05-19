package me.blog.korn123.easydiary.viewholders

import android.app.Activity
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import me.blog.korn123.commons.utils.CommonUtils
import me.blog.korn123.easydiary.R
import java.io.File

/**
 * ViewHolder that represents a cat image.
 */
internal class PostcardViewHolder(itemView: View, val activity: Activity) : RecyclerView.ViewHolder(itemView) {

    private val imageView: ImageView = itemView.findViewById(R.id.imageview)

    internal fun bindTo(file: File) {
        val point =  CommonUtils.getDefaultDisplay(activity)
        val targetX = Math.floor((point.x - CommonUtils.dpToPixelFloatValue(imageView.context, 9)) / 2.0)
//        imageView.layoutParams.width = targetX.toInt()
        imageView.layoutParams.height = targetX.toInt()
//        //        imageView.setImageBitmap(BitmapUtils.decodeFileMaxWidthHeight(file.path, 500))
        Glide.with(imageView.context)
                .load(file)
//                .apply(RequestOptions().placeholder(R.drawable.ic_aaf_photos).fitCenter())
                .into(imageView)

//        val lp = imageView.layoutParams
//        if (lp is FlexboxLayoutManager.LayoutParams) {
//            lp.flexGrow = 1f
//        }
    }
}