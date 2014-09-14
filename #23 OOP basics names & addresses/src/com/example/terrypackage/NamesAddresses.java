package com.example.terrypackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class NamesAddresses {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Person terry = new Person("terry", "Astoria, NY");
		// System.out.println(terry.name + "\t" + terry.address);

		String content = readFromTextFile("C:\\Users\\burea1124\\JavaInputFiles\\namesaddresses.txt");
		// read all the text content, store it in a string

		// create a String array and chop up the string delimited by new lines,
		// will make 4 ~ 5 elements (a name-address pair)
		String[] split_by_newlines = array_creator(content);

		// loop through each element, and chop up each name-address pair into
		// another array
		// inside the same loop, make a Person object with the name and address
		// you just extracted
		// Put the Person inside a Person array

		Person[] peopleArray = new Person[5];
		for (int i = 0; i < split_by_newlines.length; i++) {
			String[] split_by_comma = split_by_newlines[i].split(", ");
			Person person = new Person(split_by_comma[0], split_by_comma[1]);
			System.out.println(peopleArray.length);
			peopleArray[i] = person;
		}

		System.out.println(Arrays.toString(peopleArray));
		System.out.println(peopleArray[0].name);
		
	}

	static String readFromTextFile(String path) throws IOException {
		String content = new String(Files.readAllBytes(Paths.get(path)));
		return content;
	}

	static String[] array_creator(String string) {

		// delimit the string by the comma
		// make an array

		String[] string_split_array = string.split("[\\r\\n]+");

		 for (int i=0; i < string_split_array.length; i++) {
		 System.out.println(string_split_array[i]);
		 }

		return string_split_array;
	}
}
