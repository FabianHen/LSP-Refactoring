
import tripservice.trip.*;
import tripservice.user.*;

import java.util.ArrayList;
import java.util.List;

public class TestableTripService extends TripService {

    private User loggedUser;
    private List<Trip> tripsToReturn;

    public TestableTripService() {
        tripsToReturn = new ArrayList<>();
    }

    public TestableTripService(User loggedUser) {
        this.loggedUser = loggedUser;
        tripsToReturn = new ArrayList<>();
    }

    public TestableTripService(List<Trip> tripsToReturn) {
        this.tripsToReturn = tripsToReturn;
    }

    public TestableTripService(User loggedUser, List<Trip> tripsToReturn) {
        this.loggedUser = loggedUser;
        this.tripsToReturn = tripsToReturn;
    }

    public void setLoggedUser(User user) {
        this.loggedUser = user;
    }

    public void setTripsToReturn(List<Trip> trips) {
        this.tripsToReturn = trips;
    }

    public List<Trip> getTripsToReturn() {
        return tripsToReturn;
    }
    
    @Override
    protected User getLoggedUser() {
        return loggedUser;
    }

    @Override
    protected List<Trip> findTripsByUser(User user) {
        return tripsToReturn;
    }
}
