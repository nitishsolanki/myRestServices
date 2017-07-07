package com.rest.model;

import java.util.ArrayList;
import java.util.List;

import com.rest.dataobjects.Account;
import com.rest.dataobjects.Member;

public class MemberDAO {
	// Connect to DB
	public static Member getMembers() {
		Member mem1 = new Member("Nitish", 30);
		Account acct1 = new Account("11111", "BofaChk", mem1.getName());
		Account acct2 = new Account("22222", "Discovercrd", mem1.getName());
		List<Account> accounts = new ArrayList<>();
		accounts.add(acct2);
		accounts.add(acct1);
		mem1.setAccounts(accounts);
		return mem1;
	}

}
