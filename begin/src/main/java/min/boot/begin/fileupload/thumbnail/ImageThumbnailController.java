package min.boot.begin.fileupload.thumbnail;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import min.boot.begin.fileupload.FileUpDownDTO;

@Controller
public class ImageThumbnailController {
private final ImageThumbnaillatorService imageThumbnaillatorService;
public ImageThumbnailController(ImageThumbnaillatorService imageThumbnaillatorService) {
	this.imageThumbnaillatorService = imageThumbnaillatorService;
}
@GetMapping("/thumbnail")
public String form() {
	return "./thumbnail/image_thumbnail";
}
@PostMapping("/thumbnail")
public String upload(Model model, FileUpDownDTO fileUpDownDTO, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception{
	String fileName = imageThumbnaillatorService.processImage(fileUpDownDTO, multipartHttpServletRequest);
	model.addAttribute("fileName", fileName);
	return "./thumbnail/image_thumbnail_download";
}
@GetMapping("/thumbnailator")
public String formA() {
	return "./thumbnail/image_thumbnail";
}
@PostMapping("/thumbnailator")
public String uploadB(Model model, FileUpDownDTO fileUpDownDTO, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception{
	String fileName = imageThumbnaillatorService.processImage(fileUpDownDTO, multipartHttpServletRequest);
	model.addAttribute("fileName", fileName);
	return "./thumbnail/image_thumbnail_download";
}
}
