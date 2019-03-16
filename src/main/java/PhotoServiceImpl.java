import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2019/3/10.
 */
@Service("photoService")
public class PhotoServiceImpl implements PhotoService {
    @Autowired
    PhotoDao photoDao;
    @Override
    public Photo getPhoto(Long photoId)throws Exception{
        return photoDao.getPhoto(photoId);
    }
 @Override
    public List<Photo> listPhoto(Long userId)throws Exception{
        return photoDao.listPhoto(userId);
 }
 @Override
    public void insertPhoto(Photo photo)throws  Exception{

 }
}
