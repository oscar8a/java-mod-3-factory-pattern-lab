public class Photographer {

    private Camera camera;
    private String name;

    public Photographer() {
        // Instantiate Photographer with a Nikon Camera
        this.camera = CameraFactory.makeCamera(CameraFactory.CameraManufacturer.NIKON_FILM);
        this.name = "Photographer with Nikon Camera";
    }

    public void takePhotograph() {
        Logger.getInstance().log(this.name + " is about to take a Photograph");
        this.camera.takePhotograph(0.5);
    }
}
