package adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bantumakers.kiandamuzik.R;

import models.PopularTrackList;

/**
 * Created by Bantu Makers on 18/12/2017.
 */

public class PopularrTracksAdapter extends RecyclerView.Adapter<PopularrTracksAdapter.ViewHolder>  {
    private Context context;
    private PopularTrackList populTrackarList;

    public PopularrTracksAdapter(Context context, PopularTrackList populTrackarList) {
        this.context = context;
        this.populTrackarList = populTrackarList;

    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView mTrackCover;
        public TextView mArtistName;
        public TextView mTrackName;
        public ImageView mArtistVerifiedBadge;
        public ImageView mTrackDetails;
        public ViewHolder(View itemView){
            super(itemView);
            mTrackCover = itemView.findViewById(R.id.trackCover);
            mTrackDetails = itemView.findViewById(R.id.trackDetails);
            mTrackName = itemView.findViewById(R.id.trackName);
            mArtistVerifiedBadge = itemView.findViewById(R.id.verifiedAccount);
            mArtistName = itemView.findViewById(R.id.artistName);
        }

    }

    @Override
    public PopularrTracksAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        PopularrTracksAdapter.ViewHolder holder = new PopularrTracksAdapter.ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(PopularrTracksAdapter.ViewHolder holder, int position) {
        holder.mArtistName.setText(populTrackarList.getPopularArtistTrack().get(position).getArtist().getName());
        holder.mTrackName.setText(populTrackarList.getPopularArtistTrack().get(position).getaName());
        holder.mTrackCover.setImageResource(populTrackarList.getPopularArtistTrack().get(position).getTrackCover());
        if (populTrackarList.getPopularArtistTrack().get(position).getArtist().isVerified()){
            holder.mArtistVerifiedBadge.setImageResource(R.drawable.ic_verified_user_black_18dp);

        }else  {

        }
    }

    @Override
    public int getItemCount() {
        return populTrackarList.getPopularArtistTrack().size();
    }





}
