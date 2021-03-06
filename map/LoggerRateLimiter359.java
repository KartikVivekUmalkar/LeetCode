package com.leetcode.map;

//
//Design a logger system that receive stream of messages along with its timestamps, each message should be printed if and only if it is not printed in the last 10 seconds.
//
//Given a message and a timestamp (in seconds granularity), return true if the message should be printed in the given timestamp, otherwise returns false.
//
//It is possible that several messages arrive roughly at the same time.
import java.util.HashMap;

public class LoggerRateLimiter359 {
	HashMap<String, Integer> map;

	/** Initialize your data structure here. */
	public LoggerRateLimiter359() {
		map = new HashMap<>();
	}

	/**
	 * Returns true if the message should be printed in the given timestamp,
	 * otherwise returns false. If this method returns false, the message will not
	 * be printed. The timestamp is in seconds granularity.
	 */
	public boolean shouldPrintMessage(int timestamp, String message) {
		if (map.containsKey(message)) {
			if (timestamp - map.get(message) < 10) {
				return false;
			} else {
				map.put(message, timestamp);
				return true;
			}
		}
		map.put(message, timestamp);
		return true;
	}

}
