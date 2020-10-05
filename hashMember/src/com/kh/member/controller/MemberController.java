package com.kh.member.controller;

import java.util.HashMap;

import com.kh.member.model.vo.Member;

public class MemberController {
	HashMap hm = new HashMap();

	public boolean insertMember(Member m) {

		hm.put(m.getId(), m);
		
		return true;
	}

	public boolean memberCheck(String id) {
		if (hm.containsKey(id)) {
			return false;
		} else {
			return true;
		}
	}
	
	public HashMap selectAll() {
		HashMap copyHm = hm;
		return copyHm;
	}
	
	public Member selectOne(String id) {
		Member m = (Member)hm.get(id);
		return m;
	}
}
