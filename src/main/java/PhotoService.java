import java.util.List;

/**
 * Created by admin on 2019/3/10.
 */
public interface PhotoService {
    Photo getPhoto( Long photoId)throws Exception;
    List<Photo> listPhoto(Long uerId)throws Exception;
    void insertPhoto(Photo photo)throws  Exception;
}
