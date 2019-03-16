/**
 * Created by admin on 2019/3/10.
 */
public class Photo {
    private Long photoId;
    private String photoName;
    private Long uerId;

    public void setPhotoId(Long photoId) {
        this.photoId = photoId;
    }

    public Long getPhotoId() {
        return photoId;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public Long getUerId() {
        return uerId;
    }

    public void setUerId(Long uerId) {
        this.uerId = uerId;
    }
}
