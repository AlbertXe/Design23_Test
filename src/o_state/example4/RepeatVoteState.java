package o_state.example4;

public class RepeatVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager manager) {
		System.out.println("请不要重复投票");
		Integer count = manager.getMapVoteCount().get(user);
		if (count>4) {
			manager.getMapState().put(user, new SpitVoteState());
		}
		
	}

}
