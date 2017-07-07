package com.rest.resource;

import com.rest.dataobjects.Member;
import com.rest.model.MemberDAO;

public class MemberResource {
	public static void main(String[] args) {
		Member mem = MemberDAO.getMembers();
		System.err.println(mem);
	}
}
