package com.singleton_pattern;

//SingleTon class
public class DBConn {

	
	private static DBConn instance = null;

	// Private constructor - to make only a single instance
	private DBConn() {

	}

	
	public static DBConn getInstance() {

		
		if (instance == null) {
			instance = new DBConn();
		}
		return instance;
	}

}
