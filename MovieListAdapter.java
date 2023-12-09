package com.example.peliculas2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MovieListAdapter extends ArrayAdapter<Movie> {

    private Context context;
    private List<Movie> movieList;

    public MovieListAdapter(Context context, List<Movie> movies) {
        super(context, 0, movies);
        this.context = context;
        this.movieList = movies;
    }


    @Override
    public int getCount() {
        return movieList.size();
    }

    @Override
    public Movie getItem(int position) {
        return movieList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Movie movie = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.movie_list_item, parent, false);
        }

        TextView titleTextView = convertView.findViewById(R.id.titleTextView);
        TextView yearTextView = convertView.findViewById(R.id.yearTextView);
        ImageView imageView = convertView.findViewById(R.id.imageView);

        titleTextView.setText(movie.getTitle());
        yearTextView.setText(String.valueOf(movie.getYear()));
        imageView.setImageResource(movie.getImageResourceId());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MovieDetailActivity.class);

                intent.putExtra("movieTitle", movie.getTitle());
                intent.putExtra("movieYear", movie.getYear());
                intent.putExtra("movieDescription", movie.getDescription());
                intent.putExtra("movieLanguageId", movie.getLanguageId());

                getContext().startActivity(intent);
            }
        });

        return convertView;
    }
}

