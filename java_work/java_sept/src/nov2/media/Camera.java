package nov2.media;

public abstract class Camera {
    public abstract void takePhoto();
    public abstract void takeVideo();
    public abstract void selfie();
    public abstract void potrait();

    public void backCamera(){
        System.out.println("Can take photo using back camera");
    }
}
