import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import  javax.servlet.http.HttpServletResponse;

/**
 * Created by admin on 2019/3/10.
 */
@Controller
public class PhotoController {
    @Autowired
    PhotoService photoService;

    @RequestMapping(value = "/photo/{photoId}")
    @ResponseBody
    public String photoDetail(@PathVariable Long photoId,
                              HttpServletRequest request, HttpServletResponse response) throws Exception {
        Photo photo = photoService.getPhoto(photoId);
        return photo.getPhotoName();
    }
}
