package com.example.peliculas2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class MovieListFragment extends Fragment {

    private ListView listView;
    private List<Movie> movieList = new ArrayList<>();
    public MovieListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie_list, container, false);

        List<Movie> movies = getMovieData();

        movieList.addAll(movies);

        MovieListAdapter adapter = new MovieListAdapter(getActivity(), movieList);

        listView = view.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Movie selectedMovie = movieList.get(position);

                Intent intent = new Intent(getActivity(), MovieDetailActivity.class);

                intent.putExtra("movieTitle", selectedMovie.getTitle());
                intent.putExtra("movieYear", selectedMovie.getYear());
                startActivity(intent);
            }
        });

        return view;
    }

    private List<Movie> getMovieData() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(
                "Ace Golden Finger",
                2022,
                R.drawable.goldfinger,
                "A Astounding Epistle of a Database Administrator And a Explorer who must Find a Car in Ancient China",
                "Idioma 1",
                "Idioma original 1",
                2,
                4.99,
                120,
                12.99,
                "G",
                "Trailers, Deleted Scenes",
                "2022-01-01 12:00:00"
        ));

        movies.add(new Movie(
                "Otra Película",
                2023,
                R.drawable.goldfinger,
                "Sinopsis de Otra Película",
                "Idioma 2",
                "Idioma original 2",
                3,
                7.99,
                150,
                15.99,
                "PG-13",
                "Trailers, Escenas Eliminadas",
                "2023-02-15 15:30:00"
        ));

        movies.add(new Movie(	"	ADAPTATION HOLES	"	,	2006	,	R.drawable.		affariprejudice	,	"	A Astounding Reflection of a Lumberjack And a Car who must Sink a Lumberjack in A Baloon Factory	"	,	"	Idioma 2	"	,	"	Idioma original 2	"	,	7	,	2.99	,	50	,	18.99	,	"	NC-17	"	,	"	Trailers,Deleted Scenes	"	,	"	15/02/2006 05:03	"	));
        movies.add(new Movie(	"	AFFAIR PREJUDICE	"	,	2006	,	R.drawable.		africanegg	,	"	A Fanciful Documentary of a Frisbee And a Lumberjack who must Chase a Monkey in A Shark Tank	"	,	"	Idioma 2	"	,	"	Idioma original 2	"	,	5	,	2.99	,	117	,	26.99	,	"	G	"	,	"	Commentaries,Behind the Scenes	"	,	"	15/02/2006 05:03	"	));
        movies.add(new Movie(	"	AFRICAN EGG	"	,	2006	,	R.drawable.		agenttruman	,	"	A Fast-Paced Documentary of a Pastry Chef And a Dentist who must Pursue a Forensic Psychologist in The Gulf of Mexico	"	,	"	Idioma 2	"	,	"	Idioma original 2	"	,	6	,	2.99	,	130	,	22.99	,	"	G	"	,	"	Deleted Scenes	"	,	"	15/02/2006 05:03	"	));
        movies.add(new Movie(	"	AGENT TRUMAN	"	,	2006	,	R.drawable.		airportollock	,	"	A Intrepid Panorama of a Robot And a Boy who must Escape a Sumo Wrestler in Ancient China	"	,	"	Idioma 2	"	,	"	Idioma original 2	"	,	3	,	2.99	,	169	,	17.99	,	"	PG	"	,	"	Deleted Scenes	"	,	"	15/02/2006 05:03	"	));
        movies.add(new Movie(	"	AIRPLANE SIERRA	"	,	2006	,	R.drawable.		alabamadevil	,	"	A Touching Saga of a Hunter And a Butler who must Discover a Butler in A Jet Boat	"	,	"	Idioma 2	"	,	"	Idioma original 2	"	,	6	,	4.99	,	62	,	28.99	,	"	PG-13	"	,	"	Trailers,Deleted Scenes	"	,	"	15/02/2006 05:03	"	));
        movies.add(new Movie(	"	AIRPORT POLLOCK	"	,	2006	,	R.drawable.		aladincalendar,	"	A Epic Tale of a Moose And a Girl who must Confront a Monkey in Ancient India	"	,	"	Idioma 2	"	,	"	Idioma original 2	"	,	6	,	4.99	,	54	,	15.99	,	"	R	"	,	"	Trailers	"	,	"	15/02/2006 05:03	"	));
        movies.add(new Movie(	"	ALABAMA DEVIL	"	,	2006	,	R.drawable.		goldfinger,	"	A Thoughtful Panorama of a Database Administrator And a Mad Scientist who must Outgun a Mad Scientist in A Jet Boat	"	,	"	Idioma 2	"	,	"	Idioma original 2	"	,	3	,	2.99	,	114	,	21.99	,	"	PG-13	"	,	"	Trailers,Deleted Scenes	"	,	"	15/02/2006 05:03	"	));
        movies.add(new Movie(	"	ALADDIN CALENDAR	"	,	2006	,	R.drawable.		americancircus	,	"	A Action-Packed Tale of a Man And a Lumberjack who must Reach a Feminist in Ancient China	"	,	"	Idioma 2	"	,	"	Idioma original 2	"	,	6	,	4.99	,	63	,	24.99	,	"	NC-17	"	,	"	Trailers,Deleted Scenes	"	,	"	15/02/2006 05:03	"	));
        movies.add(new Movie(	"	ALAMO VIDEOTAPE	"	,	2006	,	R.drawable.		ameliehellfinger	,	"	A Boring Epistle of a Butler And a Cat who must Fight a Pastry Chef in A MySQL Convention	"	,	"	Idioma 2	"	,	"	Idioma original 2	"	,	6	,	0.99	,	126	,	16.99	,	"	G	"	,	"	Commentaries,Behind the Scenes	"	,	"	15/02/2006 05:03	"	));
        movies.add(new Movie(	"	ALASKA PHANTOM	"	,	2006	,	R.drawable.		amadeusholly	,	"	A Fanciful Saga of a Hunter And a Pastry Chef who must Vanquish a Boy in Australia	"	,	"	Idioma 2	"	,	"	Idioma original 2	"	,	6	,	0.99	,	136	,	22.99	,	"	PG	"	,	"	Commentaries,Deleted Scenes	"	,	"	15/02/2006 05:03	"	));
        movies.add(new Movie(	"	ALI FOREVER	"	,	2006	,	R.drawable.		altervictory,	"	A Action-Packed Drama of a Dentist And a Crocodile who must Battle a Feminist in The Canadian Rockies	"	,	"	Idioma 2	"	,	"	Idioma original 2	"	,	4	,	4.99	,	150	,	21.99	,	"	PG	"	,	"	Deleted Scenes,Behind the Scenes	"	,	"	15/02/2006 05:03	"	));
        movies.add(new Movie(	"	ALICE FANTASIA	"	,	2006	,	R.drawable.		alleyevolution	,	"	A Emotional Drama of a A Shark And a Database Administrator who must Vanquish a Pioneer in Soviet Georgia	"	,	"	Idioma 2	"	,	"	Idioma original 2	"	,	6	,	0.99	,	94	,	23.99	,	"	NC-17	"	,	"	Trailers,Deleted Scenes,Behind the Scenes	"	,	"	15/02/2006 05:03	"	));
        movies.add(new Movie(	"	ALIEN CENTER	"	,	2006	,	R.drawable.		alonetrip,	"	A Brilliant Drama of a Cat And a Mad Scientist who must Battle a Feminist in A MySQL Convention	"	,	"	Idioma 2	"	,	"	Idioma original 2	"	,	5	,	2.99	,	46	,	10.99	,	"	NC-17	"	,	"	Trailers,Commentaries,Behind the Scenes	"	,	"	15/02/2006 05:03	"	));
        movies.add(new Movie(	"	ALLEY EVOLUTION	"	,	2006	,	R.drawable.		aliforever	,	"	A Fast-Paced Drama of a Robot And a Composer who must Battle a Astronaut in New Orleans	"	,	"	Idioma 2	"	,	"	Idioma original 2	"	,	6	,	2.99	,	180	,	23.99	,	"	NC-17	"	,	"	Trailers,Commentaries	"	,	"	15/02/2006 05:03	"	));
        movies.add(new Movie(	"	ALONE TRIP	"	,	2006	,	R.drawable.		alicenter	,	"	A Fast-Paced Character Study of a Composer And a Dog who must Outgun a Boat in An Abandoned Fun House	"	,	"	Idioma 2	"	,	"	Idioma original 2	"	,	3	,	0.99	,	82	,	14.99	,	"	R	"	,	"	Trailers,Behind the Scenes	"	,	"	15/02/2006 05:03	"	));
        movies.add(new Movie(	"	ALTER VICTORY	"	,	2006	,	R.drawable.		alicefantasi	,	"	A Thoughtful Drama of a Composer And a Feminist who must Meet a Secret Agent in The Canadian Rockies	"	,	"	Idioma 2	"	,	"	Idioma original 2	"	,	6	,	0.99	,	57	,	27.99	,	"	PG-13	"	,	"	Trailers,Behind the Scenes	"	,	"	15/02/2006 05:03	"	));
        movies.add(new Movie(	"	AMADEUS HOLY	"	,	2006	,	R.drawable.		alaskaphantom	,	"	A Emotional Display of a Pioneer And a Technical Writer who must Battle a Man in A Baloon	"	,	"	Idioma 2	"	,	"	Idioma original 2	"	,	6	,	0.99	,	113	,	20.99	,	"	PG	"	,	"	Commentaries,Deleted Scenes,Behind the Scenes	"	,	"	15/02/2006 05:03	"	));
        movies.add(new Movie(	"	AMELIE HELLFIGHTERS	"	,	2006	,	R.drawable.		alamovitape	,	"	A Boring Drama of a Woman And a Squirrel who must Conquer a Student in A Baloon	"	,	"	Idioma 2	"	,	"	Idioma original 2	"	,	4	,	4.99	,	79	,	23.99	,	"	R	"	,	"	Commentaries,Deleted Scenes,Behind the Scenes	"	,	"	15/02/2006 05:03	"	));
        movies.add(new Movie(	"	AMERICAN CIRCUS	"	,	2006	,	R.drawable.		alaskaphantom	,	"	A Insightful Drama of a Girl And a Astronaut who must Face a Database Administrator in A Shark Tank	"	,	"	Idioma 2	"	,	"	Idioma original 2	"	,	3	,	4.99	,	129	,	17.99	,	"	R	"	,	"	Commentaries,Behind the Scenes	"	,	"	15/02/2006 05:03	"	));
        movies.add(new Movie(	"	AMISTAD MIDSUMMER	"	,	2006	,	R.drawable.		alamovitape	,	"	A Emotional Character Study of a Dentist And a Crocodile who must Meet a Sumo Wrestler in California	"	,	"	Idioma 2	"	,	"	Idioma original 2	"	,	6	,	2.99	,	85	,	17.99	,	"	G	"	,	"	Commentaries,Behind the Scenes	"	,	"	15/02/2006 05:03	"	));


        return movies;
    }
}


