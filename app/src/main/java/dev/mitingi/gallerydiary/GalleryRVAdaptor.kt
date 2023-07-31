package dev.mitingi.gallerydiary

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.squareup.picasso.Picasso
import dev.mitingi.gallerydiary.databinding.ImagelistBinding

class GalleryRVAdaptor ( var imagelist:List<ImageData>): RecyclerView.Adapter<ImageViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        var binding=ImagelistBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  ImageViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        var images=imagelist[position]
        var binding=holder.binding
        binding.ivimage.toString()
        Picasso.get()
            .load(images.avatar)
            .resize(500,500)
            .into(binding.ivimage)

    }

    override fun getItemCount(): Int {
 return imagelist.size
    }
}
class ImageViewHolder(var binding:ImagelistBinding):ViewHolder(binding.root){}

