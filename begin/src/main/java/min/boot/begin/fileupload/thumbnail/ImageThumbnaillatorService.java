package min.boot.begin.fileupload.thumbnail;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URLEncoder;

import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import min.boot.begin.fileupload.FileUpDownDTO;
import net.coobird.thumbnailator.Thumbnailator;

@Component
public class ImageThumbnaillatorService {
	public String processImage(FileUpDownDTO fileUpDownDTO, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception{
		MultipartFile multipartFile = fileUpDownDTO.getFile();
		if (multipartFile.isEmpty()) {
			return "redirect:/thumbnail";
		}
		Long datetime = System.currentTimeMillis();
		String fileName = datetime + "_" + fileUpDownDTO.getFile().getOriginalFilename();
		String savePath = multipartHttpServletRequest.getSession().getServletContext().getRealPath("./resources/img");
		String filePath = savePath + "\\" + fileName;
		File file = new File(filePath);
		FileCopyUtils.copy(multipartFile.getBytes(), file);
		FileOutputStream fileOutputStream = new FileOutputStream(new File(savePath, "sm_" + fileName));
		Thumbnailator.createThumbnail(multipartFile.getInputStream(), fileOutputStream, 100, 100);
		multipartFile.transferTo(file);
		fileName = URLEncoder.encode(fileName, "UTF-8").replaceAll("\\+", "%20");
		return fileName;
	}

}
