package javaInterviewQuestions;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/*
Refactor the AlertService and MapAlertDAO classes:
Create a new package-private interface, named AlertDAO, that contains the same methods as MapAlertDAO.
MapAlertDAO should implement the AlertDAo interface.
AlertService should have a public constructor that accepts AlertDAO.
The raiseAlert and getAlertTime methods should use the object passed through the constructor.
 */
interface AlertDAO {
    UUID addAlert(Date time);
    Date getAlert(UUID id);
}

class AlertService {
    private final AlertDAO storage;

    public AlertService(AlertDAO alertDAO) {
        this.storage = alertDAO;
    }

    public UUID raiseAlert() {
        return this.storage.addAlert(new Date());
    }

    public Date getAlertTime(UUID id) {
        return this.storage.getAlert(id);
    }
}

class MapAlertDAO implements AlertDAO {
    private final Map<UUID, Date> alerts = new HashMap<>();

    @Override
    public UUID addAlert(Date time) {
        UUID id = UUID.randomUUID();
        this.alerts.put(id, time);
        return id;
    }

    @Override
    public Date getAlert(UUID id) {
        return this.alerts.get(id);
    }
}
class Main {
    public static void main(String[] args) {
        // Creating an instance of MapAlertDAO
        AlertDAO mapAlertDAO = new MapAlertDAO();

        // Creating an instance of AlertService with MapAlertDAO
        AlertService alertService = new AlertService(mapAlertDAO);

        // Raising an alert and getting its time
        UUID alertId = alertService.raiseAlert();
        Date alertTime = alertService.getAlertTime(alertId);

        // Printing the result
        System.out.println("Alert raised with ID: " + alertId);
        System.out.println("Alert time: " + alertTime);
    }
}