package com.sorting;

import java.util.Objects;

public class Song implements Comparable<Song> {
private String title;
private String artist;
private int year;

public Song(String title, String artist, int year) {
	super();
	this.title = title;
	this.artist = artist;
	this.year = year;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getArtist() {
	return artist;
}

public void setArtist(String artist) {
	this.artist = artist;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

@Override
public String toString() {
	return "Song [title=" + title + ", artist=" + artist + ", year=" + year + "]";
}

@Override
public int hashCode() {
	return Objects.hash(artist, title, year);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Song other = (Song) obj;
	return Objects.equals(artist, other.artist) && Objects.equals(title, other.title) && year == other.year;
}
//based on title
@Override
public int compareTo(Song song) {
	// TODO Auto-generated method stub
	if(this.getYear()>song.getYear())
		return 1;
	else if(this.getYear()<song.getYear())
		return -1;
	else
		return -0;
}
}
