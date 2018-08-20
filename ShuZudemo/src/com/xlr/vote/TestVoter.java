package com.xlr.vote;
// 测试选民投票
public class TestVoter {
	public static void main(String[] args) {
		for (int i = 0; i < 102; i++) {
			Voter name = new Voter(String.valueOf(i));
			name.voteFor();
		}
		
		Voter.print();
	}
	
	
}
