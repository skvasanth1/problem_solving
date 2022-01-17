package com.example;

import java.util.Set;
import java.util.stream.Collectors;

public class CommonSubString {
	public static String twoStrings(String s1, String s2) {
		Set<Character> set1 = s1.codePoints().parallel().mapToObj(obj -> (char) obj).collect(Collectors.toSet());
		Set<Character> set2 = s2.codePoints().parallel().mapToObj(obj -> (char) obj).collect(Collectors.toSet());
		int len1 = set1.size();
		set1.removeAll(set2);
		if (set1.size() != len1) {
			return "YES";
		}
		return "NO";
	}

	public static void main(String[] args) {
		System.out.println(twoStrings("and", "art"));
		System.out.println(twoStrings("hi", "world"));
	}
}
