package com.sorting;

import java.util.Comparator;

public class shotByArtist implements Comparator<Song>{

	@Override
	public int compare(Song o1, Song o2) {
		// TODO Auto-generated method stub
		return o1.getArtist().compareTo(o2.getArtist());
	}

}
