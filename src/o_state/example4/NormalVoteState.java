package o_state.example4;

public class NormalVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager manager) {
		//正常 投票
		manager.getMapVote().put(user, voteItem);
		System.out.println("恭喜投票成功");
		
		manager.getMapState().put(user, new RepeatVoteState());
	}

}
