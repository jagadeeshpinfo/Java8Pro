package com.sorting;

import java.util.Comparator;

public class ShortByTitle implements Comparator<Song>{

	@Override
	public int compare(Song songTitel, Song songTitle2) {
		
		
		
		return songTitel.getTitle().compareTo(songTitle2.getTitle());
	}

}
