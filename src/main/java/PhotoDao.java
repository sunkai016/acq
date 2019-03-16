import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by admin on 2019/3/10.
 */
@Mapper
public interface PhotoDao {
    Photo getPhoto(@Param("photoId") Long photoId)throws Exception;
    List<Photo> listPhoto(@Param("userId")Long uerId)throws Exception;
    void insertPhoto(@Param("photo")Photo photo)throws  Exception;
}
