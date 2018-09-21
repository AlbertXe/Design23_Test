package o_state.example4;

import java.util.HashMap;
import java.util.Map;

public class VoteManager {
	
	private Map<String, VoteState> mapState = new HashMap<>();
	
	private Map<String, String> mapVote = new HashMap<>();
	
	private Map<String ,Integer> mapVoteCount = new HashMap<>();

	public Map<String, VoteState> getMapState() {
		return mapState;
	}

	public Map<String, String> getMapVote() {
		return mapVote;
	}

	public Map<String, Integer> getMapVoteCount() {
		return mapVoteCount;
	}
	
	public void vote(String user,String voteItem) {
		//1：先为该用户增加投票的次数
		Integer count = mapVoteCount.get(user);
		if (count == null) {
			count = 0;
		}
		count +=1;
		mapVoteCount.put(user, count);
		
		//2：获取该用户的投票状态
		VoteState voteState = mapState.get(user);
		if (voteState == null) {
			voteState = new NormalVoteState();
		}
		
		voteState.vote(user, voteItem, this);
	}
}
