package com.rest.resource;

import com.rest.dataobjects.Member;

public class MemberResource {
	public static void main(String[] args) {
		Member mem = new Member("nitish", 30);
		System.err.println(mem.toString());
	}
}
