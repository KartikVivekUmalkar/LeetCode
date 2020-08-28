package com.leetcode.string;

import java.util.Arrays;

public class ReorderDataInLogFiles37 {
	public String[] reorderLogFiles(String[] logs) {

		Arrays.sort(logs, (element1, element2) -> {

			String[] arrayOfElement1 = element1.split(" ", 2);
			String[] arrayOfElement2 = element2.split(" ", 2);
			if (arrayOfElement1[0].equals(arrayOfElement2[0])) {

				return arrayOfElement1[1].compareTo(arrayOfElement2[1]);

			}
			if (arrayOfElement1[0].contains("let")) {
				return -1;
			} else {
				return 1;
			}
		});
		return logs;
	}
}
