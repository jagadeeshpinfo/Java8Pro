package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SongApp {
	public static void main(String[] args) {
		
		ArrayList<Song> al=new ArrayList<Song>();
		al.add(new Song("oo natava mama ohoo anta","Aluarjun",2022));
		al.add(new Song("kil kil kiladi","Raviteja",2020));
		al.add(new Song("bota bomam","Chiru",2021));
		al.add(new Song("akanda song","Balu",2025));
		// default it is  having compariable -compareto method
		
		System.out.println("before sorting");
		al.stream().forEach(s->System.out.println(s));

		System.out.println("After sorting based on year");
		Collections.sort(al);
		al.stream().forEach(s->System.out.println(s));

		// shorting based on title
		System.out.println("After sorting based on title");

		Collections.sort(al,new ShortByTitle());
		al.stream().forEach(s1->System.out.println(s1));

		System.out.println("After sorting based on Artoist");
		Collections.sort(al,new shotByArtist());
		al.stream().forEach(s2->System.out.println(s2));

	}
		
}
