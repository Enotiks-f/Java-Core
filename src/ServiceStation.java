public class ServiceStation {
    public void check(Serviceable vehicle) {
        if (vehicle != null) {
            vehicle.service();
        }
    }
}
