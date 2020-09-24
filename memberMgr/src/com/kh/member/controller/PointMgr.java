package com.kh.member.controller;

import com.kh.member.vo.Grade;

/*
 * 회원정보 입력 (한명씩 입력)
회원정보 출력 (전체출력)
* 회원정보 검색 (한명 정보 검색 및 출력)
회원정보 수정 (검색)
회원정보 삭제 (특정 대상 삭제)
* 회원정보 전체삭제
 */

public interface PointMgr {
	public void memberInsertData();
	public void memberModifyData();
	public void memberAllPrintData();
	public void memberDeleteData();
	public int searchMember(String name);
}





