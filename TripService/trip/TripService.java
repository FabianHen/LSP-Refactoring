package tripservice.trip;

import java.util.ArrayList;
import java.util.List;

import tripservice.exception.UserNotLoggedInException;
import tripservice.user.User;
import tripservice.user.UserSession;

public class TripService {

	public List<Trip> getTripsByUser(User user) throws UserNotLoggedInException {
		User loggedUser = getLoggedUser();
		if (loggedUser == null) {
			throw new UserNotLoggedInException();
		}
		boolean isFriend = isFriend(user, loggedUser);
		if (isFriend) {
			return findTripsByUser(user);
		}
		return new ArrayList<>();
	}

	private static boolean isFriend(User user, User loggedUser) {
		boolean isFriend = false;
		for (User friend : user.getFriends()) {
			if (friend.equals(loggedUser)) {
				isFriend = true;
				break;
			}
		}
		return isFriend;
	}

	protected  List<Trip> findTripsByUser(User user){
		return TripDAO.findTripsByUser(user);
	}

	protected User getLoggedUser() {
		return UserSession.getInstance().getLoggedUser();
	}
}
